

public class Recursion{

    public static void printRecursion(int i, int n, int sum) {
if(i==n){
    sum+=i;
    System.out.println(sum);
    return;
}
        sum +=i;
        printRecursion(i+1,n,sum);
        
    }
    public static void main(String[] args) {
        printRecursion(1, 5, 0);
    }
}






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

