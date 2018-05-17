package com.djeffou.utils

import org.scalatest.{FlatSpecLike, Matchers}

import scala.util.Random

class UtilsTest extends FlatSpecLike with Matchers {

  private val random = new Random() 
  
  "ParseUnsignedLongFromBitsString" should "parse a positive bits string" in {
    val long = Math.abs(random.nextLong())

    val result = Utils.parseUnsignedLongFromBitsString(long.toBinaryString)

    result shouldBe long
  }

  "ParseUnsignedLongFromBitsString" should "parse a negative bits string" in {
    val long = - Math.abs(random.nextLong())

    val result = Utils.parseUnsignedLongFromBitsString(long.toBinaryString)

    result shouldBe long
  }
}
