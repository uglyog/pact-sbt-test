logLevel := Level.Warn

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)

addSbtPlugin("au.com.dius" %% "pact-jvm-provider-sbt" % "3.5.13")
