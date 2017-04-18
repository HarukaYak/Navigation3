package br.com.android.navigation;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, SearchView.OnQueryTextListener {

    protected Toolbar toolbar;
    private int mSelectedPosition;
    private DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;
    protected TextView nameUserLogged;
    protected TextView emailUserLogged;

    private static final String SELECTED_MENU_ITEM = "menuItem";


    private static NavigationView navigationView = null;
//    protected UserSessionPreference prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        prefs = new UserSessionPreference(this);

//        if (prefs.isFirstTime()) {
//            startActivity(new Intent(this, LoginActivity.class));
//            finish();
//        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        if (isSmartphone()) {
            mDrawerLayout = (DrawerLayout) findViewById(R.id.nav_drawer);

            mDrawerToggle = new ActionBarDrawerToggle(
                    this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
            mDrawerLayout.setDrawerListener(mDrawerToggle);
            mDrawerToggle.syncState();
        }

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        View header = navigationView.getHeaderView(0);
        nameUserLogged = (TextView) header.findViewById(R.id.name_user_logged);
        emailUserLogged = (TextView) header.findViewById(R.id.email_user_logged);


//        if (!prefs.isFirstTime()) {
//            nameUserLogged.setText(prefs.getName());
//            emailUserLogged.setText(prefs.getEmail());
//        }

        if (savedInstanceState == null) {
            mSelectedPosition = R.id.nav_drawer_explore;
        } else {
            mSelectedPosition = savedInstanceState.getInt(SELECTED_MENU_ITEM);
        }


        //selectOptionsMenu(navigationView.getMenu().findItem(mSelectedPosition));


        findMenuItem(mSelectedPosition);


    }

    public void findMenuItem(int item) {
        selectOptionsMenu(navigationView.getMenu().findItem(item));
    }


    public static void setNavSelected(int resId) {
        navigationView.setCheckedItem(resId);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SELECTED_MENU_ITEM, mSelectedPosition);
    }

    private boolean isTablet() {
        return getResources().getBoolean(R.bool.tablet);
    }

    private boolean isSmartphone() {
        return getResources().getBoolean(R.bool.smartphone);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        mDrawerToggle.syncState();
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        selectOptionsMenu(item);
        return true;
    }


    public void selectOptionsMenu(MenuItem menuItem) {
        mSelectedPosition = menuItem.getItemId();

        Fragment fragment;

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (mSelectedPosition) {
            case R.id.nav_drawer_explore:
//                fragment = ExploreFragment.newInstance();
//                fragmentTransaction.replace(R.id.main_layout_container, fragment);
//                fragmentTransaction.commit();
//                break;
//            case R.id.nav_drawer_eventos:
//                fragment = EventosFragment.newInstance();
//                fragmentTransaction.replace(R.id.main_layout_container, fragment);
//                fragmentTransaction.commit();
//                break;
//            case R.id.nav_drawer_disciplina:
//                fragment = DisciplinasFragment.newInstance();
//                fragmentTransaction.replace(R.id.main_layout_container, fragment);
//                fragmentTransaction.commit();
//                break;
//            case R.id.nav_drawer_notas:
//                fragment = NotasFragment.newInstance();
//                fragmentTransaction.replace(R.id.main_layout_container, fragment);
//                fragmentTransaction.commit();
//                break;
//            case R.id.nav_drawer_curso:
//                startActivity(new Intent(this, CursoActivity.class));
//                break;
//
//            case R.id.nav_drawer_config:
//                startActivity(new Intent(this, SettingsActivity.class));
//                break;

        }

        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());

        if (isSmartphone()) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("BUSCA", query);
        Toast.makeText(this, "BUSCA ==>" + query, Toast.LENGTH_LONG).show();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
