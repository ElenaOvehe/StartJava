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

        int max1 = num1 > num2 ? num1 : num2;
        int max = max1 > num3 ? max1 : num3; 
        int min1 = num1 < num2 ? num1 : num2; 
        int min = min1 < num3 ? min1 : num3; 

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
        int digTransition = 9;
        for (int i = 1; i <= endRange ; i += 2) {
            System.out.printf("%5d", i);
            if ((i % 10) == digTransition) {
                System.out.println();
            }
        }

        endRange %= 10;
        int saveCounter = digTransition;
        if (endRange > 0) {
              saveCounter = endRange; 
        }

        int dig0 = 0;
        for (; saveCounter < digTransition; saveCounter += 2) {
            System.out.printf("%5d", dig0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        int num = 3242592;
        int countTwos = 0;
        int saveNum = num;

        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }

        if (countTwos % 2 == 0) {
                System.out.println("число " + saveNum + " содержит четное количество двоек = " + 
                        countTwos);
        } else {
                System.out.println("число " + saveNum + " содержит нечетное количество двоек = " + 
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
        int externalReplay = 5;
        while (externalReplay >= 1) {
            int internalReplay = 1;

            while (internalReplay <= externalReplay) {
                System.out.print("#");
                internalReplay++;
            }
            System.out.println();
            externalReplay--;
        }

        System.out.println("\nиспользуя только цикл do while\n");
        int counter1 = 1;
        int counter2 = counter1;
        do {
            System.out.println("$");
            do {
                System.out.print("$");
                counter2++;

                if (counter2 == 3) {
                    System.out.print("$");
                }

            } while (counter2 <= 1);
            counter1++;
        } while (counter1 <= 4);

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
