package com.ntuc.jdbc.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {
    public static void main(String[] args) {
        // create a JDBC session with the parameters given in the hibernate config xml
        SessionFactory sessionFactory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // add a Student
        Student student = new Student();
        student.setName("Alex");
        session.persist(student);
        session.getTransaction().commit();
        session.close();

        // read a student
        session = sessionFactory.openSession();
        session.beginTransaction();
        student = session.get(Student.class, 1l); // fetch the student with id 1
        if (student != null)
            System.out.println(student.getName());
        else
            System.out.println("Student with ID 1 does not exist");
        session.close();

        // update Student
        session = sessionFactory.openSession();
        session.beginTransaction();
        student = session.get(Student.class, 1l); // fetch the student with id 1
        if (student != null) {
            student.setName("Something"); // change the name of student with id 1
            System.out.println("Student data updated");
        } else
            System.out.println("Student with ID 1 does not exist");
        session.getTransaction().commit();
        session.close();

        // // Delete Student
        session = sessionFactory.openSession();
        session.beginTransaction();
        student = session.get(Student.class, 1l); // fetch the student with id 1
        if (student != null) {
            session.remove(student);
            System.out.println("Student with ID 1 is Deleted");
        } else
            System.out.println("Student with ID 1 does not exist");
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }

}
