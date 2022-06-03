package com.kodcha.num.english

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NumberToEnglishEngineTest {

    @Test
    fun zeroToNine() {
        assertEquals("zero", NumberToEnglishEngine(0).numberToWords())
        assertEquals("one", NumberToEnglishEngine(1).numberToWords())
        assertEquals("two", NumberToEnglishEngine(2).numberToWords())
        assertEquals("three", NumberToEnglishEngine(3).numberToWords())
        assertEquals("four", NumberToEnglishEngine(4).numberToWords())
        assertEquals("five", NumberToEnglishEngine(5).numberToWords())
        assertEquals("six", NumberToEnglishEngine(6).numberToWords())
        assertEquals("seven", NumberToEnglishEngine(7).numberToWords())
        assertEquals("eight", NumberToEnglishEngine(8).numberToWords())
        assertEquals("nine", NumberToEnglishEngine(9).numberToWords())
    }

    @Test
    fun zeroToNineWithLeadingZero() {
        assertEquals("zero", NumberToEnglishEngine("00".toLong()).numberToWords())
        assertEquals("one", NumberToEnglishEngine("01".toLong()).numberToWords())
        assertEquals("two", NumberToEnglishEngine("02".toLong()).numberToWords())
        assertEquals("three", NumberToEnglishEngine( "03".toLong()).numberToWords())
        assertEquals("four", NumberToEnglishEngine( "04".toLong()).numberToWords())
        assertEquals("five", NumberToEnglishEngine( "05".toLong()).numberToWords())
        assertEquals("six", NumberToEnglishEngine( "06".toLong()).numberToWords())
        assertEquals("seven", NumberToEnglishEngine( "07".toLong()).numberToWords())
        assertEquals("eight", NumberToEnglishEngine( "08".toLong()).numberToWords())
        assertEquals("nine", NumberToEnglishEngine( "09".toLong()).numberToWords())
    }

    @Test
    fun tenToNineteen() {
        assertEquals("ten", NumberToEnglishEngine(10).numberToWords())
        assertEquals("eleven", NumberToEnglishEngine(11).numberToWords())
        assertEquals("twelve", NumberToEnglishEngine(12).numberToWords())
        assertEquals("thirteen", NumberToEnglishEngine(13).numberToWords())
        assertEquals("fourteen", NumberToEnglishEngine(14).numberToWords())
        assertEquals("fifteen", NumberToEnglishEngine(15).numberToWords())
        assertEquals("sixteen", NumberToEnglishEngine(16).numberToWords())
        assertEquals("seventeen", NumberToEnglishEngine(17).numberToWords())
        assertEquals("eighteen", NumberToEnglishEngine(18).numberToWords())
        assertEquals("nineteen", NumberToEnglishEngine(19).numberToWords())
    }

    @Test
    fun twentyToTwentyNine() {
        assertEquals("twenty", NumberToEnglishEngine(20).numberToWords())
        assertEquals("twenty one", NumberToEnglishEngine(21).numberToWords())
        assertEquals("twenty two", NumberToEnglishEngine(22).numberToWords())
        assertEquals("twenty three", NumberToEnglishEngine(23).numberToWords())
        assertEquals("twenty four", NumberToEnglishEngine(24).numberToWords())
        assertEquals("twenty five", NumberToEnglishEngine(25).numberToWords())
        assertEquals("twenty six", NumberToEnglishEngine(26).numberToWords())
        assertEquals("twenty seven", NumberToEnglishEngine(27).numberToWords())
        assertEquals("twenty eight", NumberToEnglishEngine(28).numberToWords())
        assertEquals("twenty nine", NumberToEnglishEngine(29).numberToWords())
    }

    @Test
    fun thirtyToThirtyNine() {
        assertEquals("thirty", NumberToEnglishEngine(30).numberToWords())
        assertEquals("thirty one", NumberToEnglishEngine(31).numberToWords())
        assertEquals("thirty two", NumberToEnglishEngine(32).numberToWords())
        assertEquals("thirty three", NumberToEnglishEngine(33).numberToWords())
        assertEquals("thirty four", NumberToEnglishEngine(34).numberToWords())
        assertEquals("thirty five", NumberToEnglishEngine(35).numberToWords())
        assertEquals("thirty six", NumberToEnglishEngine(36).numberToWords())
        assertEquals("thirty seven", NumberToEnglishEngine(37).numberToWords())
        assertEquals("thirty eight", NumberToEnglishEngine(38).numberToWords())
        assertEquals("thirty nine", NumberToEnglishEngine(39).numberToWords())
    }

    @Test
    fun fortyToFortyNine() {
        assertEquals("forty", NumberToEnglishEngine(40).numberToWords())
        assertEquals("forty one", NumberToEnglishEngine(41).numberToWords())
        assertEquals("forty two", NumberToEnglishEngine(42).numberToWords())
        assertEquals("forty three", NumberToEnglishEngine(43).numberToWords())
        assertEquals("forty four", NumberToEnglishEngine(44).numberToWords())
        assertEquals("forty five", NumberToEnglishEngine(45).numberToWords())
        assertEquals("forty six", NumberToEnglishEngine(46).numberToWords())
        assertEquals("forty seven", NumberToEnglishEngine(47).numberToWords())
        assertEquals("forty eight", NumberToEnglishEngine(48).numberToWords())
        assertEquals("forty nine", NumberToEnglishEngine(49).numberToWords())
    }

    @Test
    fun fiftyToFiftyNine() {
        assertEquals("fifty", NumberToEnglishEngine(50).numberToWords())
        assertEquals("fifty one", NumberToEnglishEngine(51).numberToWords())
        assertEquals("fifty two", NumberToEnglishEngine(52).numberToWords())
        assertEquals("fifty three", NumberToEnglishEngine(53).numberToWords())
        assertEquals("fifty four", NumberToEnglishEngine(54).numberToWords())
        assertEquals("fifty five", NumberToEnglishEngine(55).numberToWords())
        assertEquals("fifty six", NumberToEnglishEngine(56).numberToWords())
        assertEquals("fifty seven", NumberToEnglishEngine(57).numberToWords())
        assertEquals("fifty eight", NumberToEnglishEngine(58).numberToWords())
        assertEquals("fifty nine", NumberToEnglishEngine(59).numberToWords())
    }

    @Test
    fun sixtyToSixtyNine() {
        assertEquals("sixty", NumberToEnglishEngine(60).numberToWords())
        assertEquals("sixty one", NumberToEnglishEngine(61).numberToWords())
        assertEquals("sixty two", NumberToEnglishEngine(62).numberToWords())
        assertEquals("sixty three", NumberToEnglishEngine(63).numberToWords())
        assertEquals("sixty four", NumberToEnglishEngine(64).numberToWords())
        assertEquals("sixty five", NumberToEnglishEngine(65).numberToWords())
        assertEquals("sixty six", NumberToEnglishEngine(66).numberToWords())
        assertEquals("sixty seven", NumberToEnglishEngine(67).numberToWords())
        assertEquals("sixty eight", NumberToEnglishEngine(68).numberToWords())
        assertEquals("sixty nine", NumberToEnglishEngine(69).numberToWords())
    }

    @Test
    fun seventyToSeventyNine() {
        assertEquals("seventy", NumberToEnglishEngine(70).numberToWords())
        assertEquals("seventy one", NumberToEnglishEngine(71).numberToWords())
        assertEquals("seventy two", NumberToEnglishEngine(72).numberToWords())
        assertEquals("seventy three", NumberToEnglishEngine(73).numberToWords())
        assertEquals("seventy four", NumberToEnglishEngine(74).numberToWords())
        assertEquals("seventy five", NumberToEnglishEngine(75).numberToWords())
        assertEquals("seventy six", NumberToEnglishEngine(76).numberToWords())
        assertEquals("seventy seven", NumberToEnglishEngine(77).numberToWords())
        assertEquals("seventy eight", NumberToEnglishEngine(78).numberToWords())
        assertEquals("seventy nine", NumberToEnglishEngine(79).numberToWords())
    }

    @Test
    fun eightyToEightyNine() {
        assertEquals("eighty", NumberToEnglishEngine(80).numberToWords())
        assertEquals("eighty one", NumberToEnglishEngine(81).numberToWords())
        assertEquals("eighty two", NumberToEnglishEngine(82).numberToWords())
        assertEquals("eighty three", NumberToEnglishEngine(83).numberToWords())
        assertEquals("eighty four", NumberToEnglishEngine(84).numberToWords())
        assertEquals("eighty five", NumberToEnglishEngine(85).numberToWords())
        assertEquals("eighty six", NumberToEnglishEngine(86).numberToWords())
        assertEquals("eighty seven", NumberToEnglishEngine(87).numberToWords())
        assertEquals("eighty eight", NumberToEnglishEngine(88).numberToWords())
        assertEquals("eighty nine", NumberToEnglishEngine(89).numberToWords())
    }

    @Test
    fun ninetyToNinetyNine() {
        assertEquals("ninety", NumberToEnglishEngine(90).numberToWords())
        assertEquals("ninety one", NumberToEnglishEngine(91).numberToWords())
        assertEquals("ninety two", NumberToEnglishEngine(92).numberToWords())
        assertEquals("ninety three", NumberToEnglishEngine(93).numberToWords())
        assertEquals("ninety four", NumberToEnglishEngine(94).numberToWords())
        assertEquals("ninety five", NumberToEnglishEngine(95).numberToWords())
        assertEquals("ninety six", NumberToEnglishEngine(96).numberToWords())
        assertEquals("ninety seven", NumberToEnglishEngine(97).numberToWords())
        assertEquals("ninety eight", NumberToEnglishEngine(98).numberToWords())
        assertEquals("ninety nine", NumberToEnglishEngine(99).numberToWords())
    }

    @Test
    fun oneHundredToNineHundred() {
        assertEquals("one hundred", NumberToEnglishEngine(100).numberToWords())
        assertEquals("two hundred", NumberToEnglishEngine(200).numberToWords())
        assertEquals("three hundred", NumberToEnglishEngine(300).numberToWords())
        assertEquals("four hundred", NumberToEnglishEngine(400).numberToWords())
        assertEquals("five hundred", NumberToEnglishEngine(500).numberToWords())
        assertEquals("six hundred", NumberToEnglishEngine(600).numberToWords())
        assertEquals("seven hundred", NumberToEnglishEngine(700).numberToWords())
        assertEquals("eight hundred", NumberToEnglishEngine(800).numberToWords())
        assertEquals("nine hundred", NumberToEnglishEngine(900).numberToWords())

        assertEquals("one hundred one", NumberToEnglishEngine(101).numberToWords())
        assertEquals("two hundred one", NumberToEnglishEngine(201).numberToWords())
        assertEquals("three hundred one", NumberToEnglishEngine(301).numberToWords())
        assertEquals("four hundred one", NumberToEnglishEngine(401).numberToWords())
        assertEquals("five hundred one", NumberToEnglishEngine(501).numberToWords())
        assertEquals("six hundred one", NumberToEnglishEngine(601).numberToWords())
        assertEquals("seven hundred one", NumberToEnglishEngine(701).numberToWords())
        assertEquals("eight hundred one", NumberToEnglishEngine(801).numberToWords())
        assertEquals("nine hundred one", NumberToEnglishEngine(901).numberToWords())

        assertEquals("one hundred eleven", NumberToEnglishEngine(111).numberToWords())
        assertEquals("two hundred eleven", NumberToEnglishEngine(211).numberToWords())
        assertEquals("three hundred eleven", NumberToEnglishEngine(311).numberToWords())
        assertEquals("four hundred eleven", NumberToEnglishEngine(411).numberToWords())
        assertEquals("five hundred eleven", NumberToEnglishEngine(511).numberToWords())
        assertEquals("six hundred eleven", NumberToEnglishEngine(611).numberToWords())
        assertEquals("seven hundred eleven", NumberToEnglishEngine(711).numberToWords())
        assertEquals("eight hundred eleven", NumberToEnglishEngine(811).numberToWords())
        assertEquals("nine hundred eleven", NumberToEnglishEngine(911).numberToWords())

        assertEquals("one hundred twelve", NumberToEnglishEngine(112).numberToWords())
        assertEquals("two hundred twelve", NumberToEnglishEngine(212).numberToWords())
        assertEquals("three hundred twelve", NumberToEnglishEngine(312).numberToWords())
        assertEquals("four hundred twelve", NumberToEnglishEngine(412).numberToWords())
        assertEquals("five hundred twelve", NumberToEnglishEngine(512).numberToWords())
        assertEquals("six hundred twelve", NumberToEnglishEngine(612).numberToWords())
        assertEquals("seven hundred twelve", NumberToEnglishEngine(712).numberToWords())
        assertEquals("eight hundred twelve", NumberToEnglishEngine(812).numberToWords())
        assertEquals("nine hundred twelve", NumberToEnglishEngine(912).numberToWords())

        assertEquals("one hundred thirteen", NumberToEnglishEngine(113).numberToWords())
        assertEquals("two hundred thirteen", NumberToEnglishEngine(213).numberToWords())
        assertEquals("three hundred thirteen", NumberToEnglishEngine(313).numberToWords())
        assertEquals("four hundred thirteen", NumberToEnglishEngine(413).numberToWords())
        assertEquals("five hundred thirteen", NumberToEnglishEngine(513).numberToWords())
        assertEquals("six hundred thirteen", NumberToEnglishEngine(613).numberToWords())
        assertEquals("seven hundred thirteen", NumberToEnglishEngine(713).numberToWords())
        assertEquals("eight hundred thirteen", NumberToEnglishEngine(813).numberToWords())
        assertEquals("nine hundred thirteen", NumberToEnglishEngine(913).numberToWords())

        assertEquals("one hundred fifty", NumberToEnglishEngine(150).numberToWords())
        assertEquals("two hundred fifty", NumberToEnglishEngine(250).numberToWords())
        assertEquals("three hundred fifty", NumberToEnglishEngine(350).numberToWords())
        assertEquals("four hundred fifty", NumberToEnglishEngine(450).numberToWords())
        assertEquals("five hundred fifty", NumberToEnglishEngine(550).numberToWords())
        assertEquals("six hundred fifty", NumberToEnglishEngine(650).numberToWords())
        assertEquals("seven hundred fifty", NumberToEnglishEngine(750).numberToWords())
        assertEquals("eight hundred fifty", NumberToEnglishEngine(850).numberToWords())
        assertEquals("nine hundred fifty", NumberToEnglishEngine(950).numberToWords())

        assertEquals("one hundred ninety nine", NumberToEnglishEngine(199).numberToWords())
        assertEquals("two hundred ninety nine", NumberToEnglishEngine(299).numberToWords())
        assertEquals("three hundred ninety nine", NumberToEnglishEngine(399).numberToWords())
        assertEquals("four hundred ninety nine", NumberToEnglishEngine(499).numberToWords())
        assertEquals("five hundred ninety nine", NumberToEnglishEngine(599).numberToWords())
        assertEquals("six hundred ninety nine", NumberToEnglishEngine(699).numberToWords())
        assertEquals("seven hundred ninety nine", NumberToEnglishEngine(799).numberToWords())
        assertEquals("eight hundred ninety nine", NumberToEnglishEngine(899).numberToWords())
        assertEquals("nine hundred ninety nine", NumberToEnglishEngine(999).numberToWords())

        assertEquals("two hundred seventy", NumberToEnglishEngine(270).numberToWords())
        assertEquals("six hundred sixty five", NumberToEnglishEngine(665).numberToWords())
        assertEquals("nine hundred eighty two", NumberToEnglishEngine(982).numberToWords())
        assertEquals("five hundred ninety four", NumberToEnglishEngine(594).numberToWords())
        assertEquals("three hundred nineteen", NumberToEnglishEngine(319).numberToWords())
        assertEquals("six hundred fifty nine", NumberToEnglishEngine(659).numberToWords())
        assertEquals("two hundred thirty one", NumberToEnglishEngine(231).numberToWords())
        assertEquals("three hundred sixty nine", NumberToEnglishEngine(369).numberToWords())
        assertEquals("two hundred one", NumberToEnglishEngine(201).numberToWords())
        assertEquals("four hundred seventy nine", NumberToEnglishEngine(479).numberToWords())
    }

    @Test
    fun thousands() {
        assertEquals("one thousand", NumberToEnglishEngine(1000).numberToWords())
        assertEquals("two thousand", NumberToEnglishEngine(2000).numberToWords())
        assertEquals("three thousand", NumberToEnglishEngine(3000).numberToWords())
        assertEquals("four thousand", NumberToEnglishEngine(4000).numberToWords())
        assertEquals("five thousand", NumberToEnglishEngine(5000).numberToWords())
        assertEquals("six thousand", NumberToEnglishEngine(6000).numberToWords())
        assertEquals("seven thousand", NumberToEnglishEngine(7000).numberToWords())
        assertEquals("eight thousand", NumberToEnglishEngine(8000).numberToWords())
        assertEquals("nine thousand", NumberToEnglishEngine(9000).numberToWords())

        assertEquals("nine thousand nine hundred ninety nine", NumberToEnglishEngine(9999).numberToWords())
        assertEquals("five thousand two hundred seventy eight", NumberToEnglishEngine(5278).numberToWords())
        assertEquals("eight thousand five hundred twenty seven", NumberToEnglishEngine(8527).numberToWords())
        assertEquals("one thousand three hundred sixteen", NumberToEnglishEngine(1316).numberToWords())
        assertEquals("three thousand eight hundred sixty eight", NumberToEnglishEngine(3868).numberToWords())
        assertEquals("two thousand six hundred twenty eight", NumberToEnglishEngine(2628).numberToWords())
        assertEquals("four thousand seven hundred fifty nine", NumberToEnglishEngine(4759).numberToWords())
        assertEquals("five thousand seven hundred fifty one", NumberToEnglishEngine(5751).numberToWords())
        assertEquals("one thousand two hundred thirteen", NumberToEnglishEngine(1213).numberToWords())
        assertEquals("eight thousand nine hundred eighty eight", NumberToEnglishEngine(8988).numberToWords())
        assertEquals("three thousand nine hundred forty eight", NumberToEnglishEngine(3948).numberToWords())
        assertEquals("eight thousand two hundred one", NumberToEnglishEngine(8201).numberToWords())
        assertEquals("five thousand two hundred seventy one", NumberToEnglishEngine(5271).numberToWords())
        assertEquals("eight thousand seven hundred thirty eight", NumberToEnglishEngine(8738).numberToWords())
        assertEquals("nine thousand four hundred thirty nine", NumberToEnglishEngine(9439).numberToWords())
        assertEquals("eight thousand seven hundred eighty four", NumberToEnglishEngine(8784).numberToWords())
        assertEquals("five thousand four hundred thirty three", NumberToEnglishEngine(5433).numberToWords())
        assertEquals("five thousand forty three", NumberToEnglishEngine(5043).numberToWords())
        assertEquals("five thousand nine hundred ninety three", NumberToEnglishEngine(5993).numberToWords())
        assertEquals("one thousand one hundred eleven", NumberToEnglishEngine(1111).numberToWords())
    }

    @Test
    fun tenThousands() {
        assertEquals("ten thousand", NumberToEnglishEngine(10000).numberToWords())
        assertEquals("twenty thousand", NumberToEnglishEngine(20000).numberToWords())
        assertEquals("thirty thousand", NumberToEnglishEngine(30000).numberToWords())
        assertEquals("forty thousand", NumberToEnglishEngine(40000).numberToWords())
        assertEquals("fifty thousand", NumberToEnglishEngine(50000).numberToWords())
        assertEquals("sixty thousand", NumberToEnglishEngine(60000).numberToWords())
        assertEquals("seventy thousand", NumberToEnglishEngine(70000).numberToWords())
        assertEquals("eighty thousand", NumberToEnglishEngine(80000).numberToWords())
        assertEquals("ninety thousand", NumberToEnglishEngine(90000).numberToWords())

        assertEquals("eleven thousand one hundred eleven", NumberToEnglishEngine(11111).numberToWords())
        assertEquals("ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(99999).numberToWords())

        assertEquals("fourteen thousand eighty", NumberToEnglishEngine(14080).numberToWords())
        assertEquals("twenty one thousand six hundred sixty seven", NumberToEnglishEngine(21667).numberToWords())
        assertEquals("thirty one thousand three hundred nineteen", NumberToEnglishEngine(31319).numberToWords())
        assertEquals("forty eight thousand four hundred fifty six", NumberToEnglishEngine(48456).numberToWords())
        assertEquals("fifty two thousand eight hundred thirty six", NumberToEnglishEngine(52836).numberToWords())
        assertEquals("sixty six thousand nine hundred four", NumberToEnglishEngine(66904).numberToWords())
        assertEquals("seventy four thousand five hundred forty eight", NumberToEnglishEngine(74548).numberToWords())
        assertEquals("eighty one thousand four hundred thirteen", NumberToEnglishEngine(81413).numberToWords())
        assertEquals("ninety eight thousand five hundred twenty seven", NumberToEnglishEngine(98527).numberToWords())
    }

    @Test
    fun hundredThousands() {
        assertEquals("one hundred thousand", NumberToEnglishEngine(100000).numberToWords())
        assertEquals("two hundred thousand", NumberToEnglishEngine(200000).numberToWords())
        assertEquals("three hundred thousand", NumberToEnglishEngine(300000).numberToWords())
        assertEquals("four hundred thousand", NumberToEnglishEngine(400000).numberToWords())
        assertEquals("five hundred thousand", NumberToEnglishEngine(500000).numberToWords())
        assertEquals("six hundred thousand", NumberToEnglishEngine(600000).numberToWords())
        assertEquals("seven hundred thousand", NumberToEnglishEngine(700000).numberToWords())
        assertEquals("eight hundred thousand", NumberToEnglishEngine(800000).numberToWords())
        assertEquals("nine hundred thousand", NumberToEnglishEngine(900000).numberToWords())

        assertEquals("one hundred eleven thousand one hundred eleven", NumberToEnglishEngine(111111).numberToWords())
        assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(999999).numberToWords())

        assertEquals("one hundred twenty eight thousand seven hundred twenty seven", NumberToEnglishEngine(128727).numberToWords())
        assertEquals("two hundred ninety four thousand three hundred ninety three", NumberToEnglishEngine(294393).numberToWords())
        assertEquals("three hundred forty seven thousand eight hundred sixty two", NumberToEnglishEngine(347862).numberToWords())
        assertEquals("four hundred forty eight thousand seven hundred five", NumberToEnglishEngine(448705).numberToWords())
        assertEquals("five hundred seven thousand forty six", NumberToEnglishEngine(507046).numberToWords())
        assertEquals("six hundred sixty six thousand twenty four", NumberToEnglishEngine(666024).numberToWords())
        assertEquals("seven hundred forty thousand forty two", NumberToEnglishEngine(740042).numberToWords())
        assertEquals("eight hundred fifty five thousand two hundred thirty four", NumberToEnglishEngine(855234).numberToWords())
        assertEquals("nine hundred eighty six thousand two hundred seventy three", NumberToEnglishEngine(986273).numberToWords())
        assertEquals("two hundred forty thousand one hundred two", NumberToEnglishEngine(240102).numberToWords())
        assertEquals("eight hundred fifty nine thousand forty two", NumberToEnglishEngine(859042).numberToWords())
        assertEquals("three hundred fourteen thousand four hundred four", NumberToEnglishEngine(314404).numberToWords())
        assertEquals("one hundred thousand one", NumberToEnglishEngine(100001).numberToWords())
    }

    @Test
    fun millions() {
        assertEquals("one million", NumberToEnglishEngine(1_000_000).numberToWords())
        assertEquals("two million", NumberToEnglishEngine(2_000_000).numberToWords())
        assertEquals("three million", NumberToEnglishEngine(3_000_000).numberToWords())
        assertEquals("four million", NumberToEnglishEngine(4_000_000).numberToWords())
        assertEquals("five million", NumberToEnglishEngine(5_000_000).numberToWords())
        assertEquals("six million", NumberToEnglishEngine(6_000_000).numberToWords())
        assertEquals("seven million", NumberToEnglishEngine(7_000_000).numberToWords())
        assertEquals("eight million", NumberToEnglishEngine(8_000_000).numberToWords())
        assertEquals("nine million", NumberToEnglishEngine(9_000_000).numberToWords())

        assertEquals("one million one", NumberToEnglishEngine(1_000_001).numberToWords())
        assertEquals("one million eleven", NumberToEnglishEngine(1_000_011).numberToWords())
        assertEquals("one million one hundred eleven", NumberToEnglishEngine(1_000_111).numberToWords())
        assertEquals("one million one thousand one hundred eleven", NumberToEnglishEngine(1_001_111).numberToWords())
        assertEquals("one million eleven thousand one hundred eleven", NumberToEnglishEngine(1_011_111).numberToWords())
        assertEquals("one million one hundred eleven thousand one hundred eleven", NumberToEnglishEngine(1_111_111).numberToWords())

        assertEquals("nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_999_999).numberToWords())
    }

    @Test
    fun billions() {
        assertEquals("one billion", NumberToEnglishEngine(1_000_000_000).numberToWords())
        assertEquals("nine billion", NumberToEnglishEngine(9_000_000_000).numberToWords())

        assertEquals("nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_999_999_999).numberToWords())
        assertEquals("nine billion ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_099_999_999).numberToWords())
        assertEquals("nine billion nine hundred nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_909_999_999).numberToWords())
        assertEquals("nine billion nine hundred ninety million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_990_999_999).numberToWords())
    }

    @Test
    fun trillions () {
        assertEquals("nine trillion nine hundred ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_999_999_999_999).numberToWords())
        assertEquals("nine trillion ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_099_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_909_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred ninety billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToEnglishEngine(9_990_999_999_999).numberToWords())
    }
}