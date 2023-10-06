import java.util.Scanner;

public class Pemilihan2Percobaan217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukan Sudut 1 : ");
        sudut1 = input17.nextFloat();
        System.out.print("Masukan Sudut 2 : ");
        sudut2 = input17.nextFloat();
        System.out.print("Masukan Sudut 3 : ");
        sudut3 = input17.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            }else if ((sudut1 == 120) || (sudut2 == 120) || (sudut3 == 120)){
                System.out.println("Segitiga Tersebut Adalah Segitiga Tumpul");
            }else 
                System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
