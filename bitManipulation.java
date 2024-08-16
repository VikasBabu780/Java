//update bit

import java.util.*;

public class bitManipulation {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int oper = sc.nextInt();
       int n= 8;
       int pos = 2;
       int bitMask = 1<<pos;
       if(oper == 1){
        int newNumber =(n| bitMask);
        System.out.println(newNumber);

       } else {
        int newNumber = ((~bitMask) & n);
        System.out.println(newNumber);
       }
    }
    
}
