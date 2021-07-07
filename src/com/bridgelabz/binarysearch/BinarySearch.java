package com.bridgelabz.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    /**
     * searching the user desired using binary search technique.
     * @param array
     * @param searchElement
     * @param <T>
     */
    public <T extends Comparable>void SearchElement(T[] array,T searchElement)
    {
        int lowerIndex = 0;
        int higherIndex = array.length -1;
        while(lowerIndex <= higherIndex)
        {
            int mid =(lowerIndex+higherIndex)/2;
            T midIndex = array[mid];
            int result = searchElement.compareTo(midIndex);
            if(result < 0)
            {
                higherIndex = mid - 1;
            }
            else if(result > 0)
            {
                lowerIndex = mid + 1;
            }
            else
            {
                System.out.println("element found at index :"+mid);
                break;
            }
        }
    }

    /**
     * printing the array after sorting.
     * @param searchArray
     * @param <T>
     */
    public <T>void printArray(T[] searchArray)
    {
        System.out.println("Array elements after sorting:");
        for (T iterator:searchArray) {
            System.out.println(iterator+" ");

        }
    }
    public static void main(String[] args)
    {
        BinarySearch binarySearch = new BinarySearch();
        String[] searchArray={"ant","cat","dot","ear","bad"};
        Arrays.sort(searchArray);
        binarySearch.printArray(searchArray);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element to be searched : ");
        String key = scanner.next();
        binarySearch.SearchElement(searchArray,key);
    }
}
