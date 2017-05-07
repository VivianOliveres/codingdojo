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

  test("user_story_1.txt") {
    val accounts: List[Account] = reader.readAccount("src/test/resources/bank/user_story_1.txt")
    accounts should have size 11

    accounts should contain (new Account(0, 0, 0, 0, 0, 0, 0, 0, 0))
    accounts should contain (new Account(1, 1, 1, 1, 1, 1, 1, 1, 1))
    accounts should contain (new Account(2, 2, 2, 2, 2, 2, 2, 2, 2))
    accounts should contain (new Account(3, 3, 3, 3, 3, 3, 3, 3, 3))
    accounts should contain (new Account(4, 4, 4, 4, 4, 4, 4, 4, 4))
    accounts should contain (new Account(5, 5, 5, 5, 5, 5, 5, 5, 5))
    accounts should contain (new Account(6, 6, 6, 6, 6, 6, 6, 6, 6))
    accounts should contain (new Account(7, 7, 7, 7, 7, 7, 7, 7, 7))
    accounts should contain (new Account(8, 8, 8, 8, 8, 8, 8, 8, 8))
    accounts should contain (new Account(9, 9, 9, 9, 9, 9, 9, 9, 9))
    accounts should contain (new Account(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

}
