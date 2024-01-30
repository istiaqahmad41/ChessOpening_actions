package com.example.assigment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    EditText et;
    Button browse;

    ImageButton camera;
    ImageButton contact;
    ImageButton carokann;
    ImageButton italian;
    ImageButton kingsgambit;
    ImageButton ruylopez;
    ImageButton pircedefense;
    ImageButton sicilion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et =  findViewById(R.id.editText1);
        browse  = findViewById(R.id.browsebtn);
        camera  = findViewById(R.id.camera);
        contact  = findViewById(R.id.contact);


        //game name Image button
        carokann  = findViewById(R.id.caro_kann);
        italian  = findViewById(R.id.italian);
        kingsgambit  = findViewById(R.id.kingsgambit);
        ruylopez  = findViewById(R.id.ruylopez);
        pircedefense  = findViewById(R.id.pircedefense);
        sicilion  = findViewById(R.id.sicilion);


         //browser button search
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);
                String url = et.getText().toString();
                i.setData(Uri.parse("http://www."+url));
                startActivity(Intent.createChooser(i,"title"));
            }
        });

        //camera opening
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

              startActivity(i);
            }
        });
        //contact opening
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));

                startActivity(i);
            }
        });


        //Link opening with button click

        carokann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=0p_881Nwoo4"));
                startActivity(Intent.createChooser(i,"caro-kann"));
            }
        });

        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=MhNs8GLo894"));
                startActivity(Intent.createChooser(i,"italian"));
            }
        });



        kingsgambit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=92XYzS-vUOc"));
                startActivity(Intent.createChooser(i,"kingsgambit"));
            }
        });

        pircedefense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=zYEnr6vhz70"));
                startActivity(Intent.createChooser(i,"pircedefense"));
            }
        });

        ruylopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=IQrtrPvU3bQ"));
                startActivity(Intent.createChooser(i,"ruylopez"));
            }
        });


        sicilion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("https://www.youtube.com/watch?v=qM4e7g2RukI"));
                startActivity(Intent.createChooser(i,"sicilion"));
            }
        });

    }
}