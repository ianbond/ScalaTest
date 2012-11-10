object TestApp extends App {
	println("Hello, Scala")
	println(abs(-100))
	
	def abs(x: Int) : Int = {
	  if (x >=0) x else -x
	}
	
}