package sorting;

public class sortingTset {
    public static void main(String[] args){

    }
}
class Sorting{

    // Time O(n^2)
    // Space O(1)
    public void selectionSort(int[] array){
        if(array == null || array.length<=1){
            return;
        }

        int n  = array.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = array[i];
        }
    }

    public int[] mergeSort(int[]array){
        if (array == null || array.length <= 1){
            return array;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] array, int left, int right){
        if (left == right){
            return new int[] {array[left]};
        }
        int mid = left + (right - left) / 2;
        int[] leftResult = mergeSort(array, left, right);
        int[] rightResult = mergeSort(array, mid+1, right);
        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] leftResult, int[] rightResult){
        int[] result = new int[leftResult.length + rightResult.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < leftResult.length && rightIndex < rightResult.length){
            if(leftResult[leftIndex] < rightResult[rightIndex]){
                result[resultIndex] = leftResult[leftIndex];
                leftIndex++;
                resultIndex++;
            }else{
                result[resultIndex] = rightResult[rightIndex];
                rightIndex++;
                resultIndex++;
            }
        }
        while(leftIndex < leftResult.length){
            result[resultIndex] = leftResult[leftIndex];
            leftIndex++;
            resultIndex++;
        }
        while(leftIndex < rightResult.length) {
            result[resultIndex] = rightResult[rightIndex];
            rightIndex++;
            resultIndex++;
        }
        return result;
    }
}