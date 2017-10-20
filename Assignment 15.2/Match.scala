

object Match {
  
  def courseMatch(course : String) : String = course match {
    case "android" => "Android course Price is : 12999"
    case "big data development " => "Big data development course Price is : 17999"
    case "spark" => "Spark course Price is : 19999"
    case _ =>  " Sorry ! , The course " + course + " is not available at Acadgild"
  }
 
  
  def main(args: Array[String]) : Unit = {
    
    println("Acadgild course details : \nCourses Available at Acadgild are : \nAndroid \nBig Data Development \nSpark \nPlease Enter your Choice(eg. spark)..." )
    var course = readLine().toString.toLowerCase 
    println(courseMatch(course))
    
  }
}