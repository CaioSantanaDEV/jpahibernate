package com.caiosantana.jpahibernate.program;

import com.caiosantana.jpahibernate.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");
		Person p4 = new Person(null, "Mariana Oliveira", "mariana@gmail.com");
		Person p5 = new Person(null, "Pedro Almeida", "pedro@gmail.com");
		Person p6 = new Person(null, "Lucas Pereira", "lucas@gmail.com");
		Person p7 = new Person(null, "Beatriz Souza", "beatriz@gmail.com");
		Person p8 = new Person(null, "Fernando Costa", "fernando@gmail.com");
		Person p9 = new Person(null, "Juliana Rocha", "juliana@gmail.com");
		Person p10 = new Person(null, "Ricardo Mendes", "ricardo@gmail.com");
		Person p11 = new Person(null, "Patrícia Lima", "patricia@gmail.com");
		Person p12 = new Person(null, "Gabriel Fernandes", "gabriel@gmail.com");
		Person p13 = new Person(null, "Rafaela Martins", "rafaela@gmail.com");
		Person p14 = new Person(null, "Roberto Duarte", "roberto@gmail.com");
		Person p15 = new Person(null, "Camila Ramos", "camila@gmail.com");
		Person p16 = new Person(null, "Thiago Moreira", "thiago@gmail.com");
		Person p17 = new Person(null, "Larissa Teixeira", "larissa@gmail.com");
		Person p18 = new Person(null, "Gustavo Cardoso", "gustavo@gmail.com");
		Person p19 = new Person(null, "Vanessa Barros", "vanessa@gmail.com");
		Person p20 = new Person(null, "Felipe Nogueira", "felipe@gmail.com");

        em.getTransaction().begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.persist(p6);
		em.persist(p7);
		em.persist(p8);
		em.persist(p9);
		em.persist(p10);
		em.persist(p11);
		em.persist(p12);
		em.persist(p13);
		em.persist(p14);
		em.persist(p15);
		em.persist(p16);
		em.persist(p17);
		em.persist(p18);
		em.persist(p19);
		em.persist(p20);

		em.getTransaction().commit();


        System.out.println("Pronto");
        em.close();
        emf.close();
    }

}
