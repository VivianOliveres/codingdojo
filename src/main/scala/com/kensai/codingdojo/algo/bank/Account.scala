package com.kensai.codingdojo.algo.bank

class Account(val digit1: Char,
              val digit2: Char,
              val digit3: Char,
              val digit4: Char,
              val digit5: Char,
              val digit6: Char,
              val digit7: Char,
              val digit8: Char,
              val digit9: Char) {

  def this(code: String) {
    this(code.charAt(0), code.charAt(1), code.charAt(2), code.charAt(3), code.charAt(4), code.charAt(5), code.charAt(6), code.charAt(7), code.charAt(8))
  }

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
