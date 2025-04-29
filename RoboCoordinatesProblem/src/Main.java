import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


//"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
//        return the final coordinates after traversing the string.
//
//            Examples:
//    Given (0,0) and String - ""UUU""
//    Answer : (0,3)
//
//    Given (0,0) and String - ""URRDDL""
//    Answer : (1,-1)
//
//    Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
//    Answer : (-1,-1)"

    public static String findCoordinates(String s){
        int [][] coordinateArr= {{0,0}};
        int xCoordinate=coordinateArr[0][0];
        int yCoordinate= coordinateArr[0][1];
        String [] inputArr=s.split(" ");
        System.out.println(Arrays.toString(inputArr));
        String result="";
        String str="";
        int iterations=0;
        String di="";
        for(String direction:inputArr){
            String [] arr=direction.split("x",0);
            System.out.println("direction :"+direction);
            System.out.println("arr :"+Arrays.toString(arr));
            if(arr.length>1){
                iterations =Integer.parseInt(arr[0]);
                if(iterations==0){
                    iterations=1;
                }
                di=arr[1];
                System.out.println("di "+arr[1]+"iterations: "+iterations);
                int[] updatedCoordinates= calculate(di,xCoordinate,yCoordinate,iterations);
                xCoordinate = updatedCoordinates[0];
                yCoordinate = updatedCoordinates[1];
            }else{
                di=arr[0];
                iterations=1;
                for(char c: di.toCharArray()){
                    String strVal= Character.toString(c);
                  //  System.out.println("xCoordinate "+xCoordinate);
                   // System.out.println("yCoordinate "+yCoordinate);
                   int[] updatedCoordinates= calculate(strVal,xCoordinate,yCoordinate,iterations);
                    xCoordinate = updatedCoordinates[0];
                    yCoordinate = updatedCoordinates[1];
                }
            }


          //  System.out.println("di :"+di);
           // System.out.println("arr :"+Arrays.toString(arr));


        }
      result="("+xCoordinate+","+yCoordinate+")";
        return result;

    }

    public static int [] calculate(String di,int xCoordinate,int yCoordinate ,int iterations){

        switch(di){

            case "R":
            case "RIGHT":
                xCoordinate+=iterations;

                break;

            case  "L":
            case  "LEFT":
                xCoordinate-=iterations;
                break;

            case "U":
            case "UP":
                yCoordinate+=iterations;
                break;

            case "D":
            case "DOWN":
                yCoordinate-=iterations;
                break;

        }
       System.out.println("("+xCoordinate+","+yCoordinate+")");
        return new int[]{xCoordinate,yCoordinate};
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
       //String s="DOWN UP 2xRIGHT DOWN 3xLEFT";
         //String s="URRDDL";
        //
        String s="UUU";
       String result= findCoordinates(s);
       System.out.println(result);


    }
}