lazy val myFistPlayApp = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "my-first-play-app",
    version := "0.0.1",
    scalaVersion := "2.13.0"
  )