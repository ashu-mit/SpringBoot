package com.example.program;


import com.example.program.Notification.EmailService;
import com.example.program.Notification.NotificationService;
import com.example.program.Notification.SmsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgramApplication.class, args);
    }

    NotificationService notificationService=new SmsService();
//    OrderService obj=new OrderService(notificationService);
   OrderService orderService=new OrderService();
    orderService

}
