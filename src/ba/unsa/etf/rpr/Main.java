package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int SumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n=0;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite n: ");
        n = ulaz.nextInt();
        int suma=0;
        suma=SumaCifara(n);
        System.out.println("Suma svih cifara broja n je: "+suma);
    }
}