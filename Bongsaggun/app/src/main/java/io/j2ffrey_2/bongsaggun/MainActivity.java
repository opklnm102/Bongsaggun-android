package io.j2ffrey_2.bongsaggun;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.ActionBar;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import android.util.Log;

import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

import io.j2ffrey_2.bongsaggun.homelist.HomeFragment;


public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.toolbar_main)
    Toolbar mToolbar;
    @Bind(R.id.toolbar_title)
    TextView tvTitle;
    @Bind(R.id.drawer)
    DrawerLayout mDrawerLayout;
//    @Bind(R.id.nav_view)
//    NavigationView nV;

    ActionBarDrawerToggle toogle;
    @Bind(R.id.tabs)
    TabLayout mTabLayout;
    @Bind(R.id.viewPager)
    ViewPager mViewPager;
    PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
//            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayShowTitleEnabled(false);
//            ab.setDisplayShowHomeEnabled(true);
        }

        tvTitle.setText("봉사꾼");

//        if (nV != null) {
//            setUpDrawerContent(nV);
//        }

//        toogle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.app_name, R.string.app_name);
//        toogle.setDrawerIndicatorEnabled(true);
//        mDrawerLayout.setDrawerListener(toogle);

        if (mViewPager != null) {
            setUpViewPager(mViewPager);
        }
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();

//        try {
//            NetworkManager.getInstance(this).getSchoolList();
//            NetworkManager.getInstance(this).getRegionList();
//            NetworkManager.getInstance(this).getTimeList();
//            NetworkManager.getInstance(this).getCategoryList();
//            NetworkManager.getInstance(this).getAllVoluntaryList();
//            NetworkManager.getInstance(this).getCalendarList(2015,11);
//
//
//            Cursor c = getContentResolver().query(BongsaggunContract.VoluntaryEntry.CONTENT_URI, null, null, null, null);
//
//            //로그에 결과 출력
//            while (c.moveToNext()) {
//                Log.i(TAG, " " + c.getInt(0) +
//                        c.getInt(1) + " " + c.getString(2) + " " + c.getString(6) + " " + c.getString(7) + " " + c.getString(8) + " " + c.getString(9));
//            }
//
//
////            printLogContactData(getContactCursor());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

//    private Cursor getContactCursor() {
//
//        //연락처 프로바이더에 접근하는 URI
//        Uri contactUri = ContactsContract.Contacts.CONTENT_URI;
//
//        String[] projection = new String[]{
//                ContactsContract.Contacts._ID,
//                ContactsContract.Contacts.DISPLAY_NAME
//        };
//
//        Cursor contactCursor = getContentResolver().query(contactUri, projection, null, null, ContactsContract.Contacts.DISPLAY_NAME + " asc");
//
//        if (contactCursor == null) {
//            Log.e(TAG, "연결 실패");
//            return null;
//        }
//        return contactCursor;
//    }

//    void printLogContactData(Cursor contactData) {
//        int idIdx;
//        int displayNameIdx;
//
//        if (contactData == null) {
//            Log.e(TAG, "연결 실페");
//            return;
//        } else if (contactData.getCount() < 1) {
//            Log.e(TAG, "매치되는 Provider 없음");
//        } else {
//            //idIdx와 displayNameIdx의 값을 구한다.
//            idIdx = contactData.getColumnIndex(ContactsContract.Contacts._ID);
//            displayNameIdx = contactData.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
//
//            //로그에 결과 출력
//            while (contactData.moveToNext()) {
//                Log.i(TAG, "ID: " + contactData.getLong(idIdx) +
//                        contactData.getString(displayNameIdx));
//            }
//        }
//    }

    private void setUpDrawerContent(NavigationView navigationView) {

    }

    private void setUpViewPager(ViewPager viewPager) {
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mPagerAdapter.addFragment(new HomeFragment(), "홈");
        mPagerAdapter.addFragment(new CalendarFragment(), "캘린더");
        mPagerAdapter.addFragment(new ZzimFragment(), "찜");
        mPagerAdapter.addFragment(new MyPageFragment(), "마이페이지");
        viewPager.setAdapter(mPagerAdapter);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
//        toogle.syncState();
    }

    static class PagerAdapter extends FragmentPagerAdapter {
        private final ArrayList<android.support.v4.app.Fragment> mFragments = new ArrayList<>();
        private final ArrayList<String> mFragmentTitles = new ArrayList<>();

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(android.support.v4.app.Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_search) {
            Log.e(TAG, " search");

            Intent intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
