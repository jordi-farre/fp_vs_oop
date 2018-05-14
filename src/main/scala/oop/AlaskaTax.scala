package oop

class AlaskaTax extends Tax {

  override def applyTax(amount: Double): Double = amount + (amount * 4 / 100)

}
