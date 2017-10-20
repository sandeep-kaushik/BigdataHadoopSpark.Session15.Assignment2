

object PartialFuncton {
  
  def sum ( a: Int , b :Int , c:Int ) : Int = a+b+c 
  def partsum  = sum(4, _:Int,_:Int ) 
  def sqrnum (f : (Int,Int) => Int) : Unit = {
    
    val x = f(2,3)
     println (s"sum of the three numbers is " + x)
     println (s"square of the sum is " +x*x)
      
  }
  def main(agrs : Array[String]) :  Unit = {
    
    sqrnum(partsum)
  }
  
}