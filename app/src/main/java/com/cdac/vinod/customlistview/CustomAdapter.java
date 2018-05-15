package com.cdac.vinod.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by vinod on 5/14/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    ArrayList<MyPojo> arrayList;
    int resource;
    Context context;

    public CustomAdapter(Context context, int resource, ArrayList<MyPojo> arrayList) {
        super(context, resource, arrayList);
        this.context = context;
        this.arrayList = arrayList;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(resource, null, false);
        TextView textName = view.findViewById(R.id.textName);
        TextView textNumber = view.findViewById(R.id.textNumber);
        MyPojo myPojo = arrayList.get(position);
        textName.setText(myPojo.getName());
        textNumber.setText(myPojo.getNumber());
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
