package eu.ncdc;

import eu.ncdc.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {



    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        BookService bookService = applicationContext.getBean(BookService.class);
        applicationContext.close();
    }
}
