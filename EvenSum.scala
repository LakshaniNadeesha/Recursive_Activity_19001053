//Write  a recursive function to get the addition of all even numbers less than given number.

object EvenSum extends App{

def evenSum(n: Int):Int = n match{
	case 0 => 0
	case x if (x<=1) => 0
	case y if (y%2==1) => evenSum(n-1)
	case _ => n + evenSum(n-1)
}
	
evenSum(10);
}
	
