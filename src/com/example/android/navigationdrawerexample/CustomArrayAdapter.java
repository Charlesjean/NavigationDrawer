package com.example.android.navigationdrawerexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chenduanjin on 9/12/13.
 */
public class CustomArrayAdapter extends BaseExpandableListAdapter{

    private DataModel mData;
    private Context mcontext;

    public CustomArrayAdapter(DataModel data, Context context)
    {
        this.mcontext = context;
        this.mData = data;
    }

    @Override
    public int getGroupCount() {
        return this.mData.getGroupHeaders().size();
    }

    @Override
    public int getChildrenCount(int i) {
        return ((ArrayList<RowInfo>)(this.mData.getRowInfos().get(i))).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.mData.getGroup(i);
    }

    @Override
    public Object getChild(int i, int i2) {

        return ((ArrayList<RowInfo>)(this.mData.getRowsForGroup(i))).get(i2);
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i2) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        View head = view;
        if (head == null)
        {
            LayoutInflater inflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            head = inflater.inflate(R.layout.list_group, null);
        }
        TextView text = (TextView)head.findViewById(R.id.groupname);
        text.setText(this.mData.getGroup(i).getHeadTitle());


        return head;
    }

    @Override
    public View getChildView(int i, int i2, boolean b, View view, ViewGroup viewGroup) {
        View row = view;
        if (row == null)
        {
            LayoutInflater inflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_row, null);
        }
        TextView rowtext = (TextView)row.findViewById(R.id.rowText);
        rowtext.setText(((ArrayList<RowInfo>)(this.mData.getRowsForGroup(i))).get(i2).getRowItem());

        ImageView imageview = (ImageView)row.findViewById(R.id.rowImg);
        imageview.setImageResource(((ArrayList<RowInfo>)(this.mData.getRowsForGroup(i))).get(i2).getmImg());

        return row;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
