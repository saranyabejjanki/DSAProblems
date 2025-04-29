import java.util.LinkedHashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int firstRepeatingCharacterUsingMap(String s){

        Map<Character,Integer> map= new LinkedHashMap<>();
        int index=-1;
        for(char c :s.toLowerCase().toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }


            if(map.get(c)>1){
                index =s.toLowerCase().indexOf(c);
                System.out.println("using hashmap The key is: " + c + ",value is :" + map.get(c));
                break;
            }
        }

        return index;

    }


    public static int firstRepeatingCharacterUsingFreqArray(String s){

        int [] arr= new int [256];
        int index=-1;
        int lef=0,rig=s.length()-1;
        for(char c:s.toLowerCase().toCharArray()){
            arr[c]++;
        }
        while(lef<=rig){
            char letter=s.toLowerCase().charAt(lef);
            if(arr[letter] >1){
                index=lef;
                System.out.println("using frequency array char : "+letter +" index :"+index +" count :"+arr[letter]);
                break;
            }
            lef++;

        }


        return index;
    }




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        String s="Interview";
        firstRepeatingCharacterUsingMap(s);
        firstRepeatingCharacterUsingFreqArray(s);

    }
}