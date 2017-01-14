package com.beta.android.aakashresearchlabs.test;

public class wordclass {

    private int mItemName;
    private int mBg;
    private Class<?> mCls;

    public wordclass(int itemName,int bg, Class<?> cls){
        mItemName = itemName;
        mBg = bg;
        mCls = cls;
    }

    public Class<?> getmCls(){
        return mCls;
    }

    public int getmItemName(){
        return mItemName;
    }

    public int getmBg(){
        return mBg;
    }

}
