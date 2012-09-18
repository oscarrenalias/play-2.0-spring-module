resolvers ++= Seq(
  DefaultMavenRepository,
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Other Repository" at "http://repo.typesafe.com/typesafe/repo/",
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
)

// Type "sbt gen-idea" to create an IntelliJ IDEA project.

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

// Type "sbt eclipse" to create an eclipse project

// Oscar Renalias 20120917: deactivated for now, since the latest version of sbt-eclipse only works with SBT 0.11.3-2 or 0.12, and both are giving me problems with dependencies

//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "2.1.0")

addSbtPlugin("play" % "sbt-plugin" % "2.0.1")

// Comment to get more information during initialization
logLevel := Level.Warn