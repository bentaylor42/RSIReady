package com.rsiready.rsiready;

import android.app.Application;

public class EventLog extends Application{

	private boolean phemModeOn = false;
	public boolean getPhemMode()
	{
		return phemModeOn;
	}
	public void setPhemMode(boolean phemModeOn)
	{
		this.phemModeOn = phemModeOn;
	}
}
