package com.kodcha.num.english

import java.util.*

class NumberToEnglishEngine(val input: Long) {

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

        if (charList.size == 2) {
            return stringBuilder.append(tens(charList[0].toString() + charList[1].toString())).toString()
                .lowercase(Locale.getDefault()).trim()
        }

        when (charList.size % 3) {
            0 -> { // hundreds
                if (charList[0].toString() != "0") {
                    stringBuilder.append(single(charList[0].toString(), true) + SPACE + NumberEnglish.HUNDRED.english
                        .lowercase(Locale.getDefault()) + SPACE)
                }
                charList.removeFirst()
                return numToWords(charList)
            }
            1 -> {// power of thousand
                if (charList[0].toString() != "0") {
                    stringBuilder.append(single(charList[0].toString(),
                        true) + SPACE + determinePowerOfThousand(charList.size) + SPACE)
                }
                charList.removeFirst()
                return numToWords(charList)
            }
            2 -> {// tens
                var input = charList[0] + "" + charList[1]
                if (tens(input) != EMPTY) {
                    stringBuilder.append(tens(input) + SPACE)
                }
                charList.removeFirst()
                charList.removeFirst()
                if (charList.size > 2 && !endsWithPowerOfThousands(stringBuilder.toString())) {
                    stringBuilder.append(determinePowerOfThousand(charList.size) + SPACE)
                }
                return numToWords(charList)
            }
            else -> return EMPTY
        }
    }

    private fun endsWithPowerOfThousands(input: String): Boolean {
        return input != null && (input.trim().endsWith("thousand") || input.trim().endsWith("million") || input.trim().endsWith("billion") || input.trim().endsWith("trillion"))
    }

    private fun determinePowerOfThousand(size: Int) : String{
        return when(size) {
            3, 4 -> NumberEnglish.THOUSAND.english.lowercase(Locale.getDefault())
            6, 7 -> NumberEnglish.MILLION.english.lowercase(Locale.getDefault())
            9, 10 -> NumberEnglish.BILLION.english.lowercase(Locale.getDefault())
            12, 13 -> NumberEnglish.TRILLION.english.lowercase(Locale.getDefault())
            else -> ""
        }
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

    private fun tens(value: String) : String {
        var prefix = EMPTY
        var suffix = EMPTY
        if (value.length == 2){
            when(value.substring(0, 1)){
                "0" -> return single(value.substring(1), true)
                "1" -> {
                    when(Integer.valueOf(value)){
                        10 -> return NumberEnglish.TEN.english.lowercase(Locale.getDefault())
                        11 -> return NumberEnglish.ELEVEN.english.lowercase(Locale.getDefault())
                        12 -> return NumberEnglish.TWELVE.english.lowercase(Locale.getDefault())
                        13 -> return NumberEnglish.THIRTEEN.english.lowercase(Locale.getDefault())
                        14 -> return NumberEnglish.FOURTEEN.english.lowercase(Locale.getDefault())
                        15 -> return NumberEnglish.FIFTEEN.english.lowercase(Locale.getDefault())
                        16 -> return NumberEnglish.SIXTEEN.english.lowercase(Locale.getDefault())
                        17 -> return NumberEnglish.SEVENTEEN.english.lowercase(Locale.getDefault())
                        18 -> return NumberEnglish.EIGHTEEN.english.lowercase(Locale.getDefault())
                        19 -> return NumberEnglish.NINETEEN.english.lowercase(Locale.getDefault())
                    }
                }
                "2" -> prefix = NumberEnglish.TWENTY.english.lowercase(Locale.getDefault())
                "3" -> prefix = NumberEnglish.THIRTY.english.lowercase(Locale.getDefault())
                "4" -> prefix = NumberEnglish.FORTY.english.lowercase(Locale.getDefault())
                "5" -> prefix = NumberEnglish.FIFTY.english.lowercase(Locale.getDefault())
                "6" -> prefix = NumberEnglish.SIXTY.english.lowercase(Locale.getDefault())
                "7" -> prefix = NumberEnglish.SEVENTY.english.lowercase(Locale.getDefault())
                "8" -> prefix = NumberEnglish.EIGHTY.english.lowercase(Locale.getDefault())
                "9" -> prefix = NumberEnglish.NINETY.english.lowercase(Locale.getDefault())
            }

            suffix = if ("0" == value.substring(1))  EMPTY else single(value.substring(1), true)
        }

        return StringBuilder(prefix + SPACE + suffix).toString().trim()
    }

}





















