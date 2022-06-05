package com.kodcha.num.german

import com.kodcha.num.english.NumberToEnglishEngine
import com.kodcha.num.german.NumberToGermanEngine
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberToGermanEngineTest {

    @Test
    fun zeroToNine() {
        assertEquals("zero", NumberToGermanEngine(0).numberToWords())
        assertEquals("eins", NumberToGermanEngine(1).numberToWords())
        assertEquals("zwei", NumberToGermanEngine(2).numberToWords())
        assertEquals("drei", NumberToGermanEngine(3).numberToWords())
        assertEquals("vier", NumberToGermanEngine(4).numberToWords())
        assertEquals("fünf", NumberToGermanEngine(5).numberToWords())
        assertEquals("sechs", NumberToGermanEngine(6).numberToWords())
        assertEquals("sieben", NumberToGermanEngine(7).numberToWords())
        assertEquals("acht", NumberToGermanEngine(8).numberToWords())
        assertEquals("neun", NumberToGermanEngine(9).numberToWords())
    }

    @Test
    fun zeroToNineWithLeadingZero() {
        assertEquals("zero", NumberToGermanEngine("00".toLong()).numberToWords())
        assertEquals("eins", NumberToGermanEngine("01".toLong()).numberToWords())
        assertEquals("zwei", NumberToGermanEngine("02".toLong()).numberToWords())
        assertEquals("drei", NumberToGermanEngine("03".toLong()).numberToWords())
        assertEquals("vier", NumberToGermanEngine("04".toLong()).numberToWords())
        assertEquals("fünf", NumberToGermanEngine("05".toLong()).numberToWords())
        assertEquals("sechs", NumberToGermanEngine("06".toLong()).numberToWords())
        assertEquals("sieben", NumberToGermanEngine("07".toLong()).numberToWords())
        assertEquals("acht", NumberToGermanEngine("08".toLong()).numberToWords())
        assertEquals("neun", NumberToGermanEngine("09".toLong()).numberToWords())
    }

    @Test
    fun tenToNineteen() {
        assertEquals("zehn", NumberToGermanEngine(10).numberToWords())
        assertEquals("elf", NumberToGermanEngine(11).numberToWords())
        assertEquals("zwölf", NumberToGermanEngine(12).numberToWords())
        assertEquals("dreizehn", NumberToGermanEngine(13).numberToWords())
        assertEquals("vierzehn", NumberToGermanEngine(14).numberToWords())
        assertEquals("fünfzehn", NumberToGermanEngine(15).numberToWords())
        assertEquals("sechzehn", NumberToGermanEngine(16).numberToWords())
        assertEquals("siebzehn", NumberToGermanEngine(17).numberToWords())
        assertEquals("achtzehn", NumberToGermanEngine(18).numberToWords())
        assertEquals("neunzehn", NumberToGermanEngine(19).numberToWords())
    }

    @Test
    fun twentyToTwentyNine() {
        assertEquals("zwanzig", NumberToGermanEngine(20).numberToWords())
        assertEquals("einundzwanzig", NumberToGermanEngine(21).numberToWords())
        assertEquals("zweiundzwanzig", NumberToGermanEngine(22).numberToWords())
        assertEquals("dreiundzwanzig", NumberToGermanEngine(23).numberToWords())
        assertEquals("vierundzwanzig", NumberToGermanEngine(24).numberToWords())
        assertEquals("fünfundzwanzig", NumberToGermanEngine(25).numberToWords())
        assertEquals("sechsundzwanzig", NumberToGermanEngine(26).numberToWords())
        assertEquals("siebenundzwanzig", NumberToGermanEngine(27).numberToWords())
        assertEquals("achtundzwanzig", NumberToGermanEngine(28).numberToWords())
        assertEquals("neunundzwanzig", NumberToGermanEngine(29).numberToWords())
    }

    @Test
    fun thirtyToThirtyNine() {
        assertEquals("dreiβig", NumberToGermanEngine(30).numberToWords())
        assertEquals("einunddreiβig", NumberToGermanEngine(31).numberToWords())
        assertEquals("zweiunddreiβig", NumberToGermanEngine(32).numberToWords())
        assertEquals("dreiunddreiβig", NumberToGermanEngine(33).numberToWords())
        assertEquals("vierunddreiβig", NumberToGermanEngine(34).numberToWords())
        assertEquals("fünfunddreiβig", NumberToGermanEngine(35).numberToWords())
        assertEquals("sechsunddreiβig", NumberToGermanEngine(36).numberToWords())
        assertEquals("siebenunddreiβig", NumberToGermanEngine(37).numberToWords())
        assertEquals("achtunddreiβig", NumberToGermanEngine(38).numberToWords())
        assertEquals("neununddreiβig", NumberToGermanEngine(39).numberToWords())
    }

    @Test
    fun fortyToFortyNine() {
        assertEquals("vierzig", NumberToGermanEngine(40).numberToWords())
        assertEquals("einundvierzig", NumberToGermanEngine(41).numberToWords())
        assertEquals("zweiundvierzig", NumberToGermanEngine(42).numberToWords())
        assertEquals("dreiundvierzig", NumberToGermanEngine(43).numberToWords())
        assertEquals("vierundvierzig", NumberToGermanEngine(44).numberToWords())
        assertEquals("fünfundvierzig", NumberToGermanEngine(45).numberToWords())
        assertEquals("sechsundvierzig", NumberToGermanEngine(46).numberToWords())
        assertEquals("siebenundvierzig", NumberToGermanEngine(47).numberToWords())
        assertEquals("achtundvierzig", NumberToGermanEngine(48).numberToWords())
        assertEquals("neunundvierzig", NumberToGermanEngine(49).numberToWords())
    }

    @Test
    fun fiftyToFiftyNine() {
        assertEquals("fünfzig", NumberToGermanEngine(50).numberToWords())
        assertEquals("einundfünfzig", NumberToGermanEngine(51).numberToWords())
        assertEquals("zweiundfünfzig", NumberToGermanEngine(52).numberToWords())
        assertEquals("dreiundfünfzig", NumberToGermanEngine(53).numberToWords())
        assertEquals("vierundfünfzig", NumberToGermanEngine(54).numberToWords())
        assertEquals("fünfundfünfzig", NumberToGermanEngine(55).numberToWords())
        assertEquals("sechsundfünfzig", NumberToGermanEngine(56).numberToWords())
        assertEquals("siebenundfünfzig", NumberToGermanEngine(57).numberToWords())
        assertEquals("achtundfünfzig", NumberToGermanEngine(58).numberToWords())
        assertEquals("neunundfünfzig", NumberToGermanEngine(59).numberToWords())
    }

    @Test
    fun sixtyToSixtyNine() {
        assertEquals("sechzig", NumberToGermanEngine(60).numberToWords())
        assertEquals("einundsechzig", NumberToGermanEngine(61).numberToWords())
        assertEquals("zweiundsechzig", NumberToGermanEngine(62).numberToWords())
        assertEquals("dreiundsechzig", NumberToGermanEngine(63).numberToWords())
        assertEquals("vierundsechzig", NumberToGermanEngine(64).numberToWords())
        assertEquals("fünfundsechzig", NumberToGermanEngine(65).numberToWords())
        assertEquals("sechsundsechzig", NumberToGermanEngine(66).numberToWords())
        assertEquals("siebenundsechzig", NumberToGermanEngine(67).numberToWords())
        assertEquals("achtundsechzig", NumberToGermanEngine(68).numberToWords())
        assertEquals("neunundsechzig", NumberToGermanEngine(69).numberToWords())
    }

    @Test
    fun seventyToSeventyNine() {
        assertEquals("siebzig", NumberToGermanEngine(70).numberToWords())
        assertEquals("einundsiebzig", NumberToGermanEngine(71).numberToWords())
        assertEquals("zweiundsiebzig", NumberToGermanEngine(72).numberToWords())
        assertEquals("dreiundsiebzig", NumberToGermanEngine(73).numberToWords())
        assertEquals("vierundsiebzig", NumberToGermanEngine(74).numberToWords())
        assertEquals("fünfundsiebzig", NumberToGermanEngine(75).numberToWords())
        assertEquals("sechsundsiebzig", NumberToGermanEngine(76).numberToWords())
        assertEquals("siebenundsiebzig", NumberToGermanEngine(77).numberToWords())
        assertEquals("achtundsiebzig", NumberToGermanEngine(78).numberToWords())
        assertEquals("neunundsiebzig", NumberToGermanEngine(79).numberToWords())
    }

    @Test
    fun eightyToEightyNine() {
        assertEquals("achtzig", NumberToGermanEngine(80).numberToWords())
        assertEquals("einundachtzig", NumberToGermanEngine(81).numberToWords())
        assertEquals("zweiundachtzig", NumberToGermanEngine(82).numberToWords())
        assertEquals("dreiundachtzig", NumberToGermanEngine(83).numberToWords())
        assertEquals("vierundachtzig", NumberToGermanEngine(84).numberToWords())
        assertEquals("fünfundachtzig", NumberToGermanEngine(85).numberToWords())
        assertEquals("sechsundachtzig", NumberToGermanEngine(86).numberToWords())
        assertEquals("siebenundachtzig", NumberToGermanEngine(87).numberToWords())
        assertEquals("achtundachtzig", NumberToGermanEngine(88).numberToWords())
        assertEquals("neunundachtzig", NumberToGermanEngine(89).numberToWords())
    }

    @Test
    fun ninetyToNinetyNine() {
        assertEquals("neunzig", NumberToGermanEngine(90).numberToWords())
        assertEquals("einundneunzig", NumberToGermanEngine(91).numberToWords())
        assertEquals("zweiundneunzig", NumberToGermanEngine(92).numberToWords())
        assertEquals("dreiundneunzig", NumberToGermanEngine(93).numberToWords())
        assertEquals("vierundneunzig", NumberToGermanEngine(94).numberToWords())
        assertEquals("fünfundneunzig", NumberToGermanEngine(95).numberToWords())
        assertEquals("sechsundneunzig", NumberToGermanEngine(96).numberToWords())
        assertEquals("siebenundneunzig", NumberToGermanEngine(97).numberToWords())
        assertEquals("achtundneunzig", NumberToGermanEngine(98).numberToWords())
        assertEquals("neunundneunzig", NumberToGermanEngine(99).numberToWords())
    }

    @Test
    fun oneHundredToNineHundred() {
        assertEquals("einhundert", NumberToGermanEngine(100).numberToWords())
        assertEquals("zweihundert", NumberToGermanEngine(200).numberToWords())
        assertEquals("dreihundert", NumberToGermanEngine(300).numberToWords())
        assertEquals("vierhundert", NumberToGermanEngine(400).numberToWords())
        assertEquals("fünfhundert", NumberToGermanEngine(500).numberToWords())
        assertEquals("sechshundert", NumberToGermanEngine(600).numberToWords())
        assertEquals("siebenhundert", NumberToGermanEngine(700).numberToWords())
        assertEquals("achthundert", NumberToGermanEngine(800).numberToWords())
        assertEquals("neunhundert", NumberToGermanEngine(900).numberToWords())

        assertEquals("einhunderteins", NumberToGermanEngine(101).numberToWords())
        assertEquals("zweihunderteins", NumberToGermanEngine(201).numberToWords())
        assertEquals("dreihunderteins", NumberToGermanEngine(301).numberToWords())
        assertEquals("vierhunderteins", NumberToGermanEngine(401).numberToWords())
        assertEquals("fünfhunderteins", NumberToGermanEngine(501).numberToWords())
        assertEquals("sechshunderteins", NumberToGermanEngine(601).numberToWords())
        assertEquals("siebenhunderteins", NumberToGermanEngine(701).numberToWords())
        assertEquals("achthunderteins", NumberToGermanEngine(801).numberToWords())
        assertEquals("neunhunderteins", NumberToGermanEngine(901).numberToWords())

        assertEquals("einhundertelf", NumberToGermanEngine(111).numberToWords())
        assertEquals("zweihundertelf", NumberToGermanEngine(211).numberToWords())
        assertEquals("dreihundertelf", NumberToGermanEngine(311).numberToWords())
        assertEquals("vierhundertelf", NumberToGermanEngine(411).numberToWords())
        assertEquals("fünfhundertelf", NumberToGermanEngine(511).numberToWords())
        assertEquals("sechshundertelf", NumberToGermanEngine(611).numberToWords())
        assertEquals("siebenhundertelf", NumberToGermanEngine(711).numberToWords())
        assertEquals("achthundertelf", NumberToGermanEngine(811).numberToWords())
        assertEquals("neunhundertelf", NumberToGermanEngine(911).numberToWords())

        assertEquals("einhundertzwölf", NumberToGermanEngine(112).numberToWords())
        assertEquals("zweihundertzwölf", NumberToGermanEngine(212).numberToWords())
        assertEquals("dreihundertzwölf", NumberToGermanEngine(312).numberToWords())
        assertEquals("vierhundertzwölf", NumberToGermanEngine(412).numberToWords())
        assertEquals("fünfhundertzwölf", NumberToGermanEngine(512).numberToWords())
        assertEquals("sechshundertzwölf", NumberToGermanEngine(612).numberToWords())
        assertEquals("siebenhundertzwölf", NumberToGermanEngine(712).numberToWords())
        assertEquals("achthundertzwölf", NumberToGermanEngine(812).numberToWords())
        assertEquals("neunhundertzwölf", NumberToGermanEngine(912).numberToWords())

        assertEquals("einhundertdreizehn", NumberToGermanEngine(113).numberToWords())
        assertEquals("zweihundertdreizehn", NumberToGermanEngine(213).numberToWords())
        assertEquals("dreihundertdreizehn", NumberToGermanEngine(313).numberToWords())
        assertEquals("vierhundertdreizehn", NumberToGermanEngine(413).numberToWords())
        assertEquals("fünfhundertdreizehn", NumberToGermanEngine(513).numberToWords())
        assertEquals("sechshundertdreizehn", NumberToGermanEngine(613).numberToWords())
        assertEquals("siebenhundertdreizehn", NumberToGermanEngine(713).numberToWords())
        assertEquals("achthundertdreizehn", NumberToGermanEngine(813).numberToWords())
        assertEquals("neunhundertdreizehn", NumberToGermanEngine(913).numberToWords())

        assertEquals("einhundertfünfzig", NumberToGermanEngine(150).numberToWords())
        assertEquals("zweihundertfünfzig", NumberToGermanEngine(250).numberToWords())
        assertEquals("dreihundertfünfzig", NumberToGermanEngine(350).numberToWords())
        assertEquals("vierhundertfünfzig", NumberToGermanEngine(450).numberToWords())
        assertEquals("fünfhundertfünfzig", NumberToGermanEngine(550).numberToWords())
        assertEquals("sechshundertfünfzig", NumberToGermanEngine(650).numberToWords())
        assertEquals("siebenhundertfünfzig", NumberToGermanEngine(750).numberToWords())
        assertEquals("achthundertfünfzig", NumberToGermanEngine(850).numberToWords())
        assertEquals("neunhundertfünfzig", NumberToGermanEngine(950).numberToWords())

        assertEquals("einhundertneunundneunzig", NumberToGermanEngine(199).numberToWords())
        assertEquals("zweihundertneunundneunzig", NumberToGermanEngine(299).numberToWords())
        assertEquals("dreihundertneunundneunzig", NumberToGermanEngine(399).numberToWords())
        assertEquals("vierhundertneunundneunzig", NumberToGermanEngine(499).numberToWords())
        assertEquals("fünfhundertneunundneunzig", NumberToGermanEngine(599).numberToWords())
        assertEquals("sechshundertneunundneunzig", NumberToGermanEngine(699).numberToWords())
        assertEquals("siebenhundertneunundneunzig", NumberToGermanEngine(799).numberToWords())
        assertEquals("achthundertneunundneunzig", NumberToGermanEngine(899).numberToWords())
        assertEquals("neunhundertneunundneunzig", NumberToGermanEngine(999).numberToWords())

        assertEquals("zweihundertsiebzig", NumberToGermanEngine(270).numberToWords())
        assertEquals("sechshundertfünfundsechzig", NumberToGermanEngine(665).numberToWords())
        assertEquals("neunhundertzweiundachtzig", NumberToGermanEngine(982).numberToWords())
        assertEquals("fünfhundertvierundneunzig", NumberToGermanEngine(594).numberToWords())
        assertEquals("dreihundertneunzehn", NumberToGermanEngine(319).numberToWords())
        assertEquals("sechshundertneunundfünfzig", NumberToGermanEngine(659).numberToWords())
        assertEquals("zweihunderteinunddreiβig", NumberToGermanEngine(231).numberToWords())
        assertEquals("dreihundertneunundsechzig", NumberToGermanEngine(369).numberToWords())
        assertEquals("zweihunderteins", NumberToGermanEngine(201).numberToWords())
        assertEquals("vierhundertneunundsiebzig", NumberToGermanEngine(479).numberToWords())
    }

    @Test
    fun thousands() {
        assertEquals("eintausend", NumberToGermanEngine(1000).numberToWords())
        assertEquals("zweitausend", NumberToGermanEngine(2000).numberToWords())
        assertEquals("dreitausend", NumberToGermanEngine(3000).numberToWords())
        assertEquals("viertausend", NumberToGermanEngine(4000).numberToWords())
        assertEquals("fünftausend", NumberToGermanEngine(5000).numberToWords())
        assertEquals("sechstausend", NumberToGermanEngine(6000).numberToWords())
        assertEquals("siebentausend", NumberToGermanEngine(7000).numberToWords())
        assertEquals("achttausend", NumberToGermanEngine(8000).numberToWords())
        assertEquals("neuntausend", NumberToGermanEngine(9000).numberToWords())

        assertEquals("neuntausendneunhundertneunundneunzig", NumberToGermanEngine(9999).numberToWords())
        assertEquals("fünftausendzweihundertachtundsiebzig", NumberToGermanEngine(5278).numberToWords())
        assertEquals("achttausendfünfhundertsiebenundzwanzig", NumberToGermanEngine(8527).numberToWords())
        assertEquals("eintausenddreihundertsechzehn", NumberToGermanEngine(1316).numberToWords())
        assertEquals("dreitausendachthundertachtundsechzig", NumberToGermanEngine(3868).numberToWords())
        assertEquals("zweitausendsechshundertachtundzwanzig", NumberToGermanEngine(2628).numberToWords())
        assertEquals("viertausendsiebenhundertneunundfünfzig", NumberToGermanEngine(4759).numberToWords())
        assertEquals("fünftausendsiebenhunderteinundfünfzig", NumberToGermanEngine(5751).numberToWords())
        assertEquals("eintausendzweihundertdreizehn", NumberToGermanEngine(1213).numberToWords())
        assertEquals("achttausendneunhundertachtundachtzig", NumberToGermanEngine(8988).numberToWords())
        assertEquals("dreitausendneunhundertachtundvierzig", NumberToGermanEngine(3948).numberToWords())
        assertEquals("achttausendzweihunderteins", NumberToGermanEngine(8201).numberToWords())
        assertEquals("fünftausendzweihunderteinundsiebzig", NumberToGermanEngine(5271).numberToWords())
        assertEquals("achttausendsiebenhundertachtunddreißig", NumberToGermanEngine(8738).numberToWords())
        assertEquals("neuntausendvierhundertneununddreißig", NumberToGermanEngine(9439).numberToWords())
        assertEquals("achttausendsiebenhundertvierundachtzig", NumberToGermanEngine(8784).numberToWords())
        assertEquals("fünftausendvierhundertdreiunddreißig", NumberToGermanEngine(5433).numberToWords())
        assertEquals("fünftausenddreiundvierzig", NumberToGermanEngine(5043).numberToWords())
        assertEquals("fünftausendneunhundertdreiundneunzig", NumberToGermanEngine(5993).numberToWords())
        assertEquals("eintausendeinhundertelf", NumberToGermanEngine(1111).numberToWords())
    }

    @Test
    fun tenThousands() {
        assertEquals("zehntausend", NumberToGermanEngine(10000).numberToWords())
    }
 }