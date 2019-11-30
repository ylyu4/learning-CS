package binarySearchTest;

public class binarySearchTest {
    public static void main(String[] args){


    }
    ///Time O  (log n )
    ///Space O (1)
    ///////Classic Binary Search
    public static int binarySearch(int[] array, int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0, right = array.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if (target == array[mid]){
                return mid;
            }else if(target < array[mid]){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static int firstOccurrence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0, right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (target < array[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (target == array[left]){
            return left;
        }
        if (target == array[right]){
            return right;
        }
        return -1;
    }

    public static int lastOccurrence(int[] array, int target){
        if (array ==null || array.length ==0){
            return -1;
        }
        int left = 0, right = array.length - 1;
        while(left < right -1){
            int mid = left + (right -left) / 2;
            if (target >= array[mid]){
                left = mid;
            }else{
                right = mid;
            }
        }
        if (target == array[right]){
            return right;
        }
        if (target == array[left]){
            return left;
        }
        return -1;
    }



    public static int closet(int[] array, int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0, right = array.length-1;
        while (left < right-1){
            int mid = left + (right-left)/2;
            if (target == array[mid]){
                return mid;
            }else if(target<array[mid]){
                right = mid;
            }else{
                left = mid;
            }
        }
        if (Math.abs(target - array[left])<Math.abs(target - array[right])){
            return left;
        }else{
            return right;
        }
    }


    public static int[] searchMatrix(int[][] matrix, int target){
        int[] result = {-1,-1};
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right){
            int mid = left + (right -left)/2;
            if (target == matrix[mid/n][mid%n]){
                result[0] = mid/n;
                result[1] = mid%n;
                return result;
            }else if (target < matrix[mid/n][mid%n]){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return result;
    }
}
