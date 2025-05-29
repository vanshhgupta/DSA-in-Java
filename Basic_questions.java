import java.util.*;
public class Basic_questions{
    public static void digits(int n){
        int m=n;
        int d=0;
        while(n>0){
            n = n/10;
            d++;
        }
        System.out.print("The number of digits in "+ m+" is " + d);
    }

    public static void reversenumber(int n){
        int power = 0;
        int rev_num = 0;
        while(n>0){
            rev_num = rev_num*10 + (n%10);
            n=n/10;
            power=power+1;
        }
        System.out.print("the reversed number is: "+ rev_num);
    }

    public static void palindrome(int n){
        int num = n;
        int power = 0;
        int rev_num = 0;
        while(n>0){
            rev_num = rev_num*10 + (n%10);
            n=n/10;
            power=power+1;
        }
        if(num==rev_num){
        System.out.print("the number "+ num + " is palidrome");
        }
        else{
        System.out.print("the number "+ num + " is not a palidrome");
        }
    }

    public static void GCD(int a, int b){
        long startTime = System.nanoTime();
        int gcd=1;
        for(int i=2;i<=Math.min(a, b);i++){
            if((a%i==0) && (b%i==0)){
                gcd=Math.max(gcd, i);
            }
        }
        System.out.println("the GCD of numbers "+ a +" " +b +" is: " + gcd);
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void betterGCD(int a, int b){
        long startTime = System.nanoTime();
        int gcd=1;
        for(int i=Math.min(a,b);i>0;i--){
            if((a%i==0) && (b%i==0)){
                gcd=i;
                break;
            }
        }
        System.out.println("the better approch of GCD of numbers "+ a +" " +b +" is: " + gcd);
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void bestGCD(int a, int b){
        long startTime = System.nanoTime();
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a == 0) {
            System.out.println("the better approch of GCD of numbers is: " + b);
        }
        else{
            System.out.println("the better approch of GCD of numbers is: " + a);
        }
        
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void armstrongnumber(int a){
        boolean armstrongnumber =  false;
        int num=a;
        int digits=0;
        while(num>0){
            num = num/10;
            digits++;
        }
        num=a;
        int lastdigit=0;
        int armstrong =0;
        while(num>0){
            lastdigit=num%10;
            armstrong= (int)(Math.pow(lastdigit, digits)) + armstrong;
            num=num/10;
        }
        System.out.println(armstrong);
        if(armstrong==a){
            armstrongnumber = true;
        }

        if (armstrongnumber) {
            System.out.println(a + " is an armstrong number");
        }
        else{
            System.out.println(a + " is not an armstrong number");
        }   
    }

    public static void divisor(int n){
        long startTime = System.nanoTime();
        int divisors[] = new int[n];
        int count=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                divisors[count++]= i;
            }
        }
        System.out.println("the number of divisors for number "+ n+" are "+ (count+1));
        System.out.print("Divisors of " + n + " are: ");
        for (int i = 0; i < count+1; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();
        
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void betterdivisor(int n){
        long startTime = System.nanoTime();
        int divisors[] = new int[n];
        int count=0;
        for(int i=1; i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                divisors[count++]= i;

                if (i != n / i) {
                    divisors[count++]= n / i;
                }
            }
        }
        System.out.println("the number of divisors for number "+ n+" are "+ (count+1));
        System.out.print("Divisors of " + n + " are: ");
        for (int i = 0; i < count+1; i++) {
            System.out.print(divisors[i] + " ");

        }
        System.out.println();
        
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void prime(int n){
        long startTime = System.nanoTime();
        boolean checkprime = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                checkprime = false;
                break;
            }
        }
        if(checkprime){
            System.out.println("the number " + n +" is prime");
        }
        else{
            System.out.println("the number " + n + " is not prime");
        }
        
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

    public static void betterprime(int n){
        long startTime = System.nanoTime();
        boolean checkprime = true;
        for(int i=2; i<= (int)(Math.sqrt(n)); i++){
            if(n%i==0){
                checkprime = false;
            break;

            }
        }
        if(checkprime){
            System.out.println("the number " + n +" is prime");
        }
        else{
            System.out.println("the number " + n + " is not prime");
        }
        
        long totalTime = System.nanoTime() - startTime;
        System.out.println(totalTime);
    }

     public static void main(String args[]){
        System.out.print("Enter the number 1: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        // System.out.print("Enter the number 2 if finding GCD: ");
        // int num2 = obj.nextInt();
        prime(num);
        betterprime(num);

    }
}