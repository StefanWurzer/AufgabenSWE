public class UmsatzDemo {
    public static void main(String[] args) {
        double[] umsatz = new double[12];
        umsatz[0] = 10.0;
        umsatz[1] = 10;
        umsatz[2] = 10;
        umsatz[3] = 10;
        umsatz[4] = 10;
        umsatz[5] = 10;
        umsatz[6] = 10;
        umsatz[7] = 10;
        umsatz[8] = 10;
        umsatz[9] = 10;
        umsatz[10] = 10;
        umsatz[11] = 11;

        //System.out.println(getUmsatzsteigerungenGT10(umsatz));

        double[][] arr2 = {{10,11,12,13,15},{21,22,23,25,26},{27,28,29,30,31},{30,32,33,34,35}};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(calculateSumByWeek(arr2)[i]);

        }

    }

    public static int getUmsatzsteigerungenGT10(double[] umsatze) {
        int a = 0;
        for (int i = 0; i < 11; i++) {
            if (umsatze[i + 1] >= (umsatze[1] * 1.1)) {
                a++;
            }
        }
        return a;
    }
    public static double[] calculateSumByWeek(double[][] umsaetze) {
        double[] summe = new double[umsaetze.length];

        for (int i = 0; i < umsaetze.length; i++) {
            for (int j = 0; j < 5; j++) {
                summe[i] = summe[i] + umsaetze[i][j];
            }
        }
        return summe;
    }
}
