import java.util.*

class NumberToWordsEngine(val input: Long) {

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
                    stringBuilder.append(single(charList[0].toString(), true) + SPACE + NumberWords.HUNDRED.toString()
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
            3, 4 -> NumberWords.THOUSAND.toString().lowercase(Locale.getDefault())
            6, 7 -> NumberWords.MILLION.toString().lowercase(Locale.getDefault())
            9, 10 -> NumberWords.BILLION.toString().lowercase(Locale.getDefault())
            12, 13 -> NumberWords.TRILLION.toString().lowercase(Locale.getDefault())
            else -> ""
        }
    }

    private fun single(value : String, noNeedZero: Boolean) : String {
        if (value.length == 1) {
            return when (value) {
                "0" -> if(noNeedZero) "" else NumberWords.ZERO.toString().lowercase(Locale.getDefault())
                "1" -> NumberWords.ONE.toString().lowercase(Locale.getDefault())
                "2" -> NumberWords.TWO.toString().lowercase(Locale.getDefault())
                "3" -> NumberWords.THREE.toString().lowercase(Locale.getDefault())
                "4" -> NumberWords.FOUR.toString().lowercase(Locale.getDefault())
                "5" -> NumberWords.FIVE.toString().lowercase(Locale.getDefault())
                "6" -> NumberWords.SIX.toString().lowercase(Locale.getDefault())
                "7" -> NumberWords.SEVEN.toString().lowercase(Locale.getDefault())
                "8" -> NumberWords.EIGHT.toString().lowercase(Locale.getDefault())
                "9" -> NumberWords.NINE.toString().lowercase(Locale.getDefault())
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
                        10 -> return NumberWords.TEN.toString().lowercase(Locale.getDefault())
                        11 -> return NumberWords.ELEVEN.toString().lowercase(Locale.getDefault())
                        12 -> return NumberWords.TWELVE.toString().lowercase(Locale.getDefault())
                        13 -> return NumberWords.THIRTEEN.toString().lowercase(Locale.getDefault())
                        14 -> return NumberWords.FOURTEEN.toString().lowercase(Locale.getDefault())
                        15 -> return NumberWords.FIFTEEN.toString().lowercase(Locale.getDefault())
                        16 -> return NumberWords.SIXTEEN.toString().lowercase(Locale.getDefault())
                        17 -> return NumberWords.SEVENTEEN.toString().lowercase(Locale.getDefault())
                        18 -> return NumberWords.EIGHTEEN.toString().lowercase(Locale.getDefault())
                        19 -> return NumberWords.NINETEEN.toString().lowercase(Locale.getDefault())
                    }
                }
                "2" -> prefix = NumberWords.TWENTY.toString().lowercase(Locale.getDefault())
                "3" -> prefix = NumberWords.THIRTY.toString().lowercase(Locale.getDefault())
                "4" -> prefix = NumberWords.FORTY.toString().lowercase(Locale.getDefault())
                "5" -> prefix = NumberWords.FIFTY.toString().lowercase(Locale.getDefault())
                "6" -> prefix = NumberWords.SIXTY.toString().lowercase(Locale.getDefault())
                "7" -> prefix = NumberWords.SEVENTY.toString().lowercase(Locale.getDefault())
                "8" -> prefix = NumberWords.EIGHTY.toString().lowercase(Locale.getDefault())
                "9" -> prefix = NumberWords.NINETY.toString().lowercase(Locale.getDefault())
            }

            suffix = if ("0" == value.substring(1))  EMPTY else single(value.substring(1), true)
        }

        return StringBuilder(prefix + SPACE + suffix).toString().trim()
    }

}





















