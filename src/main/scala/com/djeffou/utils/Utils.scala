package com.djeffou.utils

object Utils {

  def parseUnsignedLongFromBitsString(bitsString: String): Long = {
    java.lang.Long.parseUnsignedLong(bitsString, 2)
  }
  
  def getBitboardFromString(s: String): Long = {
    if (s.length != 64) throw new IllegalArgumentException("String length must be 64")
     
    val correctedString =
      s.sliding(8, 8)  
      .map(line => line.reverse)
      .toList
      .mkString

    parseUnsignedLongFromBitsString(correctedString)
  }
}
