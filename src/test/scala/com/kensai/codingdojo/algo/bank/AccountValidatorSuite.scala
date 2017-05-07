package com.kensai.codingdojo.algo.bank

import org.scalatest._

class AccountValidatorSuite extends FunSuite with Matchers {

  val validator = new AccountValidator()

  test("Account[345882865] should be OK") {
    val account: Account = new Account("345882865")

    val isValid: AccountValidatorResult.Value = validator(account)

    isValid shouldBe AccountValidatorResult.OK
  }

  test("Account[345882866] should not be ERR") {
    val account: Account = new Account("345882866")

    val isValid: AccountValidatorResult.Value = validator(account)

    isValid shouldBe AccountValidatorResult.ERR
  }

}
