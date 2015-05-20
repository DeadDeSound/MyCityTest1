package com.example.nezar.myamakentest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Rest1 extends ActionBarActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest1);
        listView = (ListView) findViewById(R.id.listView);

        final RestDataModel [] restDataModels = new RestDataModel[4];

        RestDataModel rest1 =  new RestDataModel();
        rest1.setName("One Way Resturant");
        rest1.setSubname("Fast Food ");
        rest1.setImageResId(R.drawable.ic_launcher);
        restDataModels[0]=rest1;

        RestDataModel rest2 =  new RestDataModel();
        rest2.setName("Al tabya  Resturant");
        rest2.setSubname("junk Food");
        rest2.setImageResId(R.drawable.ic_launcher);
        restDataModels[1]=rest2;

        RestDataModel rest3 =  new RestDataModel();
        rest3.setName("Krepawy  Resturant");
        rest3.setSubname("Crepes Waaw");
        rest3.setImageResId(R.drawable.ic_launcher);
        restDataModels[2]=rest3;

        RestDataModel rest4 =  new RestDataModel();
        rest4.setName("Krepawy  Resturant");
        rest4.setSubname("Crepes Waaw");
        rest4.setImageResId(R.drawable.ic_launcher);
        restDataModels[3]=rest4;


        RestAdapter adapter= new RestAdapter(this,R.layout.listitem,restDataModels);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Name" + restDataModels[position].getName(),Toast.LENGTH_LONG).show();
                String str = restDataModels[position].getName().toString();
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
