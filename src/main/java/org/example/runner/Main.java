package org.example.runner;

import org.example.service.GroupService;
import org.example.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.example.repository")
@ComponentScan("org.example.service")
@EntityScan("org.example.entity")
public class Main {
    public static void main(final String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class);
        GroupService groupService = ctx.getBean(GroupService.class);
        StudentService studentService = ctx.getBean(StudentService.class);

    }
}
