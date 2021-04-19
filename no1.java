package latihan;

import java.util.Scanner;

public class no1 {
    public static void printMatriks(int[][] matriks){
        //menampilkan matriks agar keren
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
//    public static void tranposeMatriks(int[][] matriks){
//        int[][] hasilTranpose = new int[matriks.length][matriks[0].length];
//        for (int i=0; i<matriks.length; i++){
//            for (int j=0; j<matriks[0].length; j++){
//                hasilTranpose[j][i] = matriks[i][j];
//            }
//        }
//        System.out.println("hasil tranpose");
//        for (int i=0; i<matriks[0].length; i++){
//            for (int j=0; j<matriks.length; j++){
//                System.out.print(hasilTranpose[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //berlaku untuk matriks A
        System.out.println("Masukan baris Matriks A;");
        int baris = input.nextInt();
        System.out.println("Masukan kolom Matriks A:");
        int kolom = input.nextInt();
        
        //membuat matriks A
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks A ===");
        printMatriks(matriks_a);
        
        //berlaku untuk matriks B
        System.out.println("Masukan baris Matriks B;");
        int baris_b = input.nextInt();
        System.out.println("Masukan kolom Matriks B:");
        int kolom_b = input.nextInt();
        //membuat matriks B
        int[][] matriks_b = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_b; j++){
                System.out.println("Matriks B["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks B ===");
        printMatriks(matriks_b);
        
        //berlaku untuk matriks C
        System.out.println("Masukan baris Matriks C:");
        int baris_c = input.nextInt();
        System.out.println("Masukan kolom Matriks C:");
        int kolom_c= input.nextInt();
        //membuat matriks C
        int[][] matriks_c = new int[baris_c][kolom_c];
        for (int i=0; i<baris_c; i++){
            for (int j=0; j<kolom_c; j++){
                System.out.println("Matriks C["+i+" , "+j+"]");
                matriks_c[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks C ===");
        printMatriks(matriks_c);
        
        //penjumlahan matriks
        int[][] hasilTambah = new int[matriks_a.length][matriks_b[0].length];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                hasilTambah[i][j] = matriks_a[i][j] + matriks_b[i][j];
            }
        }
        System.out.println("hasil penjumlahan matriks_a dan matriks_b:");
        printMatriks(hasilTambah);
//        tranposeMatriks(hasilTambah);
        
        //perkalian matriks
        int[][] hasilKali = new int[hasilTambah.length][matriks_c[0].length];
        for (int i=0; i<hasilTambah.length; i++){
            for (int j=0; j<matriks_c[0].length; j++){
                for (int k=0; k<hasilTambah[0].length; k++){
                    hasilKali[i][j] += hasilTambah[i][k] * matriks_c[k][j];
                }
            }
        }
        System.out.println("=== hasil perkalian: ===");
        printMatriks(hasilKali);
//        tranposeMatriks(hasilKali);
        int[][] hasilTranpose = new int[hasilKali.length][hasilKali[0].length];
        for (int i=0; i<hasilKali.length; i++){
            for (int j=0; j<hasilKali[0].length; j++){
                hasilTranpose[j][i] = hasilKali[i][j];
            }
        }
        System.out.println("hasil tranpose");
        for (int i=0; i<hasilKali[0].length; i++){
            for (int j=0; j<hasilKali.length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
