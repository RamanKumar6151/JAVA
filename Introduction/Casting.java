package Introduction;

public class Casting {
    public static void main(String[] args){
        double price=100.00;
        double finalPrice=price+18; // implicit casting
        System.out.println(finalPrice);

        int p=100;
        int fP=p+(int)18.18; //explicit casting
        System.out.println(fP);

    }
}
