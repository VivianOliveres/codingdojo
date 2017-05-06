package com.kensai.codingdojo.algo.bank

class Account(val digit1: Int,
              val digit2: Int,
              val digit3: Int,
              val digit4: Int,
              val digit5: Int,
              val digit6: Int,
              val digit7: Int,
              val digit8: Int,
              val digit9: Int) {

  override def toString: String = s"Account[$digit1$digit2$digit3$digit4$digit5$digit6$digit7$digit8$digit9]"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Account]

  override def equals(other: Any): Boolean = other match {
    case that: Account =>
      (that canEqual this) &&
        digit1 == that.digit1 &&
        digit2 == that.digit2 &&
        digit3 == that.digit3 &&
        digit4 == that.digit4 &&
        digit5 == that.digit5 &&
        digit6 == that.digit6 &&
        digit7 == that.digit7 &&
        digit8 == that.digit8 &&
        digit9 == that.digit9
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
