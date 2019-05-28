name := """play-akka-calculator-client-app"""
organization := "com.akka"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.5.23"
