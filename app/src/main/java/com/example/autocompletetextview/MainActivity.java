package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   private ImageView imageView;
   AutoCompleteTextView actv;
    String[] cakes = new String[]{"cupcake", "Black Forest", "chocolava Cake", "Ice cake", "Honey Cake", "creamy vanialla cake"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        actv=findViewById(R.id.auto);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,cakes);
        actv.setAdapter(adapter);

    }
}
