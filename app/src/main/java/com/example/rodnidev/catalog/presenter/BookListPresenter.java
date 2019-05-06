package com.example.rodnidev.catalog.presenter;

import androidx.annotation.NonNull;

public interface BookListPresenter {

  void attachView(@NonNull BooksView booksView);

  void detachView();

  void loadBooks();
}
