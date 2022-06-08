# 描述
在此课程中，我们将引导您如何在Artifactory中创建仓库，您将能够从Artifactory解析依赖，并将构建产物上传至Artifactory。
# 主要内容
* 通过Artifactory解析依赖  
* 上传制品包至Artifactory
# 操作步骤
## Artifactory 创建仓库
访问并登录Artifactory，如浏览器访问：http://ip:8082/artifactory  
创建仓库：  
webinar-maven-dev-local  
webinar-maven-remote  
webinar-maven-virtual  
* ### 创建 webinar-maven-dev-local 仓库  
  Settings--Repositories  
  1\) 点击右上角 "+ Add Repositories" -- "Local Repository"  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-1.png">
  2\) 选择 "Maven" 类型  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-2.png">
  3\) 填写仓库名 "webinar-maven-dev-local", 保存  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-3.png">
* ### 创建 webinar-maven-remote 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Remote Repository"
  2\) 选择 "Maven" 类型
  3\) 填写仓库名 "webinar-maven-remote", URL保持默认，保存
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-4.png">
* ### 创建 webinar-maven-virtual 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Virtual Repository"
  2\) 选择 "Maven" 类型  
  填写仓库名 "webinar-maven-virtual", 并将上面刚创建的2个仓库拖动至右侧，保存
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-5.png">
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-6.png">
##  解析依赖(Resolve)  
1\)  Artifactory--Artifacts--Set Me Up  
"Package Type": 选择 "Maven" 类型  
"Repository": "webinar-maven-virtual"  
"Configure": 填写当前用户密码，点击小锁按钮，选择用于解析依赖的仓库 "webinar-maven-virtual"    
点击 "Generate Settings"， 生成配置文件  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-7.png">  
点击 "Download Snippet"，下载 settings.xml，并替换 Maven 中现有 settings.xml 配置  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-8.png">  
2\)  下载示例代码，进入示例项目目录，运行编译构建  
```bash
git clone https://github.com/JFrog/project-examples.git
cd project-examples/maven-examples/maven-example
# 编译构建
mvn clean install
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-9.png">    

##  上传制品(Deploy)  
同上，点击 "Set Me Up"，选择 Maven Local 仓库 "webinar-maven-local"，点击 "Deploy"，将生成的配置复制到 pom.xml 文件中  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-10.png">  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-11.png">  
```bash
mvn deploy
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-12.png">   
##  查看 Artifactory 中缓存的第三方依赖包和上传的制品包  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-13.png">
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Maven-14.png">
