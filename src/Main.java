public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] money = {12120, 21300, 40500, 23455, 1000};
        int allMoney = 0;
        for (int val : money) {
            allMoney = allMoney + val;
        }
        System.out.println("Сумма трат за месяц составила " + allMoney + " рублей");
        //Задание 2
        int[] money2 = {4564, 897856, 4747, 43689, 8794};
        int maxMoney = -1;
        int minMoney = 200000000;
        for (final int val : money2) {
            if (val < minMoney) {
               minMoney = val;
            }
            if (val > maxMoney) {
                maxMoney = val;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minMoney + " рублей");
            System.out.println("Максимальная сумма трат за неделю составила " + maxMoney + " рублей");
            //Задача 3
        double[] money3 = {19173, 1303, 40503, 23453, 1033};
        double average = 0;
        double allMoney2 = 0;
        for (double val : money3) {
            allMoney2 = allMoney2 + val;
        }
        System.out.println("Средняя сумма трат за месяц составила " + allMoney2 / money3.length + " рублей");
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}