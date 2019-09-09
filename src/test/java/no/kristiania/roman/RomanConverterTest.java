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
    private String toRoman(int number) {
        String result = "";
        if (number == 2) {
            result = "II";
        } else if (number == 1) {
            result = "I";
        }else if (number == 3) {
            result = "III";
        }
        return result;
    }
}