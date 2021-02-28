import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark.{SparkConf, SparkContext}

val spark:SparkSession=SparkSession
  .builder()
  .master("local")
  .appName("any")
  .getOrCreate()
import  spark.implicits._


case class C(val a:Int,val b:Int)
Seq(C(10,20)).toDF().show()
spark.createDataFrame(Seq((10,20))).show()