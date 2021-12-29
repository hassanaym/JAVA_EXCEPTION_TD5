import java.util.ArrayList;

public class CalcLigneCommande {
    public static void main(String[] args) {
        int sommeInt = 0;
        double sommeDouble = 0.0;

        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            try {
                sommeDouble = sommeDouble + Double.parseDouble(args[i]);

                sommeInt = sommeInt + Integer.parseInt(args[i]);

            } catch (NumberFormatException e) {
                str.add(args[i]);
            }

        }
        System.out.println("La somme des arguments entiers: " + sommeInt);
        System.out.println("La somme des arguments reels: " + sommeDouble);
        System.out.println("Les arguments : " + str.toString() + " ne sont ni eniters ni réels");
    }
}
