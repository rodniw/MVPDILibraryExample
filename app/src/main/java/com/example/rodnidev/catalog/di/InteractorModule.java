package com.example.rodnidev.catalog.di;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.interactor.BookListAuthorSorter;
import com.example.rodnidev.catalog.interactor.BookListRatingSorter;
import com.example.rodnidev.catalog.interactor.BookListTitleSorter;
import com.example.rodnidev.catalog.interactor.BookListUseCase;
import com.example.rodnidev.catalog.interactor.BookListUseCaseImpl;

class InteractorModule {

  @NonNull
  private final RepositoryModule repositoryModule;

  InteractorModule() {
    repositoryModule = new RepositoryModule();
  }

  BookListUseCase getFavoriteBooksUseCase() {
    return new BookListUseCaseImpl(
        repositoryModule.getFavoriteBooksSource(),
        new BookListTitleSorter()
    );
  }

  BookListUseCase getInternetBooksUseCase() {
    return new BookListUseCaseImpl(
        repositoryModule.getInternetBooksSource(),
        new BookListAuthorSorter()
    );
  }

  BookListUseCase getForbiddenBooksUseCase() {
    return new BookListUseCaseImpl(
        repositoryModule.getForbiddenBooksSource(),
        new BookListRatingSorter()
    );
  }
}
