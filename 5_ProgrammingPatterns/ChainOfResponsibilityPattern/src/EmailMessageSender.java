public class EmailMessageSender extends MessageSender {

    public EmailMessageSender(MessagePriorityLevel messagePriorityLevel) {
        super(messagePriorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
