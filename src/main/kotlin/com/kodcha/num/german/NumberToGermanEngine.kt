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
                "0" -> if(noNeedZero) "" else NumberEnglish.ZERO.english.lowercase(Locale.getDefault())
                "1" -> NumberEnglish.ONE.english.lowercase(Locale.getDefault())
                "2" -> NumberEnglish.TWO.english.lowercase(Locale.getDefault())
                "3" -> NumberEnglish.THREE.english.lowercase(Locale.getDefault())
                "4" -> NumberEnglish.FOUR.english.lowercase(Locale.getDefault())
                "5" -> NumberEnglish.FIVE.english.lowercase(Locale.getDefault())
                "6" -> NumberEnglish.SIX.english.lowercase(Locale.getDefault())
                "7" -> NumberEnglish.SEVEN.english.lowercase(Locale.getDefault())
                "8" -> NumberEnglish.EIGHT.english.lowercase(Locale.getDefault())
                "9" -> NumberEnglish.NINE.english.lowercase(Locale.getDefault())
                else -> EMPTY
            }
        }
        return EMPTY
    }
}