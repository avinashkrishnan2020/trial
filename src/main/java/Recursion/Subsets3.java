package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets3 {
    /*
    Find subsets that add up to 7 (with repeating elements)
     */
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
        int target = 4;
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(intList, target, 0, new ArrayList<>(), subsets);
        System.out.println(subsets);
    }

    public static void findSubsets(List<Integer> intList, int target, int index,
                                   List<Integer> subset, List<List<Integer>> subsets){

        // end condition
        if(index == intList.size()){
            if(target == 0) {
                subsets.add(new ArrayList<>(subset));
            }
            return;
        }

        if(intList.get(index) <= target){
            subset.add(intList.get(index));
            findSubsets(intList, target-intList.get(index), index, subset, subsets);
            subset.remove(subset.size()-1);
        }
        findSubsets(intList, target, index+1, subset, subsets);
    }
}
