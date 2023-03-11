package Homework;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.println("Посчитать треугольное число (1) или проверить число на треугольность (2)?");
        Scanner answer = new Scanner(System.in);
        System.out.print("Введите вариант задачи: ");
        int var = answer.nextInt();
        if (var == 1) {
            Scanner num_for_task = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = num_for_task.nextInt();
            System.out.println(triangle_number(num));
        } else if (var == 2) {
            Scanner num_for_task = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = num_for_task.nextInt();
            System.out.println(check_triangle_number(num));
        } else{
            System.out.println("Нет такого варианта, до свидания!");       
        }
    }

    private static int triangle_number(int num) {
        double double_result = 0.5 * num * (num + 1);
        int result = (int) double_result;
        return result;
    }

    private static String check_triangle_number(int num) {
        double check = Math.pow(8 * num + 1, 0.5) - 1;
        String res = "";
        if (check % 2 == 0) {
            check /= 2;
            int n = (int) check;
            res = String.format("Число является треугольным %d -> %d", num, n);
        } else {
            res = String.format("Число %d не является треугольным", num);
        }
        return res;
    }
}