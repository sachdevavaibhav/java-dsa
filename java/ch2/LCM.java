package ch2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Time: O((a*b)/maxInt)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int maxInt = Math.max(a, b);
        int minInt = Math.min(a, b);
        int ans = 1;
        int i=1;
        int maxRange = (a*b)/maxInt;
        while (i<=maxRange) {
            if ((maxInt*i)%minInt == 0) {
                ans = maxInt*i;
                break;
            }
            i++;
        }
        System.out.println(ans);
    }
}

        // Scanner s=new Scanner(System.in);
        // int a=s.nextInt();
        // int b=s.nextInt();
        // int x=Math.max(a,b);
        // int y=a*b;
        // int ans=x;
        // for(int i=x;i<=y;i++){
        //     if(i%a==0 && i%b==0){
        //         ans=i;
        //         break;
        //     }
        // }
        // System.out.print(ans);
