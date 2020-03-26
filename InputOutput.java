import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scaner scaner = new Scaner(System.in);
  String nama;
  System.out.print("Masukkan nama anda:  ");
  nama = scanner.nextLine();
  System.out.println("Hai,"+nama);
 }
}