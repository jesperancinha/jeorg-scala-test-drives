# JeOrg Scala Test Drives

Study project on all things scala related

---

[![Twitter URL](https://img.shields.io/twitter/url?logoColor=blue&style=social&url=https%3A%2F%2Fimg.shields.io%2Ftwitter%2Furl%3Fstyle%3Dsocial)](https://twitter.com/intent/tweet?text=%20Checkout%20this%20%40github%20repo%20by%20%40joaofse%20%F0%9F%91%A8%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB%3A%20https%3A//github.com/jesperancinha/jeorg-scala-test-drives)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=Scala%20Test%20Drives&color=informational)](https://github.com/jesperancinha/jeorg-scala-test-drives)
[![GitHub release](https://img.shields.io/github/release-pre/jesperancinha/jeorg-scala-test-drives.svg)](#)

[![CircleCI](https://circleci.com/gh/jesperancinha/jeorg-scala-test-drives/tree/main.svg?style=svg)](https://circleci.com/gh/jesperancinha/jeorg-scala-test-drives/tree/main)
[![Build status](https://ci.appveyor.com/api/projects/status/2wm1p5dy2mawewkp?svg=true)](https://ci.appveyor.com/project/jesperancinha/jeorg-scala-test-drives)
[![jeorg-scala-test-drives](https://github.com/jesperancinha/jeorg-scala-test-drives/actions/workflows/jeorg-scala-test-drives.yml/badge.svg)](https://github.com/jesperancinha/jeorg-scala-test-drives/actions/workflows/jeorg-scala-test-drives.yml)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/fe01b148957f4109bd66b3dbde1c2728)](https://www.codacy.com/gh/jesperancinha/jeorg-scala-test-drives/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jesperancinha/jeorg-scala-test-drives&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/375b0a90-d5a0-468f-a9b7-051ea83a9c80)](https://codebeat.co/projects/github-com-jesperancinha-jeorg-scala-test-drives-main)
[![BCH compliance](https://bettercodehub.com/edge/badge/jesperancinha/jeorg-scala-test-drives?branch=main)](https://bettercodehub.com/results/jesperancinha/jeorg-scala-test-drives)
[![Known Vulnerabilities](https://snyk.io/test/github/jesperancinha/jeorg-scala-test-drives/badge.svg)](https://snyk.io/test/github/jesperancinha/jeorg-scala-test-drives)

[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/fe01b148957f4109bd66b3dbde1c2728)](https://www.codacy.com/gh/jesperancinha/jeorg-scala-test-drives/dashboard?utm_source=github.com&utm_medium=referral&utm_content=jesperancinha/jeorg-scala-test-drives&utm_campaign=Badge_Coverage)
[![codecov](https://codecov.io/gh/jesperancinha/jeorg-scala-test-drives/branch/main/graph/badge.svg)](https://codecov.io/gh/jesperancinha/jeorg-scala-test-drives)
[![Coverage Status](https://coveralls.io/repos/github/jesperancinha/jeorg-scala-test-drives/badge.svg?branch=main)](https://coveralls.io/github/jesperancinha/jeorg-scala-test-drives?branch=main)

[![GitHub language count](https://img.shields.io/github/languages/count/jesperancinha/jeorg-scala-test-drives.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/top/jesperancinha/jeorg-scala-test-drives.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/code-size/jesperancinha/jeorg-scala-test-drives.svg)](#)

---

## Technologies used

Please check the [TechStack.md](TechStack.md) file for details.

## Java SDK


```bash
sdk install java 11.0.11.hs-adpt
sdk use java 11.0.11.hs-adpt
```
## Scala SDK

```bash
sdk install scala 3.0.0
sdk use scala 3.0.0
```

Scala 3 features are only active on the Scala3 projects.
Since I was not able to incorporate Scala3 builds with old projects given dependency issues on external libraries, the Scala 3 projects still run independently of the main build.

Please go to [Scala3](./jeorg-scala3-test-drives-crums), pick your project and run the Makefile.
There are normally 3 options which are self-explanatory: `build`, `test` and `run`. 
There may be further options on location, explained through the Readme.md file.

## Coursier

-   MAC-OS

```bash
brew install coursier/formulas/coursier && cs setup
```

## Build

```bash
sbt clean assembly
sbt clean assembly update test
```

## Intellij

This project uses Scala 3.0.0 in one of its modules.

In case you are using Intellij, please make sure you are using any version above [212.4321](https://confluence.jetbrains.com/display/IDEADEV/IntelliJ+IDEA+2021.2+EAP+%28212.4321.30+build%29+Release+Notes), otherwise, the plugin won't recognize Scala 3 specific code.

## References

### Online

-   [ScalaTest](https://www.scalatest.org/)
-   [Scala - Overview](https://www.tutorialspoint.com/scala/scala_overview.htm)
-   [Lift Framework](https://github.com/lift/framework)
-   [Play Framework](https://www.playframework.com/)
-   [Bowler SBT Quickstart](https://github.com/bowler-framework/bowler-quickstart)

## About me

[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=for-the-badge&logo=github&color=grey "GitHub")](https://github.com/jesperancinha)
