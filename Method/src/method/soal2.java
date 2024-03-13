package method;

import java.util.Scanner;

public class soal2 {  
    static void checkCube(int[] sisi) {
        if (sisi[0] == sisi[1] && sisi[0] == sisi[2] && sisi[1] == sisi[2]) {
            System.out.println("Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sisi = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan panjang sisi " + (i+1) + ": ");
            sisi[i] = input.nextInt();
        }

        checkCube(sisi);

        input.close();
    }
}
