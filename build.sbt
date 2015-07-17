name := "securitydemo"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.3"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-json4s-jackson" % "0.11.3"
libraryDependencies += "org.clapper" %% "grizzled-slf4j" % "1.0.2"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
libraryDependencies += "joda-time" % "joda-time" % "2.8.1"

dependencyOverrides += "org.scala-lang" % "scala-library" % scalaVersion.value
dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value
dependencyOverrides += "org.scala-lang" % "scala-reflect" % scalaVersion.value