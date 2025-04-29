//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


//    Largest substring with same Characters
//
//    Given a string s of size N. The task is to find the largest substring which consists of
//    the same characters

//    //
//    Input : s = “abcdddddeff”
//    Output : 5
//    Substring is “ddddd” s = “abcdddddeff”
//    Input : s = aabceebeee
//    Output : 3

    public static int largestSubstringWithSameCharacters(String s){

        int count=1;
        int startIn=-1;
        int maxCount=1;

        for(int i=1;i<s.length();i++){

            if(s.charAt(i) == s.charAt(i-1)){

                count++;
            }else{
                if(count>maxCount){
                    maxCount=count;
                }
                count=1;
            }
        }
        if(count>maxCount){
            maxCount=count;
        }
     //   System.out.println("maxCount "+maxCount);
   return  maxCount;
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
        String s = "abcdddddeff";
        //String s="aabceebeee";
        int maxCount=largestSubstringWithSameCharacters(s);
        System.out.println("mxCount :"+maxCount);
    }
}