package Stack;

public class Card {
    private int value;
    private Colour colour;

    public Card(int value, Colour colour) {
        if (value > -1 && value < 10) {
            this.value = value;
        } else {
            System.out.print("Value is not in range");
        }
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour=" + colour +
                '}';
    }
}

