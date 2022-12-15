package IBAN;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String iBan = "AT611904300234573201";

        IbanValidationService test = new IbanValidationService(iBan);

        System.out.println(test.getFullCode());

       int[] arr = test.buildArray();
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println(test.calcCheckSum());
        System.out.println(test.isIbanCorrect());
    }
}
