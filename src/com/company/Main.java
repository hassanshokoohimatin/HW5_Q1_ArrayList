package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();

        System.out.println("Enter the length of the ArrayList...");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        if (length != 0) {
            System.out.println("Enter the elements of the arraylist...");
            for (int i = 0; i < length; i++) {
                int value = in.nextInt();
                myArrayList.add(i, value);
            }
        }

        myArrayList = function(myArrayList);

        if (myArrayList.size() == 0) {
            System.out.println("{}");
        } else {

            for (int i = 0; i < myArrayList.size() - 1; i += 2) {
                System.out.printf("%s%d%s%d%s\n", "{", myArrayList.get(i), ",", myArrayList.get(i + 1), "}");
            }
        }

    }


    public static ArrayList<Integer> function(ArrayList<Integer> array) {

        if (array.size() == 0)
            return array;
        else if (array.size() % 2 == 0) {
            for (int i = 0; i < array.size() - 1; i += 2) {
                if (array.get(i + 1) < array.get(i)) {
                    array.remove(i + 1);
                    array.remove(i);
                    i = 0;
                }
            }
            return array;
        } else {
            array.remove(array.size() - 1);
            for (int i = 0; i < array.size() - 1; i += 2) {
                if (array.get(i + 1) < array.get(i)) {
                    array.remove(i + 1);
                    array.remove(i);
                    i = 0;
                }
            }
            return array;
        }
    }
}
