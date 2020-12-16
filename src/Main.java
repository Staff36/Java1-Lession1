/*Методы к заданиям 3-8 решил вызвать из main, мне кажется так быстрее проверить*/

public class Main {
        // Задание 1:
    public static void main(String[] args) {

        //Задание 2:
            byte myByte=0;
            short myShort=0;
            int myInt=0;
            long myLong=0L;
            float myFloat=0.0f;
            double myDouble =0.0d;
            boolean myBoolean=false;
            char myChar='a';
            String myString ="Моя строка";

        //Задание 3:
            float a3= 5.5f;
            float b3= 9.1f;
            float c3= 3.8f;
            float d3= 0.9f;
            System.out.println("Результат арифметического выражения a*(b+(c/d)): "+arithmeticFloats(a3,b3,c3,d3));

        //Задание 4:
            int firstValue4=5;
            int secondValue4 =15;
            System.out.println("Результат сравнения чисел с диапазоном: "+checkInt(firstValue4, secondValue4));

        // Задание 5:
            int value5 =100;
            checkPositiveOrNegativeNumber(value5);

        //Задание 6:
            int value6 =-100;
            System.out.println(checkingValue(value6));

        //Задание 7:
            String name7= "Дмитрий";
            writeNameToConsole(name7);

        //Задание 8*:
            int year=800;
            checkYearToLeap(year);
    }

    //Задание 3:
    private static float arithmeticFloats(float a,float b, float c, float d){
        return a*(b+c/d);
    }

    //Задание 4:
    private static boolean checkInt(int a, int b){
        return (a>=10 && a<=20) && (b>=10 && b<=20);

    }
    // Задание 5:
    private static void checkPositiveOrNegativeNumber(int value){
    if (value>=0) System.out.println("Число положительное");
     else System.out.println("Число отрицательное");
    }
    //Задание 6:
    private static boolean checkingValue(int value){
        return value <0;
    }
    //Задание 7:
    private static void writeNameToConsole(String name){
        System.out.println("Привет, "+name);
    }
    //Задание 8*:
    private static void checkYearToLeap(int year){
        if (year%4==0&&(year%100!=0||year%400==0))System.out.println("Год високосный");
        else System.out.println("Год не високосный");

    }
}

