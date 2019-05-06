package com.example.rodnidev.catalog.interactor;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.entity.Book;
import java.util.List;

public class BookListUseCaseImpl implements BookListUseCase {

  @NonNull
  private final BooksSource booksSource;
  @NonNull
  private final BookListSorter bookListSorter;

  public BookListUseCaseImpl(
      @NonNull BooksSource booksSource,
      @NonNull BookListSorter bookListSorter) {
    this.booksSource = booksSource;
    this.bookListSorter = bookListSorter;
  }

  @NonNull
  @Override
  public List<Book> getBooks() {
    return bookListSorter.sortBooks(booksSource.getBooks());
  }
}
