package fr.wildcodeschoo.thewizardproject.controllers;

import fr.wildcodeschoo.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface wizz = context.getBean("theChangeDress", WizardInterface.class);

        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(wizz.giveAdvice());
        System.out.println("******************");
        System.out.println(wizz.changeDress());
    }
}
