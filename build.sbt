import au.com.dius.pact.provider.sbt._

name := "pact-sbt-test"

version := "1.0"

scalaVersion := "2.11.7"

PactJvmPlugin.pactSettings
SbtProviderPlugin.config ++ Seq(
  providers := Seq(
    ProviderConfig(name = "Activity Service", port = 5050)
        .hasPactWith(ConsumerConfig(name = "sampleconsumer", pactFile = file("src/test/resources/sample-pact.json")))
        .hasPactWith(ConsumerConfig(name = "sampleconsumer2", pactFile = file("src/test/resources/sample-pact2.json")))
  )
)
