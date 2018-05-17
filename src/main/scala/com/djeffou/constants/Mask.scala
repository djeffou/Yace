package com.djeffou.constants

import com.djeffou.utils.Utils

object Mask {

  val FIRST: Long = 1
  
  val LAST: Long = Mask.FIRST << 63

  val CASTLING_WHITE_KING_FREE: Long = Utils.getBitboardFromString(
    "00000000" + 
    "00000000" + 
    "00000000" + 
    "00000000" + 
    "00000000" + 
    "00000000" + 
    "00000000" + 
    "00000110"
  )

  val CASTLING_WHITE_KING_ATTACKED: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00001110")

  val CASTLING_WHITE_QUEEN_FREE: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "01110000")

  val CASTLING_WHITE_QUEEN_ATTACKED: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00111000")

  val CASTLING_BLACK_KING_FREE: Long = Utils.getBitboardFromString("00000110" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val CASTLING_BLACK_KING_ATTACKED: Long = Utils.getBitboardFromString("00001110" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val CASTLING_BLACK_QUEEN_FREE: Long = Utils.getBitboardFromString("01110000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val CASTLING_BLACK_QUEEN_ATTACKED: Long = Utils.getBitboardFromString("00111000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val UNIVERSE: Long = Utils.getBitboardFromString("11111111" + "11111111" + "11111111" + "11111111" + "11111111" + "11111111" + "11111111" + "11111111")

  val EMPTY: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  // FILES

  val FILE_A: Long = Utils.getBitboardFromString("10000000" + "10000000" + "10000000" + "10000000" + "10000000" + "10000000" + "10000000" + "10000000")

  val FILE_B: Long = Utils.getBitboardFromString("01000000" + "01000000" + "01000000" + "01000000" + "01000000" + "01000000" + "01000000" + "01000000")

  val FILE_C: Long = Utils.getBitboardFromString("00100000" + "00100000" + "00100000" + "00100000" + "00100000" + "00100000" + "00100000" + "00100000")

  val FILE_D: Long = Utils.getBitboardFromString("00010000" + "00010000" + "00010000" + "00010000" + "00010000" + "00010000" + "00010000" + "00010000")

  val FILE_E: Long = Utils.getBitboardFromString("00001000" + "00001000" + "00001000" + "00001000" + "00001000" + "00001000" + "00001000" + "00001000")

  val FILE_F: Long = Utils.getBitboardFromString("00000100" + "00000100" + "00000100" + "00000100" + "00000100" + "00000100" + "00000100" + "00000100")

  val FILE_G: Long = Utils.getBitboardFromString("00000010" + "00000010" + "00000010" + "00000010" + "00000010" + "00000010" + "00000010" + "00000010")

  val FILE_H: Long = Utils.getBitboardFromString("00000001" + "00000001" + "00000001" + "00000001" + "00000001" + "00000001" + "00000001" + "00000001")

  val ROW_1: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "11111111")

  val ROW_2: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "11111111" + "00000000")

  val ROW_3: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "11111111" + "00000000" + "00000000")

  val ROW_4: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "00000000" + "11111111" + "00000000" + "00000000" + "00000000")

  val ROW_5: Long = Utils.getBitboardFromString("00000000" + "00000000" + "00000000" + "11111111" + "00000000" + "00000000" + "00000000" + "00000000")

  val ROW_6: Long = Utils.getBitboardFromString("00000000" + "00000000" + "11111111" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val ROW_7: Long = Utils.getBitboardFromString("00000000" + "11111111" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val ROW_8: Long = Utils.getBitboardFromString("11111111" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000")

  val ROWS_1_8: Long = Utils.getBitboardFromString("11111111" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "00000000" + "11111111")

  val ROWS_2_7: Long = ~Mask.ROWS_1_8
}
