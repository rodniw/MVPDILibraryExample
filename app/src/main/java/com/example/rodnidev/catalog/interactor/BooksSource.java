package com.example.rodnidev.catalog.interactor;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.entity.Book;
import java.util.List;

public interface BooksSource {

  @NonNull
  List<Book> getBooks();
}
