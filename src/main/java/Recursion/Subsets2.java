package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    /*
    Find subsets that add up to 7 (without repeating elements)
     */
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8};
        int target = 7;
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(arr, 0, 0, target, new ArrayList<>(), subsets);
        System.out.println(subsets);
    }

    public static void findSubsets(Integer[] arr, int index, int sum, int target,
                                   List<Integer> subset, List<List<Integer>> subsets){

        // end condition
        if(index == arr.length){
            if(target == 0){
                subsets.add(new ArrayList<>(subset));
            }
            return;
        }


        if(arr[index] <= target){
            //add element
            subset.add(arr[index]);
            findSubsets(arr, index+1, sum+arr[index], target-arr[index], subset, subsets);

            //remove element
            subset.remove(subset.size()-1);
        }
        findSubsets(arr, index+1, sum, target, subset, subsets);

    }


}
