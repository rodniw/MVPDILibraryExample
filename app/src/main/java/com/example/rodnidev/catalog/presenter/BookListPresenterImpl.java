package com.example.rodnidev.catalog.presenter;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.rodnidev.catalog.interactor.BookListUseCase;

public class BookListPresenterImpl implements BookListPresenter {

  @NonNull
  private final BookListUseCase bookListUseCase;
  @Nullable
  private BooksView booksView;

  public BookListPresenterImpl(@NonNull BookListUseCase bookListUseCase) {
    this.bookListUseCase = bookListUseCase;
  }

  @Override
  public void attachView(@NonNull BooksView booksView) {
    this.booksView = booksView;
    loadBooks();
  }

  @Override
  public void detachView() {
    this.booksView = null;
  }

  @Override
  public void loadBooks() {
    new Handler().postDelayed(() -> {
      if (booksView != null) {
        booksView.showBooks(bookListUseCase.getBooks());
      }
    }, 2000);
  }
}
