package com.example.rodnidev.catalog.application;

import android.app.Application;
import com.example.rodnidev.catalog.di.AppComponent;
import com.example.rodnidev.catalog.di.AppComponentImpl;

public class MainApplication extends Application {

  public static AppComponent appComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    appComponent = new AppComponentImpl();
  }
}
