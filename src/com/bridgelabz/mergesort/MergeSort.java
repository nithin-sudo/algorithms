package com.bridgelabz.mergesort;

public class MergeSort {
    /**
     * sorting the string array using merge sort.
     * @param sortStringArray
     * @param lowerIndex
     * @param middleIndex
     * @param higherIndex
     */
    public void sortStringArray(String sortStringArray[], int lowerIndex, int middleIndex, int higherIndex) {

        String temp[] = new String[higherIndex - lowerIndex + 1];

        int index = lowerIndex, j = middleIndex+1, k = 0;

        while(index <= middleIndex && j <= higherIndex) {
            if(sortStringArray[index].compareTo(sortStringArray[j]) > 0) {
                temp[k] = sortStringArray[index];
                k ++;
                index ++;
            }
            else {
                temp[k] = sortStringArray[j];
                k ++;
                j ++;
            }
        }

        while(index <= middleIndex) {
            temp[k] = sortStringArray[index];
            k ++;
            index ++;
        }

        while(j <= higherIndex) {
            temp[k] = sortStringArray[j];
            k ++;
            j ++;
        }

        for(index = lowerIndex; index <= higherIndex; index += 1) {
            sortStringArray[index] = temp[index - lowerIndex];
        }
    }

    /**
     * calculating middle index value recursively.
     * @param sortStringArray
     * @param lowerIndex
     * @param higherIndex
     */
    public void mergeSort(String sortStringArray[], int lowerIndex, int higherIndex)
    {
        if(lowerIndex < higherIndex) {
            int middleIndex = (lowerIndex + higherIndex) / 2;
            mergeSort(sortStringArray, lowerIndex, middleIndex);
            mergeSort(sortStringArray, middleIndex+1, higherIndex);
            sortStringArray(sortStringArray, lowerIndex, middleIndex, higherIndex);
        }
    }

    /**
     * priting the string array.
     * @param array
     */
    public static void printArray(String array[])
    {
        for (String iterator:array)
        {
            System.out.println(iterator);
        }
    }
    public static void main(String[] args) {
        String sortStringArray[] = { "paper","pen","pencil" };

        System.out.println("Array before sorting");
        printArray(sortStringArray);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(sortStringArray, 0, sortStringArray.length - 1);

        System.out.println("\nArray after sorting");
        printArray(sortStringArray);
    }
}
