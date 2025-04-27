// Working on x^n  when Stack Heigt is = logn 

public class Recursion {

    public static int calculateX(int x, int n) {
        if (n == 0) {  //base case 1
            return 1;
        }
        if (x == 1) { //base case 2
            return 1;
        }

        if(n%2 == 0){
            // Even Case 
            return calculateX(x, n/2) * calculateX(x, n/2);
        }
        else {
            return calculateX(x, n/2) * calculateX(x, n/2) * x ;
        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calculateX(x, n);
        System.out.println(ans);
    }
}

// Working on x^n 
// public class Recursion {
//     public static int calculateX(int x, int n) {
// if(n==0){  //base case 1
//     return 1;
// }
// if(x==1){ //base case 2
//     return 1;
// }
// int XPowerNminusOne = calculateX(x, n-1); //kaaj
// int xPower = x * XPowerNminusOne;
// return xPower;
//     }
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 5;
//         int ans = calculateX(x, n);
//         System.out.println(ans);
//     }
// }
// Fibonacci Series Using Recursion 
// public class Recursion {
//     public static void Fibo(int a, int b, int n) {
//         if (n == 0) {
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         Fibo(b, c, n - 1);
//     }
//     public static void main(String[] args) {
//         int a = 0, b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         Fibo(a, b, n - 2);
//     }
// }
// Factorial of n
// public class Recursion{
//     public static int calculateFact(int n) {
//        if(n==1 || n==0){
//         return 1;
//        }
//         int fact_n1 = calculateFact(n-1);
//        int fact_n = n*fact_n1;
//       return fact_n;
//     }
//     public static void main(String[] args) {
//         int n=3;
//      int ans =  calculateFact(n);
//      System.out.println(ans);
//     }
// }
// public class Recursion{
//     public static void printRecursion(int i, int n, int sum) {
// if(i==n){
//     sum+=i;
//     System.out.println(sum);
//     return;
// }
//         sum +=i;
//         printRecursion(i+1,n,sum);
//     }
//     public static void main(String[] args) {
//         printRecursion(1, 5, 0);
//     }
// }
// public class Recursion {
//     public static void printRecursion(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printRecursion(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printRecursion(n);
//     }
// }
// public class Recursion {
//     public static void printRecursion(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printRecursion(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printRecursion(n);
//     }
// }

