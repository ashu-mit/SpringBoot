package program.Notification;

public class FakeEmailService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Dummy Email sent");
    }
}
