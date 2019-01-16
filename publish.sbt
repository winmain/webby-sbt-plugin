name := "webby-sbt-plugin"
organization := "com.github.winmain.webby"
version := "0.2.0"

description := "An SBT plugin for Webby - scala web framework"
startYear := Some(2016)
homepage := Some(url("https://github.com/winmain/webby-sbt-plugin"))
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
bintrayVcsUrl := Some("https://github.com/winmain/webby-sbt-plugin")

bintrayRepository := "sbt-plugins"
bintrayOrganization := Some("winmain")
publishMavenStyle := false

// No Javadoc
publishArtifact in(Compile, packageDoc) := false
publishArtifact in packageDoc := false
sources in(Compile, doc) := Nil
