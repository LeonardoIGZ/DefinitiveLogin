package com.thuganomics.definitivelogin;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;

public class User implements Parcelable {
    private String nombre;
    private String tel;
    private String email;
    private String contrasenia;

    public User(){

    }

    public User(String nombre, String tel, String email, String contrasenia) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeString(this.tel);
        dest.writeString(this.email);
        dest.writeString(this.contrasenia);
    }

    public void readFromParcel(Parcel source) {
        this.nombre = source.readString();
        this.tel = source.readString();
        this.email = source.readString();
        this.contrasenia = source.readString();
    }

    protected User(Parcel in) {
        this.nombre = in.readString();
        this.tel = in.readString();
        this.email = in.readString();
        this.contrasenia = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
