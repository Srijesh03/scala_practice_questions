import org.apache.spark.sql.SparkSession

import scala.io.StdIn


object temp_dg_fr {
  def main(args:Array[String]) :Unit = {
    val spark= SparkSession.builder()
      .appName("TempConverter")
      .master("local[*]")
      .getOrCreate()

    // Read the temperature in degrees Celsius from the user
    print("Enter the temperature in degrees Celsius: ")
    var inputnum = StdIn.readInt()

    var celcius = inputnum.toDouble

    var farhenite = (celcius *9 /5 + 32)

    println(farhenite)
    spark.stop()





  }



}
