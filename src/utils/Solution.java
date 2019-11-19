package utils;

    public class Solution {
        public boolean isPrime(int n) {
            // Write your solution here
            for(int i = 2; i*i <=n; i ++  ){
                if (n%i  ==0){
            return false;
                }

            }
            return true;
        }
        public boolean isEven(int x) {
            boolean b = (x % 2 == 0);
            return b;
        }
        public boolean areEqual(int x, int y){
            boolean b = (x==y);
            return b;
        }

    public static void main(String[] args){
            Solution solution = new Solution();
            System.out.println(solution.areEqual(10, 10));
    }
    }


