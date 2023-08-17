package ProgrammingInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45); //you can add as much values as you need
        list.add(78);
        System.out.println(list);
        list.set(0, 9);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

//        input
        for(int i=0;i<3;i++){
            list.add(in.nextInt());
        }
//        output
        for(int i=0;i<3;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);


//        Multidimensional Array List
        ArrayList<ArrayList<Integer>> multilist = new ArrayList<>();

//        initialization
        for(int i=0;i<3;i++){
            multilist.add(new ArrayList<>());
        }

//        adding elements
        for(int i=0;i<3;i++){
            multilist.get(i).add(in.nextInt());
        }

        System.out.println(multilist);
    }


}
