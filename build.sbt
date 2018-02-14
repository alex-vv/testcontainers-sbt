lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.12.4",
    name := "testcontainers-sbt",
    libraryDependencies ++= Seq(
      "ch.qos.logback"             % "logback-classic"       % "1.2.3" % "test",
      "org.scalatest"              %% "scalatest"            % "3.0.5" % "test",
      "com.dimafeng"               %% "testcontainers-scala" % "0.14.0" % "test",
      "org.testcontainers"         % "postgresql"            % "1.6.0" % "test"
    )
  )
