package vn.iviettech.spring.jpa.realationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.iviettech.spring.jpa.realationship.config.Config;

/**
 * Created by Admin on 08/06/2017.
 */
public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    public static void main(String[] args) {

    }
}
