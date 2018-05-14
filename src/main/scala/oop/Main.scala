package oop

object Main extends App {

  val priceCalculator = new OopPriceCalculator();
  println(priceCalculator.calculatePriceWithTax(200, "US-AL"))
  println(priceCalculator.calculatePriceWithTax(200, "US-AK"))

}
