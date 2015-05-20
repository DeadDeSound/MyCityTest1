package com.example.nezar.myamakentest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nezar on 5/19/2015.
 */
public class RestAdapter extends ArrayAdapter<RestDataModel> {

    private Context context;
    private int resource;
    private RestDataModel[] restDataModels;

    private LayoutInflater inflater;

    public RestAdapter(Context context, int resource, RestDataModel[] objects) {
        super(context, resource, objects);

        this.context=context;
        this.resource=resource;
        this.restDataModels=objects;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(resource,parent,false);
        TextView restName = (TextView) convertView.findViewById(R.id.rest_name);
        TextView restSubname = (TextView) convertView.findViewById(R.id.rest_subname);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

          RestDataModel restmodel  = restDataModels[position];
            restName.setText(restmodel.getName());
            restSubname.setText(restmodel.getSubname());
            imageView.setImageResource(restmodel.getImageResId());

                return convertView;


    }
}//class
