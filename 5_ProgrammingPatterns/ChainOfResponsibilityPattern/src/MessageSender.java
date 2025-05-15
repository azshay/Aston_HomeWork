// Обработчик для сообщений

public abstract class MessageSender {

    private MessagePriorityLevel messagePriorityLevel;
    private MessageSender nextMessageSender;

    public MessageSender(MessagePriorityLevel messagePriorityLevel) {
        this.messagePriorityLevel = messagePriorityLevel;
    }

    public void setNextMessageSender(MessageSender messageSender) {
        this.nextMessageSender = messageSender;
    }

    public void messageSenderHandler(String message, MessagePriorityLevel messagePriorityLevel) {
        if (messagePriorityLevel.ordinal() >= this.messagePriorityLevel.ordinal()) {
            write(message);
        }

        if (nextMessageSender != null) {
            nextMessageSender.messageSenderHandler(message, messagePriorityLevel);
        }
    }

    public abstract void write(String message);
}
