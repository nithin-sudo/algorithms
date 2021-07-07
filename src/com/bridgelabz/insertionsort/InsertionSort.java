package com.bridgelabz.insertionsort;

public class InsertionSort
{
    /**
     * sorting the string array using insertion sort.
     * @param array
     * @param <T>
     */
    public <T extends Comparable>void sortArrayOfStrings(T[] array)
    {
        for(int index = 1;index<array.length;index++)
        {
            T key = array[index];
            int j = index - 1;
            while(j >= 0 && array[j].compareTo(array[index])>0)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    /**
     *printing the array elements.
     * @param array
     * @param <T>
     */
    public<T> void printArray( T[] array)
    {
        for (T iterator:array)
        {
            System.out.print(iterator+" ");
        }
    }
    public static void main(String[] args) {
        String[] sortArray = {"cinema","films","netflix"};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortArrayOfStrings(sortArray);
        insertionSort.printArray(sortArray);
    }
}

