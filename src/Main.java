import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Jos guvernu! ");
        System.out.println("Muica");


        Produs prod1 = new Produs("Mar", "", 12.5);
        Produs prod2 = new Produs("Para", "", 14.2);
        ArrayList<Produs> listaDeProduse = new ArrayList<>();
        listaDeProduse.add(prod1);
        listaDeProduse.add(prod2);

        Cos cos = new Cos();
        double total = cos.calculeazaSuma(listaDeProduse);
    }

}
