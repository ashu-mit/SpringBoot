package program.Notification;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Email sent ");
    }
}
