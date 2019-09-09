package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {
    @Test
    void shouldReturnIFor1() {
        assertEquals("I", toRoman(1));

    }
    @Test
    void shouldReturnIIFor1() {
        assertEquals("II", toRoman(2));

    }
    @Test
    void shouldReturnIIIFor3() {
        assertEquals("III", toRoman(3));

    }
    @Test
    void shouldReturnIVFor4() {
        assertEquals("IV", toRoman(4));

    }
    @Test
    void shouldReturnVFor5() {
        assertEquals("V", toRoman(5));

    }
    @Test
    void shouldCalcualte6through8() {
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));

    }
    @Test
    void shouldReturnIXFor9() {
        assertEquals("IX", toRoman(9));

    }
    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        if (number == 9) {
            result.append("IX");
            number = 0;
        }
        if (number >= 5) {
            result.append("V");
            number -= 5;
        }
        if (number == 4) {
            result.append("IV");
            number = 0;
        }
        for (int i = 0; i < number; i++) { // checks 1-3
            result.append("I");
        }
        return result.toString();
    }
}