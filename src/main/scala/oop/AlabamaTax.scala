package oop

class AlabamaTax extends Tax {

  override def applyTax(amount: Double): Double = amount + (amount * 2 / 100)

}
