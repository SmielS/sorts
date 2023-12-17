package org.example;

// O(log(n))

public class Quick {
    Quick quick = new Quick();

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int startPosition, int endPosition) {

        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) leftPosition++;
            while (array[rightPosition] > pivot) rightPosition--;
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) quickSort(array, leftPosition, endPosition);
        if (startPosition < rightPosition) quickSort(array, startPosition, rightPosition);
    }

}
