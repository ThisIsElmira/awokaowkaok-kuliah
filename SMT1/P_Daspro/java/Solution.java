import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void textln(String expression) {
        System.out.println(expression);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        long max = 0;
        long min = 0;
        long x2 = x;
        long[] drive = new long[y];
        long[] seat = new long[y];
        for (int i = 0; i < y; i++) {
            drive[i] = input.nextLong();
            seat[i] = drive[i];
        }
        maximumDrive(x,x2,max,drive);
        minimumDrive(x, min, seat);
        textln(max+" "+min);
        }
        
    
    
    static void maximumDrive(long a, long b, long maximum, long driving[])
    {
        while(a>0){
            Arrays.sort(driving);
            maximum+=driving[driving.length-1];
            driving[driving.length-1]--;
            a--;
        }
        a=b;
    }

    static void minimumDrive(long a, long minimum, long seats[])
    {
        while(a>0){
            Arrays.sort(seats);
            for(int i=0; i<seats.length; i++){
                if(seats[i]>0){
                    minimum+=seats[i];
                    seats[i]--;
                    break;
                }
            }
            a--;
        }
    }
}