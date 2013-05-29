name := "VRaptor Scala Plugin"

version := "1.1"

organization := "Caelum"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "br.com.caelum"           % "vraptor"               % "3.5.1"       		% "compile",
  "net.vidageek"            % "mirror"                % "1.6.1"           % "compile",
  "com.google.inject"       % "guice"                 % "3.0"             % "compile",
  "org.mortbay.jetty"       % "servlet-api-2.5"       % "6.1.14"          % "compile",
  "org.hamcrest"            % "hamcrest-core"         % "1.3.RC2"         % "compile",
  "org.scalatest"           % "scalatest"             % "1.3"             % "test",
  "org.mockito"             % "mockito-core"          % "1.8.5"           % "test"
)
