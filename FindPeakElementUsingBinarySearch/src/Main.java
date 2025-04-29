//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Problem: A peak element in an array is an element that is strictly greater than its neighbors. Find any peak element and return its
    //index.
    //Difficulty: Medium
//1 Input: nums = [1,2,3,1]
         //   2 Output: 2//

    public static  int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]>=nums[mid+1]){
                r=mid;
            }else{
                l=mid+1;
            }

        }

        return l;
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       int [] nums={1,2,1,3,5,6,4};
        int in=findPeakElement(nums);
        System.out.println("peak Element index :"+in);

    }
}