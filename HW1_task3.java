package HW1;

/**
 * task3
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task3 {
    // метод получения числа
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        // scan.close(); Почему не получается закрыть Scanner???
    }

    // метод получения числа операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}
 40  
HW1/task4.java
@@ -0,0 +1,40 @@
package HW1;
/**
 * task4
 * 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
/**
 * task4
 */
public class task4 {

    public static void main(String[] args) {
       // boolean result = true;
       // while (result) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            for (int m = 0; m < 9; m++) {
                                for (int n = 0; n < 9; n++) {
                                    if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) {
                                        int a = i * 10 + j;
                                        int b = k * 10 + l;
                                        int c = m * 10 + n;
                                        System.out.printf("%d + %d = %d   ", a, b, c);

                                        //result=false;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        //}
    }
}
