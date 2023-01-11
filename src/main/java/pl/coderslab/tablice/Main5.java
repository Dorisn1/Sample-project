package pl.coderslab.tablice;

public class Main5 {
    public static void main(String[] args) {
        int[] numbers3 = {4,643,112,9999,-69};
        int min = 0;

        for(int liczbaZTablicy3: numbers3){
            if(min > liczbaZTablicy3){
                min = liczbaZTablicy3;
            }
        }
        System.out.println("MIN: " + min + ".");

    }
}
