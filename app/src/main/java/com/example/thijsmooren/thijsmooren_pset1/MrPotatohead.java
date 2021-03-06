package com.example.thijsmooren.thijsmooren_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatohead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
    }

    public void onCheckboxClicked(View view){
        // is it checked?
        boolean checked = ((CheckBox) view).isChecked();

        //Check which checkbox was clicked
        switch (view.getId()){
            case R.id.armsCheck:
                ImageView arms = (ImageView) findViewById(R.id.arms);
                if (checked){
                    arms.setVisibility(View.VISIBLE);
                }
                else{
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.earsCheck:
                ImageView ears = (ImageView) findViewById(R.id.ears);
                if (checked){
                    ears.setVisibility(View.VISIBLE);
                }
                else{
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hatCheck:
                ImageView hat = (ImageView) findViewById(R.id.hat);
                if (checked){
                    hat.setVisibility(View.VISIBLE);
                }
                else{
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyesCheck:
                ImageView eyes = (ImageView) findViewById(R.id.eyes);
                if (checked){
                    eyes.setVisibility(View.VISIBLE);
                }
                else{
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustacheCheck:
                ImageView mustache = (ImageView) findViewById(R.id.mustache);
                if (checked){
                    mustache.setVisibility(View.VISIBLE);
                }
                else{
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glassesCheck:
                ImageView glasses = (ImageView) findViewById(R.id.glasses);
                if (checked){
                    glasses.setVisibility(View.VISIBLE);
                }
                else{
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.noseCheck:
                ImageView nose = (ImageView) findViewById(R.id.nose);
                if (checked){
                    nose.setVisibility(View.VISIBLE);
                }
                else{
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouthCheck:
                ImageView mouth = (ImageView) findViewById(R.id.mouth);
                if (checked){
                    mouth.setVisibility(View.VISIBLE);
                }
                else{
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;


            case R.id.eyebrowsCheck:
                ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                if (checked){
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else{
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoesCheck:
                ImageView shoes = (ImageView) findViewById(R.id.shoes);
                if (checked){
                    shoes.setVisibility(View.VISIBLE);
                }
                else{
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
}
