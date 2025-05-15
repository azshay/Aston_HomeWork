public class LogReportMessageSender extends MessageSender{

    public LogReportMessageSender(MessagePriorityLevel messagePriorityLevel) {
        super(messagePriorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Log report: " + message);
    }
}
