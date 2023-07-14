package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
           ApplicationContext context=new ClassPathXmlApplicationContext("testbytype.xml");
          // Employees emp=context.getBean("emp1",Employees.class);
                Employees employee=(Employees)context.getBean("emp1");
          System.out.println(employee);
    }
}
