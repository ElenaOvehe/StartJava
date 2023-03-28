public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Калькулятор: \n");
        int a = 5;
        int b = 4;
        char sign = '^';
        int result = 1;
        int numA = 1;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            for (int i = 1; i <= b; i++) {
                result = numA; 
                numA = a * result;
                //System.out.println("numA = " + numA);
            }
            result = numA;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);

        System.out.println("\n2. Игра \"Угадай число\":\n");
        int numComputer = 22;
        int numUser = 27;
        int numMin = 1;
        int numMax = 100;
        for (numMin = 1; numMin <= numMax; numMin++) {
        if (numUser == numComputer) {
                System.out.println("Вы победили!");
                return;
        } else {
            if (numUser < numComputer) {
                System.out.println("число " + numUser + " меньше того, что загадал компьютер");
                numUser++;
            } else {
                System.out.println("число " + numUser + " больше того, что загадал компьютер");
                numUser--;
            }
        }
        }

    }
}