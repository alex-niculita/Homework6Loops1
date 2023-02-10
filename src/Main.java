public class Main {
    public static void main(String[] args) {
        System.out.println("\tTask 1: numbers 1-10");
        task1();
        System.out.println();
        System.out.println("\tTask 2: numbers 10-1");
        task2();
        System.out.println();
        System.out.println("\tTask 3: only even numbers 0-17");
        task3();
        System.out.println();
        System.out.println("\tTask 4: from 10 to -10");
        task4();
        System.out.println();
        System.out.println("\tTask 5: leap years from 1904 to 2096");
        task5();
        System.out.println();
        System.out.println("\tTask 6: sequence of numbers +7");
        task6();
        System.out.println();
        System.out.println("\tTask 7: sequence of numbers *2");
        task7();
        System.out.println();
        System.out.println("\tTask 8: yearly savings for 29000");
        task8();
        System.out.println();
        System.out.println("\tTask 9: yearly savings + interest 12 per year");
        task9();
        System.out.println();
        System.out.println("\tTask 10: the times table");
        task10();

    }

    public static void task1(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void task2(){
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        for(int i=0;i<=17;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void task4(){
        for(int i=10;i>-11;i--){
            System.out.println(i);
        }
    }
    public static void task5(){
        for (int i = 1904; i <= 2096; i = i + 4){
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i+" год является високосным");
            }

        }
    }
    public static void task6(){
        for(int i=7;i<=98;i+=7){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task7(){
        for(int i=1;i<=512;i*=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task8(){
        int totalSalary = 0, monthSalary = 29000;
        for(int i=1;i<=12;i++){
            totalSalary += monthSalary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalSalary+" рублей");
        }
    }
    public static void task9(){
        int totalSalary = 0, monthSalary = 29000;
        for(int i=1;i<=12;i++){
            totalSalary += totalSalary/100;
            totalSalary += monthSalary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalSalary+" рублей");
        }
    }
    public static void task10(){
        for(int i=1;i<=10;i++){
            System.out.println(i*2);
        }
    }

}