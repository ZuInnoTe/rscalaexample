lazy val root = (project in file(".")).
  settings(
    name := "rscalaexample",
    version := "0.1",
    scalaVersion := "2.11.4"
  )

scalacOptions += "-target:jvm-1.7"

assemblyJarName in assembly := "rscalaexample.jar"

libraryDependencies += "com.github.lucarosellini.rJava" % "JRIEngine" % "0.9-7" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

