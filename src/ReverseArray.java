public class ReverseArray {
    public static void main(String[] args) {

        String[] Arr = {"Hallo", "Max", "Mustermann"};
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");
        }

        System.out.println("");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(reverseArray(Arr)[i]+" ");
        }
    }

    public static String[] reverseArray(String[] arrayToReverse) {

        int b = arrayToReverse.length;
        String[] arr = new String[b];
        for (int i = 0; i < b; i++) {
            arr[(b-i-1)] = arrayToReverse[i];
        }
        return arr;
    }
}
