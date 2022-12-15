package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Card karte = new Card(5, Colour.green);
        Card karte2 = new Card(3, Colour.yellow);
        Card karte3 = new Card(2, Colour.red);
        Card karte4 = new Card(7, Colour.blue);
        Card[] stackly = new Card[10];

        CardStack stack = new CardStack(stackly);
        stack.push(karte);
        stack.push(karte3);
        stack.push(karte2);
        stack.push(karte4);

        stack.pop();
        stack.pop();
        stack.pop();


    }

}
