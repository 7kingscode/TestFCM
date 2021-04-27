package com.aks.testingfcm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.io.Serializable;


public class TestingMww implements Serializable {
   int no;
   String str;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

class TestingAww implements Parcelable {
    int no;
    String str;

    protected TestingAww(Parcel in) {
        no = in.readInt();
        str = in.readString();
    }

    public static final Creator<TestingAww> CREATOR = new Creator<TestingAww>() {
        @Override
        public TestingAww createFromParcel(Parcel in) {
            return new TestingAww(in);
        }

        @Override
        public TestingAww[] newArray(int size) {
            return new TestingAww[size];
        }
    };

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(no);
        dest.writeString(str);
    }
}

class Testing {
    String TAG = "TestingMww";


    public static void main(String[] args) {
        printMeth();
    }

    static void printMeth() {



    }
}