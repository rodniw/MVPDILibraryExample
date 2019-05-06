package com.example.rodnidev.catalog.interactor;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.entity.Book;
import java.util.List;

public interface BookListSorter {

  @NonNull
  List<Book> sortBooks(@NonNull List<Book> books);
}
