public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println();
        System.out.println("Задача 1");
        System.out.println();

        int[] money = {12000, 14000, 10000, 13000, 9000};
        int sum = 0;

        for (int j : money) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        //Task 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        int maxWaste = 0;

        for (int j : money) {
            if (maxWaste < j) {
                maxWaste = j;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxWaste + " рублей.");

        int minWaste = 20000;

        for (int j : money) {
            if (minWaste > j) {
                minWaste = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWaste + " рублей.");

        //Task 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        double[] wastes = {13232, 18988, 21343, 23873, 11972};
        double total = 0;

        for (double waste : wastes) {
            total += waste;
        }
        System.out.println("Средняя сумма трат за месяц составила " + total / wastes.length + " рублей");

        //Task 4
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}