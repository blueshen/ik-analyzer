<!-- Badges section here. -->
[![GitHub version](https://img.shields.io/maven-central/v/cn.shenyanchao.ik-analyzer/ik-analyzer.svg?style=flat-square)](https://search.maven.org/search?q=g:cn.shenyanchao.ik-analyzer%20AND%20a:ik-analyzer&core=gav)
[![License](https://img.shields.io/badge/license-LGPL--2.1-blue)](./LICENSE)
[![Build Status](https://app.travis-ci.com/blueshen/ik-analyzer.svg?branch=master)](https://app.travis-ci.com/github/blueshen/ik-analyzer)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/blueshen/ik-analyzer/releases)

[![GitHub forks](https://img.shields.io/github/forks/blueshen/ik-analyzer.svg?style=social&label=Fork)](https://github.com/blueshen/ik-analyzer/network/members)
[![GitHub stars](https://img.shields.io/github/stars/blueshen/ik-analyzer.svg?style=social&label=Star)](https://github.com/blueshen/ik-analyze/stargazers)
<!-- /Badges section end. -->



本版本，主要特点：

- Maven化, 工程化
- 词典优化，使其适用于中文分词
- 全面支持的lucene全系列版本为5/6/7/8/9, 持续技术支持 

Maven用法：

从9.0.0开始，已经发布到Maven Central，groupId使用cn.shenyanchao.ik-analyzer

```xml
    <dependency>
        <groupId>cn.shenyanchao.ik-analyzer</groupId>
        <artifactId>ik-analyzer</artifactId>
        <version>9.0.0</version>
    </dependency>
```

旧版本：
你需要手动安装，安装到本地的repository，或者Deploy到自己的Maven repository服务器上。
安装到本地Maven repository，使用如下命令，将自动编译，打包并安装：

```shell
    mvn clean install -Dmaven.test.skip=true
```
```xml
    <dependency>
        <groupId>org.wltea.ik-analyzer</groupId>
        <artifactId>ik-analyzer</artifactId>
        <version>9.0.0</version>
    </dependency>
```

Rust版本:

如果你有使用Rust的需求，请使用 https://github.com/blueshen/ik-rs
---
关于我

请访问 <https://www.shenyanchao.cn>

---
说明

IKAnalyzer的作者为林良益（linliangyi2007@gmail.com），项目网站为<http://code.google.com/p/ik-analyzer/>
