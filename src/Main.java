


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//problem 1

//Given a 2-D String array of student-marks, find the student with the highest average score and output their average score. If the average score is in decimals, round it down to the nearest integer.
//        Example 2:
//Input: [{"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"}, {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}]
//Output: 92
//Explanation:
//Alice's scores are 90 and 95, resulting in an average of 92.5, which rounds down to 92.
//Bob's average is 82.5, which rounds down to 82.
//Charlie's average is 80.

import java.util.*;

public class Main {


    public static String[][] findSecondMaxAverageValueAndName(String [][] students ){

        HashMap<String, List<Integer>> map = new HashMap<>();
        for(String [] student :students) {
            String name = student[0];
            Integer mark=Integer.parseInt(student[1]);

            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(mark);
        }
         System.out.println(map);

         double secondAverage=0.0;
         double maxAverage=0.0;
         String studentName="";
         String secondStudentName="";

        for(Map.Entry<String,List<Integer>> e:map.entrySet()){
          double average= e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0.0);
         // System.out.println(average);
          if(average>maxAverage){

              secondAverage=maxAverage;
              secondStudentName=studentName;
              maxAverage=average;
              studentName=e.getKey();

          }else if(average> secondAverage && average !=maxAverage){
              secondAverage=average;
              secondStudentName=e.getKey();
              System.out.println(secondAverage);

          }
            // System.out.println("secondAverage :"+secondAverage+" studentName:"+studentName);
        }
      System.out.println("secondAverage :"+secondAverage+" studentName:"+secondStudentName);
        String [][] secondStudent =new String[2][2];
        secondStudent[0][0]=secondStudentName;
        secondStudent[0][1]=String.valueOf(secondAverage);


   return secondStudent;
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        String[][]  students= {{"Charles", "84"},{"John", "100"},{"Andy", "37"},{"John", "23"},
                {"Charles", "20"}};

        String[][] secondBestAverageStudent= findSecondMaxAverageValueAndName(students);
        System.out.println(secondBestAverageStudent[0][0]);
        System.out.println(secondBestAverageStudent[0][1]);
//
//
//
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}