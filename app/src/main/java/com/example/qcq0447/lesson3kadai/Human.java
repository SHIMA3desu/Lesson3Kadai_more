package com.example.qcq0447.lesson3kadai;

import android.util.Log;

/**
 * Created by qcq0447 on 2016/11/29.
 */

public class Human extends Animal implements  Thinkable{
//    String name;
//    int age;
//    String hobby = "読書";
    String hobby = "";
    public Human(String name,int age,String hob){
//        this.name = name;
//        this.age = age;
        super.name = name;
        super.age = age;
        this.hobby = hob;
    }

    public void say(){
        Log.d("javatest","私の名前は" + this.name);
        Log.d("javatest","私の歳は" + this.age);

    }

    public void think(){
        Log.d("javatest","「私は" + this.hobby + "について考える」");

    }
}
