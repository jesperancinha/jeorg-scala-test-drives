val akka = "2.6.15"
val akkaHttp = "10.1.11"

name := "jeorg-scala-test-drives"

version := "0.1"

scalaVersion := "2.13.6"

//idePackagePrefix := Some("org.jesperancinha.scala.td")

lazy val global = project
  .in(file("."))
  .settings(commonSettings)
  .disablePlugins(AssemblyPlugin)
  .aggregate(
//    `jeorg-scala3-test-drives-crums-1`,
    `jeorg-scala-test-drives-crums-1`,
    `jeorg-scala-test-drives-crums-2`,
    `jeorg-scala-test-drives-crums-3`,
    `jeorg-scala-test-drives-akka-1`,
    `jeorg-scala-test-drives-akka-2`,
    `jeorg-scala-test-drives-akka-3`,
  )

//lazy val `jeorg-scala3-test-drives-crums-1` = project
//  .in(file("jeorg-scala3-test-drives-crums/jeorg-scala3-test-drives-crums-1"))
//  .settings(
////    scalaVersion := "3.0.1",
//    crossScalaVersions := Seq("3.0.1", "2.12", "2.13.6"),
//    name := "jeorg-scala3-test-drives-crums-1",
//    version := "1.0.0-SNAPSHOT",
//    commonSettings,
//    libraryDependencies ++= common3Dependencies,
//    assemblySettings,
//    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
//  )

lazy val `jeorg-scala-test-drives-crums-1` = project
  .in(file("jeorg-scala-test-drives-crums/jeorg-scala-test-drives-crums-1"))
  .settings(
    name := "jeorg-scala-test-drives-crums-1",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val `jeorg-scala-test-drives-crums-2` = project
  .in(file("jeorg-scala-test-drives-crums/jeorg-scala-test-drives-crums-2"))
  .settings(
    name := "jeorg-scala-test-drives-crums-2",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val `jeorg-scala-test-drives-crums-3` = project
  .in(file("jeorg-scala-test-drives-crums/jeorg-scala-test-drives-crums-3"))
  .settings(
    name := "jeorg-scala-test-drives-crums-3",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val `jeorg-scala-test-drives-akka-1` = project
  .in(file("jeorg-scala-test-drives-akka/jeorg-scala-test-drives-akka-1"))
  .settings(
    name := "jeorg-scala-test-drives-akka-1",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val `jeorg-scala-test-drives-akka-2` = project
  .in(file("jeorg-scala-test-drives-akka/jeorg-scala-test-drives-akka-2"))
  .settings(
    name := "jeorg-scala-test-drives-akka-2",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val `jeorg-scala-test-drives-akka-3` = project
  .in(file("jeorg-scala-test-drives-akka/jeorg-scala-test-drives-akka-3"))
  .settings(
    name := "jeorg-scala-test-drives-akka-3",
    version := "1.0.0-SNAPSHOT",
    commonSettings,
    libraryDependencies ++= commonDependencies,
    assemblySettings,
    mainClass := Some("com.jesperancinha.imagecontour.boot.Boot")
  )

lazy val common3Dependencies = Seq(
  "org.jesperancinha.console" % "consolerizer" % "2.0.12",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
)

lazy val commonDependencies = Seq(
  "org.jesperancinha.console" % "consolerizer" % "2.0.12",
  "io.spray" %% "spray-json" % "1.3.5",
  "org.scalactic" %% "scalactic" % "3.1.0",
  "net.liftweb" %% "lift-json" % "3.4.1",
  "com.typesafe.slick" %% "slick" % "3.3.2",
  "com.typesafe.akka" %% "akka-http-core" % akkaHttp,
  "com.typesafe.akka" %% "akka-actor-typed" % akka,
  "com.typesafe.akka" %% "akka-actor" % akka,
  "com.typesafe.akka" %% "akka-stream" % akka,
  "com.typesafe.akka" %% "akka-http" % akkaHttp,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttp,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttp,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akka % Test,
  "org.mockito" %% "mockito-scala" % "1.16.37" % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,

)

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-deprecation",
  "-encoding",
  "utf8"
)

lazy val commonSettings = Seq(
  javacOptions ++= Seq("-source", "11", "-target", "11"),
  scalacOptions in Test ++= Seq("-Yrangepos"),
  scalacOptions ++= compilerOptions,
  resolvers ++= Seq(
    Resolver.sbtPluginRepo("releases"),
    Resolver.DefaultMavenRepository,
    Resolver.url("bintray-sbt-plugins", url("https://dl.bintray.com/eed3si9n/sbt-plugins/"))(Resolver.ivyStylePatterns),
    Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins"),
    "Spray repository" at "https://repo.spray.io",
    "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
    Resolver.mavenCentral,
    Resolver.mavenLocal
  )
)
lazy val assemblySettings = Seq(
  assemblyJarName in assembly := name.value + ".jar",
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs@_*) => MergeStrategy.discard
    case "application.conf" => MergeStrategy.concat
    case x => MergeStrategy.first
  }
)