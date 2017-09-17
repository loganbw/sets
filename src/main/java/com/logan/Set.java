package com.logan;


import java.util.ArrayList;

public class Set {
    private int myIntegers;
    private ArrayList<Integer> mySet = new ArrayList<Integer>();
    private ArrayList<Integer> noDupSet = new ArrayList<Integer>();

    public void add(){
        mySet.add(9);
        mySet.add(40);
        mySet.add(10);
        mySet.add(11);
        mySet.add(0);

        for (int dupNumber : mySet){
            if (!noDupSet.contains(dupNumber)){
                noDupSet.add(dupNumber);
            }
        }

        System.out.println(noDupSet);
    }
    public void size(){
        int lengthArray = noDupSet.toArray().length;
        System.out.println(lengthArray);
    }
    public void remove(){
        noDupSet.remove(Integer.valueOf(10));
        System.out.println(noDupSet);

    }
    public void values(){

        for (int i = 0; i < noDupSet.toArray().length; i++) {
            System.out.println(noDupSet.get(i));
        }

    }





    public static void sets(){



    }
 }



