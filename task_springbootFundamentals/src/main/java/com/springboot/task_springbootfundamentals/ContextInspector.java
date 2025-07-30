package com.springboot.task_springbootfundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextInspector implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Spring Context Inspection ===");

        // Get all bean names
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Total beans: " + beanNames.length);

        // Sort and print bean names
        java.util.Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("Bean: " + beanName);
        }

        // Count beans starting with "org.springframework"
        long springFrameworkBeans = java.util.Arrays.stream(beanNames)
                .filter(name -> {
                    Object bean = applicationContext.getBean(name);
                    return bean.getClass().getPackage() != null &&
                            bean.getClass().getPackage().getName().startsWith("org.springframework");
                })
                .count();

        System.out.println("Beans starting with 'org.springframework': " + springFrameworkBeans);
    }
}