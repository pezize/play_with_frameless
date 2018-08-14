name := "play_with_frameless"

version := "0.1"

organization := "org.typelevel"
scalaVersion := "2.11.12"

val sparkVersion = "2.3.0"
val framelessVersion = "0.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.typelevel" %% "frameless-dataset" % framelessVersion
)
