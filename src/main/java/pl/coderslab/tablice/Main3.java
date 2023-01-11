package pl.coderslab.tablice;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = {4,643,112,9999,69};
        int sum = 0;

        for(int liczbaZTablicy: numbers){
            sum = sum + liczbaZTablicy;
        }

        System.out.println("SUMA: " + sum + ".");

    }
}
