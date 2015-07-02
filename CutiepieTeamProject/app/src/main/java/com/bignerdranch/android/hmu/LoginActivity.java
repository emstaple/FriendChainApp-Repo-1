package com.bignerdranch.android.hmu;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.facebook.FacebookSdk;

/**
 * Created by emstaple on 6/30/15.
 */
public class LoginActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return LoginFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
