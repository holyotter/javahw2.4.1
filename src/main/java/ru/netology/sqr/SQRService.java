package ru.netology.sqr;

public class SQRService {
    public int sqrValue(int min, int max) {
        int num;
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            num = i * i;
            if (num >= min && num <= max) {
                counter++;
            }
        }
        return counter;
    }
}
