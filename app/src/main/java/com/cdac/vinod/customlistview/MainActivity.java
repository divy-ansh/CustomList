package com.cdac.vinod.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter adapter;
    ArrayList<MyPojo> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPojo myPojo = new MyPojo();
        myPojo.setName("Ram");
        myPojo.setNumber("1234567890");
        arrayList.add(myPojo);
        for (int i =1 ; i<20; i++)
        {
            MyPojo myPojo1 = new MyPojo();
            myPojo1.setName("Laxman");
            myPojo1.setNumber("1234567890");
            arrayList.add(myPojo1);
        }

        listView = (ListView) findViewById(R.id.listview);

        adapter = new CustomAdapter(MainActivity.this,R.layout.list_item,arrayList);
        listView.setAdapter(adapter);

    }
}
