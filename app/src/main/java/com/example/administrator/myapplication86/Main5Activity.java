package com.example.administrator.myapplication86;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class Main5Activity extends AppCompatActivity {

    ViewGroup rootContainer;
    Scene scene1;
    Scene scene2;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        rootContainer =
                (ViewGroup) findViewById(R.id.rootContainer);

        transitionMgr = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene01_layout, this);

        scene2 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene02_layout, this);

        scene1.enter();

    }

    public void goToScene2(View view) {
        TransitionManager.go(scene2, transitionMgr);
        //Toast.makeText(getApplicationContext(),
        //      "장면 전환 2에 도달함", Toast.LENGTH_LONG).show();

    }

    public void goToScene1(View view) {
        TransitionManager.go(scene1, transitionMgr);
    }
}