logLevel := Level.Warn

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)

addSbtPlugin("au.com.dius" %% "pact-jvm-provider-sbt" % "2.4.0")
addSbtPlugin("com.eed3si9n" % "sbt-dirty-money" % "0.1.0")
