<!-- Badges section here. -->
[![GitHub version](https://img.shields.io/maven-central/v/cn.shenyanchao.ik-analyzer/ik-analyzer.svg?style=flat-square)](https://search.maven.org/search?q=g:cn.shenyanchao.ik-analyzer%20AND%20a:ik-analyzer&core=gav)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/blueshen/ik-analyzer/releases)
[![Crates.io](https://img.shields.io/badge/license-lgpl__2__1-blue)](./LICENSE)
[![Build Status](https://travis-ci.org/blueshen/ik-analyzer.svg)](https://travis-ci.org/blueshen/ik-analyzer)

[![GitHub forks](https://img.shields.io/github/forks/blueshen/ik-analyzer.svg?style=social&label=Fork)](https://github.com/blueshen/ik-analyzer/network/members)
[![GitHub stars](https://img.shields.io/github/stars/blueshen/ik-analyzer.svg?style=social&label=Star)](https://github.com/blueshen/ik-analyze/stargazers)
<!-- /Badges section end. -->



本版本，主要特点：

- Maven化, 代码格式化
- 添加了不少停用词，使其适用于中文分词
- 全面支持的lucene全系列版本为5/6/7/8/9, 持续技术支持 

Maven用法：

将以下依赖加入工程的pom.xml中的依赖部分

```xml
    <dependency>
        <groupId>cn.shenyanchao.ik-analyzer</groupId>
        <artifactId>ik-analyzer</artifactId>
        <version>9.0.0</version>
    </dependency>
```
在IK Analyzer加入Maven Central Repository之前，你需要手动安装，安装到本地的repository，或者上传到自己的Maven repository服务器上。

要安装到本地Maven repository，使用如下命令，将自动编译，打包并安装：

```shell
    mvn clean install -Dmaven.test.skip=true
```
---
关于我

请访问 <https://www.shenyanchao.cn>

---
说明

IKAnalyzer的作者为林良益（linliangyi2007@gmail.com），项目网站为<http://code.google.com/p/ik-analyzer/>
