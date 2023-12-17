package org.example;

public class Bin {
    Bin bin = new Bin();

//    public static int binarySearch(int value, int[]array){
//        return binarySearch(value,array,0, array.length-1);
//    }

    public static int binarySearch(int value, int[] array, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return binarySearch(value, array, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binarySearch(value, array, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }
}
