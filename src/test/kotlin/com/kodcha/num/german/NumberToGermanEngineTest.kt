package com.kodcha.num.german

import com.kodcha.num.german.NumberToGermanEngine
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberToGermanEngineTest {
    
    @Test
    fun zeroToNine() {
        Assertions.assertEquals("zero", NumberToGermanEngine(0).numberToWords())
        Assertions.assertEquals("eins", NumberToGermanEngine(1).numberToWords())
        Assertions.assertEquals("zwei", NumberToGermanEngine(2).numberToWords())
        Assertions.assertEquals("drei", NumberToGermanEngine(3).numberToWords())
        Assertions.assertEquals("vier", NumberToGermanEngine(4).numberToWords())
        Assertions.assertEquals("fünf", NumberToGermanEngine(5).numberToWords())
        Assertions.assertEquals("sechs", NumberToGermanEngine(6).numberToWords())
        Assertions.assertEquals("sieben", NumberToGermanEngine(7).numberToWords())
        Assertions.assertEquals("acht", NumberToGermanEngine(8).numberToWords())
        Assertions.assertEquals("neun", NumberToGermanEngine(9).numberToWords())
    }
 }