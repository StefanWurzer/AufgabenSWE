package Rekursion;

public class DemoPalindrom {
    public static void main(String[] args) {
        String palindorm = "Rentner";
        System.out.println(check(palindorm));
    }
    public static boolean check(String palindrom){
        if(palindrom.length()<=1){
            return true;
        }
        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length())) {
            check(palindrom.substring(1,palindrom.length()-1));
        }
        return false;

    }
}

