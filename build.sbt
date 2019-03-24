lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.8",
    name := "testcontainers-sbt",
    libraryDependencies ++= Seq(
      "ch.qos.logback"             % "logback-classic"       % "1.2.3" % "test",
      "org.scalatest"              %% "scalatest"            % "3.0.5" % "test",
      "com.dimafeng"               %% "testcontainers-scala" % "0.24.0" % "test",
      "org.testcontainers"         % "postgresql"            % "1.11.1" % "test"
    )
  )
