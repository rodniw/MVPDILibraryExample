package com.example.rodnidev.catalog.view;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.example.rodnidev.catalog.application.MainApplication;

public class FavoriteBooksFragment extends BooksFragment {

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MainApplication.appComponent.inject(this);
  }
}
