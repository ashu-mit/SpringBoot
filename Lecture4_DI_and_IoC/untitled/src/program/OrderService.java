package program;


import program.Notification.NotificationService;

public class OrderService {

      public NotificationService notificationService;


    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public OrderService(){

    }



    public void orderplace()
    {
        System.out.println("order placed");
        notificationService.sendNotification();
    }

    public void setNotificationService(NotificationService notificationService)
    {
        this.notificationService=notificationService;
    }

}
