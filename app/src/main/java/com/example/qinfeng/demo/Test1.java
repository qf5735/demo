package com.example.qinfeng.demo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 *
 * 描述：   
 * 创建人：Qin.Feng
 * 创建时间：2017/6/26 19:07
 * 修改人：Qin.Feng
 * 修改时间：2017/6/26 19:07
 * 修改备注：
 */ 
public class Test1<T> implements Parcelable,Serializable{
    private String a;

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
    }

    public Test1() {
    }


    public String s(String a){
        return  "()";
    }

    protected Test1(Parcel in) {
        this.a = in.readString();
    }

    public static final Parcelable.Creator<Test1> CREATOR = new Parcelable.Creator<Test1>() {
        @Override
        public Test1 createFromParcel(Parcel source) {
            return new Test1(source);
        }

        @Override
        public Test1[] newArray(int size) {
            return new Test1[size];
        }
    };
}
