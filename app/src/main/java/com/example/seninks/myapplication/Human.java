package com.example.seninks.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Human implements Parcelable {

    int age;
    String surname;


    public Human(int age, String surname) {
        this.age = age;
        this.surname = surname;

    }

    protected Human(Parcel in) {
        age = in.readInt();
        surname = in.readString();
    }

    public static final Creator<Human> CREATOR = new Creator<Human>() {
        @Override
        public Human createFromParcel(Parcel in) {
            return new Human(in);
        }

        @Override
        public Human[] newArray(int size) {
            return new Human[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(age);
        dest.writeString(surname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
