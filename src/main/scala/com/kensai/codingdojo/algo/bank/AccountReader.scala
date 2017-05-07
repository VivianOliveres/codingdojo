package com.kensai.codingdojo.algo.bank

import scala.io.Source

class AccountReader {

  def readAccount(path: String): List[Account] = {
    Source.fromFile(path).foreach(print(_))
    Source.fromFile(path)
      .mkString.split("\n").toList // By line
      .grouped(4)
      .map(grouped => (grouped(0), grouped(1), grouped(2)).zipped.toList) // list of 3 elements
      .flatten
      .grouped(3)
      .filter(seq => seq.size == 3)
      .map(seq => (seq(0)._1, seq(0)._2, seq(0)._3, seq(1)._1, seq(1)._2, seq(1)._3, seq(2)._1, seq(2)._2, seq(2)._3))
      .map {
        case (' ','|','|','_',' ','_',' ','|','|') => '0'
        case (' ',' ',' ',' ',' ',' ',' ','|','|') => '1'
        case (' ',' ','|','_','_','_',' ','|',' ') => '2'
        case (' ',' ',' ','_','_','_',' ','|','|') => '3'
        case (' ','|',' ',' ','_',' ',' ','|','|') => '4'
        case (' ','|',' ','_','_','_',' ',' ','|') => '5'
        case (' ','|','|','_','_','_',' ',' ','|') => '6'
        case (' ',' ',' ','_',' ',' ',' ','|','|') => '7'
        case (' ','|','|','_','_','_',' ','|','|') => '8'
        case (' ','|',' ','_','_','_',' ','|','|') => '9'
        case _ => '?';
      }
      .grouped(9)
      .map(list => new Account(list(0), list(1), list(2), list(3), list(4), list(5), list(6), list(7), list(8)))
      .toList
  }

  def readAccounts(paths: List[String]): List[Account] = {
    paths.map(readAccount(_))
    paths.map(Source.fromFile(_))
    List.empty[Account];
  }
}
