//
//
//
//Find Buildings With an Ocean View
//Last Updated : 11 Apr, 2024
//Given a list of n buildings in a line, each building's height is given in
// heights[] array. Find and return the indices (0-indexed) of buildings with an
// unobstructed "ocean view," meaning they can see the ocean without taller
// buildings blocking their view to the right. The task is to return the indices
// (0-indexed) of the buildings that have an ocean view, sorted in increasing order.
//
//Example:
//
//Input: heights = {4,2,3,1}
//Output: {0,2,3}
//
//
//
//Input: heights = {4,3,2,1}
//Output: {0,1,2,3}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static List<Integer> findBuildingsWithAnOceanView(int [] buildingHeights){
        List<Integer> oceanViewBuildings=new ArrayList<>();
        int previous=0;

        for(int i=buildingHeights.length-1;i>=0;i--){

            if(buildingHeights[i]>previous){
                oceanViewBuildings.add(i);
               // maxHeight=buildingHeights[i];
                previous= buildingHeights[i];
            }

        }
        Collections.sort(oceanViewBuildings);
        System.out.println(oceanViewBuildings);
      return oceanViewBuildings;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int arr[]={4,2,3,1};

        findBuildingsWithAnOceanView(arr);

    }
}