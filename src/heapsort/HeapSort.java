
package heapsort;

import java.util.Arrays;

public class HeapSort 
{
    
  
    public static int[] sort(int[] numbers)
    {
        System.out.println(Arrays.toString(numbers));
        int n = numbers.length;
        for (int i = n / 2 - 1; i >= 0; i--)
        {
            numbers = heapify(numbers,n,i);
        }
        for (int i=n-1; i>=0; i--)
        {
            
            int temp = numbers[0];
            numbers[0] = numbers[i];
            numbers[i] = temp;
            heapify(numbers, i, 0);
        }
        return numbers;
    }
    
    public static int[] heapify(int[] numbers, int n, int root)
    {
        
         
        int max = root;
        int l = (2*root)+1;
        int r = (2*root)+2;
        if ((l < n) && (numbers[max] < numbers[l]))
        {
            max = l;
        }
        
        if ((r < n) && (numbers[max] < numbers[r]))
        {
            max = r;
        }
        
        if (max != root)
        {
            swap(numbers, root, max);
            numbers = heapify(numbers,n,max);
        }
        return numbers;
    }
    
    public static int[] swap(int[] numbers, int root, int max)
    {
        int temp = numbers[root];
        numbers[root] = numbers[max];
        numbers[max] = temp;
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

   
    public static void main(String[] args) 
    {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
       sortedNumbers = sort(randomNumbers);
       System.out.println(Arrays.toString(sortedNumbers));
    }
    
}
