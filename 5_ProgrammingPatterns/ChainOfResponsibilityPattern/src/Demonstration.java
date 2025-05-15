public class Demonstration {
    public static void main(String[] args) {

        MessageSender logReportSender = new LogReportMessageSender(MessagePriorityLevel.NORMAL);
        MessageSender emailMessageSender = new EmailMessageSender(MessagePriorityLevel.CRITICAL);
        MessageSender smsMessageSender = new SMSMessageSender(MessagePriorityLevel.PANIC);

        logReportSender.setNextMessageSender(emailMessageSender);
        emailMessageSender.setNextMessageSender(smsMessageSender);

        System.out.println("Priority: Normal");
        logReportSender.messageSenderHandler("Message 1.", MessagePriorityLevel.NORMAL);
        System.out.println("\nPriority: Critical");
        logReportSender.messageSenderHandler("Message 2.", MessagePriorityLevel.CRITICAL);
        System.out.println("\nPriority: Panic");
        logReportSender.messageSenderHandler("Message 3.", MessagePriorityLevel.PANIC);

    }
}