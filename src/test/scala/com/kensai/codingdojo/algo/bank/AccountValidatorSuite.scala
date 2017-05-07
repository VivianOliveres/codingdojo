package com.kensai.codingdojo.algo.bank

import org.scalatest._

class AccountValidatorSuite extends FunSuite with Matchers {

  val validator = new AccountValidator()

  test("Account[345882865] should be valid") {
    val account: Account = new Account(3, 4, 5, 8, 8, 2, 8, 6, 5)

    val isValid: Boolean = validator(account)

    isValid shouldBe true
  }

  test("Account[345882866] should not be valid") {
    val account: Account = new Account(3, 4, 5, 8, 8, 2, 8, 6, 6)

    val isValid: Boolean = validator(account)

    isValid shouldBe false
  }

}
