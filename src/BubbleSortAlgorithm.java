public class BubbleSortAlgorithm{

    // Method to perform Bubble Sort and show step-by-step process
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println();

        System.out.println("Compare two numbers next to each other if the current number is bigger you swap the numbers");
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("Comparing " + arr[j] + " and " + arr[j + 1] + ": ");
                
                // Check if current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println("Swapped!");
                } else {
                    System.out.println("No Swap.");
                }
                printArray(arr);  // Print array after each comparison
            }
            
            if (!swapped) {
                break;
            }
            System.out.println();
        }

        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
