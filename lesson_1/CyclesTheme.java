public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEvenNum = 0;
        int sumOddNum = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else if (counter % 2 != 0) {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNum +
                 ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3; 
        int min = num1 < num2 ? num1 : num2; 
        min = min < num3 ? min : num3; 

        System.out.println("\nЧисло максимальное: " + max + "; Число наименьшее: " + min);
        System.out.println("\nВыводим все числа в интервале (" + min + ", " + max + ") в порядке убывания: ");

        for (int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int sumDigits = 0;
        while (srcNum != 0) {
            int extractedDigit = srcNum % 10;
            srcNum /= 10;
            System.out.print(extractedDigit);
            sumDigits += extractedDigit;
        }
        System.out.println("\nсумма цифр: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int endRange = 24;
        int digitTransition = 9;
        for (int i = 1; i <= endRange ; i += 2) {
            System.out.printf("%5d", i);
            if ((i % 10) == digitTransition) {
                System.out.println();
            }
        }

        endRange %= 10;
        int saveCounter = digitTransition;
        if (endRange > 0) {
              saveCounter = endRange; 
        }

        for (; saveCounter < digitTransition; saveCounter += 2) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        int num = 3242592;
        int countTwos = 0;
        int copyNum = num;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }

        if (countTwos % 2 == 0) {
            System.out.println("число " + copyNum + " содержит четное количество двоек = " + 
                    countTwos);
        } else {
            System.out.println("число " + copyNum + " содержит нечетное количество двоек = " + 
                    countTwos);
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        System.out.println("используя только цикл for\n");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nиспользуя только цикл while\n");
        int numLines = 5;
        while (numLines >= 1) {
            int numCharString = 1;

            while (numCharString <= numLines) {
                System.out.print("#");
                numCharString++;
            }
            System.out.println();
            numLines--;
        }

        System.out.println("\nиспользуя только цикл do while\n");
        numLines = 1;
        int numCharString = 1;
        int counterLines = 2;

        do {
            do {
                System.out.print("$");
                numCharString++;
                if (numCharString == counterLines) {
                    if (counterLines == 2 || counterLines >= 7) {
                        counterLines += 2;
                        System.out.println();
                    } else if (counterLines == 4) {
                        counterLines += 3;
                        System.out.println();
                    }
                }
            } while (numCharString <= 9);
            numLines++;
        } while (numLines <= 1);

        System.out.println("\n\n7. Отображение ASCII-символов\n");
        for (int i = 1; i <= 1; i++){
            System.out.println("Dec " + "Char");
            for (int j = 1; j <32; j += 2) {
                System.out.printf("%8s%n", j + " = " + (char) j);
            }
            for (int k = 98; k <= 122; k += 2) {
                System.out.printf("%8s%n",k + " = " + (char) k);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int numPolindrome = 1234321;
        int revDig = 0;
        int backNum = 0;
        int saveNumPolindrome = numPolindrome;

        while (numPolindrome != 0) {
            revDig = numPolindrome % 10;
            backNum = backNum * 10 + revDig;
            numPolindrome /= 10;
        }

        if (saveNumPolindrome == backNum) {
            System.out.println("Миссия выполнена, число " + saveNumPolindrome + " является палиндромом! ");
        } else {
            System.out.println("число " + saveNumPolindrome + " не читается так же в другую сторону :(");
        }
        System.out.println("!Проверка - " + backNum + " : " + saveNumPolindrome);

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int numHappy = 123204; //sum 3 digits ?= 
        int saveNumHappy = numHappy;
        int revDigHappy = 0;
        int step = 0;
        int firstDig = 0;
        int secondDig = 0;
        int sumFirstDig = 0;
        int sumSecondDig = 0;

        System.out.println("Сумма цифр:");

        for (int i = 1; i <= 6; i++) {
            step++;
            revDigHappy = numHappy % 10;
            numHappy /= 10;

            for (int j = 1; j <= 1 && step <= 3; j++) {
                firstDig = revDigHappy;
                sumFirstDig += firstDig;
                System.out.print(firstDig);
                if (step <= 2) {
                    System.out.print(" + ");
                }
                if (step == 3) {
                    System.out.println(" = " + sumFirstDig);
                }
            }

            for (int k = 1; k <= 1 && step > 3; k++) {
                secondDig = revDigHappy;
                sumSecondDig += secondDig;
                System.out.print(secondDig);
                if (step <= 5) {
                    System.out.print(" + ");
                }
                if (step == 6) {
                    System.out.println(" = " + sumSecondDig);
                }
            }
        }

        if (sumFirstDig == sumSecondDig) {
            System.out.println("Число " + saveNumHappy + " является счастливым! :)");
        } else {
            System.out.println("Число " + saveNumHappy + " НЕ является счастливым!");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("    |");
        for (int i = 1; i <= 9; i++)  {
            if (i == 1) {
                System.out.print(" ");
            } else {
                System.out.printf("%2d ", i);
            }
        }

        System.out.printf("\n----|------------");
        System.out.printf("-------------\n");

        for (int j = 2; j <= 9; j++){
            System.out.printf("%3d |", j);
            for (int k = 2; k <= 9; k++){

                int calcTable = (k) * (j);

                System.out.printf("%3d", calcTable);
            }
            System.out.println();
        }

    }
}
