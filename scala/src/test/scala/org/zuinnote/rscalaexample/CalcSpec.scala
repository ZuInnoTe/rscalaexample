package org.zuinnote.rscalaexample



import org.scalatest._

class CalcSpec extends UnitSpec {
  "Scala: 1 + 1 " should "equal 2" in {
    val scalaCalc = new RScalaExample()
    assert(scalaCalc.calcScala(1,1) === 2)
  }

  "R from Scala: 1 + 1 " should "equal 2" in {
    val scalaCalc = new RScalaExample()
    assert(scalaCalc.calcR(1,1) === 2)
  }

}
