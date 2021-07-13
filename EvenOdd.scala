object EvenOdd extends App{

def isEven(num: Int): Boolean = num match{
	case 0 => true
	case _ => isOdd(num - 1)
}

def isOdd(num: Int): Boolean = num match{
	case 0 => false
	case _ => isEven(num - 1)
}

println(isEven(101));

}