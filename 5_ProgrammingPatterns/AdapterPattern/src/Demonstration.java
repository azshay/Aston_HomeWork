public class Demonstration {
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectCable();
    }
}