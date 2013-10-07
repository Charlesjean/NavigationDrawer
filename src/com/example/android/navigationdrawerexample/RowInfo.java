package com.example.android.navigationdrawerexample;

import android.*;
import android.R;
import android.graphics.drawable.Drawable;

/**
 * Created by chenduanjin on 9/13/13.
 */
public class RowInfo {
    private int mImg;
    private String rowItem;

    public RowInfo(int mImg, String rowItem) {
        this.mImg = mImg;
        this.rowItem = rowItem;
    }


    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }

    public String getRowItem() {
        return rowItem;
    }

    public void setRowItem(String rowItem) {
        this.rowItem = rowItem;
    }
}
