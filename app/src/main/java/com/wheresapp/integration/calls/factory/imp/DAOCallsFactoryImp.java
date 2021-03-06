package com.wheresapp.integration.calls.factory.imp;

import android.content.Context;

import com.wheresapp.integration.calls.DAOCalls;
import com.wheresapp.integration.calls.factory.DAOCallsFactory;
import com.wheresapp.integration.calls.imp.DAOCallsImp;

/**
 * Created by Victorma on 25/11/2014.
 */
public class DAOCallsFactoryImp extends DAOCallsFactory {

    @Override
    public DAOCalls getInstanceDAOCalls(Context context) {
        return new DAOCallsImp(context);
    }
}
