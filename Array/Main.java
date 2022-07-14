//package com.Aryan;
import java.util.Scanner; //m n array of m integers
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, rem;
        int t = sc.nextInt();
        for(int i = 0;i<=t ;i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] =new int[n];
            for(int j = 0;j<=n; j++)
            {
                arr[i] = sc.nextInt();
                sum += arr[j];
            }
            rem = sum % m;
            System.out.println(rem);
        }
    }
}