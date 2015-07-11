lazy val root = (project in file(".")).settings(
       scalaVersion := "2.11.7",
       crossScalaVersions := Seq("2.10.5", "2.11.7", "2.12.0-M1"),
       name := "DeepLearning4s",
       organization := "org.deeplearning4s",
       resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
       libraryDependencies += "org.deeplearning4j" % "deeplearning4j-core" % "0.0.3.3.5.alpha2-SNAPSHOT",
       scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions", "-language:higherKinds")
)