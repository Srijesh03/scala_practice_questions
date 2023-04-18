import org.apache.spark.sql.SparkSession

import scala.io.StdIn

object q4 extends App {

  val spark = SparkSession.builder()
    .appName("question4")
    .master("local[*]")
    .getOrCreate()

  //1store a number in vairable
  println("Please enter a number")
  val num: Int = StdIn.readInt()

  //2if value is not within range of (100-1000) print number is not within the range
  if (num >= 100 && num <= 1000) {
    println("Number is in range")
  } else {
    println("number is not in range ")
  }

  //check for even or odd

  if (num%2 == 0)
    {println("Number is even")}
  else
    {println("Number is odd")}


}





