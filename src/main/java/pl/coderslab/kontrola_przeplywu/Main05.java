package pl.coderslab.kontrola_przeplywu;

public class Main05 {
    public static void main(String[] args) {
    byte resultFor = 0, resultWhile = 0;
    for (byte i = 1; i <= 10; i++) {
        resultFor += i;
    }
    byte i = 1;
    while (i <= 10) {
        resultWhile += i;
        i++;
    }
    System.out.println("Suma z pętli \"for\" to " + resultFor + ".");
    System.out.println("Suma z pętli \"while\" to " + resultWhile + ".");
}

}
