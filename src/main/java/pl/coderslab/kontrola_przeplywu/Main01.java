package pl.coderslab.kontrola_przeplywu;

public class Main01 {
    public static void main(String[] args) {
       int nr1 = 3;
       int nr2 = 7;

       if (nr1 > nr2) {
           //Jeśli nr2 jest większe od nr1 to:
           System.out.println("Większa liczba to " + nr1);
       }else if (nr2 > nr1){
           //Jeśli nr1 jest większe od nr2 to:
           System.out.println("Większa liczba to " + nr2);
       }else{
           //Jeśli nr2 nie jest większe od nr1
           //Jeśli nr1 nie jest większe od nr2
           System.out.println("Liczby są równe");
       }
    }
}
