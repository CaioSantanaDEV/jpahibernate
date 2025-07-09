package com.caiosantana.jpahibernate.domain;

public class Person {
    private Integer id;
    private String nome;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;


    }

    public Person (){

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
