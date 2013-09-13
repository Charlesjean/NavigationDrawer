package com.example.android.navigationdrawerexample;

import android.*;
import android.R;
import android.graphics.drawable.Drawable;

/**
 * Created by chenduanjin on 9/13/13.
 */
public class RowInfo {
    private Drawable mImg;
    private String rowItem;

    public RowInfo(Drawable mImg, String rowItem) {
        this.mImg = mImg;
        this.rowItem = rowItem;
    }


    public Drawable getmImg() {
        return mImg;
    }

    public void setmImg(Drawable mImg) {
        this.mImg = mImg;
    }

    public String getRowItem() {
        return rowItem;
    }

    public void setRowItem(String rowItem) {
        this.rowItem = rowItem;
    }
}
