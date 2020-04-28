import sun.security.tools.PathList

name := "TopN"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.5" % "provided",
  "com.typesafe" % "config" % "1.4.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "com.holdenkarau" %% "spark-testing-base" % "2.4.5_0.14.0" % "test"
)

// META-INF discarding
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}