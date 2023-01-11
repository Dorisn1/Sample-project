package pl.coderslab.kontrola_przeplywu;

public class Main6 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " - ");
            if (i % 2 == 1) {
                System.out.print("nie");
            }
            System.out.println("parzysta");
        }
        int i = 0;
        while (i <= n) {
            System.out.print(i + " - ");
            if (i % 2 == 1) {
                System.out.print("nie");
            }
            System.out.println("parzysta");
            i++;
        }
    }

}
