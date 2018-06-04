package com.example.javier.contentprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import java.sql.SQLClientInfoException;

public class Contentpro extends SQLiteOpenHelper {

    String sqlCreate = "Create table cliente" + "(_id integer primary key autoincrement, " + "nombre text, " + "telefono text, " + "email text)";

    public Contentpro(Context context, String nombre, SQLiteDatabase.CursorFactory factory, int version){

        super(context, nombre, factory, version);
}

    @Override
public void onCreate(SQLiteDatabase db){
    db.execSQL(sqlCreate);

    for(int i=1; i<=15; i++)
    }

        //Ejemplo de datos
        String nombre = "Cliente" + i;
        String telefono = "900-123-00" + i;
        String correo = "email" + i + "@mail.com";

        db.execSQL("Insert into Clientes" (nombre, telefono, correo)"" + "Values ('"+ nombre + "','" + telefono + "','" + correo + "')");
}
