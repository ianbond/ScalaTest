object TestApp {
	
	def abs(x: Int) : Int = {
	  if (x >=0) x else -x
	}
	
	def main(args: Array[String]) {
	
	  println("Hello, Scala")
	  println(abs(-100))
	  
	}
	
}