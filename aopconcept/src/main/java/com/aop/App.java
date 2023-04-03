package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;
import com.aop.service.PaymentServiceimp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("com/aop/config.xml");
       PaymentService paymentobject= context.getBean("payment",PaymentService.class);
     //auth,print payment started
       paymentobject.makePayment();
       }
}
