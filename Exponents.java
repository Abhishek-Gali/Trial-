/// RECURSION SIDE CONCEPT PROBLEM


import java.util.*;
class Exponent{
    public static int Power(int x , int n){
        if (n==0){
            return 1;
        }
        return x*(Power(x, n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int x = sc.nextInt();
        System.out.print("Enter the Power : ");
        int y = sc.nextInt();
        int z =Power(x,y);
        System.out.println(z);
    }
}