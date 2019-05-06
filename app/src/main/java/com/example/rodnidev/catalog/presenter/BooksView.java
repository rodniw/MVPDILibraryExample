package com.example.rodnidev.catalog.presenter;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.entity.Book;
import java.util.List;

public interface BooksView {

  void showBooks(@NonNull List<Book> books);
}
