public class SMSMessageSender extends MessageSender{

    public SMSMessageSender(MessagePriorityLevel messagePriorityLevel) {
        super(messagePriorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
