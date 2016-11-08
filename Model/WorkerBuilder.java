package com.Me.lab1.model;

import java.util.Random;

public class WorkerBuilder extends Worker {
    static Worker[] generateWorkers(){
        String[] HUMANNAMES={"Rustam","Aslan","Halif","Muhammad","Nigga","Kim Chen","Zigmund","Artem","Potap","Oleksa","Yevpatiy","Aren","Pikachu"};
        String[] WOMANNAMES={"Olya","Iryna","Kateryna","Vasylyna"};

        final Random random=new Random();
        Worker[] Workers =new Worker[10];
        for(int i=0;i<10;i++){
            boolean a=random.nextBoolean();
            if(a){
                Workers[i]=new Worker(HUMANNAMES[random.nextInt(HUMANNAMES.length)],Gender.male, random.nextInt(1999));
            }
            else
                Workers[i]=new Worker(WOMANNAMES[random.nextInt(WOMANNAMES.length)],Gender.female, random.nextInt(1999));
        }
        return Workers;
    }
    public WorkerBuilder naame(String name){
        this.name =name;
        return this;
    }
    public WorkerBuilder set_Name(String name) {
        this.name = name;
        return this;
    }

    public WorkerBuilder set_Surname(String surname) {
        this.surname = surname;
        return this;
    }

    public WorkerBuilder set_ApplyDate(int applyDate) {
        this.applyDate = applyDate;
        return this;
    }

    public WorkerBuilder set_BirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public WorkerBuilder set_Work(String work) {
        this.work = work;
        return this;
    }

    public Worker createWorker() {
        return new Worker(name, surname, applyDate, birthYear, work);
    }
}