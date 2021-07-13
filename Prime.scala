object Prime extends App{

def isPrime(n: Int): Boolean = {
    def isPrimeUntil(i: Int): Boolean =
      if (i <= 1) true
      else n % i != 0 && isPrimeUntil(i-1)

    isPrimeUntil(n / 2)
  }

println(isPrime(5));
println(isPrime(8));

}
