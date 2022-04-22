package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];  //zadaem massiv iz 10 elementov
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000); //napolnyaem massiv sluchainymi znacheniyami
        System.out.println(Arrays.toString(array)); // vyvodim massiv na ekran

        System.out.println("Input chislo elementov summu kotorih nado poschitat");
        Scanner chisloElementsVSumme = new Scanner(System.in);
        int chislo = chisloElementsVSumme.nextInt(); //zaprashivaem vvod chisla elementov, maksimum summ kotoryh budem iskat
            if (chislo> array.length) {
                System.out.println("Input wrong number bigger than array length"); // esli user zadaet chislo bolshe dliny massiva, to vyvodim oshibku
            }else {
                int upperBound = array.length - chislo + 1;
                int sumArrayChisloElem = 0;
                int IndexOfFirstElem = 0;

                for (int i = 0; i < upperBound; i++) {
                    int sum = 0;
                    for (int j = i; j < i + chislo; j++) {
                        sum = array[j] + sum;
                    }
                    if (sum >= sumArrayChisloElem) {
                        sumArrayChisloElem = sum;
                        IndexOfFirstElem = i;
                    }
                }

                System.out.println(sumArrayChisloElem); // maksimalnaya summa elementov
                System.out.println(IndexOfFirstElem); // index nachalnogo elementa

                int k = IndexOfFirstElem;
                int[] arrayChisloElem = new int[chislo];
                for (int i = 0; i < chislo; i++) {
                    arrayChisloElem[i] = array[k];
                    k++;
                    System.out.print(arrayChisloElem[i] + " "); // vyvodim massiv elementov, summa kotoryh maksimalnaya
                }
            }
    }
}
