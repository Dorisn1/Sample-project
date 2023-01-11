package pl.coderslab.tablice;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers2 = {4,643,112,9999,69};
        int sumOdd = 0;

        for(int liczbaZTablicy2: numbers2){
            if(liczbaZTablicy2 % 2 == 0) {
                System.out.println(liczbaZTablicy2);
            }else{
                sumOdd = sumOdd + liczbaZTablicy2;
            }
        }
        System.out.println("SUMA: " + sumOdd + ".");

    }
}
