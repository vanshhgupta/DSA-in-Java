
import java.util.*;
import java.math.*;
public class patterns{

    // Pattern Questions

    public static void sqaure(){
        for(int i =0; i<=5 ;i++){
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfpyramid(){
for(int i=1;i<=5; i++ ){
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
}
    }

    public static void halfnumberpyramid(){
        for(int i =1; i<=5 ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void halfnumberpyramid1(){
        int num = 1;
        for(int i =1; i<=5 ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }

    public static void reversehalfpyramid(){
        for(int i =1; i<=5; i++){
            for(int j=1; j<=(5-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void reversehalfnumpyramid(){
        for(int i =1; i<=5; i++){
            for(int j=1; j<=(5-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void reversepyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(5-i+1); j++){
                System.out.print("*");
            }
            for(int j=1; j<=(4-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void doublepyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(5-i+1); j++){
                System.out.print("*");
            }
            for(int j=1; j<=(4-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void halfdoublepyramid(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void evenoddpyramid(){
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }

    public static void doublenumpyramid(int num){
        for(int i=1; i<=num;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(num-i);j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void continousnumpyramid(int n){
        int k=1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void alphapyramid(int n){
        for(int i=1; i<=n;i++){
            char k='A';
            for(int j=1; j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void reversealphapyramid(int n){
        for(int i=n; i>=1;i--){
            char k='A';
            for(int j=1; j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void alphapyramid1(int n){
        char k='A';
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
    }

    public static void alphafullpyramid(int n){
        for(int i=1; i<=n;i++){
            char k='A';
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(k);
                k++;
            }

            k--;
            for(int j=2; j<=i;j++){
                k--;
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void alphareversepyramid(int n){
        for(int i=1; i<=n; i++){
            char k = (char)('A' + (n-i));
            for(int j=1; j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    
    public static void emptydiamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i;j--){
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void oppemptydiamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int m=n-1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i+1;j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=m-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void emptyrect(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i==1 || j==1 || i==n|| j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void numsqaure(){
        System.out.print("Enter not row, but the maximum number in patter: ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int rows=2*n-1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                int top=i-1;
                int left = j-1;
                int bottom = rows-i;
                int right = rows - j;
                int m= Math.min(Math.min(top,bottom), Math.min(right, left));
                System.out.print(n-m);
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of rows in pattern: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        numsqaure();
    }
}