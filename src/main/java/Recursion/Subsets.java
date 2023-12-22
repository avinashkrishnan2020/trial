package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    /*
    Find subsets of ABC:
    A,B,C,AB,AC,BC,ABC,null-set
     */
    public static void main(String[] args) {
        String str = "ABC";
        List<List<String>> subsets =  new ArrayList<>();
        findSubsets(str.split(""), 0, new ArrayList<>(), subsets);
        System.out.println(subsets);
    }

    public static void findSubsets(String[] arr, int index, List<String> subset, List<List<String>> subsets){

        //end condition
        if(index == arr.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        //add an element
        subset.add(arr[index]);
        findSubsets(arr, index+1, subset, subsets);

        //remove an element
        subset.remove(subset.size()-1);
        findSubsets(arr, index+1, subset, subsets);

    }
}
