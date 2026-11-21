package PACKAGE_NAME;

public class Main{
    public int reverse(int n){
        int num=n,rev=0;
        while(num > 0){
            int t=num%10;
            rev=(rev*10)+t;
            num=num/10;
        }
        if(rev==n)
            return n
        else
            return 0;
    }
}
