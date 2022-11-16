
package javaapplication46;
import java.util.Random;

public class JavaApplication46 {

    public static void main(String[] args) {
        
        int n = 10;
        System.out.println("Kol-vo ychastkov postoyanstva ravno: " + kolvoPostoyanstva(n));
    }

    private static int kolvoPostoyanstva(int n) {
        
        Random rnd = new Random();
        int prev = rnd.nextInt(2), curr, flag = 0, count = 0;
        System.out.println(prev);
        for (int i = 0; i < n; i++) {
            curr = rnd.nextInt(2);
            System.out.println(curr);
            if( prev == curr) {
                if(flag == 0){
                    count++; 
                    flag = 1;
                }
                
            } 
            else flag = 0;
            prev = curr;                  
        }   
        return count;       
    }
}    

