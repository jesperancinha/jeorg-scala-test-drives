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
 
---

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/scala-50.png "Scala")](https://www.scala-lang.org/)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-50/sbt-50.png "Scala")](https://www.scala-sbt.org/)

---

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

## About me 👨🏽‍💻🚀🏳️‍🌈

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/mastodon-20.png "Mastodon")](https://masto.ai/@jesperancinha)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
| [Sessionize](https://sessionize.com/joao-esperancinha/)
| [Spotify](https://open.spotify.com/user/jlnozkcomrxgsaip7yvffpqqm?si=b54b89eae8894960)
| [Medium](https://medium.com/@jofisaes)
| [Buy me a coffee](https://www.buymeacoffee.com/jesperancinha)
| [Credly Badges](https://www.credly.com/users/joao-esperancinha)
| [Google Apps](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
| [Sonatype Search Repos](https://search.maven.org/search?q=org.jesperancinha)
| [Docker Images](https://hub.docker.com/u/jesperancinha)
| [Stack Overflow Profile](https://stackoverflow.com/users/3702839/joao-esperancinha)
| [Reddit](https://www.reddit.com/user/jesperancinha/)
| [Dev.TO](https://dev.to/jofisaes)
| [Hackernoon](https://hackernoon.com/@jesperancinha)
| [Code Project](https://www.codeproject.com/Members/jesperancinha)
| [BitBucket](https://bitbucket.org/jesperancinha)
| [GitLab](https://gitlab.com/jesperancinha)
| [Coursera](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
| [FreeCodeCamp](https://www.freecodecamp.org/jofisaes)
| [HackerRank](https://www.hackerrank.com/jofisaes)
| [LeetCode](https://leetcode.com/jofisaes)
| [Codebyte](https://coderbyte.com/profile/jesperancinha)
| [CodeWars](https://www.codewars.com/users/jesperancinha)
| [Code Pen](https://codepen.io/jesperancinha)
| [Hacker Earth](https://www.hackerearth.com/@jofisaes)
| [Khan Academy](https://www.khanacademy.org/profile/jofisaes)
| [Hacker News](https://news.ycombinator.com/user?id=jesperancinha)
| [InfoQ](https://www.infoq.com/profile/Joao-Esperancinha.2/)
| [LinkedIn](https://www.linkedin.com/in/joaoesperancinha/)
| [Xing](https://www.xing.com/profile/Joao_Esperancinha/cv)
| [Tumblr](https://jofisaes.tumblr.com/)
| [Pinterest](https://nl.pinterest.com/jesperancinha/)
| [Quora](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)
| [VMware Spring Professional 2021](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
| [Oracle Certified Professional, Java SE 11 Programmer](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
| [Oracle Certified Professional, JEE7 Developer](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
| [IBM Cybersecurity Analyst Professional](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
| [Certified Advanced JavaScript Developer](https://cancanit.com/certified/1462/)
| [Certified Neo4j Professional](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
| [Deep Learning](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
