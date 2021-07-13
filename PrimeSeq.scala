object PrimeSeq extends App{

def findPrimeSeq(i : Int) : List[Int] = i match {
    case 2 => List(2)
    case _ => {
    val primeList = findPrimeSeq(i-1)
    if(isPrime(i, primeList)) i :: primeList else primeList
    }
}

def isPrime(num : Int, prePrimes : List[Int]) : Boolean = {
    prePrimes.forall(num % _ != 0)
}

println(findPrimeSeq(10));

} 