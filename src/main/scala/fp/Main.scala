package fp

object Main extends App {

  val priceCalculator = new FpPriceCalculator();
  println(priceCalculator.calculatePriceWithTax(200, "US-AL"))
  println(priceCalculator.calculatePriceWithTax(200, "US-AK"))

}
