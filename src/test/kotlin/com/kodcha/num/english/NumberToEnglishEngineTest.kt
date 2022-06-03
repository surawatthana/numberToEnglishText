package com.kodcha.num.english

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NumberToGermanEngineTest {

    @Test
    fun zeroToNine() {
        assertEquals("zero", NumberToGermanEngine(0).numberToWords())
        assertEquals("one", NumberToGermanEngine(1).numberToWords())
        assertEquals("two", NumberToGermanEngine(2).numberToWords())
        assertEquals("three", NumberToGermanEngine(3).numberToWords())
        assertEquals("four", NumberToGermanEngine(4).numberToWords())
        assertEquals("five", NumberToGermanEngine(5).numberToWords())
        assertEquals("six", NumberToGermanEngine(6).numberToWords())
        assertEquals("seven", NumberToGermanEngine(7).numberToWords())
        assertEquals("eight", NumberToGermanEngine(8).numberToWords())
        assertEquals("nine", NumberToGermanEngine(9).numberToWords())
    }

    @Test
    fun zeroToNineWithLeadingZero() {
        assertEquals("zero", NumberToGermanEngine("00".toLong()).numberToWords())
        assertEquals("one", NumberToGermanEngine("01".toLong()).numberToWords())
        assertEquals("two", NumberToGermanEngine("02".toLong()).numberToWords())
        assertEquals("three", NumberToGermanEngine( "03".toLong()).numberToWords())
        assertEquals("four", NumberToGermanEngine( "04".toLong()).numberToWords())
        assertEquals("five", NumberToGermanEngine( "05".toLong()).numberToWords())
        assertEquals("six", NumberToGermanEngine( "06".toLong()).numberToWords())
        assertEquals("seven", NumberToGermanEngine( "07".toLong()).numberToWords())
        assertEquals("eight", NumberToGermanEngine( "08".toLong()).numberToWords())
        assertEquals("nine", NumberToGermanEngine( "09".toLong()).numberToWords())
    }

    @Test
    fun tenToNineteen() {
        assertEquals("ten", NumberToGermanEngine(10).numberToWords())
        assertEquals("eleven", NumberToGermanEngine(11).numberToWords())
        assertEquals("twelve", NumberToGermanEngine(12).numberToWords())
        assertEquals("thirteen", NumberToGermanEngine(13).numberToWords())
        assertEquals("fourteen", NumberToGermanEngine(14).numberToWords())
        assertEquals("fifteen", NumberToGermanEngine(15).numberToWords())
        assertEquals("sixteen", NumberToGermanEngine(16).numberToWords())
        assertEquals("seventeen", NumberToGermanEngine(17).numberToWords())
        assertEquals("eighteen", NumberToGermanEngine(18).numberToWords())
        assertEquals("nineteen", NumberToGermanEngine(19).numberToWords())
    }

    @Test
    fun twentyToTwentyNine() {
        assertEquals("twenty", NumberToGermanEngine(20).numberToWords())
        assertEquals("twenty one", NumberToGermanEngine(21).numberToWords())
        assertEquals("twenty two", NumberToGermanEngine(22).numberToWords())
        assertEquals("twenty three", NumberToGermanEngine(23).numberToWords())
        assertEquals("twenty four", NumberToGermanEngine(24).numberToWords())
        assertEquals("twenty five", NumberToGermanEngine(25).numberToWords())
        assertEquals("twenty six", NumberToGermanEngine(26).numberToWords())
        assertEquals("twenty seven", NumberToGermanEngine(27).numberToWords())
        assertEquals("twenty eight", NumberToGermanEngine(28).numberToWords())
        assertEquals("twenty nine", NumberToGermanEngine(29).numberToWords())
    }

    @Test
    fun thirtyToThirtyNine() {
        assertEquals("thirty", NumberToGermanEngine(30).numberToWords())
        assertEquals("thirty one", NumberToGermanEngine(31).numberToWords())
        assertEquals("thirty two", NumberToGermanEngine(32).numberToWords())
        assertEquals("thirty three", NumberToGermanEngine(33).numberToWords())
        assertEquals("thirty four", NumberToGermanEngine(34).numberToWords())
        assertEquals("thirty five", NumberToGermanEngine(35).numberToWords())
        assertEquals("thirty six", NumberToGermanEngine(36).numberToWords())
        assertEquals("thirty seven", NumberToGermanEngine(37).numberToWords())
        assertEquals("thirty eight", NumberToGermanEngine(38).numberToWords())
        assertEquals("thirty nine", NumberToGermanEngine(39).numberToWords())
    }

    @Test
    fun fortyToFortyNine() {
        assertEquals("forty", NumberToGermanEngine(40).numberToWords())
        assertEquals("forty one", NumberToGermanEngine(41).numberToWords())
        assertEquals("forty two", NumberToGermanEngine(42).numberToWords())
        assertEquals("forty three", NumberToGermanEngine(43).numberToWords())
        assertEquals("forty four", NumberToGermanEngine(44).numberToWords())
        assertEquals("forty five", NumberToGermanEngine(45).numberToWords())
        assertEquals("forty six", NumberToGermanEngine(46).numberToWords())
        assertEquals("forty seven", NumberToGermanEngine(47).numberToWords())
        assertEquals("forty eight", NumberToGermanEngine(48).numberToWords())
        assertEquals("forty nine", NumberToGermanEngine(49).numberToWords())
    }

    @Test
    fun fiftyToFiftyNine() {
        assertEquals("fifty", NumberToGermanEngine(50).numberToWords())
        assertEquals("fifty one", NumberToGermanEngine(51).numberToWords())
        assertEquals("fifty two", NumberToGermanEngine(52).numberToWords())
        assertEquals("fifty three", NumberToGermanEngine(53).numberToWords())
        assertEquals("fifty four", NumberToGermanEngine(54).numberToWords())
        assertEquals("fifty five", NumberToGermanEngine(55).numberToWords())
        assertEquals("fifty six", NumberToGermanEngine(56).numberToWords())
        assertEquals("fifty seven", NumberToGermanEngine(57).numberToWords())
        assertEquals("fifty eight", NumberToGermanEngine(58).numberToWords())
        assertEquals("fifty nine", NumberToGermanEngine(59).numberToWords())
    }

    @Test
    fun sixtyToSixtyNine() {
        assertEquals("sixty", NumberToGermanEngine(60).numberToWords())
        assertEquals("sixty one", NumberToGermanEngine(61).numberToWords())
        assertEquals("sixty two", NumberToGermanEngine(62).numberToWords())
        assertEquals("sixty three", NumberToGermanEngine(63).numberToWords())
        assertEquals("sixty four", NumberToGermanEngine(64).numberToWords())
        assertEquals("sixty five", NumberToGermanEngine(65).numberToWords())
        assertEquals("sixty six", NumberToGermanEngine(66).numberToWords())
        assertEquals("sixty seven", NumberToGermanEngine(67).numberToWords())
        assertEquals("sixty eight", NumberToGermanEngine(68).numberToWords())
        assertEquals("sixty nine", NumberToGermanEngine(69).numberToWords())
    }

    @Test
    fun seventyToSeventyNine() {
        assertEquals("seventy", NumberToGermanEngine(70).numberToWords())
        assertEquals("seventy one", NumberToGermanEngine(71).numberToWords())
        assertEquals("seventy two", NumberToGermanEngine(72).numberToWords())
        assertEquals("seventy three", NumberToGermanEngine(73).numberToWords())
        assertEquals("seventy four", NumberToGermanEngine(74).numberToWords())
        assertEquals("seventy five", NumberToGermanEngine(75).numberToWords())
        assertEquals("seventy six", NumberToGermanEngine(76).numberToWords())
        assertEquals("seventy seven", NumberToGermanEngine(77).numberToWords())
        assertEquals("seventy eight", NumberToGermanEngine(78).numberToWords())
        assertEquals("seventy nine", NumberToGermanEngine(79).numberToWords())
    }

    @Test
    fun eightyToEightyNine() {
        assertEquals("eighty", NumberToGermanEngine(80).numberToWords())
        assertEquals("eighty one", NumberToGermanEngine(81).numberToWords())
        assertEquals("eighty two", NumberToGermanEngine(82).numberToWords())
        assertEquals("eighty three", NumberToGermanEngine(83).numberToWords())
        assertEquals("eighty four", NumberToGermanEngine(84).numberToWords())
        assertEquals("eighty five", NumberToGermanEngine(85).numberToWords())
        assertEquals("eighty six", NumberToGermanEngine(86).numberToWords())
        assertEquals("eighty seven", NumberToGermanEngine(87).numberToWords())
        assertEquals("eighty eight", NumberToGermanEngine(88).numberToWords())
        assertEquals("eighty nine", NumberToGermanEngine(89).numberToWords())
    }

    @Test
    fun ninetyToNinetyNine() {
        assertEquals("ninety", NumberToGermanEngine(90).numberToWords())
        assertEquals("ninety one", NumberToGermanEngine(91).numberToWords())
        assertEquals("ninety two", NumberToGermanEngine(92).numberToWords())
        assertEquals("ninety three", NumberToGermanEngine(93).numberToWords())
        assertEquals("ninety four", NumberToGermanEngine(94).numberToWords())
        assertEquals("ninety five", NumberToGermanEngine(95).numberToWords())
        assertEquals("ninety six", NumberToGermanEngine(96).numberToWords())
        assertEquals("ninety seven", NumberToGermanEngine(97).numberToWords())
        assertEquals("ninety eight", NumberToGermanEngine(98).numberToWords())
        assertEquals("ninety nine", NumberToGermanEngine(99).numberToWords())
    }

    @Test
    fun oneHundredToNineHundred() {
        assertEquals("one hundred", NumberToGermanEngine(100).numberToWords())
        assertEquals("two hundred", NumberToGermanEngine(200).numberToWords())
        assertEquals("three hundred", NumberToGermanEngine(300).numberToWords())
        assertEquals("four hundred", NumberToGermanEngine(400).numberToWords())
        assertEquals("five hundred", NumberToGermanEngine(500).numberToWords())
        assertEquals("six hundred", NumberToGermanEngine(600).numberToWords())
        assertEquals("seven hundred", NumberToGermanEngine(700).numberToWords())
        assertEquals("eight hundred", NumberToGermanEngine(800).numberToWords())
        assertEquals("nine hundred", NumberToGermanEngine(900).numberToWords())

        assertEquals("one hundred one", NumberToGermanEngine(101).numberToWords())
        assertEquals("two hundred one", NumberToGermanEngine(201).numberToWords())
        assertEquals("three hundred one", NumberToGermanEngine(301).numberToWords())
        assertEquals("four hundred one", NumberToGermanEngine(401).numberToWords())
        assertEquals("five hundred one", NumberToGermanEngine(501).numberToWords())
        assertEquals("six hundred one", NumberToGermanEngine(601).numberToWords())
        assertEquals("seven hundred one", NumberToGermanEngine(701).numberToWords())
        assertEquals("eight hundred one", NumberToGermanEngine(801).numberToWords())
        assertEquals("nine hundred one", NumberToGermanEngine(901).numberToWords())

        assertEquals("one hundred eleven", NumberToGermanEngine(111).numberToWords())
        assertEquals("two hundred eleven", NumberToGermanEngine(211).numberToWords())
        assertEquals("three hundred eleven", NumberToGermanEngine(311).numberToWords())
        assertEquals("four hundred eleven", NumberToGermanEngine(411).numberToWords())
        assertEquals("five hundred eleven", NumberToGermanEngine(511).numberToWords())
        assertEquals("six hundred eleven", NumberToGermanEngine(611).numberToWords())
        assertEquals("seven hundred eleven", NumberToGermanEngine(711).numberToWords())
        assertEquals("eight hundred eleven", NumberToGermanEngine(811).numberToWords())
        assertEquals("nine hundred eleven", NumberToGermanEngine(911).numberToWords())

        assertEquals("one hundred twelve", NumberToGermanEngine(112).numberToWords())
        assertEquals("two hundred twelve", NumberToGermanEngine(212).numberToWords())
        assertEquals("three hundred twelve", NumberToGermanEngine(312).numberToWords())
        assertEquals("four hundred twelve", NumberToGermanEngine(412).numberToWords())
        assertEquals("five hundred twelve", NumberToGermanEngine(512).numberToWords())
        assertEquals("six hundred twelve", NumberToGermanEngine(612).numberToWords())
        assertEquals("seven hundred twelve", NumberToGermanEngine(712).numberToWords())
        assertEquals("eight hundred twelve", NumberToGermanEngine(812).numberToWords())
        assertEquals("nine hundred twelve", NumberToGermanEngine(912).numberToWords())

        assertEquals("one hundred thirteen", NumberToGermanEngine(113).numberToWords())
        assertEquals("two hundred thirteen", NumberToGermanEngine(213).numberToWords())
        assertEquals("three hundred thirteen", NumberToGermanEngine(313).numberToWords())
        assertEquals("four hundred thirteen", NumberToGermanEngine(413).numberToWords())
        assertEquals("five hundred thirteen", NumberToGermanEngine(513).numberToWords())
        assertEquals("six hundred thirteen", NumberToGermanEngine(613).numberToWords())
        assertEquals("seven hundred thirteen", NumberToGermanEngine(713).numberToWords())
        assertEquals("eight hundred thirteen", NumberToGermanEngine(813).numberToWords())
        assertEquals("nine hundred thirteen", NumberToGermanEngine(913).numberToWords())

        assertEquals("one hundred fifty", NumberToGermanEngine(150).numberToWords())
        assertEquals("two hundred fifty", NumberToGermanEngine(250).numberToWords())
        assertEquals("three hundred fifty", NumberToGermanEngine(350).numberToWords())
        assertEquals("four hundred fifty", NumberToGermanEngine(450).numberToWords())
        assertEquals("five hundred fifty", NumberToGermanEngine(550).numberToWords())
        assertEquals("six hundred fifty", NumberToGermanEngine(650).numberToWords())
        assertEquals("seven hundred fifty", NumberToGermanEngine(750).numberToWords())
        assertEquals("eight hundred fifty", NumberToGermanEngine(850).numberToWords())
        assertEquals("nine hundred fifty", NumberToGermanEngine(950).numberToWords())

        assertEquals("one hundred ninety nine", NumberToGermanEngine(199).numberToWords())
        assertEquals("two hundred ninety nine", NumberToGermanEngine(299).numberToWords())
        assertEquals("three hundred ninety nine", NumberToGermanEngine(399).numberToWords())
        assertEquals("four hundred ninety nine", NumberToGermanEngine(499).numberToWords())
        assertEquals("five hundred ninety nine", NumberToGermanEngine(599).numberToWords())
        assertEquals("six hundred ninety nine", NumberToGermanEngine(699).numberToWords())
        assertEquals("seven hundred ninety nine", NumberToGermanEngine(799).numberToWords())
        assertEquals("eight hundred ninety nine", NumberToGermanEngine(899).numberToWords())
        assertEquals("nine hundred ninety nine", NumberToGermanEngine(999).numberToWords())

        assertEquals("two hundred seventy", NumberToGermanEngine(270).numberToWords())
        assertEquals("six hundred sixty five", NumberToGermanEngine(665).numberToWords())
        assertEquals("nine hundred eighty two", NumberToGermanEngine(982).numberToWords())
        assertEquals("five hundred ninety four", NumberToGermanEngine(594).numberToWords())
        assertEquals("three hundred nineteen", NumberToGermanEngine(319).numberToWords())
        assertEquals("six hundred fifty nine", NumberToGermanEngine(659).numberToWords())
        assertEquals("two hundred thirty one", NumberToGermanEngine(231).numberToWords())
        assertEquals("three hundred sixty nine", NumberToGermanEngine(369).numberToWords())
        assertEquals("two hundred one", NumberToGermanEngine(201).numberToWords())
        assertEquals("four hundred seventy nine", NumberToGermanEngine(479).numberToWords())
    }

    @Test
    fun thousands() {
        assertEquals("one thousand", NumberToGermanEngine(1000).numberToWords())
        assertEquals("two thousand", NumberToGermanEngine(2000).numberToWords())
        assertEquals("three thousand", NumberToGermanEngine(3000).numberToWords())
        assertEquals("four thousand", NumberToGermanEngine(4000).numberToWords())
        assertEquals("five thousand", NumberToGermanEngine(5000).numberToWords())
        assertEquals("six thousand", NumberToGermanEngine(6000).numberToWords())
        assertEquals("seven thousand", NumberToGermanEngine(7000).numberToWords())
        assertEquals("eight thousand", NumberToGermanEngine(8000).numberToWords())
        assertEquals("nine thousand", NumberToGermanEngine(9000).numberToWords())

        assertEquals("nine thousand nine hundred ninety nine", NumberToGermanEngine(9999).numberToWords())
        assertEquals("five thousand two hundred seventy eight", NumberToGermanEngine(5278).numberToWords())
        assertEquals("eight thousand five hundred twenty seven", NumberToGermanEngine(8527).numberToWords())
        assertEquals("one thousand three hundred sixteen", NumberToGermanEngine(1316).numberToWords())
        assertEquals("three thousand eight hundred sixty eight", NumberToGermanEngine(3868).numberToWords())
        assertEquals("two thousand six hundred twenty eight", NumberToGermanEngine(2628).numberToWords())
        assertEquals("four thousand seven hundred fifty nine", NumberToGermanEngine(4759).numberToWords())
        assertEquals("five thousand seven hundred fifty one", NumberToGermanEngine(5751).numberToWords())
        assertEquals("one thousand two hundred thirteen", NumberToGermanEngine(1213).numberToWords())
        assertEquals("eight thousand nine hundred eighty eight", NumberToGermanEngine(8988).numberToWords())
        assertEquals("three thousand nine hundred forty eight", NumberToGermanEngine(3948).numberToWords())
        assertEquals("eight thousand two hundred one", NumberToGermanEngine(8201).numberToWords())
        assertEquals("five thousand two hundred seventy one", NumberToGermanEngine(5271).numberToWords())
        assertEquals("eight thousand seven hundred thirty eight", NumberToGermanEngine(8738).numberToWords())
        assertEquals("nine thousand four hundred thirty nine", NumberToGermanEngine(9439).numberToWords())
        assertEquals("eight thousand seven hundred eighty four", NumberToGermanEngine(8784).numberToWords())
        assertEquals("five thousand four hundred thirty three", NumberToGermanEngine(5433).numberToWords())
        assertEquals("five thousand forty three", NumberToGermanEngine(5043).numberToWords())
        assertEquals("five thousand nine hundred ninety three", NumberToGermanEngine(5993).numberToWords())
        assertEquals("one thousand one hundred eleven", NumberToGermanEngine(1111).numberToWords())
    }

    @Test
    fun tenThousands() {
        assertEquals("ten thousand", NumberToGermanEngine(10000).numberToWords())
        assertEquals("twenty thousand", NumberToGermanEngine(20000).numberToWords())
        assertEquals("thirty thousand", NumberToGermanEngine(30000).numberToWords())
        assertEquals("forty thousand", NumberToGermanEngine(40000).numberToWords())
        assertEquals("fifty thousand", NumberToGermanEngine(50000).numberToWords())
        assertEquals("sixty thousand", NumberToGermanEngine(60000).numberToWords())
        assertEquals("seventy thousand", NumberToGermanEngine(70000).numberToWords())
        assertEquals("eighty thousand", NumberToGermanEngine(80000).numberToWords())
        assertEquals("ninety thousand", NumberToGermanEngine(90000).numberToWords())

        assertEquals("eleven thousand one hundred eleven", NumberToGermanEngine(11111).numberToWords())
        assertEquals("ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(99999).numberToWords())

        assertEquals("fourteen thousand eighty", NumberToGermanEngine(14080).numberToWords())
        assertEquals("twenty one thousand six hundred sixty seven", NumberToGermanEngine(21667).numberToWords())
        assertEquals("thirty one thousand three hundred nineteen", NumberToGermanEngine(31319).numberToWords())
        assertEquals("forty eight thousand four hundred fifty six", NumberToGermanEngine(48456).numberToWords())
        assertEquals("fifty two thousand eight hundred thirty six", NumberToGermanEngine(52836).numberToWords())
        assertEquals("sixty six thousand nine hundred four", NumberToGermanEngine(66904).numberToWords())
        assertEquals("seventy four thousand five hundred forty eight", NumberToGermanEngine(74548).numberToWords())
        assertEquals("eighty one thousand four hundred thirteen", NumberToGermanEngine(81413).numberToWords())
        assertEquals("ninety eight thousand five hundred twenty seven", NumberToGermanEngine(98527).numberToWords())
    }

    @Test
    fun hundredThousands() {
        assertEquals("one hundred thousand", NumberToGermanEngine(100000).numberToWords())
        assertEquals("two hundred thousand", NumberToGermanEngine(200000).numberToWords())
        assertEquals("three hundred thousand", NumberToGermanEngine(300000).numberToWords())
        assertEquals("four hundred thousand", NumberToGermanEngine(400000).numberToWords())
        assertEquals("five hundred thousand", NumberToGermanEngine(500000).numberToWords())
        assertEquals("six hundred thousand", NumberToGermanEngine(600000).numberToWords())
        assertEquals("seven hundred thousand", NumberToGermanEngine(700000).numberToWords())
        assertEquals("eight hundred thousand", NumberToGermanEngine(800000).numberToWords())
        assertEquals("nine hundred thousand", NumberToGermanEngine(900000).numberToWords())

        assertEquals("one hundred eleven thousand one hundred eleven", NumberToGermanEngine(111111).numberToWords())
        assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(999999).numberToWords())

        assertEquals("one hundred twenty eight thousand seven hundred twenty seven", NumberToGermanEngine(128727).numberToWords())
        assertEquals("two hundred ninety four thousand three hundred ninety three", NumberToGermanEngine(294393).numberToWords())
        assertEquals("three hundred forty seven thousand eight hundred sixty two", NumberToGermanEngine(347862).numberToWords())
        assertEquals("four hundred forty eight thousand seven hundred five", NumberToGermanEngine(448705).numberToWords())
        assertEquals("five hundred seven thousand forty six", NumberToGermanEngine(507046).numberToWords())
        assertEquals("six hundred sixty six thousand twenty four", NumberToGermanEngine(666024).numberToWords())
        assertEquals("seven hundred forty thousand forty two", NumberToGermanEngine(740042).numberToWords())
        assertEquals("eight hundred fifty five thousand two hundred thirty four", NumberToGermanEngine(855234).numberToWords())
        assertEquals("nine hundred eighty six thousand two hundred seventy three", NumberToGermanEngine(986273).numberToWords())
        assertEquals("two hundred forty thousand one hundred two", NumberToGermanEngine(240102).numberToWords())
        assertEquals("eight hundred fifty nine thousand forty two", NumberToGermanEngine(859042).numberToWords())
        assertEquals("three hundred fourteen thousand four hundred four", NumberToGermanEngine(314404).numberToWords())
        assertEquals("one hundred thousand one", NumberToGermanEngine(100001).numberToWords())
    }

    @Test
    fun millions() {
        assertEquals("one million", NumberToGermanEngine(1_000_000).numberToWords())
        assertEquals("two million", NumberToGermanEngine(2_000_000).numberToWords())
        assertEquals("three million", NumberToGermanEngine(3_000_000).numberToWords())
        assertEquals("four million", NumberToGermanEngine(4_000_000).numberToWords())
        assertEquals("five million", NumberToGermanEngine(5_000_000).numberToWords())
        assertEquals("six million", NumberToGermanEngine(6_000_000).numberToWords())
        assertEquals("seven million", NumberToGermanEngine(7_000_000).numberToWords())
        assertEquals("eight million", NumberToGermanEngine(8_000_000).numberToWords())
        assertEquals("nine million", NumberToGermanEngine(9_000_000).numberToWords())

        assertEquals("one million one", NumberToGermanEngine(1_000_001).numberToWords())
        assertEquals("one million eleven", NumberToGermanEngine(1_000_011).numberToWords())
        assertEquals("one million one hundred eleven", NumberToGermanEngine(1_000_111).numberToWords())
        assertEquals("one million one thousand one hundred eleven", NumberToGermanEngine(1_001_111).numberToWords())
        assertEquals("one million eleven thousand one hundred eleven", NumberToGermanEngine(1_011_111).numberToWords())
        assertEquals("one million one hundred eleven thousand one hundred eleven", NumberToGermanEngine(1_111_111).numberToWords())

        assertEquals("nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_999_999).numberToWords())
    }

    @Test
    fun billions() {
        assertEquals("one billion", NumberToGermanEngine(1_000_000_000).numberToWords())
        assertEquals("nine billion", NumberToGermanEngine(9_000_000_000).numberToWords())

        assertEquals("nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_999_999_999).numberToWords())
        assertEquals("nine billion ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_099_999_999).numberToWords())
        assertEquals("nine billion nine hundred nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_909_999_999).numberToWords())
        assertEquals("nine billion nine hundred ninety million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_990_999_999).numberToWords())
    }

    @Test
    fun trillions () {
        assertEquals("nine trillion nine hundred ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_999_999_999_999).numberToWords())
        assertEquals("nine trillion ninety nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_099_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred nine billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_909_999_999_999).numberToWords())
        assertEquals("nine trillion nine hundred ninety billion nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", NumberToGermanEngine(9_990_999_999_999).numberToWords())
    }
}