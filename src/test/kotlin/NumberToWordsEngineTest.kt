import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NumberToWordsEngineTest {

    @Test
    fun zeroToNine() {
        assertEquals("zero", NumberToWordsEngine(0).numberToWords())
        assertEquals("one", NumberToWordsEngine(1).numberToWords())
        assertEquals("two", NumberToWordsEngine(2).numberToWords())
        assertEquals("three", NumberToWordsEngine(3).numberToWords())
        assertEquals("four", NumberToWordsEngine(4).numberToWords())
        assertEquals("five", NumberToWordsEngine(5).numberToWords())
        assertEquals("six", NumberToWordsEngine(6).numberToWords())
        assertEquals("seven", NumberToWordsEngine(7).numberToWords())
        assertEquals("eight", NumberToWordsEngine(8).numberToWords())
        assertEquals("nine", NumberToWordsEngine(9).numberToWords())
    }

    @Test
    fun zeroToNineWithLeadingZero() {
        assertEquals("zero", NumberToWordsEngine("00".toLong()).numberToWords())
        assertEquals("one", NumberToWordsEngine("01".toLong()).numberToWords())
        assertEquals("two", NumberToWordsEngine("02".toLong()).numberToWords())
        assertEquals("three", NumberToWordsEngine( "03".toLong()).numberToWords())
        assertEquals("four", NumberToWordsEngine( "04".toLong()).numberToWords())
        assertEquals("five", NumberToWordsEngine( "05".toLong()).numberToWords())
        assertEquals("six", NumberToWordsEngine( "06".toLong()).numberToWords())
        assertEquals("seven", NumberToWordsEngine( "07".toLong()).numberToWords())
        assertEquals("eight", NumberToWordsEngine( "08".toLong()).numberToWords())
        assertEquals("nine", NumberToWordsEngine( "09".toLong()).numberToWords())
    }

    @Test
    fun tenToNineteen() {
        assertEquals("ten", NumberToWordsEngine(10).numberToWords())
        assertEquals("eleven", NumberToWordsEngine(11).numberToWords())
        assertEquals("twelve", NumberToWordsEngine(12).numberToWords())
        assertEquals("thirteen", NumberToWordsEngine(13).numberToWords())
        assertEquals("fourteen", NumberToWordsEngine(14).numberToWords())
        assertEquals("fifteen", NumberToWordsEngine(15).numberToWords())
        assertEquals("sixteen", NumberToWordsEngine(16).numberToWords())
        assertEquals("seventeen", NumberToWordsEngine(17).numberToWords())
        assertEquals("eighteen", NumberToWordsEngine(18).numberToWords())
        assertEquals("nineteen", NumberToWordsEngine(19).numberToWords())
    }

    @Test
    fun twentyToTwentyNine() {
        assertEquals("twenty", NumberToWordsEngine(20).numberToWords())
        assertEquals("twenty one", NumberToWordsEngine(21).numberToWords())
        assertEquals("twenty two", NumberToWordsEngine(22).numberToWords())
        assertEquals("twenty three", NumberToWordsEngine(23).numberToWords())
        assertEquals("twenty four", NumberToWordsEngine(24).numberToWords())
        assertEquals("twenty five", NumberToWordsEngine(25).numberToWords())
        assertEquals("twenty six", NumberToWordsEngine(26).numberToWords())
        assertEquals("twenty seven", NumberToWordsEngine(27).numberToWords())
        assertEquals("twenty eight", NumberToWordsEngine(28).numberToWords())
        assertEquals("twenty nine", NumberToWordsEngine(29).numberToWords())
    }

    @Test
    fun thirtyToThirtyNine() {
        assertEquals("thirty", NumberToWordsEngine(30).numberToWords())
        assertEquals("thirty one", NumberToWordsEngine(31).numberToWords())
        assertEquals("thirty two", NumberToWordsEngine(32).numberToWords())
        assertEquals("thirty three", NumberToWordsEngine(33).numberToWords())
        assertEquals("thirty four", NumberToWordsEngine(34).numberToWords())
        assertEquals("thirty five", NumberToWordsEngine(35).numberToWords())
        assertEquals("thirty six", NumberToWordsEngine(36).numberToWords())
        assertEquals("thirty seven", NumberToWordsEngine(37).numberToWords())
        assertEquals("thirty eight", NumberToWordsEngine(38).numberToWords())
        assertEquals("thirty nine", NumberToWordsEngine(39).numberToWords())
    }

    @Test
    fun fortyToFortyNine() {
        assertEquals("forty", NumberToWordsEngine(40).numberToWords())
        assertEquals("forty one", NumberToWordsEngine(41).numberToWords())
        assertEquals("forty two", NumberToWordsEngine(42).numberToWords())
        assertEquals("forty three", NumberToWordsEngine(43).numberToWords())
        assertEquals("forty four", NumberToWordsEngine(44).numberToWords())
        assertEquals("forty five", NumberToWordsEngine(45).numberToWords())
        assertEquals("forty six", NumberToWordsEngine(46).numberToWords())
        assertEquals("forty seven", NumberToWordsEngine(47).numberToWords())
        assertEquals("forty eight", NumberToWordsEngine(48).numberToWords())
        assertEquals("forty nine", NumberToWordsEngine(49).numberToWords())
    }

    @Test
    fun fiftyToFiftyNine() {
        assertEquals("fifty", NumberToWordsEngine(50).numberToWords())
        assertEquals("fifty one", NumberToWordsEngine(51).numberToWords())
        assertEquals("fifty two", NumberToWordsEngine(52).numberToWords())
        assertEquals("fifty three", NumberToWordsEngine(53).numberToWords())
        assertEquals("fifty four", NumberToWordsEngine(54).numberToWords())
        assertEquals("fifty five", NumberToWordsEngine(55).numberToWords())
        assertEquals("fifty six", NumberToWordsEngine(56).numberToWords())
        assertEquals("fifty seven", NumberToWordsEngine(57).numberToWords())
        assertEquals("fifty eight", NumberToWordsEngine(58).numberToWords())
        assertEquals("fifty nine", NumberToWordsEngine(59).numberToWords())
    }

    @Test
    fun sixtyToSixtyNine() {
        assertEquals("sixty", NumberToWordsEngine(60).numberToWords())
        assertEquals("sixty one", NumberToWordsEngine(61).numberToWords())
        assertEquals("sixty two", NumberToWordsEngine(62).numberToWords())
        assertEquals("sixty three", NumberToWordsEngine(63).numberToWords())
        assertEquals("sixty four", NumberToWordsEngine(64).numberToWords())
        assertEquals("sixty five", NumberToWordsEngine(65).numberToWords())
        assertEquals("sixty six", NumberToWordsEngine(66).numberToWords())
        assertEquals("sixty seven", NumberToWordsEngine(67).numberToWords())
        assertEquals("sixty eight", NumberToWordsEngine(68).numberToWords())
        assertEquals("sixty nine", NumberToWordsEngine(69).numberToWords())
    }

    @Test
    fun seventyToSeventyNine() {
        assertEquals("seventy", NumberToWordsEngine(70).numberToWords())
        assertEquals("seventy one", NumberToWordsEngine(71).numberToWords())
        assertEquals("seventy two", NumberToWordsEngine(72).numberToWords())
        assertEquals("seventy three", NumberToWordsEngine(73).numberToWords())
        assertEquals("seventy four", NumberToWordsEngine(74).numberToWords())
        assertEquals("seventy five", NumberToWordsEngine(75).numberToWords())
        assertEquals("seventy six", NumberToWordsEngine(76).numberToWords())
        assertEquals("seventy seven", NumberToWordsEngine(77).numberToWords())
        assertEquals("seventy eight", NumberToWordsEngine(78).numberToWords())
        assertEquals("seventy nine", NumberToWordsEngine(79).numberToWords())
    }

    @Test
    fun eightyToEightyNine() {
        assertEquals("eighty", NumberToWordsEngine(80).numberToWords())
        assertEquals("eighty one", NumberToWordsEngine(81).numberToWords())
        assertEquals("eighty two", NumberToWordsEngine(82).numberToWords())
        assertEquals("eighty three", NumberToWordsEngine(83).numberToWords())
        assertEquals("eighty four", NumberToWordsEngine(84).numberToWords())
        assertEquals("eighty five", NumberToWordsEngine(85).numberToWords())
        assertEquals("eighty six", NumberToWordsEngine(86).numberToWords())
        assertEquals("eighty seven", NumberToWordsEngine(87).numberToWords())
        assertEquals("eighty eight", NumberToWordsEngine(88).numberToWords())
        assertEquals("eighty nine", NumberToWordsEngine(89).numberToWords())
    }

    @Test
    fun ninetyToNinetyNine() {
        assertEquals("ninety", NumberToWordsEngine(90).numberToWords())
        assertEquals("ninety one", NumberToWordsEngine(91).numberToWords())
        assertEquals("ninety two", NumberToWordsEngine(92).numberToWords())
        assertEquals("ninety three", NumberToWordsEngine(93).numberToWords())
        assertEquals("ninety four", NumberToWordsEngine(94).numberToWords())
        assertEquals("ninety five", NumberToWordsEngine(95).numberToWords())
        assertEquals("ninety six", NumberToWordsEngine(96).numberToWords())
        assertEquals("ninety seven", NumberToWordsEngine(97).numberToWords())
        assertEquals("ninety eight", NumberToWordsEngine(98).numberToWords())
        assertEquals("ninety nine", NumberToWordsEngine(99).numberToWords())
    }

    @Test
    fun oneHundredToNineHundred() {
        assertEquals("one hundred", NumberToWordsEngine(100).numberToWords())
        assertEquals("two hundred", NumberToWordsEngine(200).numberToWords())
        assertEquals("three hundred", NumberToWordsEngine(300).numberToWords())
        assertEquals("four hundred", NumberToWordsEngine(400).numberToWords())
        assertEquals("five hundred", NumberToWordsEngine(500).numberToWords())
        assertEquals("six hundred", NumberToWordsEngine(600).numberToWords())
        assertEquals("seven hundred", NumberToWordsEngine(700).numberToWords())
        assertEquals("eight hundred", NumberToWordsEngine(800).numberToWords())
        assertEquals("nine hundred", NumberToWordsEngine(900).numberToWords())

        assertEquals("one hundred one", NumberToWordsEngine(101).numberToWords())
        assertEquals("two hundred one", NumberToWordsEngine(201).numberToWords())
        assertEquals("three hundred one", NumberToWordsEngine(301).numberToWords())
        assertEquals("four hundred one", NumberToWordsEngine(401).numberToWords())
        assertEquals("five hundred one", NumberToWordsEngine(501).numberToWords())
        assertEquals("six hundred one", NumberToWordsEngine(601).numberToWords())
        assertEquals("seven hundred one", NumberToWordsEngine(701).numberToWords())
        assertEquals("eight hundred one", NumberToWordsEngine(801).numberToWords())
        assertEquals("nine hundred one", NumberToWordsEngine(901).numberToWords())

        assertEquals("one hundred eleven", NumberToWordsEngine(111).numberToWords())
        assertEquals("two hundred eleven", NumberToWordsEngine(211).numberToWords())
        assertEquals("three hundred eleven", NumberToWordsEngine(311).numberToWords())
        assertEquals("four hundred eleven", NumberToWordsEngine(411).numberToWords())
        assertEquals("five hundred eleven", NumberToWordsEngine(511).numberToWords())
        assertEquals("six hundred eleven", NumberToWordsEngine(611).numberToWords())
        assertEquals("seven hundred eleven", NumberToWordsEngine(711).numberToWords())
        assertEquals("eight hundred eleven", NumberToWordsEngine(811).numberToWords())
        assertEquals("nine hundred eleven", NumberToWordsEngine(911).numberToWords())

        assertEquals("one hundred twelve", NumberToWordsEngine(112).numberToWords())
        assertEquals("two hundred twelve", NumberToWordsEngine(212).numberToWords())
        assertEquals("three hundred twelve", NumberToWordsEngine(312).numberToWords())
        assertEquals("four hundred twelve", NumberToWordsEngine(412).numberToWords())
        assertEquals("five hundred twelve", NumberToWordsEngine(512).numberToWords())
        assertEquals("six hundred twelve", NumberToWordsEngine(612).numberToWords())
        assertEquals("seven hundred twelve", NumberToWordsEngine(712).numberToWords())
        assertEquals("eight hundred twelve", NumberToWordsEngine(812).numberToWords())
        assertEquals("nine hundred twelve", NumberToWordsEngine(912).numberToWords())

        assertEquals("one hundred thirteen", NumberToWordsEngine(113).numberToWords())
        assertEquals("two hundred thirteen", NumberToWordsEngine(213).numberToWords())
        assertEquals("three hundred thirteen", NumberToWordsEngine(313).numberToWords())
        assertEquals("four hundred thirteen", NumberToWordsEngine(413).numberToWords())
        assertEquals("five hundred thirteen", NumberToWordsEngine(513).numberToWords())
        assertEquals("six hundred thirteen", NumberToWordsEngine(613).numberToWords())
        assertEquals("seven hundred thirteen", NumberToWordsEngine(713).numberToWords())
        assertEquals("eight hundred thirteen", NumberToWordsEngine(813).numberToWords())
        assertEquals("nine hundred thirteen", NumberToWordsEngine(913).numberToWords())

        assertEquals("one hundred fifty", NumberToWordsEngine(150).numberToWords())
        assertEquals("two hundred fifty", NumberToWordsEngine(250).numberToWords())
        assertEquals("three hundred fifty", NumberToWordsEngine(350).numberToWords())
        assertEquals("four hundred fifty", NumberToWordsEngine(450).numberToWords())
        assertEquals("five hundred fifty", NumberToWordsEngine(550).numberToWords())
        assertEquals("six hundred fifty", NumberToWordsEngine(650).numberToWords())
        assertEquals("seven hundred fifty", NumberToWordsEngine(750).numberToWords())
        assertEquals("eight hundred fifty", NumberToWordsEngine(850).numberToWords())
        assertEquals("nine hundred fifty", NumberToWordsEngine(950).numberToWords())

        assertEquals("one hundred ninety nine", NumberToWordsEngine(199).numberToWords())
        assertEquals("two hundred ninety nine", NumberToWordsEngine(299).numberToWords())
        assertEquals("three hundred ninety nine", NumberToWordsEngine(399).numberToWords())
        assertEquals("four hundred ninety nine", NumberToWordsEngine(499).numberToWords())
        assertEquals("five hundred ninety nine", NumberToWordsEngine(599).numberToWords())
        assertEquals("six hundred ninety nine", NumberToWordsEngine(699).numberToWords())
        assertEquals("seven hundred ninety nine", NumberToWordsEngine(799).numberToWords())
        assertEquals("eight hundred ninety nine", NumberToWordsEngine(899).numberToWords())
        assertEquals("nine hundred ninety nine", NumberToWordsEngine(999).numberToWords())

        assertEquals("two hundred seventy", NumberToWordsEngine(270).numberToWords())
        assertEquals("six hundred sixty five", NumberToWordsEngine(665).numberToWords())
        assertEquals("nine hundred eighty two", NumberToWordsEngine(982).numberToWords())
        assertEquals("five hundred ninety four", NumberToWordsEngine(594).numberToWords())
        assertEquals("three hundred nineteen", NumberToWordsEngine(319).numberToWords())
        assertEquals("six hundred fifty nine", NumberToWordsEngine(659).numberToWords())
        assertEquals("two hundred thirty one", NumberToWordsEngine(231).numberToWords())
        assertEquals("three hundred sixty nine", NumberToWordsEngine(369).numberToWords())
        assertEquals("two hundred one", NumberToWordsEngine(201).numberToWords())
        assertEquals("four hundred seventy nine", NumberToWordsEngine(479).numberToWords())
    }

    @Test
    fun thousands() {
        assertEquals("one thousand", NumberToWordsEngine(1000).numberToWords())
        assertEquals("two thousand", NumberToWordsEngine(2000).numberToWords())
        assertEquals("three thousand", NumberToWordsEngine(3000).numberToWords())
        assertEquals("four thousand", NumberToWordsEngine(4000).numberToWords())
        assertEquals("five thousand", NumberToWordsEngine(5000).numberToWords())
        assertEquals("six thousand", NumberToWordsEngine(6000).numberToWords())
        assertEquals("seven thousand", NumberToWordsEngine(7000).numberToWords())
        assertEquals("eight thousand", NumberToWordsEngine(8000).numberToWords())
        assertEquals("nine thousand", NumberToWordsEngine(9000).numberToWords())

        assertEquals("nine thousand nine hundred ninety nine", NumberToWordsEngine(9999).numberToWords())
        assertEquals("five thousand two hundred seventy eight", NumberToWordsEngine(5278).numberToWords())
        assertEquals("eight thousand five hundred twenty seven", NumberToWordsEngine(8527).numberToWords())
        assertEquals("one thousand three hundred sixteen", NumberToWordsEngine(1316).numberToWords())
        assertEquals("three thousand eight hundred sixty eight", NumberToWordsEngine(3868).numberToWords())
        assertEquals("two thousand six hundred twenty eight", NumberToWordsEngine(2628).numberToWords())
        assertEquals("four thousand seven hundred fifty nine", NumberToWordsEngine(4759).numberToWords())
        assertEquals("five thousand seven hundred fifty one", NumberToWordsEngine(5751).numberToWords())
        assertEquals("one thousand two hundred thirteen", NumberToWordsEngine(1213).numberToWords())
        assertEquals("eight thousand nine hundred eighty eight", NumberToWordsEngine(8988).numberToWords())
        assertEquals("three thousand nine hundred forty eight", NumberToWordsEngine(3948).numberToWords())
        assertEquals("eight thousand two hundred one", NumberToWordsEngine(8201).numberToWords())
        assertEquals("five thousand two hundred seventy one", NumberToWordsEngine(5271).numberToWords())
        assertEquals("eight thousand seven hundred thirty eight", NumberToWordsEngine(8738).numberToWords())
        assertEquals("nine thousand four hundred thirty nine", NumberToWordsEngine(9439).numberToWords())
        assertEquals("eight thousand seven hundred eighty four", NumberToWordsEngine(8784).numberToWords())
        assertEquals("five thousand four hundred thirty three", NumberToWordsEngine(5433).numberToWords())
        assertEquals("five thousand forty three", NumberToWordsEngine(5043).numberToWords())
        assertEquals("five thousand nine hundred ninety three", NumberToWordsEngine(5993).numberToWords())
        assertEquals("one thousand one hundred eleven", NumberToWordsEngine(1111).numberToWords())
    }

    @Test
    fun tenThousands() {
        assertEquals("ten thousand", NumberToWordsEngine(10000).numberToWords())
        assertEquals("twenty thousand", NumberToWordsEngine(20000).numberToWords())
        assertEquals("thirty thousand", NumberToWordsEngine(30000).numberToWords())
        assertEquals("forty thousand", NumberToWordsEngine(40000).numberToWords())
        assertEquals("fifty thousand", NumberToWordsEngine(50000).numberToWords())
        assertEquals("sixty thousand", NumberToWordsEngine(60000).numberToWords())
        assertEquals("seventy thousand", NumberToWordsEngine(70000).numberToWords())
        assertEquals("eighty thousand", NumberToWordsEngine(80000).numberToWords())
        assertEquals("ninety thousand", NumberToWordsEngine(90000).numberToWords())

        assertEquals("eleven thousand one hundred eleven", NumberToWordsEngine(11111).numberToWords())
        assertEquals("ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(99999).numberToWords())

        assertEquals("fourteen thousand eighty", NumberToWordsEngine(14080).numberToWords())
        assertEquals("twenty one thousand six hundred sixty seven", NumberToWordsEngine(21667).numberToWords())
        assertEquals("thirty one thousand three hundred nineteen", NumberToWordsEngine(31319).numberToWords())
        assertEquals("forty eight thousand four hundred fifty six", NumberToWordsEngine(48456).numberToWords())
        assertEquals("fifty two thousand eight hundred thirty six", NumberToWordsEngine(52836).numberToWords())
        assertEquals("sixty six thousand nine hundred four", NumberToWordsEngine(66904).numberToWords())
        assertEquals("seventy four thousand five hundred forty eight", NumberToWordsEngine(74548).numberToWords())
        assertEquals("eighty one thousand four hundred thirteen", NumberToWordsEngine(81413).numberToWords())
        assertEquals("ninety eight thousand five hundred twenty seven", NumberToWordsEngine(98527).numberToWords())
    }

    @Test
    fun hundredThousands() {
        assertEquals("one hundred thousand", NumberToWordsEngine(100000).numberToWords())
        assertEquals("two hundred thousand", NumberToWordsEngine(200000).numberToWords())
        assertEquals("three hundred thousand", NumberToWordsEngine(300000).numberToWords())
        assertEquals("four hundred thousand", NumberToWordsEngine(400000).numberToWords())
        assertEquals("five hundred thousand", NumberToWordsEngine(500000).numberToWords())
        assertEquals("six hundred thousand", NumberToWordsEngine(600000).numberToWords())
        assertEquals("seven hundred thousand", NumberToWordsEngine(700000).numberToWords())
        assertEquals("eight hundred thousand", NumberToWordsEngine(800000).numberToWords())
        assertEquals("nine hundred thousand", NumberToWordsEngine(900000).numberToWords())

        assertEquals("one hundred eleven thousand one hundred eleven", NumberToWordsEngine(111111).numberToWords())
        assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(999999).numberToWords())

        assertEquals("one hundred twenty eight thousand seven hundred twenty seven", NumberToWordsEngine(128727).numberToWords())
        assertEquals("two hundred ninety four thousand three hundred ninety three", NumberToWordsEngine(294393).numberToWords())
        assertEquals("three hundred forty seven thousand eight hundred sixty two", NumberToWordsEngine(347862).numberToWords())
        assertEquals("four hundred forty eight thousand seven hundred five", NumberToWordsEngine(448705).numberToWords())
        assertEquals("five hundred seven thousand forty six", NumberToWordsEngine(507046).numberToWords())
        assertEquals("six hundred sixty six thousand twenty four", NumberToWordsEngine(666024).numberToWords())
        assertEquals("seven hundred forty thousand forty two", NumberToWordsEngine(740042).numberToWords())
        assertEquals("eight hundred fifty five thousand two hundred thirty four", NumberToWordsEngine(855234).numberToWords())
        assertEquals("nine hundred eighty six thousand two hundred seventy three", NumberToWordsEngine(986273).numberToWords())
        assertEquals("two hundred forty thousand one hundred two", NumberToWordsEngine(240102).numberToWords())
        assertEquals("eight hundred fifty nine thousand forty two", NumberToWordsEngine(859042).numberToWords())
        assertEquals("three hundred fourteen thousand four hundred four", NumberToWordsEngine(314404).numberToWords())
        assertEquals("one hundred thousand one", NumberToWordsEngine(100001).numberToWords())
    }

    @Test
    fun millions() {
        assertEquals("one million", NumberToWordsEngine(1_000_000).numberToWords())
        assertEquals("two million", NumberToWordsEngine(2_000_000).numberToWords())
        assertEquals("three million", NumberToWordsEngine(3_000_000).numberToWords())
        assertEquals("four million", NumberToWordsEngine(4_000_000).numberToWords())
        assertEquals("five million", NumberToWordsEngine(5_000_000).numberToWords())
        assertEquals("six million", NumberToWordsEngine(6_000_000).numberToWords())
        assertEquals("seven million", NumberToWordsEngine(7_000_000).numberToWords())
        assertEquals("eight million", NumberToWordsEngine(8_000_000).numberToWords())
        assertEquals("nine million", NumberToWordsEngine(9_000_000).numberToWords())

        assertEquals("one million one", NumberToWordsEngine(1_000_001).numberToWords())
        assertEquals("one million eleven", NumberToWordsEngine(1_000_011).numberToWords())
        assertEquals("one million one hundred eleven", NumberToWordsEngine(1_000_111).numberToWords())
        assertEquals("one million one thousand one hundred eleven", NumberToWordsEngine(1_001_111).numberToWords())
        assertEquals("one million eleven thousand one hundred eleven", NumberToWordsEngine(1_011_111).numberToWords())
        assertEquals("one million one hundred eleven thousand one hundred eleven", NumberToWordsEngine(1_111_111).numberToWords())

        assertEquals("nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_999_999).numberToWords())
    }

    @Test
    fun billions() {
        assertEquals("one billion", NumberToWordsEngine(1_000_000_000).numberToWords())
        assertEquals("nine billion", NumberToWordsEngine(9_000_000_000).numberToWords())

        assertEquals("nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_999_999_999).numberToWords())
        assertEquals("nine billion ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_099_999_999).numberToWords())
        assertEquals("nine billion nine hundred nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_909_999_999).numberToWords())
        assertEquals("nine billion nine hundred ninety million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_990_999_999).numberToWords())
    }

    @Test
    fun trillions () {
        assertEquals("nine trillion nine hundred ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_999_999_999_999).numberToWords())
        assertEquals("nine trillion ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_099_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_909_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred ninety billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToWordsEngine(9_990_999_999_999).numberToWords())
    }
}