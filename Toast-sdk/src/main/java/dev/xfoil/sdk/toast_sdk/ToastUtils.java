package dev.xfoil.sdk.toast_sdk;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ToastUtils {

    public void showLongToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    public void showShortToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
