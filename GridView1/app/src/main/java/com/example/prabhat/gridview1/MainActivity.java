package com.example.prabhat.gridview1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView mygrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mygrid = (GridView) findViewById(R.id.gridview);
        mygrid.setAdapter(new VivzAdapter(this));
        mygrid.setOnItemClickListener();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
Intent intent=new Intent(this,dialog.class);
startActivity(intent);
    }
}
class country{
    int imageid;
    String countryname;
    country(int imageid,String countryname)
    {
        this.imageid=imageid;
        this.countryname=countryname;
    }
}
class VivzAdapter extends BaseAdapter{
ArrayList<country> list;
Context context;
    VivzAdapter(Context context){
    list=new ArrayList<country>();
    this.context=context;
    Resources res=context.getResources();
    String[] countrynames=res.getStringArray(R.array.countrynames);
    int[] image={R.drawable.australia,R.drawable.germany,R.drawable.india,R.drawable.russia,R.drawable.spain,R.drawable.switzerland,R.drawable.yemen};
    for(int i=0;i<7;i++)
    {
        country tempcountry=new country(image[i],countrynames[i]);
        list.add(tempcountry);
    }

}
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    class ViewHolder{
    ImageView mycountry;
    ViewHolder(View v){
        mycountry= v.findViewById(R.id.imageView);
        }
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {
        View row=View;
        ViewHolder holder=null;
        if(row==null){
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row=inflater.inflate(R.layout.appearance,viewGroup,false);
        holder=new ViewHolder(row);
        row.setTag(holder);}
        else{
            holder=(ViewHolder)row.getTag();
        }
        country temp=list.get(i);
        holder.mycountry.setImageResource(temp.imageid);
        return row;
    }
}
