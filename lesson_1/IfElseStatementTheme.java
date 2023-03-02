import java.util.Scanner;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 27 ;
        if (age < 20) {
            System.out.println("Вы младше 20 лет");
        } else {
            System.out.println("Вы старше 20 лет");
        }
        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Пользователь - мужчина");
        } else {
            System.out.println("Пользователь - женщина");
        }
        float heigh = (float) 169 / 100;
        System.out.println("heigh = " + heigh);
        if (heigh < 1.80) {
            System.out.println("Ваш рост ниже 1 м 80 см, и составляет: " + (int) (heigh*100) + " см");
        } else {
            System.out.println("Ваш рост выше 180 см, и составляет: " + (int) (heigh*100) + " см");
        }
        char capitalLetter = "Bary".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается на букву \"M\"");
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается на букву \"I\"");
        } else {
            System.out.println("\nПриятно познакомиться! Ваше имя начинается на букву " 
                    + "\"" + capitalLetter + "\"");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 16;
        int num2 = -22;
        if (num1 < num2) {
            System.out.println("Число " + num1 + " меньше, чем число: " + num2);
        } else if (num1 > num2) {
            System.out.println("Число " + num1 + " больше, чем число: " + num2);
        } else {
            System.out.println("Числа: " + num1 + " и " + num2 + " равны!");
        }

        System.out.println("\n3. Проверка числа");
        int num3 = -55;
        if (num3 == 0) {
            System.out.println("number = " + num3);
        } else if (num3 != 0) {
            if (num3 % 2 == 0) {
                System.out.println(num3 + " - число четное");
            } else {
                System.out.println(num3 + " - число не четное");
            }
            if (num3 > 0) {
                System.out.println("number " + num3 + " > 0");
            } else {
                System.out.println("number " + num3 + " < 0");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int scrNum1 = 222;
        int scrNum2 = 715;
        int hundred1 = scrNum1 / 100;
        int tens1 = scrNum1 / 10 % 10;
        int ones1 = scrNum1 % 10;
        int hundred2 = scrNum2 / 100;
        int tens2 = scrNum2 / 10 % 10;
        int ones2 = scrNum2 % 10;
        System.out.println("\nИсходные числа " + scrNum1 + " и " + scrNum2 );

        if (hundred1 == hundred2) {
            System.out.println("Одинаковые в них цифры первого разряда: " + 
                    hundred1 + " = " + hundred2);
        } 
        if (tens1 == tens2) {
            System.out.println("Одинаковые в них цифры второго разряда: " + tens1 + " = " + tens2);
        } 
        if (ones1 == ones2) {
            System.out.println("Одинаковые в них цифры третьего разряда: " + ones1 + " = " + ones2);
        } 
        if (hundred1 != hundred2 && tens1 != tens2 && ones1 != ones2){
            System.out.println("равных цифр нет!");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char unknownChar = '\u0057';
        if ((unknownChar >= 'A') && (unknownChar <= 'Z')) { //A = 65 Z = 90
            System.out.println("код обозначает: " + unknownChar + " - большую букву");
        } else if ((unknownChar >= 'a') && (unknownChar < 'z')) {
            System.out.println("код обозначает: " + unknownChar + " - маленькую букву");
        } else if ((unknownChar >= '0') && (unknownChar <= '9')) {
            System.out.println("код является: " + unknownChar + " - цифрой");
        } else {
            System.out.println("исходный код является не буквой и не цифрой!");
        }
        System.out.println(unknownChar + " - номер кода " + (int) unknownChar);

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        int accrual = 5;
        if ((depositAmount >= 100_000) && (depositAmount < 300_000)) {
            accrual = 7;
        } else if (depositAmount >= 300_000) {
            accrual = 10;
        } 
        int accrualCalcul = depositAmount * accrual / 100;
        int amountYear = depositAmount + accrualCalcul;
        System.out.println("\nНа данный вклад начисления составят: " + accrual + " %");
        System.out.println("Клиент внес: " + depositAmount + "\nНачисления составят: " + 
                accrualCalcul + "\nИтоговая сумма к выплате за год: " + amountYear);

        System.out.println("\n7. Определение оценки по предметам\n");
        int ratingHistory = 59;
        int ratingProgramming = 91;
        int averageRating = (ratingHistory + ratingProgramming) / 2;
        int scoresHistory = 2 ;
        int scoresProgramming = 2;
        
        if (ratingHistory > 60 && ratingHistory <= 73) {
            scoresHistory = 3; 
        }else if (ratingHistory > 73 && ratingHistory <= 91) {
            scoresHistory = 4; 
        } else if (ratingHistory > 91 && ratingHistory <= 100){
            scoresHistory = 5; 
        } 

        if (ratingProgramming > 60 && ratingProgramming <= 73) {
            scoresProgramming = 3;
        } else if (ratingProgramming > 73 && ratingProgramming <= 91) {
            scoresProgramming = 4;
        } else if (ratingProgramming > 91 && ratingProgramming <= 100){
            scoresProgramming = 5;
        }

        int averageScore = (scoresHistory + scoresProgramming) / 2;
        System.out.println("Ученик получил следующие оценки: \n" + scoresHistory + 
                " балла по истории\n" + scoresProgramming + " балла по программированию" );
        System.out.println("Средний балл оценок по предметам: " + averageScore +
                "\nСредний % по предметам: " + averageRating + " %");

        System.out.println("\n8. Расчет прибыли за год\n");
        int expensisRent = 5_000;
        int expensisGoods = 9_000;
        int profitGoods = 13_000;
        int calculationYear = (profitGoods - (expensisRent + expensisGoods)) * 12;
        if (calculationYear > 0) {
            System.out.println("+" + calculationYear + " руб.");
        } else {
            System.out.println(calculationYear + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int needMoney = 567;
        int requestNum100USD = needMoney / 100;
        int requestNum10USD = needMoney / 10 % 10;
        int requestNum1USD = needMoney % 10;

        int have100USD = 10;
        int have10USD = 5;
        int have1USD = 50;
        int jarTotalMoney = have100USD * 100 + have10USD * 10 + have1USD * 1;

        int give100USD = 0;
        int give10USD = 0;
        int give1USD = 0;

        int calcHundreds = 0;
        int calcTens = 0;
        int calcOnes = 0;

        if (jarTotalMoney >= needMoney) {
            if (requestNum100USD <= have100USD) {
                give100USD = requestNum100USD;
            } else if (requestNum100USD > have100USD) {
                calcHundreds = 10 * (requestNum100USD - have100USD); 
                give100USD = have100USD;
                give10USD = have10USD - calcHundreds; 
            }

            if (requestNum10USD <= (have10USD - calcHundreds)) {
                give10USD = have10USD - (calcHundreds + requestNum10USD);
                give10USD = have10USD - give10USD;
            } else if (requestNum10USD > (have10USD - calcHundreds)) {
                calcTens = 10 * (requestNum10USD - have10USD); 
                give10USD = have10USD;
                give1USD = have1USD - calcTens; 
            }

            if (requestNum1USD <= (have1USD - calcOnes)) {
                give1USD = have1USD - (calcTens + requestNum1USD);
                give1USD = have1USD - give1USD;
            } else if (requestNum1USD > (have1USD - calcTens)) {
                calcTens = 10 * (requestNum10USD - have10USD); 
                give1USD = have1USD - calcTens ; 
            }

            System.out.println("Сумма к выдаче: " + needMoney + " USD");
            System.out.println("номиналом: \n" + give100USD + " банкнот 100 USD\n" + 
                    give10USD + " банкнот 10 USD\n" + give1USD + " банкнот 1 USD\n");
            
        } else {
            System.out.println("В банкомате не хватает денежных средств!");
        }

    }
}