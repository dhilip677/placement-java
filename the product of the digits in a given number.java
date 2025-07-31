import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int p=1;
        while(n>0){
            int digit = n % 10;
            p *= digit;
            n/= 10;
        }
            System.out.println(p);
        
    }
}
