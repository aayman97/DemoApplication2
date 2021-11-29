package com.example.demoapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int activeplayer = 0;
    boolean endgame = false;
    int [] tags = {2,2,2,2,2,2,2,2,2};

    public void newgame (View v){
        if(endgame == true){
            recreate();
        }
        else{
            Toast toast=Toast.makeText(getApplicationContext(),"Finish Your Game First ! ",Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void dropIn(View v){
        ImageView a = (ImageView) v;

        if(endgame == false){
            if(activeplayer == 0){
                a.setImageResource(R.drawable.oooo);
                a.animate().alpha(1).setDuration(1000);
                tags[Integer.parseInt(a.getTag().toString())] = activeplayer;
                activeplayer=1;
            }
            else{
                a.setImageResource(R.drawable.xxxx);
                a.animate().alpha(1).setDuration(1000);
                tags[Integer.parseInt(a.getTag().toString())] = activeplayer;
                activeplayer=0;
            }

            if(tags[0] == 0 && tags[1] == 0 && tags[2] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[0] == 0 && tags[4] == 0 && tags[8] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[0] == 0 && tags[3] == 0 && tags[6] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[1] == 0 && tags[4] == 0 && tags[7] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[2] == 0 && tags[4] == 0 && tags[6] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[3] == 0 && tags[4] == 0 && tags[5] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            else if (tags[6] == 0 && tags[7] == 0 && tags[8] == 0){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 0,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 0);
                endgame = true;
            }
            //    else
            else if(tags[0] == 1 && tags[1] == 1 && tags[2] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[0] == 1 && tags[4] == 1 && tags[8] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[0] == 1 && tags[3] == 1 && tags[6] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[1] == 1 && tags[4] == 1 && tags[7] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[2] == 1 && tags[4] == 1 && tags[6] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[3] == 1 && tags[4] == 1 && tags[5] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            else if (tags[6] == 1 && tags[7] == 1 && tags[8] == 1){
                Toast toast=Toast.makeText(getApplicationContext(),"Congratulation Player " + 1,Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("Congratulation Player " + 1);
                endgame = true;
            }
            a.setEnabled(false);
        }



        boolean gameclosed = true;
        for(int i = 0;i<tags.length;i++){
            if(tags[i] == 2){
                gameclosed = false;
                break;
            }
        }
        if(gameclosed){
            Toast toast=Toast.makeText(getApplicationContext(),"The game is a draw , Start a new game ",Toast.LENGTH_SHORT);
            toast.show();
            endgame = true;
        }

        if(endgame == true && !gameclosed ){
            Toast toast=Toast.makeText(getApplicationContext(),"Start a new game",Toast.LENGTH_SHORT);
            toast.show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}