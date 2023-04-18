import org.apache.spark.sql.SparkSession

import scala.io.StdIn

object three_var extends App {
  val spark= SparkSession.builder()
    .appName("greatest_num")
    .master("local[*]")
    .getOrCreate()

  var number1 = StdIn.readInt()
  var number2=  StdIn.readInt()
  var number3 = StdIn.readInt()

  val max_num= List(number1,number2,number3).max

  println("The highest number is:",max_num)

  spark.stop()



}
