package com.example.android.navigationdrawerexample;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by chenduanjin on 9/13/13.
 */
public class DataModel {

    private ArrayList<GroupHeaderInfo> groupHeaders;
    private ArrayList<ArrayList<RowInfo>> rowInfos;

    public DataModel(ArrayList<GroupHeaderInfo> groups, ArrayList<ArrayList<RowInfo>> rows)
    {
        if (groups.size() != rows.size())
        {
            Log.e("DataModel", "groups and rows must be with same demsions");
            return;
        }
        this.groupHeaders = groups;
        this.rowInfos = rows;
    }

    public ArrayList<GroupHeaderInfo> getGroupHeaders() {
        return groupHeaders;
    }

    public void setGroupHeaders(ArrayList<GroupHeaderInfo> groupHeaders) {
        this.groupHeaders = groupHeaders;
    }

    public ArrayList<ArrayList<RowInfo>> getRowInfos() {
        return rowInfos;
    }

    public void setRowInfos(ArrayList<ArrayList<RowInfo>> rowInfos) {
        this.rowInfos = rowInfos;
    }

    public GroupHeaderInfo getGroup(int index)//group index
    {
        if (this.groupHeaders.size() >= index + 1)
        {
            return this.groupHeaders.get(index);
        }
        return null;
    }

    public Object getRowsForGroup(int index)
    {
        if (this.rowInfos.size() >= index + 1)
        {
            return this.rowInfos.get(index);
        }
        return  null;
    }

}
