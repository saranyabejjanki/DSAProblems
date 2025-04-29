//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Example 1:
//
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//    Example 2:
//
//    Input: nums = [1]
//    Output: 1
//    Explanation: The subarray [1] has the largest sum 1.
//    Example 3:
//
//    Input: nums = [5,4,-1,7,8]
//    Output: 23
//    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
    public static int maxSumSubArray(int arr[]){
       int curSum=0;
       int maxSum=arr[0];
       int strI=-1;
       int temStrat=-1;
       int endIn=-1;

       for(int i=0;i<arr.length;i++){
           if(curSum<=0){
               curSum=arr[i];
               temStrat=i;
           }else{

               curSum+=arr[i];
           }

           if(curSum>maxSum){
               maxSum=curSum;
               strI=temStrat;
               endIn=i;
           }
       }
       System.out.println("maxSum :"+maxSum);
       System.out.println("start index :"+strI +" end Index "+endIn);
      return  maxSum;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
       // int [] arr1={5,4,-1,7,8};
        maxSumSubArray(arr);


    }
}