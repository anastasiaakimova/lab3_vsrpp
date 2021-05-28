package org.example.runner;

import org.example.entity.Groups;
import org.example.entity.Students;
import org.example.service.FacultyService;
import org.example.service.GroupService;
import org.example.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableJpaRepositories("org.example.repository")
@ComponentScan("org.example.service")
@EntityScan("org.example.entity")
public class Main {
    public static void main(final String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class);
        GroupService groupService = ctx.getBean(GroupService.class);
        StudentService studentService = ctx.getBean(StudentService.class);
        FacultyService facultyService = ctx.getBean(FacultyService.class);
//
//
//        //create
//        Long id = 2L;
//        Groups gr = groupService.read(id);
//        Students st = new Students();
//        Set<Students> list = gr.getStudents();
//        st.setName("Stas");
//        st.setSurname("Ivanov");
//        st.setPhoneNumber("ndxm");
//        st.setGroup(gr);
//        list.add(st);
//        gr.setStudents(list);
//        groupService.save(gr);
//		/*
//		for (Student student : gr.getStudents()) {
//			System.out.println(student);
//		}
//		System.out.println(gr);
//		*/
//        //read
//        Students student = studentService.read(id);
//        List<Students> lt = studentService.read();
//        System.out.println("1 .... :" + student);
//        System.out.print("N... : ");
//        for (Students stud : lt) {
//            System.out.println(stud);
//        }
//
//        //update
//        student.setName("Vitya");
//        student.setPhoneNumber("lyny");
//        student.setSurname("PoP");
//        studentService.edit(student);
//
//        //delete
//
//        ctx.close();
//    }
    }
}
