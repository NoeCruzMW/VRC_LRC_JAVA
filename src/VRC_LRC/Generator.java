package VRC_LRC;

/**
 *
 * @author Zurck'z | Noe Cruz Lopez
 * @facebook https://www.facebook.com/zurckz2014/
 */
public class Generator {

    public static String generator(String cad, boolean par, boolean der) {
        String bit = "";
        if ((cad.length() == 7)) {
            if (par) {
                bit = isPair(counter(cad)) == true ? "0" : "1";
            } else {
                bit = isPair(counter(cad)) == true ? "1" : "0";
            }
        }
        if (der) {
            cad += bit;
        } else {
            cad = bit + cad;

        }
        return cad.trim();
    }

    public static String toBinary(int chapter) {
        return Integer.toBinaryString(chapter);
    }

    public static int counter(String cad) {
        int count = 0;
        for (int i = 0; i < cad.length(); i++) {
            count = cad.substring(i, i + 1).equals("1") ? count + 1 : count;
        }
        return count;
    }

    public static boolean isPair(int num) {
        return num % 2 == 0;
    }

    public static int toString(String cad) {
        int num = toDecimal(cad);
        return num;

    }

    public static int toDecimal(String Bin) {

        String aux = Bin;
        Bin = (counter(Bin) > 1) ? aux : "100000";
        int i, numDecimal = 0, b = 0;
        double u;

        for (i = Bin.length() - 1; i >= 0; i--) {
            u = Integer.parseInt(Bin.substring(i, i + 1)) * Math.pow(2, b);
            numDecimal += (int) (u);
            b++;
        }

        return numDecimal;
    }

}
