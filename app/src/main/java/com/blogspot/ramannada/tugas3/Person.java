package com.blogspot.ramannada.tugas3;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ramannada on 10/18/2017.
 */

public class Person implements Parcelable {
    private String name;
    private String phoneNumber;
    private String email;
    private String username;

    public Person(String name, String username, String email, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override
    public String toString() {
        return  "name=" + name + '\n' +
                "username= " + username + '\n' +
                "phoneNumber= " + phoneNumber + '\n' +
                "email= " + email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.email);
        dest.writeString(this.username);
    }

    protected Person(Parcel in) {
        this.name = in.readString();
        this.phoneNumber = in.readString();
        this.email = in.readString();
        this.username = in.readString();
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
