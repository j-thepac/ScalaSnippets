name := "ScalaProject1"
version := "0.1"
//scalaVersion := "2.13.1"
//libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.8.4"
libraryDependencies += "org.scalamock" %% "scalamock" % "4.3.0" % "test"
libraryDependencies += "org.testng" % "testng" % "6.10"
//json
libraryDependencies += "org.json" % "json" % "20210307"
//spark
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.7"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.7"
//Akka
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.2.6"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.17"
//Sttp Client
libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.5.1"

//libraryDependencies +="com.typesafe.akka" %% "akka-http" % "10.1.7"