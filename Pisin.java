public class Pisin {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ei parametreja");
            return;
        }
        String pisin = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].length() > pisin.length()) {
                pisin = args[i];
            }
        }
        System.out.println("Pisin parametri: " + pisin);
    }
}
