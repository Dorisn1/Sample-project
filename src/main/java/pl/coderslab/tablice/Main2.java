package pl.coderslab.tablice;

public class Main2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "berry"};
        System.out.println(fruits[0]);
        System.out.println(fruits[fruits.length-1]);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
