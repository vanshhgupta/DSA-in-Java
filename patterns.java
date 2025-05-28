
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
    
    

    public static void main(String[] args) {
        reversepyramid();
    }
}