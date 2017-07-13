package com.adida.aka.remoteboundservicereceive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.adida.aka.common.ISimpleCalcu;


/**
 * Created by Aka on 7/13/2017.
 */

public class SumService extends Service {
    private ISimpleCalcu mISimpleCalcu = new ISimpleCalcu.Stub() {
        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }
    };
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mISimpleCalcu.asBinder();
    }
}
