sbtPlugin := true

sources in doc in Compile := List()
javacOptions ++= Seq("-encoding", "UTF-8")
scalacOptions ++= Seq("-target:jvm-1.7", "-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature")
scalaVersion := "2.10.6"

sourceDirectory in Compile := baseDirectory.value / "src"
scalaSource in Compile := baseDirectory.value / "src"
javaSource in Compile := baseDirectory.value / "src"
