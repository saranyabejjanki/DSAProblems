import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static boolean  validParentheses(String s){

        char [] arr= new char[s.length()];
        int top=-1;

        for(char c: s.toCharArray() ){

            if(c=='(' || c=='[' || c=='{'){
                arr[++top]=c;
            }else{

                if(top==-1 ||  (c==')' && arr[top] !='(') || (c==']' && arr[top] !='[' )  || (c=='}' && arr[top] !='{')){

                    return false;
                }
                top--;
            }

        }

        return top==-1;
    }

    public static boolean validParenthesesUsingStack(String s){
         Stack<Character> stack= new Stack<>();

         for(char c : s.toCharArray()) {
             if (c=='{' || c=='(' || c=='['){
                 stack.push(c);
             }else{
                 if(stack.empty()){
                     return  false;
                 }
                 char c1=stack.pop();
                 if( (c=='}'&& c1!='{') || (c==')' && c1!='(') || (c==']' && c1!='[')){

                     return  false;
                 }

             }
         }
          return  stack.empty();
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


     String s = "()[]{}";
       //String s="(]";
       boolean isValid= validParentheses(s);
       System.out.println("isValid:"+isValid);

        boolean isValid1=validParenthesesUsingStack(s);
        System.out.println("isValid1:"+isValid1);





    }
}