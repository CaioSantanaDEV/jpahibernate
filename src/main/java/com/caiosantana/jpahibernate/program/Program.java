package com.caiosantana.jpahibernate.program;

import com.caiosantana.jpahibernate.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
		Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
		Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");


	}

}
