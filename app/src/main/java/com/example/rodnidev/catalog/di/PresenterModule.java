package com.example.rodnidev.catalog.di;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.presenter.BookListPresenter;
import com.example.rodnidev.catalog.presenter.BookListPresenterImpl;

class PresenterModule {

  @NonNull
  private final InteractorModule interactorModule;

  PresenterModule() {
    interactorModule = new InteractorModule();
  }

  BookListPresenter getFavoriteBooksPresenter() {
    return new BookListPresenterImpl(
        interactorModule.getFavoriteBooksUseCase()
    );
  }

  BookListPresenter getInternetBooksPresenter() {
    return new BookListPresenterImpl(
        interactorModule.getInternetBooksUseCase()
    );
  }

  BookListPresenter getForbiddenBooksPresenter() {
    return new BookListPresenterImpl(
        interactorModule.getForbiddenBooksUseCase()
    );
  }
}
