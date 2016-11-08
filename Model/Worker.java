package com.Me.lab1.model;

/**
 * Created by hater on 13.09.2016.
 */
enum Gender{female,male}
public class Worker {

    protected String name;
    protected Gender gender;
    protected String surname;
    protected int applyDate;
    protected int birthYear;
    protected String work;
    public Worker(){}
    public Worker(String name){
        this.name =name;
    }
    public Worker(String name, String surname){
        this.name =name;
        this.surname =surname;
    }
    public Worker(String name, String surname, int applyDate){
        this.name =name;
        this.surname =surname;
        this.applyDate=applyDate;
    }
    public Worker(String name, String surname, int applyDate, int birthYear){
        this.name =name;
        this.surname =surname;
        this.applyDate=applyDate;
        this.birthYear=birthYear;
    }
    public Worker(String name, String surname, int applyDate, int birthYear, String work){
        this.name =name;
        this.surname =surname;
        this.applyDate=applyDate;
        this.birthYear=birthYear;
        this.work=work;
    }
    public Worker(String name, int birthYear){
        this.name =name; this.birthYear=birthYear;
    }

    public Worker(String name, Gender gender, int birthYear) {
        this.name = name;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getApplyDate() {
        return this.applyDate;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getWork() {
        return work;
    }

    public void setApplyDate(int applyDate) {
        this.applyDate = applyDate;
    }


    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        if(work!=null)
        return name + surname +Integer.toString(applyDate)+Integer.toString(birthYear)+work;
        else
            return name +" "+" "+Integer.toString(birthYear)+" "+gender;
    }
}