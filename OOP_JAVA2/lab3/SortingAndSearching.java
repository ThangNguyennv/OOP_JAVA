package lab3;
import java.util.*;
public class SortingAndSearching {
    static Scanner sc = new Scanner(System.in);

    //bai2.1
    public static boolean linearSearch(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key)
                return true;
        }
        return false;
    }
    public static void testLinearSearch(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        if(linearSearch(arr, key) == true)
            System.out.println("The key is found");
        else
            System.out.println("The key is not found");
    }

    public static int linearSearchIndex(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key)
                return i;
        }
        return 0;
    }
    public static void testLinearSearchIndex(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        if(linearSearchIndex(arr, key) == 0)
            System.out.println("The key is not found");
        else
            System.out.println("The key is found and the array index is: " + linearSearchIndex(arr, key));
    }
    
    //bai2.2
    public static boolean binarySearch(int array[], int key, int fromIdx, int toIdx){
        if(fromIdx == toIdx - 1){
            if(array[fromIdx] == key)
                return true;
            else
                return false;
        }
        else{
            int middle = (fromIdx + toIdx)/2;
            if(key == array[middle])
                return true;
            else if(key < array[middle])
                toIdx = middle;
            else
                fromIdx = middle + 1;
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }
    public static void testBinarySearch(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        System.out.print("Enter the fromIdx: ");
        int fromIdx = sc.nextInt();
        System.out.print("Enter the toIdx: ");
        int toIdx = sc.nextInt();
        if(binarySearch(arr,key,fromIdx, toIdx) == true)
            System.out.println("The key is found");
        else
            System.out.println("The key is not found");
    }

    //bai2.3
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped;
        do{
            swapped = false;
            for(int i = 1; i < n; i++){
                if(array[i-1] > array[i]){
                    swap(array, i-1, i);
                    swapped = true;
                }
            }
            n = n - 1;
        } while(swapped);
    }
    public static void testBubbleSort(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("The array is sorted: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //bai2.4
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min_pos = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min_pos]){
                    min_pos = j;
                }
            }
            int temp = array[min_pos];
            array[min_pos] = array[i];
            array[i] = temp;
        }
    }
    public static void testSelectionSort(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("The array is sorted: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //bai2.5
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            //lay ra phan tu o chi so i
            int x = array[i], pos = i - 1;
            while(pos >= 0 && x < array[pos]){
                array[pos+1] = array[pos]; //dich phan tu o vi tri pos sang phai
                pos--;
            }
            array[pos+1] = x; // truong hop vi pham dk cua while
        }
    }
    public static void testInsertionSort(){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of array: ");
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("The array is sorted: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        testLinearSearch();
        testLinearSearchIndex();
        testBinarySearch();
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }
}
