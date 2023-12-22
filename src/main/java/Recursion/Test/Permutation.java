package Recursion.Test;

import java.util.ArrayList;
import java.util.List;

/*
Find permutations of [1,2,3]
 */
public class Permutation {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3};
        List<List<Integer>> permutations = new ArrayList<>();
        findPermutations(arr, new ArrayList<>(), permutations);
        System.out.println(permutations);
    }

    public static void findPermutations(Integer[] arr, List<Integer> permutation,
                                        List<List<Integer>> permutations){

        if(permutation.size()==arr.length){
            permutations.add(new ArrayList<>(permutation));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(permutation.contains(arr[i])) continue;
            permutation.add(arr[i]);
            findPermutations(arr, permutation, permutations);
            permutation.remove(permutation.size()-1);
        }


    }
}
