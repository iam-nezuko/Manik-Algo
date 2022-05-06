import java.util.Arrays;

//Missing number Algorithm.
public class MissingNumber{

    public static void main(String[] args) {
        // UnsortedBruteForce();
        UnsortedinOofN();
        //SortedBruteForce();
        //SortedEfficientUsingBinarySearch();
        //printing index of numbers whose sum is given number.
        //using map
        //using two pointer approach.
    }


    public static void UnsortedinOofN(){
        //find missing number from unsorted array. list starts with 1
        int[] arr = {4,7,9,3,2,1,5,6};
        //we can actually find the misssing element using sum of n natural numbers.
        int arrsum=0;
        for(int i=0; i< arr.length; i++){
            arrsum = arrsum+arr[i];
        }
        int length = arr.length+1;
        int TotalSum = length*(length+1)/2;

        System.out.println("Missing Number is " + (TotalSum-arrsum));
    }


    public static void UnsortedBruteForce(){
        //find missing number from unsorted array. list starts with 1
        int[] arr = {4,7,9,3,2,1,5,6};
        // sorted array is 1 2 3 4 5 6 7 9 --- missing number is 8
        // Brute Force Algorithm
        // sort the array
        // using for loop find if i exists in each element.
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            if(arr[i] != i+1)
                System.out.println("Missing Number is = "+(i+1));
        }

        //This takes O(nlogn) to sort and another O(n) to find missing number.
        //Therefore O(nlogn) is the complexity of this algorithm.
    }
}