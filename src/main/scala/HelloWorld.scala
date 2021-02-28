import java.time.Instant
//import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

import scala.collection.mutable._

import java.util.Calendar
import java.text.SimpleDateFormat
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark.{SparkConf, SparkContext}


object HelloWorld {
  val spark:SparkSession=SparkSession
    .builder()
    .master("local")
    .appName("any")
    .getOrCreate()
  import  spark.implicits._

  def main(args: Array[String]): Unit = {
val df=Seq((10,20),(10,40)).toDF()

    df.show()


  }
}




