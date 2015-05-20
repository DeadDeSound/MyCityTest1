package com.example.nezar.myamakentest1.banks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nezar.myamakentest1.OneWay;
import com.example.nezar.myamakentest1.R;
import com.example.nezar.myamakentest1.RestAdapter;
import com.example.nezar.myamakentest1.RestDataModel;


public class MobileServices extends ActionBarActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_services);
        listView = (ListView) findViewById(R.id.listView3);
        final RestDataModel[] mobileDataModels = new RestDataModel[4];

        RestDataModel rest1 =  new RestDataModel();
        rest1.setName("One Way Resturant");
        rest1.setSubname("Fast Food ");
        rest1.setImageResId(R.drawable.ic_launcher);
        mobileDataModels[0]=rest1;

        RestDataModel rest2 =  new RestDataModel();
        rest2.setName("Al tabya  Resturant");
        rest2.setSubname("junk Food");
        rest2.setImageResId(R.drawable.ic_launcher);
        mobileDataModels[1]=rest2;

        RestDataModel rest3 =  new RestDataModel();
        rest3.setName("Krepawy  Resturant");
        rest3.setSubname("Crepes Waaw");
        rest3.setImageResId(R.drawable.ic_launcher);
        mobileDataModels[2]=rest3;

        RestDataModel rest4 =  new RestDataModel();
        rest4.setName("Krepawy  Resturant");
        rest4.setSubname("Crepes Waaw");
        rest4.setImageResId(R.drawable.ic_launcher);
        mobileDataModels[3]=rest4;


        RestAdapter adapter= new RestAdapter(this,R.layout.listitem, mobileDataModels);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Name" + mobileDataModels[position].getName(), Toast.LENGTH_LONG).show();
                String str = mobileDataModels[position].getName().toString();
                switch (str){
                    case "One Way Resturant":
                        Intent myIntent = new Intent(getApplicationContext(),OneWay.class);
                        startActivity(myIntent);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Default",Toast.LENGTH_LONG).show();
                        break;
                }//switch
            }
        });



    }




}
