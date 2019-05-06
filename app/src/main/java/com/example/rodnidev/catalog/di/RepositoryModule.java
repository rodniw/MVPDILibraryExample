package com.example.rodnidev.catalog.di;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.interactor.BooksSource;
import com.example.rodnidev.catalog.repository.DarkNetBooksSource;
import com.example.rodnidev.catalog.repository.FavoritesBooksSource;
import com.example.rodnidev.catalog.repository.NetworkBooksSource;

class RepositoryModule {

  @NonNull
  BooksSource getFavoriteBooksSource() {
    return new FavoritesBooksSource();
  }

  @NonNull
  BooksSource getInternetBooksSource() {
    return new NetworkBooksSource();
  }

  @NonNull
  BooksSource getForbiddenBooksSource() {
    return new DarkNetBooksSource();
  }
}
