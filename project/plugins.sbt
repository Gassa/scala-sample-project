addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")
addSbtPlugin("com.github.tkawachi" % "sbt-lock" % "0.5.0")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.lightbend.sbt" % "sbt-aspectj" % "0.11.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.3.7")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("se.marcuslonnberg" % "sbt-docker"          % "1.5.0")

// Can't reslove from sbt
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.3.15")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"
