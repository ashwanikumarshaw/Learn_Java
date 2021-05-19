package searching;

public class Duplicate_Elements {

	 // Function to print duplicates
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("Duplicates elements are : ");
          
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
    	Duplicate_Elements duplicate = new Duplicate_Elements();
        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        int arr_size = arr.length;
  
        duplicate.printRepeating(arr, arr_size);
    }
    
    /*
     * Algorithm: 
     * 
Traverse the given array from start to end.
For every element in the array increment the arr[i]%n‘th element by n.
Now traverse the array again and print all those indexes i 
for which arr[i]/n is greater than 1. Which guarantees that 
the number n has been added to that index
This approach works because all elements are in the range from 0 
to n-1 and arr[i] would be greater than n only if a value “i” has 
appeared more than once.
     */

}
