package com.wheresapp.integration.contacts.imp;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.ContactsContract;

import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.wheresapp.integration.contacts.DAOContacts;
import com.wheresapp.modelTEMP.Contact;

import java.util.List;

/**
 * Created by Victorma on 25/11/2014.
 */
/*
public class DAOContactsSyncImp implements DAOContacts {
    @Override
    public boolean create(Contact contact) {
        return contact.save() != 0;
    }

    @Override
    public Contact read(Contact contact) {
        List<Contact> c = new Select()
                .from(Contact.class)
                .where("telephone LIKE '"+contact.getTelephone()+"'")
                .limit(1).execute();
        return (c.size() > 0)? c.get(0): null;
    }

    @Override
    public boolean update(Contact contact) {

        Contact c = this.read(contact);

        c.setName(contact.getName());
        c.setFavourite(contact.getFavourite());
        c.setLastSeen(contact.getLastSeen());
        c.setState(contact.getState());
        c.setNickname(contact.getNickname());

        Long id = c.save();

        return id != 0;
    }

    @Override
    public boolean delete(Contact contact) {
        boolean r = false;
        Contact c = this.read(contact);
        if(c!=null){
            c.delete();
            r = true;
        }
        return r;
    }

    @Override
    public List<Contact> discover(Contact contact, int limit, int page) {

        Uri rawContactUri = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(ContactsContract.RawContacts.ACCOUNT_NAME, account.name).appendQueryParameter(
                ContactsContract.RawContacts.ACCOUNT_TYPE, account.type).build();
        Cursor c1 = mContentResolver.query(rawContactUri, new String[] { BaseColumns._ID, ContactsContract.RawContacts.SYNC1  }, null, null, null);
        while (c1.moveToNext()) {
            SyncEntry entry = new SyncEntry();
            entry.raw_id = c1.getLong(0);
            entry.user_id = c1.getLong(1);
            localContacts.put(entry.user_id.toString(), entry);
        }

        From f = new Select().from(Contact.class);

        if(contact.getTelephone()!=null)
            f.where("Telephone LIKE '"+contact.getTelephone()+"'");

        if(contact.getNickname()!=null)
            f.where("Nickname LIKE '%"+contact.getNickname()+"%'");

        if(contact.getName()!=null)
            f.where("Name LIKE '%"+contact.getName()+"%'");

        if(contact.getState()!=null)
            f.where("State = "+contact.getState()+"");

        if(contact.getFavourite()!=null)
            f.where("Favourite = "+contact.getFavourite()+"");

        if(contact.getLastSeen()!=null)
            f.where("LastSeen = "+contact.getLastSeen()+"");

        f.orderBy("Name DESC");
        if(limit>0) {
            f.limit(limit);
            if (page >= 0)
                f.offset(limit * page);
        }

        return f.execute();
    }

    @Override
    public List<Contact> discover(Contact contact) {
        return discover(contact,-1,-1);
    }
}
*/