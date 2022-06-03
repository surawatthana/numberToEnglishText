package com.kodcha.num.german

import com.kodcha.num.english.NumberEnglish
import java.util.*

class NumberToGermanEngine(val input: Long) {

    private val SPACE = " "
    private val EMPTY = ""
    private var stringBuilder = StringBuilder()

    internal fun numberToWords() : String{
        stringBuilder = StringBuilder()
        var mutableListChar: MutableList<Char> = mutableListOf<Char>()
        input.toString().toCharArray().forEach { a -> mutableListChar.add(a) }
        return numToWords(mutableListChar)
    }

    private fun numToWords(charList: MutableList<Char>): String {
        if (charList.size == 1) {
            return stringBuilder.append(single(charList[0].toString(), false)).toString().lowercase(Locale.getDefault())
                .trim()
        }
        
        
        
        return EMPTY
    }


    private fun single(value : String, noNeedZero: Boolean) : String {
        if (value.length == 1) {
            return when (value) {
                "0" -> if(noNeedZero) "" else NumberGerman.ZERO.german.lowercase(Locale.getDefault())
                "1" -> NumberGerman.ONE.german.lowercase(Locale.getDefault())
                "2" -> NumberGerman.TWO.german.lowercase(Locale.getDefault())
                "3" -> NumberGerman.THREE.german.lowercase(Locale.getDefault())
                "4" -> NumberGerman.FOUR.german.lowercase(Locale.getDefault())
                "5" -> NumberGerman.FIVE.german.lowercase(Locale.getDefault())
                "6" -> NumberGerman.SIX.german.lowercase(Locale.getDefault())
                "7" -> NumberGerman.SEVEN.german.lowercase(Locale.getDefault())
                "8" -> NumberGerman.EIGHT.german.lowercase(Locale.getDefault())
                "9" -> NumberGerman.NINE.german.lowercase(Locale.getDefault())
                else -> EMPTY
            }
        }
        return EMPTY
    }
}