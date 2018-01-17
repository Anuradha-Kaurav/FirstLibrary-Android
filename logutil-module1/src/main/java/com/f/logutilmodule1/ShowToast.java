package com.f.logutilmodule1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shabb on 1/17/2018.
 */

public class ShowToast {

    public static Toast getToast(Context context, String msg){

        Toast tt = new Toast(context);
        tt.makeText(context, msg, Toast.LENGTH_LONG).show();
        return tt;

    }
}
