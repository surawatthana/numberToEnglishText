package com.kodcha.num.german

import java.util.*

class NumberToGermanEngine(val input: Long) {

    private val AND = "und"
    private val EMPTY = ""
    private val TY = "zig"
    private val HUNDRED = "hundert"
    private val EN = "en"
    private val SPACE = " "
    private var stringBuilder = StringBuilder()

    internal fun numberToWords() : String{
        stringBuilder = StringBuilder()
        val mutableListChar: MutableList<Char> = mutableListOf<Char>()
        input.toString().toCharArray().forEach { a -> mutableListChar.add(a) }
        var result =  numToWords(mutableListChar)
        result = result.replace("ein million", "eine million")
        result = result.replace("ein milliarde", "eine milliarde")
        result = result.replace("ein billion", "eine billion")
        result = result.replace( "million tausend", "million ")
        result = result.replace( "millionen tausend", "millionen ")
        result = result.replace( "milliarde tausend", "milliarde ")
        result = result.replace( "milliarden tausend", "milliarden ")
        return result.trim()
    }

    private fun numToWords(charList: MutableList<Char>): String {
        if (charList.size == 1) {
            return stringBuilder.append(single(charList[0].toString(), false)).toString().lowercase(Locale.getDefault())
                .trim()
        }

        if (charList.size == 2) {
            return stringBuilder.append(tens(charList[0].toString() + charList[1].toString())).toString()
                .lowercase(Locale.getDefault()).trim()
        }

        when (charList.size % 3) {
            0 -> { // hundreds
                if (charList[0] != '0') {
                    stringBuilder.append(hundreds(charList[0]))
                }
                charList.removeFirst()
                return numToWords(charList)
            }
            1 -> {// power of thousand
                if (charList[0].toString() != "0") {
                    var single = single(charList[0].toString(), true)
                    if (single == "eins"){
                        single = "ein"
                    }
                    stringBuilder.append(single + determinePowerOfThousand(charList.size, Integer.valueOf(charList[0].toString())))
                }
                charList.removeFirst()
                return numToWords(charList)
            }
            2 -> {// tens
                val input = charList[0] + "" + charList[1]
                val intInput = input.toInt()
                if (tens(input) != EMPTY) {
                    stringBuilder.append(tens(input))
                }
                charList.removeFirst()
                charList.removeFirst()
                if (charList.size > 2 && !endsWithPowerOfThousands(stringBuilder.toString())) {
                    stringBuilder.append(determinePowerOfThousand(charList.size, intInput))
                }
                return numToWords(charList)
            }
            else -> return EMPTY
        }
    }

    private fun endsWithPowerOfThousands(input: String): Boolean {
        return (input.trim().endsWith(NumberGerman.THOUSAND.german) || input.trim().endsWith(NumberGerman.MILLION.german + SPACE) || input.trim().endsWith(NumberGerman.MILLION.german+"en ") || input.trim().endsWith(NumberGerman.BILLION.german) || input.trim().endsWith(NumberGerman.BILLION.german + "n") || input.trim().endsWith(NumberGerman.TRILLION.german) || input.trim().endsWith(NumberGerman.TRILLION.german + "en"))
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

    private fun tens(value: String) : String {
//        var prefix = EMPTY
//        var suffix = EMPTY

        if (value.length == 2){
            when(value.substring(0, 1)){
                "0" -> return single(value.substring(1), true)
                "1" -> {
                    when(Integer.valueOf(value)) {
                        10 -> return NumberGerman.TEN.german.lowercase(Locale.getDefault())
                        11 -> return NumberGerman.ELEVEN.german.lowercase(Locale.getDefault())
                        12 -> return NumberGerman.TWELVE.german.lowercase(Locale.getDefault())
                        else -> {

                            var prefix = single(value.substring(1), true)

                            if (prefix.endsWith("s")) {
                                prefix = prefix.substring(0, prefix.length - 1)
                            } else if (prefix.endsWith("en")) {
                                prefix = prefix.replace("en", "")
                            }

                            return prefix + NumberGerman.TEN.german.lowercase(Locale.getDefault())
                        }
                    }
                }
                else -> {
                    when(Integer.valueOf(value)) {
                        20 -> return NumberGerman.TWENTY.german.lowercase(Locale.getDefault())
                        21 -> return NumberGerman.ONE.german.replace("s", "").lowercase(Locale.getDefault()) + AND + NumberGerman.TWENTY.german.lowercase(Locale.getDefault())
                        else -> {
                            val prefix = single(value.substring(1), true)
                            var result =  prefix + AND + getTy(value)
                            if (result.startsWith(AND)) {
                                result = result.replace(AND, EMPTY)
                            }
                            if (result.startsWith(NumberGerman.ONE.german+AND)) {
                                result = result.replace(NumberGerman.ONE.german+AND,"ein"+AND)
                            }
                            return result
                        }
                    }
                }
            }
        }

        return EMPTY
    }

    private fun getTy(prefix: String) : String {

        if (prefix.startsWith("2")) {
            return NumberGerman.TWENTY.german.lowercase(Locale.getDefault())
        }
        if (prefix.startsWith("3")) {
            return NumberGerman.THIRTY.german.lowercase(Locale.getDefault())
        }

        var single = single(prefix.substring(0, 1), true)
        if (single.endsWith("s")) {
            single = single.substring(0, single.length - 1)
        } else if (single.endsWith("en")) {
            single = single.replace("en", "")
        }
        return single + TY
    }

    private fun hundreds(value: Char) : String {
        return when (value) {
            '1' -> "einhundert"
            else -> {
                single(value+"", true) + HUNDRED
            }
        }
    }

    private fun determinePowerOfThousand(size: Int, value: Int) : String {
        if ((size == 3 || size == 4)) {
            return NumberGerman.THOUSAND.german.lowercase(Locale.getDefault())
        } else if ((size == 6 || size == 7) && value > 0) {
            return if (value == 1) {
                SPACE + NumberGerman.MILLION.german.lowercase(Locale.getDefault()) + SPACE
            } else {
                SPACE + NumberGerman.MILLION.german.lowercase(Locale.getDefault())+ EN + SPACE
            }
        } else if ((size == 9 || size == 10) && value > 0) {
            return if (value == 1) {
                SPACE + NumberGerman.BILLION.german.lowercase(Locale.getDefault()) + SPACE
            } else {
                SPACE + NumberGerman.BILLION.german.lowercase(Locale.getDefault())+"n" + SPACE
            }
        } else if ((size == 12 || size == 13) && value > 0) {
            return if (value == 1) {
                SPACE + NumberGerman.TRILLION.german.lowercase(Locale.getDefault()) + SPACE
            } else {
                SPACE + NumberGerman.TRILLION.german.lowercase(Locale.getDefault())+ EN + SPACE
            }
        }


        return  EMPTY
    }
}