package method;

import java.util.Scanner;

public class soal1 {
    static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        
        if (n <= 0){
            System.out.println("Inputan harus lebih dari 0");
        } else {
            printNumbers(n);
        }
        
        input.close();
    }
    

}
