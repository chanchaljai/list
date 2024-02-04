package com.example.listexample;

import static com.example.listexample.R.id.listView;
import static com.example.listexample.R.id.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Spinner spinner;
    AutoCompleteTextView actxtView;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();


    int[] arrNo = new int[]{1,2,3,4,5};
    

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);


        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, arrNames);
       listView.setAdapter(adapter);
       
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           private int position;

           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              
               if(position == 0){
                   Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
               }
           }
       });

        //Spinner
        arrIds.add("Adhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);

        //AutoCompleteTextView
        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("Java");
        arrLanguage.add("PHP");
        arrLanguage.add("Objective C");
        arrLanguage.add("C#");
        arrLanguage.add("CScript");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguage);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);


    }
}

