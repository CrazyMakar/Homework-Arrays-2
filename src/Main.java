public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        {
            int[] pay = {73746, 564546, 92942, 21345, 193458};
            int sum = 0;
            for (int i = 0; i < pay.length; i++) {
                sum += pay[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        }
        System.out.println();

        System.out.println("Задание №2");
        {
            int[] pay = {73746, 564546, 92942, 21345, 193458};
            int minPay = pay[0];
            int maxPay = pay[0];
            for (int i = 0; i < pay.length; i++) {
                if (pay[i] < minPay) {
                    minPay = pay[i];
                }
                if (pay[i] > maxPay) {
                    maxPay = pay[i];
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. " +
                    "Максимальная сумма трат за неделю составила " + maxPay + " рублей.");
        }
        System.out.println();

        System.out.println("Задание №3");
        {
            int[] pay = {73746, 564546, 92942, 21345, 193458};
            int sum = 0;
            for (int i = 0; i < pay.length; i++) {
                sum += pay[i];
            }
            double sumMonth = (double) sum / 4;
            System.out.println("Средняя сумма трат за месяц составила " + sumMonth + " рублей.");
        }
        System.out.println();

        System.out.println("Задание №4");
        {
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}