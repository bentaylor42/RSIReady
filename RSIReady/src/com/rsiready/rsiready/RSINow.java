package com.rsiready.rsiready;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RSINow extends Activity implements TabListener {
	
	boolean phemActive = false;
	int screenSelected = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rsinow);
		
		// Changes the colour of the action bar + adds tabs
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));
		
		// Loads singletons
		EventLog eventlog = (EventLog) getApplicationContext();
		phemActive = eventlog.getPhemMode();
		
		/*
		if (phemActive){
			View view = this.getWindow().getDecorView();
			view.setBackgroundColor(getResources().getColor(R.color.lightGrey));
		}
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rsinow, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent intent = new Intent (this, SettingsMenu.class);
			// Insert any additional code to be executed before moving on, here
			startActivity (intent);
			return true;
		}
		if (id == R.id.tools) {
			Intent intent = new Intent (this, ToolsMenu.class);
			// Insert any additional code to be executed before moving on, here
			startActivity (intent);
			return true;
		}
		if (id == R.id.emergency) {
			Intent intent = new Intent (this, EmergencyMenu.class);
			// Insert any additional code to be executed before moving on, here
			startActivity (intent);
			return true;
		}
		if (id == R.id.rsi){
			Intent intent = new Intent (this, RSINow.class);
			// Insert any additional code to be executed before moving on, here
			startActivity (intent);
			return true;
		}
		if (id == R.id.home_button){
			Intent intent = new Intent (this, MainActivity.class);
			// Insert any additional code to be executed before moving on, here
			startActivity (intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
