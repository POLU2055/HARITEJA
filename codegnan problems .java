//LONGEST VALUE BETWEEN TWO VALUES
  import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a>b?a:b;
        System.out.println(c);
        s.close();
    }
}

//PRINT NUMBER FROM 1 TO N USING FOR LOOP/ANY LOOP
//AND PRINT NUMBER FROM N TO 1 USING WHILE LOOP
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=1;
        for (i=1;i<=a ;i++ ){
            System.out.print(i+" ");
        } 
        System.out.println();
        int k=1;
        while(k<=a){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
        int j=1;
        do{
            System.out.print(j+" ");
            j++;
        }while(j<=a);
        s.close();
    }
}

//Create a program that acts as a simple calculator. 
//Take two integers and an operator (+, -, *, /) and perform the calculation
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        s.nextLine();
        char c=s.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                    break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                  break;
            default :
            System.out.println("Invalid choice");
            break;
        }
        s.close();
    }
}

//CHECK A NUMBER IS DIVISIBLE BY NUMBER OR NOT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a%b==0){
            System.out.print("Divisible");
        }
        else{
            System.out.print("Not Divisible");
        }
        s.close();
    }
}

//Read two integers and print their division if second is non-zero, else 0 using conditional operator
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        int b=s.nextInt(); 
        int c=b==0?0:a/b;
        System.out.println(c);
        s.close();
    }
}

//  PRINT MONTH DAYS BY GIVING MONTH NUMBER
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0 && a<13 &&(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)){
            System.out.printf("%d Month has : 31 Days", a);
        }
        else if(a>0 && a<13 && a==2){
            System.out.printf("%d Month has : 28 Days", a);
        }
        else if(a>0 && a<13){
            System.out.printf("%d Month has : 30 Days", a);
        }
        else{
            System.out.print("Ivalid month Number");
        }
        s.close();
    }
}

//THE NEXT POWER 2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0){
            System.out.println("1");
        }
        else{
            a--;
            a|=a>>1;
            a|=a>>2;
            a|=a>>4;
            a|=a>>8;
            a|=a>>16;
            a=a+1;
            System.out.println(a);
        }
        s.close();
    }
}
//THE GIVEN NUMBER IS POWER OF 2 OR NOT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0 && ((a & (a-1)) ==0)){
            System.out.println("It is power 0f 2");
        }
        else{
            System.out.print("It is not power 0f 2");
        }
        s.close();
    }
}

//CHECK THE NUMBER IS EVEN OR NOT USING FUNCTION/METHOD
import java.util.*;
public class Main{
    static String Even(int n){
        if(n%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String c;
        c=Even(a);
        System.out.print(c);
        s.close();
    }
}
//THE PRIME NUMBERS THAT ARE PRESENTED IN ARRAY AND THEIR PRODUCT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ ){
            int val=s.nextInt();
            a[i]=val;
        } 
        int m=1;
        for(int i=0;i<n;i++){
            int f=0;
            if(a[i]<1){
                continue;
            }
            for (int j=2;j<=Math.sqrt(a[i]) ;j++ ){
                if(a[i]%j==0){
                    f=1;
                    break;
                }
            } 
            if(f==0){
                m=m*a[i];
            }
        }
        System.out.println(m);
        s.close();
    }
}

//Given a number N, compute the sum of its digits using isdigit() on its string representation. Print the sum.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();  // Read number as a string
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';  // Convert char digit to int
            }
        }

        System.out.println(sum);
        s.close();
    }
}

//IN JAVA THERE IS NO NEED OF BREAK AFTER RETURN STATEMENT IN SWITCH CASE
//BUT IN PRINT STATEMENT AFTER IT IS REQUIRED 
//THERE IS DEFAULT AT EVERY SWITCH 

//FOR GETTING OUTPUT WITH EXACT DECIMAL PLACES WE USE String.format("%.1f",n)
//Given a number N, compute the sum of factorials of all numbers from 1 to N using a for loop. Print the sum modulo 10^9+7.(DOUBT)
