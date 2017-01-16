package com.beta.android.aakashresearchlabs.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.beta.android.aakashresearchlabs.test.customAdapters.testmenuAdapter;
import com.beta.android.aakashresearchlabs.test.customClasses.wordclass;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        //changing index page heading text
        TextView hd =(TextView) findViewById(R.id.index_heading);
        hd.setText("Test Plan");

        //test plan index adapter
        final ArrayList<wordclass> list = new ArrayList<wordclass>();
        list.add(new wordclass(R.string.list1));
        list.add(new wordclass(R.string.list2));
        list.add(new wordclass(R.string.list3));
        list.add(new wordclass(R.string.list4));
        list.add(new wordclass(R.string.list5));
        list.add(new wordclass(R.string.list6));

        testmenuAdapter adapter = new testmenuAdapter(this,list);
        ListView section = (ListView) findViewById(R.id.menu_list_section);
        section.setAdapter(adapter);


    }

}