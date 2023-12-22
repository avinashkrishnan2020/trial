package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        List<List<String>> permutations = new ArrayList<>();
        findPermutations(str.split(""), new ArrayList<>(), permutations);
        System.out.println(permutations);
    }

    public static void findPermutations(String[] arr,
                                        List<String> permutation, List<List<String>> permutations){

        if(permutation.size() == arr.length){
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
