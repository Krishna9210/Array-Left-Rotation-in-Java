import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            if(d > i) 
                arr[size - d + i] = sc.nextInt();
            else
                arr[i - d] = sc.nextInt();
        }
        
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
