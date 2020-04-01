object Prime extends App {

  @scala.annotation.tailrec
  def isPrime(accum: Long, modulo: Long = 2L): Boolean = {
    // to save iterations as only need up to half
    (accum < modulo * modulo) || (accum % modulo match {
      case 0 => accum == modulo
      case _ => isPrime(accum, modulo + 1L)
    })
  }

  @scala.annotation.tailrec
  def getPrime(targetPrime: Long, accumulator: Long = 2, primeCount: Long = 0): Long = {

    def askIfPrime(n: Long, primeCount: Long): Long = if (isPrime(n)) {
      primeCount + 1
    } else {
      primeCount
    }

    if (primeCount == targetPrime) accumulator - 1 else { // -1 to remove final iteration
      getPrime(targetPrime, accumulator + 1, askIfPrime(accumulator, primeCount))
    }
  }

  println(s"Works for example of 6th prime: ${getPrime(6) == 13} ")
  println(s"10001st prime = ${getPrime(10001)}") // 104743

}
