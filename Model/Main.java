package com.Me.lab1.model;

import com.Me.lab1.model.com.Me.lab1.application.App;


public class Main {

    public static void main(String[] args) {
	// write your code here
 Worker yay=new WorkerBuilder();
 Worker[] yaay=WorkerBuilder.generateWorkers();
        App.SHOWTHEMALL(yaay);
        Worker k= new WorkerBuilder().createWorker();
            }
        }