name := "TopN"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5",
  "org.apache.spark" %% "spark-sql" % "2.4.5",
  "com.typesafe" % "config" % "1.4.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "com.holdenkarau" %% "spark-testing-base" % "2.4.5_0.14.0" % "test"
)