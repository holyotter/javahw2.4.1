package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @Test
    public void shouldSqrValue() {
        SQRService service = new SQRService();
        int min = 350;
        int max = 400;
        int expected = 2;
        int actual = service.sqrValue(min, max);
        assertEquals(expected, actual);
    }
}