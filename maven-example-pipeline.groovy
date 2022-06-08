node {

  def artServer = Artifactory.server 'art1'
  def rtMaven = Artifactory.newMavenBuild()
  def buildInfo = Artifactory.newBuildInfo()
  
  stage ('Clone') {
        git url: 'https://github.com/JFrog/project-examples.git'
    }

    stage ('Artifactory configuration') {
        rtMaven.tool = 'maven3' // Tool name from Jenkins configuration
        rtMaven.resolver releaseRepo: 'webinar-maven-virtual', snapshotRepo: 'webinar-maven-virtual', server: artServer
        rtMaven.deployer releaseRepo: 'webinar-maven-dev-local', snapshotRepo: 'webinar-maven-dev-local', server: artServer
    }

    stage ('Env capture') {
        buildInfo.env.capture = true
    }

    stage ('Exec Maven') {
        rtMaven.run pom: 'maven-examples/maven-example/pom.xml', goals: 'clean install', buildInfo: buildInfo
    }
  
    stage ('Publish build info') {
        artServer.publishBuildInfo buildInfo
    }

}
