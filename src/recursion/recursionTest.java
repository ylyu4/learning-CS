package recursion;

public class recursionTest {

    // Time O(2^n)
    // Space O(n)
    public static long fib(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }


    // Time O(n)
    // Space O(1)
    public static long fib2(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 0; i < n; i++){
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }


    // Time O(b)
    // Space O(1)
    public static long power1(int a, int b){
        long result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    // Time O(b)
    // Space O(b)
    public static long power2(int a, int b){
        if (b == 0){
            return 1;
        }
        return power2(a, b-1) * a;
    }


    // Time O(b)
    // Space O(log b)
    public static long power3(int a, int b){
        if (b == 0){
            return 1;
        }
        if (b % 2 == 0){
            return power3(a, b/2) * power3(a, b/2);
        }else{
            return power3(a, b/2) * power3(a, b/2) * a;
        }
    }

    // Time O(log b)
    // Space O(log b)

    public static long power4(int a, int b){
        if (b == 0){
            return 1;
        }
        long tmp =  power4(a, b/2);
        if (b % 2 == 0){
            return tmp * tmp;
        }else{
            return tmp * tmp * a;
        }
    }
}
