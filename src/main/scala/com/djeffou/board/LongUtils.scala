package com.djeffou.board

object LongUtils {

  def numberOfLeadingZeros(i: Long): Int = {
    if (i == 0) {
      64
    } else {
      var n = 1
      var x: Int = (i >>> 32).toInt
      if (x == 0) {
        n += 32
        x = i.toInt
      }
      if ((x >>> 16) == 0) {
        n += 16
        x <<= 16
      }
      if ((x >>> 24) == 0) {
        n += 8
        x <<= 8
      }
      if ((x >>> 28) == 0) {
        n += 4
        x <<= 4
      }
      if ((x >>> 30) == 0) {
        n += 2
        x <<= 2
      }
      n -= x >>> 31
      n
    }
  }

  def numberOfTrailingZeros(i: Long): Int = {
    if (i == 0) {
      64
    } else {
      var x = 0
      var y = 0
      var n = 63
      y = i.toInt
      if (y != 0) {
        n = n - 32
        x = y
      }
      else x = (i >>> 32).toInt
      y = x << 16
      if (y != 0) {
        n = n - 16
        x = y
      }
      y = x << 8
      if (y != 0) {
        n = n - 8
        x = y
      }
      y = x << 4
      if (y != 0) {
        n = n - 4
        x = y
      }
      y = x << 2
      if (y != 0) {
        n = n - 2
        x = y
      }
      n - ((x << 1) >>> 31)
    }
  }

  def bitCount(i: Long): Int = {
    var j = i 
    j = j - ((j >>> 1) & 0x5555555555555555L)
    j = (j & 0x3333333333333333L) + ((j >>> 2) & 0x3333333333333333L)
    j = (j + (j >>> 4)) & 0x0f0f0f0f0f0f0f0fL
    j = j + (j >>> 8)
    j = j + (j >>> 16)
    j = j + (j >>> 32)
    j.toInt & 0x7f
  }
}
