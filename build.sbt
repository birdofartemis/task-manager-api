ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

resolvers += "Akka library repository".at("https://repo.akka.io/maven")

val AkkaVersion = "2.10.0"
val AkkaHttpVersion = "10.7.0"

lazy val root = (project in file("."))
  .settings(
    name := "task-manager-api",
    idePackagePrefix := Some("com.api.task.manager"),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
    )
  )
