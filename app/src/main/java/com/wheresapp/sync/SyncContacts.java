package com.wheresapp.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OperationCanceledException;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
import android.util.Log;

import com.wheresapp.R;
import com.wheresapp.SignUpActivity;
import com.wheresapp.bussiness.contacts.ASContacts;
import com.wheresapp.bussiness.contacts.factory.ASContactsFactory;
import com.wheresapp.modelTEMP.Contact;
import com.wheresapp.server.ServerAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sergio on 05/12/2014.
 */
public class SyncContacts {
    private String TAG = "SyncContacts";
    private Account account;
    private Context context;

    public SyncContacts(Context context) {
        this.context = context;

        /*
        authority = "com.android.contacts";
        myId = getUserId();*/
    }



    public void performSync() throws OperationCanceledException {

        ASContacts as = ASContactsFactory.getInstance().getInstanceASContacts(context);
        as.updateContactList();
    }

/*
    private String getUserId() {
        String userId = null;
        final SharedPreferences prefs = context.getSharedPreferences(
                SignUpActivity.class.getSimpleName(), Context.MODE_PRIVATE);
        userId = prefs.getString(SignUpActivity.PROPERTY_USER_ID,"");
        if (userId=="") {
            Log.i(TAG, "Registration not found.");
            return null;
        }
        return userId;
    }*/
}
