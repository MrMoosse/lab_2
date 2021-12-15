package com.company;

import java.util.*;

public class Main {

    public static void cw1_1() {
        int twoLastDigitsOfIndex = 84;
        int iter = 1000;
        do {
            if (iter % twoLastDigitsOfIndex == 0) {
                //print
                System.out.println("liczba " + iter + " podzielna przez " + twoLastDigitsOfIndex);
            }
            iter--;
        } while (iter >= 0);
    }

    public static void cw1_2() {
        int[] integerArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.2, 3.4, 5.6, 7.8, 9.0};
        String[] stringArray = {"przez", "ten", "zapis", "mozemy", "rozumiec"};

        int iter = 0;
        while (iter < integerArray.length) {
            System.out.println(integerArray[iter++]);
        }
        iter = 0;
        while (iter < doubleArray.length) {
            System.out.println(doubleArray[iter++]);
        }
        iter = 0;
        while (iter < stringArray.length) {
            System.out.println(stringArray[iter++]);
        }
    }

    public static void cw1_3() {
        //while(true) nieskonczona petla
        //while(false) nigdy się nie wykona
    }


    public static void cw2_1() {
        int lastDigitOfIndex = 4;
        for (int i = 100; i >= 0; i--) {
            if (i % lastDigitOfIndex == 0) {
                System.out.println(i);
            }
        }
    }

    public static void cw2_2() {
        int[] integerArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            integerArray[i] = scanner.nextInt();
        }

        for (int number :
                integerArray) {
            System.out.println(number + 11);
        }
    }

    public static void cw3_1() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number % 2) {
            case 0:
                System.out.println("liczba jest parzysta");
                break;
            default:
                System.out.println("liczba nie jest parzysta");
        }

        switch (number % 7) {
            case 0:
                System.out.println("liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("liczba nie jest podzielna przez 7");
        }
    }

    public static void cw3_2() {
        String word = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char[] chars = word.toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();
        characterMap.put('o', 0);
        characterMap.put('p', 0);
        characterMap.put('x', 0);
        characterMap.put('z', 0);
        characterMap.put('q', 0);
        characterMap.put('-', 0);

        for (char c :
                chars) {
            switch (c) {
                case 'o' -> characterMap.put('o', characterMap.get('o') + 1);
                case 'p' -> characterMap.put('p', characterMap.get('p') + 1);
                case 'x' -> characterMap.put('x', characterMap.get('x') + 1);
                case 'z' -> characterMap.put('z', characterMap.get('z') + 1);
                case 'q' -> characterMap.put('q', characterMap.get('q') + 1);
                default -> characterMap.put('-', characterMap.get('-') + 1);
            }
        }

        for (var entry : characterMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void cw4_1() {
        for (int i = 0; i < 100; i++) {
            if (i == 34)
                break;
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++) {
            if (i == 34)
                continue;
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++) {
            if (i == 34)
                return;
            System.out.println(i);
        }
    }

    //cw_5_1
    public static void fillArray(int[] array) {
        int j = 0;
        for (int i = 40; i >= 20; i--)
            array[j] = i;
    }

    public static void displayArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    //dummy main just for 5_1 exercise
    public static void cw51Main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        displayArray(array);
    }

    //cw 5_2
    public static void fillArray(String[] array) {
        Scanner scanner = new Scanner(System.in);
        for (String word : array) {
            word = scanner.nextLine();
        }
    }

    public static void displayArray(String[] array) {
        for (String j : array) {
            System.out.println(j);
        }
    }

    //dummy main just for 5_2 exercise
    public static void cw52Main(String[] args) {
        String[] array = new String[20];
        fillArray(array);
        displayArray(array);
    }

    //cw_5_3
    public static void displayName(String name) {
        System.out.println("Name: " + name);
    }

    public static void displayName(String name, String surname) {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    public static void displayName(String name, String surname, int age) {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    //same as above
    public static void cw53Main(String[] args) {
        displayName("Mateusz");
        displayName("Mateusz", "Mydlarz");
        displayName("Mateusz", "Mydlarz", 25);
    }

    //cw 5_4
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //same as above
    public static void cw54Main(String[] args) {
        System.out.println(sum(8, 9) + sum(2, 3, 4));
    }

    //cw 6_1

    public static void fillArray(ArrayList<String> array, int amount) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<amount; i++) {
            array.add(scanner.nextLine());
        }
    }

    public static void displayArray(ArrayList<String> array) {
        for (String j : array) {
            System.out.println(j);
        }
    }

    //same as above
    public static void cw61Main()
    {
        ArrayList<String> array = new ArrayList<>();
        fillArray(array,5);
        displayArray(array);
        array.remove(array.size()-1);
        array.remove(array.size()-1);
        fillArray(array, 3);
        Collections.sort(array);
        Collections.reverse(array);
        displayArray(array);
    }

    //cw 6_2
    public static void fillArray(Set<Integer> array, int amount) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<amount; i++) {
            array.add(scanner.nextInt());
        }
    }
    public static void displayArray(Set<Integer> array) {
        for (var j : array) {
            System.out.println(j);
        }
    }

    //same as above
    public static void cw62Main()
    {
        Set<Integer> set = new TreeSet<Integer>(); //tree set is automatically sorted
        fillArray(set, 10);
        displayArray(set);
    }



    public static void main(String[] args) {
        cw61Main();
    }
}