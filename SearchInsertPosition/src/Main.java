

//2. Search Insert Position
//Problem: Given a sorted array and a target value, return the index where the target is located. If the target is not present, return the
//index where it should be inserted in order to keep the array sorted.
//        Difficulty: Easy
//Example:
//
//Input: nums = [1,3,5,6], target = 5
//        2 Output: 2
public class Main {

    public static int searchInsertPosition(int[] arr,int target){

        int lef=0,right=arr.length-1;

         int searchIndex=-1;
        while(lef<=right){
            int mid=(lef+right)/2;
           // searchIndex=mid;
            if(arr[mid]==target){
                searchIndex=mid;
                return searchIndex;
            }

            if(target>arr[mid]){
                lef=mid+1;
            }else{
                right=mid-1;
            }

        }
        System.out.println("SearchIndex :"+searchIndex);
        System.out.println("lef :"+lef);

        return lef;

    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        int[] arr ={1,3,5,6};
        int tar=2;

        int result=searchInsertPosition(arr,tar);
//        if(result == -1){
//            int lef=0
//
//        }else{
            System.out.println(result);
//        }


    }
}