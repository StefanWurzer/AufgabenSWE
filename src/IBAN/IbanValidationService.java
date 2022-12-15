package IBAN;

public class IbanValidationService {
    private String iBan;
    private int calculatedCheckSum;

    public IbanValidationService(String iBan) {
        if(iBan.length() == 20) {
            this.iBan = iBan;
            this.calculatedCheckSum = -1;
        }else {
            System.out.printf("Invalid data given");

        }
    }

    public String getCountryCode(){
        return iBan.substring(0,2);
    }
    public int getCheckSum(){
        int numberInt = Integer.parseInt(iBan.substring(2,4));
        return numberInt;
    }
    public String getAccountNumber(){
        String countryCode = getCountryCode();
        int Sum = getCheckSum();
        String kontoNummer = iBan.substring(4,20);
        String ausgabe = "Eingabe von IBAN:" +"\n"+ iBan + "\n"+"\n"+"Ländercode = " + countryCode + " (" + getCountryCodeNumber() +")" + "\n" + "Prüfsumme = " + getCheckSum() + "\n" + "Kontonummer = " + kontoNummer;
        return ausgabe;
    }

    public String getCountryCodeNumber(){
        char charA = iBan.charAt(0);
        int intA = charA - 55;
        char charB = iBan.charAt(1);
        int intB = charB - 55;
        String gesamt =""+ (intA) + (intB*100);
        return gesamt;
    }

    public String getFullCode(){
        return getAccountNumber() + "\n" + "Prüfzahl = " + iBan.substring(4,20) + getCountryCodeNumber();
    }
    public String getFullCode2(){
        return iBan.substring(4,20) + getCountryCodeNumber();
    }

    public int[] buildArray(){
        int[] liste = new int[getFullCode2().length()];
        char a = 0;
        for (int i = 0; i < getFullCode2().length(); i++) {
            a = getFullCode2().charAt(i);
            int intA = a;
            intA = a-48;
            liste[i] = intA;
        }
        return liste;

    }
    public int calcCheckSum(){
        int ergebnis = 0;
        for (int i = 0; i < buildArray().length; i++) {
            ergebnis = ((ergebnis * 10) + buildArray()[i]) % 97;


        }
        ergebnis = (98 - ergebnis);
        return ergebnis;
    }

    public boolean isIbanCorrect(){
        return (getCheckSum()==calcCheckSum());
    }
}
