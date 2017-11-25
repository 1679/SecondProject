package com.example.administrator.myapplication86;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;


public class ScnenTransitionsActivity extends AppCompatActivity {

    ViewGroup rootContainer;
    Scene scene1;
    Scene scene2;
    Transition transitionMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_transitions);

        rootContainer =
                (ViewGroup) findViewById(R.id.rootContainer);

        transitionMgr = TransitionInflater.from(this)
                .inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene1_layout, this);

        scene2 = Scene.getSceneForLayout(rootContainer,
                R.layout.scene2_layout, this);

        scene1.enter();

    }

    public void goToScene2 (View view)
    {
        TransitionManager.go(scene2, transitionMgr);
        //Toast.makeText(getApplicationContext(),
        //      "장면 전환 2에 도달함", Toast.LENGTH_LONG).show();

    }

    public void goToScene1 (View view)
    {
        TransitionManager.go(scene1, transitionMgr);
    }


    public void four(View vi) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }
}