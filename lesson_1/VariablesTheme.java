public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("           Задачки на тему\n \"Переменные: примитивные типы данных\"\n");
        System.out.println("1. Вывод значений переменных на консоль\n");
        byte numbCores = 4;
        short nameOS = 10;
        int assemblyCode = 19045;
        long availableMemory = 745;
        char colon = ':';
        float versBoard = 1.0f;
        double volumeMemory = 4.95;
        boolean freeMemory = ((double) volumeMemory*1024) >= availableMemory;
        if (freeMemory) {
            System.out.println("Имя ОС: Windows " + nameOS + "\nВерсия 10.0.1945" + 
                    " Cборка " + assemblyCode + "\nКоличество ядер" + colon + numbCores + 
                    "\nПолный объем физической памяти: " + volumeMemory + " Гб" + "\nДоступно физической памяти: " +
                    availableMemory + " Мб " + "\nВерсия основной платы: " + versBoard);
        } else {
            System.out.println("Закончилась память. Проверить заданные параметры!");
        }

        System.out.println("\n2. Расчет стоимости товара со скидкой:\n");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sumGoods = pricePen + priceBook;
        int sumDiscount = sumGoods * discount / 100;
        int discountPrice = sumGoods - sumDiscount;
        System.out.println("Сумма скидки: " + sumDiscount + " руб." + 
                "\nОбщая стоимость товара с учетом скидки: " + discountPrice + " руб.");

        System.out.println("\n3. Отобразите в консоли слово JAVA\n");
        System.out.println("   J    a  V     V  a    \n" + "   J   a a  V   V  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("byte: " + byteMax + "; " + (++byteMax) + "; " + (--byteMax) + "; " +
                "\nshort: " + shortMax + "; " + (++shortMax) + "; " + (--shortMax) +  "; " +
                "\nint: " + intMax + "; " + (++intMax) + "; " + (--intMax) + ";" +
                "\nlong: " + longMax + "; "+ (++longMax) + "; " + (--longMax)+ ";" );

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5; 
        System.out.println("5.1 с помощью третьей переменной " + "\nИсходные значения переменной:" + 
                " \n" + "число 1 = " + num1 + "; " + "число 2 = " + num2);
        int tmp = num2; 
        num2 = num1; 
        num1 = tmp;  
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + "; " + 
                " число 2 = " + num2); 
        System.out.println("\n5.2 с помощью арифметических операций ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num1 + "; " + 
                "число 2 = " + num2);
        num1 += num2; 
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + "; " + 
                "число 2 = " + num2);
        System.out.println("\n5.3 с помощью побитовой операции ");
        System.out.println("Исходные значения переменной: " + "\nчисло 1 = " + num1 + "; " + 
                "число 2 = " + num2);
        num1 ^= num2; 
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменной: " + "\nчисло 1 = " + num1 + "; " +
                 "число 2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println((int) ch35 + " = " + ch35 + "\n" + (int) ch38 + " = " + ch38 + 
                "\n" + (int) ch64 + " = "+ ch64 + "\n" + (int) ch94 + " = " + ch94 + 
                "\n" + (int) ch95 + " = " + ch95);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        ch95 = '_';    //переменная определена выше в задании 6
        char underline = ch95; //переопределяем 
        char slash = '/';
        char backSlash = '\\';
        char openBracket = '('; 
        char closedBraket = ')';
        System.out.println("    " + slash + backSlash + "     " + "\n" + "   " + slash + 
                "  " + backSlash + "    " + "\n" + "  " + slash + underline + openBracket + 
                " " + closedBraket + backSlash + "  " + "\n" + " " + slash + "      " + 
                backSlash + " " + "\n" + slash + underline + underline + underline + 
                underline + slash + backSlash + underline + underline + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int scrNum = 123;
        int hundred = scrNum / 100;
        int tens = scrNum / 10;
        int ones = scrNum / 1;
        int sumDigits = hundred + tens + ones;
        int prodDigits = hundred * tens * ones;
        System.out.println("Число " + scrNum + " содержит:\n" + hundred + " сотен\n" +
                tens + " десятков\n" + ones + " единиц"+"\nСумма его цифр " + sumDigits + 
                "\nА произведение " + prodDigits);

        System.out.println("\n9. Вывод времени\n");
        int srcSeconds = 86399;
        int hour = srcSeconds / 3600; //делим общ.кол-во сек на кол-во сек в часе
        int minutes = (srcSeconds % 3600) / 60; //от остатка часа деленного на минуты в часе - получаем минуты
        int second = srcSeconds % 60; //получаем остаток - это секунды
        System.out.println(hour + ":"+ minutes + ":" + second);

    }
}
