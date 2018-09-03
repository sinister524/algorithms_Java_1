package ru.geekbrains.algorithmsJava1;

public class Main {

    public static void main(String[] args) {

//        Находим среднее арифмитическое O(n)
        int [] numbers = {5,65,13,55,88,65,99,146};
        int k = 0;
        for (int i = 0; i <numbers.length ; i++) {
            k+=numbers [i];
        }
        int average;
        average = k / numbers.length;
        System.out.println("Среднее арифмитическое: " + average);
    }
}
