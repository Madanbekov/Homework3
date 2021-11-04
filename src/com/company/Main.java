package com.company;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] counters = {1.2, 2.3, -4.5, 12.2, -5.1,
                32.5, 76.9, -54.5, 33.3,
                -67.4, 43.6, 98.8, 77.9, -83.1, 45.7};
        double counter = 0;
        double cemal = 0;
        boolean dva = false;
        for (double myPhone : counters) {
            if (myPhone < 0){
            dva = true;
        } else {
                if (dva){
                    counter++;
                    cemal += myPhone;
                }
            }
    }
        System.out.println(cemal / counter);

        lenovo(counters);
        System.out.println(Arrays.toString(counters));
    }

    public static void lenovo(double[] beka) {
        for (int i = 0; i < beka.length; i++) {
            double defaultDigit = beka[i];
            for (int j = i; j < beka.length; j++) {
                if (defaultDigit > beka[j]){
                    double d = defaultDigit;
                    defaultDigit = beka[j];
                    beka[j]=d;
                }

            }
            beka[i] = defaultDigit;
        }
    }


}