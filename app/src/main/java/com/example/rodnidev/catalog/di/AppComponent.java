package com.example.rodnidev.catalog.di;

import com.example.rodnidev.catalog.view.FavoriteBooksFragment;
import com.example.rodnidev.catalog.view.ForbiddenBooksFragment;
import com.example.rodnidev.catalog.view.InternetBooksFragment;

public interface AppComponent {

  void inject(FavoriteBooksFragment favoriteBooksFragment);

  void inject(InternetBooksFragment internetBooksFragment);

  void inject(ForbiddenBooksFragment forbiddenBooksFragment);
}
