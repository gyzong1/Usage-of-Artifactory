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
##  解析依赖  
##  上传制品  
