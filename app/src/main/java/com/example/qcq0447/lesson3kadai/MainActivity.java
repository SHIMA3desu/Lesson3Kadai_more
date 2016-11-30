package com.example.qcq0447.lesson3kadai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Human human = new Human("太郎", 25,"スポーツ");
        human.say();
        human.think();

        Human human2 = new Human("次郎", 98,"読書");
        human2.say();
        human2.think();


    }
}
