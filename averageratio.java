import java.util.Scanner;

public class averageratio {

// Java program to find the ratio of positive,
// negative, and zero elements in the array.



    // Function to find the ratio of
    // positive, negative, and zero elements
   public  static void positiveNegativeZero(int[] arr)
    {

        // Store the array length into the variable len.
        int len = arr.length;

        // Initialize the postiveCount, negativeCount, and
        // zeroCountby 0 which will count the total number
        // of positive, negative and zero elements
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;

        // Traverse the array and count the total number of
        // positive, negative, and zero elements.
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
            else if (arr[i] < 0) {
                negativeCount++;
            }
            else if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Print the ratio of positive,
        // negative, and zero elements
        // in the array up to four decimal places.
        System.out.printf("%1.6f ", positiveCount / len);
        System.out.println();
        System.out.printf("%1.6f ", negativeCount / len);
        System.out.println();
        System.out.printf("%1.6f ", zeroCount / len);
        System.out.println();
    }

    // Driver Code.
    public static void main(String args[])
    {
      //  System.out.println("Enter the elements size for Ist test case");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();


        // Test Case 1:
        int a1[]= new int[n] ;
        for (int i=0;i<n;i++){
                a1[i]= sc.nextInt();
                }




       // int[] a1 = { 2, -1, 5, 6, 0 };
        positiveNegativeZero(a1);


        // Test Case 2:
       /* int[] a2 = { 4, 0, -2, -9, -7, 1 };
       positiveNegativeZero(a2);  */
    }
}
