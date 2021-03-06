package com.wheresapp.bussiness.calls.factory.imp;

import android.content.Context;

import com.wheresapp.bussiness.calls.ASCalls;
import com.wheresapp.bussiness.calls.factory.ASCallsFactory;
import com.wheresapp.bussiness.calls.imp.ASCallsImp;

/**
 * Created by Victorma on 26/11/2014.
 */
public class ASCallsFactoryImp extends ASCallsFactory {
    @Override
    public ASCalls getInstanceASCalls(Context context) {
        return new ASCallsImp(context);
    }
}
