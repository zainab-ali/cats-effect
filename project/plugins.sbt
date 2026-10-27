// scalajs-env-selenium is only published for Scala 2.13.
libraryDependencies += ("org.scala-js" %% "scalajs-env-selenium" % "1.1.1")
  .platform(Platform.jvm)
  .cross(CrossVersion.for3Use2_13)
// The scalajs-js-envs and scalajs-logging 2.13 dependencies are pulled in by scalajs-env-selenium
excludeDependencies ++= Seq(
  ExclusionRule("org.scala-js", "scalajs-js-envs_2.13"),
  ExclusionRule("org.scala-js", "scalajs-logging_2.13")
)

// TODO: Zainab - This is a local snapshot
addSbtPlugin("org.typelevel" % "sbt-typelevel" % "0.8.6-54-5014100-20260909T111237Z-SNAPSHOT")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.22.0")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.12")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.8")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.9.2")
addSbtPlugin("com.github.sbt" % "sbt-java-formatter" % "0.13.1")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.13.1")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.8")
addSbtPlugin("org.scalameta" % "sbt-native-image" % "0.5.0")

