

object PartialFuncton {
  // calculate the sum of three numbers 
  def sum ( a: Int , b :Int , c:Int ) : Int = a+b+c
  
  // partial function in which one argument is fixed and two variable argument
  def partsum  = sum(4, _:Int,_:Int ) 
  
  // function which takes one function as an argument .
  def sqrnum (f : (Int,Int) => Int) : Unit = {
    
    val x = f(2,3)
     println (s"sum of the three numbers is " + x)
     println (s"square of the sum is " +x*x)
      
  }
  def main(agrs : Array[String]) :  Unit = {
    // function call
    sqrnum(partsum)
  }
  
}