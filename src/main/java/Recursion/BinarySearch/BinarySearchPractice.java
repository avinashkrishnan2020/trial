package Recursion.BinarySearch;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int target = 2;
        System.out.println(search(0, nums.length-1, nums, 10));
    }

    public static int search(int start, int end, int[] nums, int target){
        if(start == end){
            if(nums[start] == target) return start;
            return -1;
        }

        int mid = start + (end-start)/2;
        if(nums[mid] == target) return mid;
        if(target < nums[mid]) return search(start, mid-1, nums, target);
        else return search(mid+1, end, nums, target);
    }
}
