package SCD

import org.apache.spark.sql.{SparkSession,DataFrame}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._


object SCDTest extends App{
  val spark:SparkSession=SparkSession.builder().master("local").appName("SCD").getOrCreate()
  import spark.implicits._
  spark.sparkContext.setLogLevel("ERROR")
  var source:DataFrame=Seq((1,"dj")).toDF("id","name")


  type0(Seq((1,"dj")).toDF("id","name")).show(false)
  type1(Seq((1,"dj_new")).toDF("id","name")).show(false)

  val type2result=type2(Seq((1,"dj")).toDF("id","name"))
  println("RAW Type2")
  type2result.show()
  println("Expected Type 2 (max timestamp)")
  type2result.groupBy("id","name").agg(max("timestamp")).show()


  def type0(df:DataFrame):DataFrame=this.source
  def type1(df:DataFrame):DataFrame={
    val temp = df.join(source.withColumnRenamed("name","name_temp"),Seq("id"),"leftouter")
    temp.drop("name_temp")
  }
  def type2(df:DataFrame):DataFrame={
    val temp =source.withColumn("timestamp",current_timestamp())
    temp.union(df.withColumn("timestamp",current_timestamp()))
  }


}
