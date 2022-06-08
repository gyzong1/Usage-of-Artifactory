# 描述
在此课程中，我们将引导您如何在Artifactory中创建仓库，您将能够从Artifactory拉取镜像，并将指定镜像上传至Artifactory。
# 主要内容
* 通过Artifactory拉取镜像  
* Push镜像至Artifactory
# 操作步骤
## Artifactory 创建仓库
访问并登录Artifactory，如浏览器访问：http://ip:8082/artifactory  
创建仓库：  
webinar-docker-dev-local  
webinar-docker-remote  
webinar-docker-virtual  
* ### 创建 webinar-docker-dev-local 仓库  
  Settings--Repositories  
  1\) 点击右上角 "+ Add Repositories" -- "Local Repository"  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-1.png">
  2\) 选择 "Docker" 类型  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-2.png">
  3\) 填写仓库名 "webinar-docker-dev-local", 保存  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-3.png">
* ### 创建 webinar-docker-remote 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Remote Repository"  
  2\) 选择 "Docker" 类型  
  3\) 填写仓库名 "webinar-docker-remote", URL保持默认，保存  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-4.png">
* ### 创建 webinar-docker-virtual 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Virtual Repository"
  2\) 选择 "Docker" 类型  
  填写仓库名 "webinar-docker-virtual", 并将上面刚创建的2个仓库拖动至右侧，保存
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-5.png">
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-6.png">
##  获取 Npm 配置  
Artifactory--Artifacts--Set Me Up  
"Package Type": 选择 "Docker" 类型  
"Repository": "webinar-docker-virtual"  
"Configure": 填写当前用户密码，点击小锁按钮，选择用于解析依赖的仓库 "webinar-docker-virtual"    
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-7.png">  
复制 npm config 和 "Using basic authentication" 认证信息，在服务器上执行并填入~/.npmrc文件  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-8.png">  
##  解析依赖(Resolve) 
下载示例代码，进入示例项目目录，运行编译构建  
```bash
git clone https://github.com/JFrog/project-examples.git
cd project-examples/npm-example
# 编译构建
npm install
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-9.png">    

##  上传制品(Deploy)  
同上，点击 "Set Me Up"，选择 Npm Local 仓库 "webinar-npm-local"，点击 "Deploy"，复制 npm publish 命令
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-10.png">  
在服务器上执行，如：  
```bash
cd node_modules/ms/
npm publish --registry http://192.168.56.11:8081/artifactory/api/npm/webinar-npm-dev-local/
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-11.png">    

##  查看 Artifactory 中缓存的第三方依赖包和上传的制品包  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-12.png">
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-13.png">
