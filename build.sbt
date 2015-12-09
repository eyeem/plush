name := """plush"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  ws,
  "net.debasishg" %% "redisclient" % "3.1",
  "com.github.t3hnar" %% "scala-bcrypt" % "2.5",
  "com.notnoop.apns" % "apns" % "1.0.0.Beta6",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.scalatestplus" %% "play" % "1.2.0" % "test"
  )

scalaVersion := "2.11.7"

