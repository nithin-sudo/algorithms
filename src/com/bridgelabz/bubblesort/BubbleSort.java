package com.bridgelabz.bubblesort;

public class BubbleSort {
    /**
     * sorting an array using bubble sort algorithm.
     * @param array
     * @param <T>
     */
    public <T extends Comparable>void bubbleSort( T[] array)
    {
        for(int index=0; index<array.length; index++)
        {
            for(int adjacent = index+1; adjacent<array.length; adjacent++)
            {
                if(array[index].compareTo(array[adjacent])>0)
                {
                    T temp = array[index];
                    array[index] = array[adjacent];
                    array[adjacent] = temp;
                }
            }
        }
    }
    /**
     * printing the elements in the array.
     * @param array
     * @param <T>
     */
    public  <T> void printSortedArray(T[] array)
    {
        System.out.println("\nArray elements after sorting:");
        for (T iterator :array)
        {
            System.out.print(iterator+" ");
        }
    }
    public static void main(String[] args) {
        Integer integerArray[] = {2,9,2,3,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(integerArray);
        bubbleSort.printSortedArray(integerArray);

    }
}
