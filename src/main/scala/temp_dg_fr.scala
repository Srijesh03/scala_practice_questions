import org.apache.spark.sql.SparkSession

object temp_dg_fr {
  def main(args:Array[String]) :Unit = {
    val spark= SparkSession.builder
      .appName("TempConverter")
      .getOrCreate()

    //take input from user
    print("Enter the temperature in degree celcius :")
    val temp_celcius = scala.io.StdIn.readInt()

    //convert it into dataframe and apply changes to convert it to farhentite

    val temp_Df = seq(temp_celcius).toDF("celcius")

    val output = temp_Df.withColumn("farhenite",col("celcius")*9/5+32)

    //Display the converted temperature
    output.show()



  }



}
