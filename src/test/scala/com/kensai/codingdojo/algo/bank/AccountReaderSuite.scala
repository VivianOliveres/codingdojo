package com.kensai.codingdojo.algo.bank

import org.scalatest._

class AccountReaderSuite extends FunSuite with Matchers{

  val reader = new AccountReader()

  test("Read 1_account.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/1_account.txt")
    accounts should have size 1

    val account: Account = accounts.head
    account shouldEqual new Account("123456789")
  }

  test("Read 2_accounts.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/2_accounts.txt")
    accounts should have size 2

    val account1: Account = accounts.head
    account1 shouldEqual new Account("123456789")

    val account2: Account = accounts(1)
    account2 shouldEqual new Account("018561397")
  }

  test("user_story_1.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/user_story_1.txt")
    accounts should have size 11

    accounts should contain (new Account("000000000"))
    accounts should contain (new Account("111111111"))
    accounts should contain (new Account("222222222"))
    accounts should contain (new Account("333333333"))
    accounts should contain (new Account("444444444"))
    accounts should contain (new Account("555555555"))
    accounts should contain (new Account("666666666"))
    accounts should contain (new Account("777777777"))
    accounts should contain (new Account("888888888"))
    accounts should contain (new Account("999999999"))
    accounts should contain (new Account("123456789"))
  }

}
