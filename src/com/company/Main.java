package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                listA.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(listA);
        {

        }

        ArrayList<String> listB = new ArrayList<>();
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                listB.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(listB);

        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        ListIterator<String> iterA = listA.listIterator();
        ListIterator<String> iterB = listB.listIterator();

        for (int i = 0; i < 5; i++) {
            listC.add(iterA.next());
            listC.add(iterB.next());

        }
        System.out.println(listC);
        {

        }
    }

    {

    }
}