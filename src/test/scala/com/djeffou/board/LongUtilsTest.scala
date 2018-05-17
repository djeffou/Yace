package com.djeffou.board

import com.djeffou.constants.Mask
import org.scalatest.{FlatSpecLike, Matchers}

class LongUtilsTest extends FlatSpecLike with Matchers {

  "The bitcount of a long" should "be equals to the number of bits equal to 1" in { 
    LongUtils.bitCount(0L) shouldBe 0
    LongUtils.bitCount(Long.MaxValue) shouldBe 63
    LongUtils.bitCount(3) shouldBe 1
  }
  
  "The number of leading zeros" should "be the number of zeros before the first 1 bit" in {
    LongUtils.numberOfLeadingZeros(Mask.EMPTY) shouldBe 64
    LongUtils.numberOfLeadingZeros(Mask.UNIVERSE) shouldBe 0
    LongUtils.numberOfLeadingZeros(3) shouldBe 62
  }
      
}
