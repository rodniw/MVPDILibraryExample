package com.example.rodnidev.catalog.interactor;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.entity.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookListTitleSorter implements BookListSorter {

  @SuppressWarnings("ComparatorCombinators")
  @NonNull
  @Override
  public List<Book> sortBooks(@NonNull List<Book> books) {
    List<Book> sortedBooks = new ArrayList<>(books);
    Collections.sort(sortedBooks,
        (b1, b2) -> b1.bookTitle.compareTo(b2.bookTitle));
    return sortedBooks;
  }
}
