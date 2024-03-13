package method;

import java.util.Scanner;

public class soal3 {
    static int inputNilai(Scanner input, int ke) {
        System.out.print("Masukkan nilai ke " + ke + ": ");
        return input.nextInt();
    }

    static void validitasSegitiga(int[] nilai) {
        if (nilai[0] == nilai[1] || nilai[0] == nilai[2] || nilai[1] == nilai[2]) {
            System.out.println("Tidak Valid");
        } else {
            cekJenisSegitiga(nilai);
        }
    }

    static void cekJenisSegitiga(int[] nilai) {
        int a = nilai[0], b = nilai[1], c = nilai[2];

        if (b < a && c < a) {
            cekBantu(a, b, c);
        } else if (a < c && b < c) {
            cekBantu(a, b, c);
        } else if (a < b && c < b) {
            cekBantu(a, b, c);
        }
    }

    static void cekBantu(int a, int b, int c) {
        if (Math.pow(b, 2) < (Math.pow(a, 2)) + (Math.pow(c, 2))) {
            System.out.println("Segitiga siku siku");
        } else if (Math.pow(b, 2) > (Math.pow(a, 2)) + (Math.pow(c, 2))) {
            System.out.println("Segitiga lancip");
        } else if (Math.pow(b, 2) == (Math.pow(a, 2)) + (Math.pow(c, 2))) {
            System.out.println("Segitiga tumpul");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[3];

        for (int i = 0; i < 3; i++) {
            nilai[i] = inputNilai(input, i+1);
        }

        validitasSegitiga(nilai);
        input.close();
    }
}