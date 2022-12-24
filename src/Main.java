public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

        public static void task1() {
            System.out.println( "Задача 1");
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int element : arr) {
                sum+=element;
                }System.out.println("сумма трат за месяц составила" + sum + "рублей");
        }
        public static void task2(){
            System.out.println( "Задача 2");
            int[] arr = generateRandomArray();
            int max = Integer.MIN_VALUE;
            for (final int current : arr) {
                if (current > max) {
                    max = current;
                }
            }
            System.out.println(max);
            int min = Integer.MAX_VALUE;
            for (final int current : arr) {
                if (current < min) {
                    min = current;
                }
            }
            System.out.println(min);
        }
        public static void task3() {
            System.out.println("Задача 3");
            int[] arr = generateRandomArray();
            float sum = 0f;
            for (int element : arr) {
                sum += element;
            }
            sum = sum / arr.length;
            System.out.println("средняя сумма трат за месяц составила " + sum + " рублей");
        }

        public static void task4(){
            System.out.println( "Задача 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >=0; i--) {
                System.out.print(reverseFullName [i]);
            }

                


                
            }
        }


