package Stack;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        counter =-1;
    }

    public void push(Card newCard) {
        if (counter + 1 < cards.length) {
            cards[counter + 1] = newCard;
            counter++;
            System.out.println(cards[counter]);
        } else {
            System.out.println("Stack is full");
        }
    }
    public Card pop(){
        counter--;
        System.out.println(cards[counter+1]);
        return cards[counter+1];

    }
}
