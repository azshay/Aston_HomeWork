public class CardReader implements USB {

    private MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectCable() {
        memoryCard.insert();
        memoryCard.copyData();
    }
}
