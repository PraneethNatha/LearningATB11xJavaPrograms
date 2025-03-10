package ex_01_Java_Basic;

public class LabAI02 {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 89, 34, 67, 9, 56};
        
        int max = findMax(numbers);
        int min = findMin(numbers);
        
        System.out.println("Array elements: ");
        printArray(numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
    
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 