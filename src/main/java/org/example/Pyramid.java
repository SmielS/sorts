package org.example;

public class Pyramid {
    Pyramid pyramid = new Pyramid();

    public static void pyramidSort(int[] array) {
        for (int i = array.length/2-1; i>=0; i--)
            heap(array, array.length, i);

        for (int i = array.length-1;i>=0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array,i,0);
        }

    }

    private static void heap(int[] array, int heapSize, int rootIndex){
        int max = rootIndex;
        int left = 2*rootIndex+1;
        int right = 2*rootIndex+2;
        if (left < heapSize && array[left] > array[max])
            max = left;
        if (right < heapSize && array[right] > array[max])
            max = right;
        if (max != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[max];
            array[max] = temp;
            heap(array, heapSize, max);
        }
    }
}
