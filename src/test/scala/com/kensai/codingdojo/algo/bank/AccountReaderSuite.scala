package com.kensai.codingdojo.algo.bank

import org.scalatest._

class AccountReaderSuite extends FunSuite with Matchers{

  val reader = new AccountReader()

  test("Read 1_account.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/1_account.txt")
    accounts should have size 1

    val account: Account = accounts.head
    account shouldEqual new Account(1, 2, 3, 4, 5, 6, 7, 8, 9)
  }

  test("Read 2_accounts.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/2_accounts.txt")
    accounts should have size 2

    val account1: Account = accounts.head
    account1 shouldEqual new Account(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val account2: Account = accounts(1)
    account2 shouldEqual new Account(0, 1, 8, 5, 6, 1, 3, 9, 7)
  }

}
