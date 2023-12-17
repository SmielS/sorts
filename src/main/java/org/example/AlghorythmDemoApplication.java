package org.example;

import java.util.Date;

public class AlghorythmDemoApplication {
    AlghorythmDemoApplication algh = new AlghorythmDemoApplication();
    public static void main(String[] args){
        for (int i = 10000; i < 100000; i=i+10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random()*10000);
            }
            Date startDate = new Date();
            Bubble.bubbleSort(array);
            Date endDate = new Date();
            long bubbleSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random()*10000);
            }
            startDate = new Date();
            Quick.quickSort(array);
            endDate = new Date();
            long quickSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random()*10000);
            }
            startDate = new Date();
            Pyramid.pyramidSort(array);
            endDate = new Date();
            long pyramidSortDuration = endDate.getTime() - startDate.getTime();

            System.out.printf("i: %s, bubble sort duration: %s, quick sort duration: %s, pyramid sort duration: %s%n", i, bubbleSortDuration, quickSortDuration, pyramidSortDuration);
        }
    }
}
