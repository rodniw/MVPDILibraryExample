package com.example.rodnidev.catalog.view;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.example.rodnidev.catalog.R;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(
        getSupportFragmentManager());

    ViewPager mViewPager = findViewById(R.id.container);
    mViewPager.setAdapter(mSectionsPagerAdapter);
  }

  class SectionsPagerAdapter extends FragmentPagerAdapter {

    SectionsPagerAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      switch (position % 3) {
        case 0: return new FavoriteBooksFragment();
        case 1: return new InternetBooksFragment();
        case 2: return new ForbiddenBooksFragment();
      }
      return new BooksFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      return getResources().getStringArray(R.array.books_sources)[position];
    }

    @Override
    public int getCount() {
      return 3;
    }
  }
}
