sbtPlugin := true

sources in doc in Compile := List()
scalacOptions := Seq("-deprecation", "-encoding", "utf8", "-unchecked", "-deprecation", "-feature", "-language:existentials")
scalaVersion := "2.12.8"

sourceDirectory in Compile := baseDirectory.value / "src"
scalaSource in Compile := baseDirectory.value / "src"
javaSource in Compile := baseDirectory.value / "src"
