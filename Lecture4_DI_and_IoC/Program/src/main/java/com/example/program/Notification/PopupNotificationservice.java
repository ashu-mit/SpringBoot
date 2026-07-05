package com.example.program.Notification;

public class PopupNotificationservice implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Pop-up notification sent");
    }
}
