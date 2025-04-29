//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int binarySearchToFindTarget(int [] arr, int target){

        int lef=0;
        int rig=arr.length-1;
        int index=-1;


        while(lef<=rig){

            int mid=(rig+lef)/2;
          //  System.out.println("mid :"+mid);
            if(arr[mid]==target){
                index=mid;
                return index;
            }

            if(arr[mid]>target ){
                rig=mid-1;
            }else{
                lef=mid+1;
            }



        }

        return -1;



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
         int[] arr= {1,2,3,4,6,8};
         int target=4;
       int index= binarySearchToFindTarget(arr,target);
       System.out.println("Target element position :"+index);
    }
}