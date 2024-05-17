package com.patterns.strategy.selection_algo;

import java.util.Arrays;
import java.util.Scanner;

public class SortingProgram {
    public static void main(String[] args) {
        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Select the sorting algorithm
        System.out.println("Select the sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Sort the array using the selected algorithm
        switch (choice) {
            case 1:
                bubbleSort(array);
                System.out.println("Array sorted using Bubble Sort: " + Arrays.toString(array));
                break;
            case 2:
                selectionSort(array);
                System.out.println("Array sorted using Selection Sort: " + Arrays.toString(array));
                break;
            case 3:
                insertionSort(array);
                System.out.println("Array sorted using Insertion Sort: " + Arrays.toString(array));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}