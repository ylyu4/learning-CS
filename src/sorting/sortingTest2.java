package sorting;

import java.util.Random;

public class sortingTest2 {
    public static void main(String[] args){
    }


    public static void quickSort(int[] array){
        if (array == null || array.length == 0){
            return;
        }
        quickSort(array, 0 ,array.length - 1);
    }
    private static Random rand = new Random();
    private static void quickSort(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        int pivotIndex = left + rand.nextInt(right - left + 1);
        swap(array, pivotIndex, right);

        int i = left, j = right - 1;
        while (i <= j){
            if (array[i] < array[j]){
                i++;
            }else{
                swap(array, i , j);
                j--;
            }
        }
        swap(array, i, j);

        quickSort(array, left, i-1);
        quickSort(array, i + 1, right);
    }

    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }




    // Time O(n)
    // Space O(1)
    public static void rainbowSort(int[] array){
        if (array == null || array.length ==0 ){
            return;
        }
        int i = 0, j = 0, k = array.length - 1;
        while (j <= k){
            if (array[j] == 1){
                swap(array, i, j);
                i++;
                j++;
            }else if (array[j] == 2){
                j++;
            }else{
                swap(array, j, k);
                k--;
            }
        }
    }

}
