package ru.geekbrains.algorithmsJava1;

public class Main {

    public static void main(String[] args) {

//        Находим среднее арифмитическое O(n)
        int [] numbers = {37,65,13,55,88,65,99,146};
        int k = 0;
        for (int i = 0; i <numbers.length ; i++) {
            k+=numbers [i];
        }
        int average;
        average = k / numbers.length;
        System.out.println("Среднее арифмитическое: " + average);

//        Возводим массив в степень O(n)
        for (int i = 0; i <numbers.length ; i++) {
            numbers [i] *= numbers [i];
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers [i] + " ");
        }
        System.out.println(" ");
//        Поиск минимального элемента массива O (n)
        int min = numbers [0];
        for (int i = 0; i <numbers.length  ; i++) {
            if (min>numbers[i]) {min = numbers [i];}
        }
        System.out.print("Минимальный элемент массива: " + min);
    }
}
