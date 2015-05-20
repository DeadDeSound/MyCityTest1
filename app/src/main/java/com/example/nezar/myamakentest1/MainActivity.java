package com.example.nezar.myamakentest1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nezar.myamakentest1.banks.Banks;
import com.example.nezar.myamakentest1.banks.Cafe;
import com.example.nezar.myamakentest1.banks.Exchange;
import com.example.nezar.myamakentest1.banks.Governmental;
import com.example.nezar.myamakentest1.banks.Grocery;
import com.example.nezar.myamakentest1.banks.Gym;
import com.example.nezar.myamakentest1.banks.Markets;
import com.example.nezar.myamakentest1.banks.MobileServices;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ImageView imageView;
    private DrawerLayout drawerLayout;
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        imageView = (ImageView) findViewById(R.id.imagedrawer);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);

            }
        });


        //set grid view item
        Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
        Bitmap userIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.personal);
        Bitmap RestIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.rest1);
        Bitmap BankIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.bank1);
        Bitmap MobileIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.mobile1);
        Bitmap GroceryeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.grocery);
        Bitmap MarketIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.market);
        Bitmap CafeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.cafe);
        Bitmap GoverIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.governemnt);
        Bitmap MoneyIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.money);
        Bitmap GymIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.gym);


        gridArray.add(new Item(RestIcon,"Restaurant"));
        gridArray.add(new Item(BankIcon,"Banks"));
        gridArray.add(new Item(MobileIcon,"Mobile Services"));
        gridArray.add(new Item(GroceryeIcon,"Grocery"));
        gridArray.add(new Item(MarketIcon,"Markets"));
        gridArray.add(new Item(CafeIcon,"Cafe"));
        gridArray.add(new Item(GoverIcon,"governmental"));
        gridArray.add(new Item(MoneyIcon,"Exchange"));
        gridArray.add(new Item(GymIcon,"Gym"));




        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.raw_grid1, gridArray);
        gridView.setAdapter(customGridAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // Toast.makeText(getApplicationContext(),((TextView) view.findViewById(R.id.item_text)).getText(),Toast.LENGTH_SHORT).show();

                String str =   ((TextView) view.findViewById(R.id.item_text)).getText().toString();
               switch(str){
                   case "Restaurant":
                       Toast.makeText(getApplicationContext(), "Restaurants", Toast.LENGTH_SHORT).show();
                       Intent myIntent = new Intent(getApplicationContext(),Rest1.class);
                       startActivity(myIntent);

                        break;
                   case "Banks":
                       Toast.makeText(getApplicationContext(), "Banks", Toast.LENGTH_SHORT).show();
                       Intent myIntent2 = new Intent(getApplicationContext(),Banks.class);
                       startActivity(myIntent2);
                       break;

                   case "Mobile Services":
                       Toast.makeText(getApplicationContext(), "Mobile", Toast.LENGTH_SHORT).show();
                       Intent myIntent3 = new Intent(getApplicationContext(),MobileServices.class);
                       startActivity(myIntent3);
                       break;
                   case "Grocery":
                       Toast.makeText(getApplicationContext(), "Grcery", Toast.LENGTH_SHORT).show();
                       Intent myIntent4 = new Intent(getApplicationContext(),Grocery.class);
                       startActivity(myIntent4);
                       break;
                   case "Markets":
                       Toast.makeText(getApplicationContext(), "Markets", Toast.LENGTH_SHORT).show();
                       Intent myIntent5 = new Intent(getApplicationContext(),Markets.class);
                       startActivity(myIntent5);
                       break;
                   case "Cafe":
                       Toast.makeText(getApplicationContext(), "Cafe", Toast.LENGTH_SHORT).show();
                       Intent myIntent6 = new Intent(getApplicationContext(),Cafe.class);
                       startActivity(myIntent6);
                       break;

                   case "governmental":
                       Toast.makeText(getApplicationContext(), "Government", Toast.LENGTH_SHORT).show();
                       Intent myIntent7 = new Intent(getApplicationContext(),Governmental.class);
                       startActivity(myIntent7);
                       break;
                   case "Exchange":
                       Toast.makeText(getApplicationContext(), "Exchange", Toast.LENGTH_SHORT).show();
                       Intent myIntent8 = new Intent(getApplicationContext(),Exchange.class);
                       startActivity(myIntent8);
                       break;
                   case "Gym":
                       Toast.makeText(getApplicationContext(), "Gym", Toast.LENGTH_SHORT).show();
                       Intent myIntent9 = new Intent(getApplicationContext(),Gym.class);
                       startActivity(myIntent9);
                       break;


                   default:
                    Toast.makeText(getApplicationContext(), "Default", Toast.LENGTH_SHORT).show();
                   break;
               }


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
