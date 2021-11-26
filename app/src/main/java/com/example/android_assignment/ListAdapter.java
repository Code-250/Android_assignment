package com.example.android_assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListAdapter extends ArrayAdapter<CartItems> {

    public ListAdapter(Context context, ArrayList<CartItems> cartArrayList){

        super(context, R.layout.single_list_item,cartArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CartItems cart = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.single_list_item,parent,false);

        }
        TextView titleName = convertView.findViewById(R.id.name_txt);
        TextView priceName = convertView.findViewById(R.id.price_txt);
        TextView itemNumber = convertView.findViewById(R.id.items_txt);

        titleName.setText(cart.titleName);
        priceName.setText(cart.priceName);
        itemNumber.setText(cart.itemNumber);



        return super.getView(position, convertView, parent);
    }
}
