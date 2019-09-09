package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {
    @Test
    void shouldReturnIFor1() {
        assertEquals("I", RomanConverter.toRoman(1));

    }
    @Test
    void shouldReturnIIFor2() {
        assertEquals("II", RomanConverter.toRoman(2));

    }
    @Test
    void shouldReturnIIIFor3() {
        assertEquals("III", RomanConverter.toRoman(3));

    }
    @Test
    void shouldReturnIVFor4() {
        assertEquals("IV", RomanConverter.toRoman(4));

    }
    @Test
    void shouldReturnVFor5() {
        assertEquals("V", RomanConverter.toRoman(5));

    }
    @Test
    void shouldCalcualte6through8() {
        assertEquals("VI", RomanConverter.toRoman(6));
        assertEquals("VII", RomanConverter.toRoman(7));
        assertEquals("VIII", RomanConverter.toRoman(8));

    }
    @Test
    void shouldReturnIXFor9() {
        assertEquals("IX", RomanConverter.toRoman(9));

    }
    @Test
    void shouldCalculateNumbersOver10() {
        assertEquals("X", RomanConverter.toRoman(10));
        assertEquals("XVIII", RomanConverter.toRoman(18));

    }

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }

    @Test
    void shouldCalculateSimpleDigits() {
        assertEquals("MMMDCCLXXXVIII", RomanConverter.toRoman(3888));
    }

}