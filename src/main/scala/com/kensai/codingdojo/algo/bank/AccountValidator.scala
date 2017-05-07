package com.kensai.codingdojo.algo.bank

class AccountValidator {

  def apply(account: Account) : AccountValidatorResult.Value = {
    if (isAccountIllegal(account)) {
      AccountValidatorResult.ILL
    } else if (isAccountError(account)) {
      AccountValidatorResult.ERR
    } else {
      AccountValidatorResult.OK
    }
  }

  private def isAccountError(account: Account) : Boolean = {
    comupteAccountHash(account) % 11 != 0
  }

  private def isAccountIllegal(account: Account) : Boolean = {
    account.digit9 == '?' ||
      account.digit8 == '?' ||
      account.digit7 == '?' ||
      account.digit6 == '?' ||
      account.digit5 == '?' ||
      account.digit4 == '?' ||
      account.digit3 == '?' ||
      account.digit2 == '?' ||
      account.digit1 == '?'
  }

  private def comupteAccountHash(account: Account) : Int = {
    account.digit9.asDigit +
      account.digit8.asDigit * 2 +
      account.digit7.asDigit * 3 +
      account.digit6.asDigit * 4 +
      account.digit5.asDigit * 5 +
      account.digit4.asDigit * 6 +
      account.digit3.asDigit * 7 +
      account.digit2.asDigit * 8 +
      account.digit1.asDigit * 9
  }
}

object AccountValidatorResult extends Enumeration {
  val OK = Value("OK")
  val ILL = Value("ILL")
  val ERR = Value("ERR")
}

