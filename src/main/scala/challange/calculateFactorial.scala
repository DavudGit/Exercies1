package challange

import scala.annotation.tailrec

object calculateFactorial {


  def calcWithTailRec(n: BigInt): BigInt = {
    @tailrec
    def facHelper(x: BigInt, acc: BigInt): BigInt = {
      if (x == 0) acc
      else facHelper(x - 1, x * acc)
    }

    facHelper(n, 1)
  }


  def calcWithRec(n: Int): BigInt = {
    if (n <= 0) 1
    else n * calcWithRec(n - 1)
  }

}
