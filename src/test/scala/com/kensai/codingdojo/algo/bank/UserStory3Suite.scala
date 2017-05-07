package com.kensai.codingdojo.algo.bank

import org.scalatest._

class UserStory3Suite extends FunSuite with Matchers {

  val reader = new AccountReader()
  val validator = new AccountValidator()

  test("Account[345882865] should be OK") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/user_story_3.txt")
    accounts should have size 3

    accounts(0) shouldEqual (new Account("000000051"))
    accounts(1) shouldEqual (new Account("49006771?"))
    accounts(2) shouldEqual (new Account("1234?678?"))

    validator(accounts(0)) shouldEqual AccountValidatorResult.OK
    validator(accounts(1)) shouldEqual AccountValidatorResult.ILL
    validator(accounts(2)) shouldEqual AccountValidatorResult.ILL
  }

}
