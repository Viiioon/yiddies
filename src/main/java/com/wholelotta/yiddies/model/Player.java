package com.wholelotta.yiddies.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    //adding an "a"
    @Column(name = "firstName")
    private String a_firstName;

    //adding a "b" because hibernate inserts columns in alphabetical order, which results in having following columns:
    //firstname, jerseynumber, lastname
    @Column(name = "lastName")
    private String b_lastName;

    private String nickName;
    private int jerseyNumber;

    public Player() {};

    public Player(Long id, String a_firstName, String b_lastName, String nickName, int jerseyNumber) {
        this.id = id;
        this.a_firstName = a_firstName;
        this.b_lastName = b_lastName;
        this.nickName = nickName;
        this.jerseyNumber = jerseyNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geta_firstName() {
        return a_firstName;
    }

    public void seta_firstName(String a_firstName) {
        this.a_firstName = a_firstName;
    }

    public String getb_lastName() {
        return b_lastName;
    }

    public void setb_lastName(String b_lastName) {
        this.b_lastName = b_lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", a_firstName='" + a_firstName + '\'' +
                ", b_lastName='" + b_lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
