package program;


import program.Notification.NotificationService;
import program.Notification.SmsService;

public class ProgramApplication {

    public static void main(String[] args) {


        NotificationService notificationService=new SmsService();
        OrderService orderService=new OrderService(notificationService);
        orderService.orderplace();


    }
}
