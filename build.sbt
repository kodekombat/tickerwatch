ThisBuild / scalaVersion := "2.12.3"
ThisBuild / organization := "com.ticker"

lazy val hello = (project in file("."))
  .settings(
    name := "ticker"
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"