name := "ScalaProject1"
version := "0.1"
//scalaVersion := "2.13.1"
//libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.8.4"
libraryDependencies += "org.scalamock" %% "scalamock" % "4.3.0" % "test"
libraryDependencies += "org.testng" % "testng" % "6.10"



libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.7"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.7"