package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zooimage(View view){

        ImageView img = (ImageView)findViewById(R.id.imageView2);
        Bitmap bImage = BitmapFactory.decodeResource(this.getResources(),R.drawable.lin);
        img.setImageBitmap(bImage);
    }
}
