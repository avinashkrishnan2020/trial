package Recursion;

import java.util.ArrayList;
import java.util.List;

/*
Different approach to find subsets
 */
public class Subsets4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3};
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(arr, 0, new ArrayList<>(), subsets);
        System.out.println(subsets);
    }

    public static void findSubsets(Integer[] arr, int index,
                                   List<Integer> subset, List<List<Integer>> subsets){

        subsets.add(new ArrayList<>(subset));

        for(int i=index; i<arr.length; i++){
            subset.add(arr[i]);
            findSubsets(arr, index+1,subset, subsets);
            subset.remove(subset.size()-1);
        }

    }
}
