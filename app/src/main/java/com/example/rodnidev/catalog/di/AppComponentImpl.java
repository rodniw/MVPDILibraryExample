package com.example.rodnidev.catalog.di;

import androidx.annotation.NonNull;
import com.example.rodnidev.catalog.view.FavoriteBooksFragment;
import com.example.rodnidev.catalog.view.ForbiddenBooksFragment;
import com.example.rodnidev.catalog.view.InternetBooksFragment;

public class AppComponentImpl implements AppComponent {

  @NonNull
  private final PresenterModule presenterModule;

  public AppComponentImpl() {
    this.presenterModule = new PresenterModule();
  }

  @Override
  public void inject(FavoriteBooksFragment favoriteBooksFragment) {
    favoriteBooksFragment.setBookListPresenter(
        presenterModule.getFavoriteBooksPresenter()
    );
  }

  @Override
  public void inject(InternetBooksFragment internetBooksFragment) {
    internetBooksFragment.setBookListPresenter(
        presenterModule.getInternetBooksPresenter()
    );
  }

  @Override
  public void inject(ForbiddenBooksFragment forbiddenBooksFragment) {
    forbiddenBooksFragment.setBookListPresenter(
        presenterModule.getForbiddenBooksPresenter()
    );
  }
}
