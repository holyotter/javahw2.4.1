package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldSqrValueTwoInRange() {
        SQRService service = new SQRService();
        int min = 350;
        int max = 400;
        int expected = 2;
        int actual = service.sqrValue(min, max);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSqrValueOneInRange() {
        SQRService service = new SQRService();
        int min = 450;
        int max = 500;
        int expected = 1;
        int actual = service.sqrValue(min, max);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSqrValueNotInRange() {
        SQRService service = new SQRService();
        int min = 790;
        int max = 840;
        int expected = 0;
        int actual = service.sqrValue(min, max);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSqrValueFiveInRange() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 200;
        int expected = 5;
        int actual = service.sqrValue(min, max);
        assertEquals(expected, actual);
    }
}