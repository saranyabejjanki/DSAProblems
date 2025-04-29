//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    3. Find Minimum in Rotated Sorted Array
//    Problem: Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Find the minimum element of
//    the array.
//    Difficulty: Medium


  //  Input: nums = [3,4,5,1,2]
  //  2 Output: 1
  public static int findMinimumInRotatedArray(int[] arr) {

      int lef = 0, right = arr.length - 1;
      int min=Integer.MAX_VALUE;

      // int searchIndex = -1;
//      while (lef <= right) {
//          int mid = (lef + right) / 2;

//          if( (mid >0) &&  (mid+1 < arr.length) && (arr[mid]<arr[mid+1]) && (arr[mid]<arr[mid-1])){
//               min=arr[mid];
//               return  min;
//          }
//
//          if (arr[lef] <= arr[right]) {//not rotated array
//              min = arr[lef];
//              return  min;
//          } else {
//              if (arr[lef] > arr[right]) {//rotated array
//                  lef = mid + 1;
//              } else {
//                  right = mid - 1;
//              }
//          }
//      }
//
//          if(arr[lef]<arr[right]){
//              if((mid>0 && (mid-1)<arr.length) && arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
//                  right=mid-1;
//              }
//          }else {
//
//              if ((mid>0 && (mid-1)<arr.length) && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
//                  min = arr[mid];
//                  return min;
//              }
//
//              if ( (mid>0 && (mid-1)<arr.length)  && arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
//                  if (arr[mid] > arr[right]) {
//                      lef = mid + 1;
//                  } else {
//                      right = mid - 1;
//                  }
//              }
//          }
//          }

      while(lef < right) {
          int mid = (lef + right) / 2;
          if (arr[mid] > arr[right]) {
              lef = mid + 1;
          } else {
              right = mid;

          }
      }
          return arr[lef];



     // return min ;
  }
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }


        //  int[]  nums = {2,3,4,5,7,9,1};
        // int [] nums={1,2,3,4, 5};
        int[] nums = {2, 3, 4, 5, 1};
        //  int [] nums={3,4, 5,1,2};
        // int [] nums={4,5,1, 2,3};
        //int [] nums={5,1,2,3, 4};
        // Output: 1
        int min = findMinimumInRotatedArray(nums);
        System.out.println("min :" + min);


    }
}