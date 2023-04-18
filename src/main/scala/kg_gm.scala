import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._


object kg_gm {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Convert KG to Grams")
      .master("local[*]")
      .getOrCreate()

    val weightsDF = spark.createDataFrame(Seq(
      ("Alice", 60.0),
      ("Bob", 75.2),
      ("Charlie", 82.7),
      ("Dave", 100.0)
    )).toDF("name", "weight_kg")

    val weightsDFGm = weightsDF.withColumn("weight_gms",col("weight_kg")*1000)
    weightsDFGm.show()
    spark.stop()
  }
}
