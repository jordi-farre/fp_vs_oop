package oop

class OopPriceCalculator {

  val taxes:Map[String, Tax] = Map("US-AL" -> new AlabamaTax,
    "US-AK" -> new AlaskaTax)

  def calculatePriceWithTax(amount: Double, state: String): Double = taxes(state).applyTax(amount)

}
