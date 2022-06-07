# 描述
在此课程中，我们将引导您如何在Artifactory中创建仓库，您将能够从Artifactory解析依赖，并将构建产物上传至Artifactory。
# 主要内容
* 通过Artifactory解析依赖  
* 上传制品包至Artifactory
# 操作步骤
## Artifactory 创建仓库
访问并登录Artifactory，如浏览器访问：http://ip:8082/artifactory  
创建仓库：  
guide-maven-dev-local  
guide-maven-remote  
guide-maven-virtual  
* ### 创建 guide-maven-dev-local 仓库  
  Admin--Repositories--Local
  点击右上角 "New"
  选择 "Maven" 类型
  填写仓库名 "guide-maven-dev-local", 保存
* ### 创建 guide-maven-remote 仓库  
  Admin--Repositories--Remote
  点击右上角 "New"
  选择 "Maven" 类型
  填写仓库名 "guide-maven-remote", URL保持默认，保存
* ### 创建 guide-maven-virtual 仓库  
  Admin--Repositories--Virtual
  点击右上角 "New"
  选择 "Maven" 类型
  填写仓库名 "guide-maven-virtual", 并将上面刚创建的2个仓库拖动至右侧，保存
##  解析依赖  
##  上传制品  
