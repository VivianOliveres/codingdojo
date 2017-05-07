package com.kensai.codingdojo.algo.bank

class AccountValidator {

  def apply(account: Account) : Boolean = {
    comupteAccountHash(account) % 11 == 0
  }

  private def comupteAccountHash(account: Account) : Int = {
    account.digit9 +
      account.digit8 * 2 +
      account.digit7 * 3 +
      account.digit6 * 4 +
      account.digit5 * 5 +
      account.digit4 * 6 +
      account.digit3 * 7 +
      account.digit2 * 8 +
      account.digit1 * 9
  }
}
