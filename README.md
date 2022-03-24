# <img src="src/docs/spring-framework.png" width="80" height="80"> Spring Framework [![Build Status](https://ci.spring.io/api/v1/teams/spring-framework/pipelines/spring-framework-5.3.x/jobs/build/badge)](https://ci.spring.io/teams/spring-framework/pipelines/spring-framework-5.3.x?groups=Build") [![Revved up by Gradle Enterprise](https://img.shields.io/badge/Revved%20up%20by-Gradle%20Enterprise-06A0CE?logo=Gradle&labelColor=02303A)](https://ge.spring.io/scans?search.rootProjectNames=spring)

This is the home of the Spring Framework: the foundation for all [Spring projects](https://spring.io/projects). Collectively the Spring Framework and the family of Spring projects are often referred to simply as "Spring". 

Spring provides everything required beyond the Java programming language for creating enterprise applications for a wide range of scenarios and architectures. Please read the [Overview](https://docs.spring.io/spring/docs/current/spring-framework-reference/overview.html#spring-introduction) section as reference for a more complete introduction.

## Code of Conduct

This project is governed by the [Spring Code of Conduct](CODE_OF_CONDUCT.adoc). By participating, you are expected to uphold this code of conduct. Please report unacceptable behavior to spring-code-of-conduct@pivotal.io.

## Access to Binaries

For access to artifacts or a distribution zip, see the [Spring Framework Artifacts](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Artifacts) wiki page.

## Documentation

The Spring Framework maintains reference documentation ([published](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/) and [source](src/docs/asciidoc)), Github [wiki pages](https://github.com/spring-projects/spring-framework/wiki), and an
[API reference](https://docs.spring.io/spring-framework/docs/current/javadoc-api/). There are also [guides and tutorials](https://spring.io/guides) across Spring projects.

## Micro-Benchmarks

See the [Micro-Benchmarks](https://github.com/spring-projects/spring-framework/wiki/Micro-Benchmarks) Wiki page.

## Build from Source

See the [Build from Source](https://github.com/spring-projects/spring-framework/wiki/Build-from-Source) Wiki page and the [CONTRIBUTING.md](CONTRIBUTING.md) file.

## Continuous Integration Builds

Information regarding CI builds can be found in the [Spring Framework Concourse pipeline](ci/README.adoc) documentation.

## Stay in Touch

Follow [@SpringCentral](https://twitter.com/springcentral), [@SpringFramework](https://twitter.com/springframework), and its [team members](https://twitter.com/springframework/lists/team/members) on Twitter. In-depth articles can be found at [The Spring Blog](https://spring.io/blog/), and releases are announced via our [news feed](https://spring.io/blog/category/news).

## License

The Spring Framework is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).

##spring5.3.x源码编译步骤
1.登录spring官网https://spring.io，projects->Spring Framework点击右侧的github图标
2.将spring源码点击fork复制到自己的远程仓库中，方便对代码进行改造后的提交
3.fok完成后，在本地远程代码存放的目录（例如：D:\springSourseCode5.3），在改目录下点击Git Bash Here
4.克隆代码带本地 git clone 自己远程仓库的地址
5.代码克隆完成后配置gradle本地路径：gradle->wrapper下的gradle-wrapper.properties文件，
将distributionUrl=file:///e:/dev_env/gradle-6.5.1-all.zip(这里选择gradle的压缩包的全路径地址)，file后面为本地gradle路径
6.打开build.gradle，在头部添加，想党羽maven中的pom文件
buildscript {
	repositories {
		maven { url "https://repo.spring.io/plugins-release" }
	}
}
7.添加阿里镜像以及spring插件库
repositories {
			//新增以下2个阿里云镜像
			maven { url 'https://maven.aliyun.com/nexus/content/groups/public/' }
			maven { url 'https://maven.aliyun.com/nexus/content/repositories/jcenter' }
			mavenCentral()
			maven { url "https://repo.spring.io/libs-spring-framework-build" }
			maven { url "https://repo.spring.io/milestone" } // Reactor
			//新增spring插件库
			maven { url "https://repo.spring.io/plugins-release" }
}
8.idea打开项目，file->open选择spring源码的根目录，打开后插件会自动帮助我们下载所需的jar ，这个过程比较漫长，建议耐心等待
9.编译测试必须的模块spring-oxm，spring-core，spring-context在右侧的目录中依次执行模块->tasks->other->compileTestJava
10.编译整个项目spring->Tasks->build->build,等待构建成功之后创建测试模块进行测试
11.创建好新模块，在引入包依赖时不能使用compile 因为5.3之后已经废除了该标签，需要使用implementation或者api
implementation(project(":spring-context"))
api(project(":spring-beans"))


