import com.github.play2war.plugin._

name := """play-java-2.3"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
Play2WarPlugin.play2WarSettings
Play2WarKeys.servletVersion := "3.0"