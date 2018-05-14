package fp

class FpPriceCalculator {

  val taxes = Map("US-AL" -> applyAlabamaTax _,
                  "US-AK" -> applyAlaskaTax _)

  def applyAlabamaTax(amount: Double): Double = amount + amount * 2 / 100

  def applyAlaskaTax(amount: Double): Double = amount + amount * 4 / 100

  def calculatePriceWithTax(amount: Double, state: String): Double = taxes(state).apply(amount)

}
