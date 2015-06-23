package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;


public class ChattApp extends Application
{


	@Override
	public void onCreate() {
		Parse.initialize(this, "C086HDztXEJy4AMln4qRHQFLsucGTF9cAhyS03e0",
				"bSmC24OqS5oQJKpiiD006KDEUHXxEvYiLYKQwepu");
	}
}
