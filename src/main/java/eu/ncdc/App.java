package eu.ncdc;

import eu.ncdc.service.BookService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("check - OK");
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        BookService bookService = applicationContext.getBean(BookService.class);
//        applicationContext.close();
    }
}
