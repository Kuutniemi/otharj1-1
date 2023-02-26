public class Pisin {
    public static void main(String[] args) {
        // check the number of parameters
        if (args.length == 0) {
            System.out.println("Ei parametreja");
            return;
        }

        // the first parameter is the longest
        String pisin = args[0];

        // check each parameter, if it is longer, then it is the longest
        for (int i = 1; i < args.length; i++) {
            if (args[i].length() > pisin.length()) {
                pisin = args[i];
            }
        }

        // print the longest parameter
        System.out.println("Pisin parametri: " + pisin);
    }
}
