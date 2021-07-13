object Sum extends App {

    def findSum(num: Int): Int = num match {
	case 0 => 0
        case 1 => 1
        case _ => num + findSum(num - 1)
    }

    println(findSum(5));

}

      