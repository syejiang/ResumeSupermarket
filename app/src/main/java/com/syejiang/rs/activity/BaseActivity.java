package com.syejiang.rs.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.syejiang.rs.R;


public class BaseActivity extends ActionBarActivity {

    /**
     * 设置标题和图标
     */

    protected void setActionBar(int title){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setIcon(R.drawable.ic_launcher);
        actionBar.setTitle(title);
    }
}
