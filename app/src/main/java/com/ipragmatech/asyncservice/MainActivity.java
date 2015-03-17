package com.ipragmatech.asyncservice;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

import com.ipragmatech.asyncservice.adapter.GithubUserListAdapter;
import com.ipragmatech.asyncservice.model.response.UserResponse;
import com.joanzapata.android.asyncservice.api.annotation.InjectService;
import com.joanzapata.android.asyncservice.api.annotation.OnMessage;
import com.joanzapata.android.asyncservice.api.internal.AsyncService;


public class MainActivity extends ActionBarActivity {


    @InjectService
    public static GithubService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        AsyncService.inject(this);
        setContentView(R.layout.activity_async);
        setTitle("Github Users");
        service.getUserAsyncWithCache();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_async, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {

            case R.id.action_refresh:
                service.getUserAsyncWithCache();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @OnMessage
    public void onUserFetched(UserResponse e) {
        GithubUserListAdapter adapter = new GithubUserListAdapter(getApplicationContext(),e.getUsers());
        ListView listView = (ListView)findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }


}
