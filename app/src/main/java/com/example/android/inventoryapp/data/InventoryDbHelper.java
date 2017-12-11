package com.example.android.inventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jiwanpokharel89 on 12/2/2017.
 */

public class InventoryDbHelper extends SQLiteOpenHelper{

    private static final String LOG_TAG = InventoryDbHelper.class.getName();
    private static final String DATABASE_NAME = "inventorydb.db";
    private static final int DATABASE_VERSION = 1;

    public InventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_TABLE = "CREATE TABLE " + InventoryContract.InventoryEntry.TABLE_NAME+" ("
                + InventoryContract.InventoryEntry._ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + InventoryContract.InventoryEntry.COLUMN_INVENTORY_NAME + " TEXT NOT NULL, "
                + InventoryContract.InventoryEntry.COLUMN_INVENTORY_PRICE + " INTEGER NOT NULL, "
                + InventoryContract.InventoryEntry.COLUMN_INVENTORY_QUANTITY + " INTEGER NOT NULL, "
                + InventoryContract.InventoryEntry.COLUMN_INVENTORY_SUPPLIER + " TEXT, "
                + InventoryContract.InventoryEntry.COLUMN_INVENTORY_PICTURE +");";
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //Changes to be done in other versions..
    }
}
