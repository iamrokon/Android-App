package carenbb.com.hackathon.emotion.joton;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class HomeWorkerActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_worker);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar7);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

       /* Button btnReg =(Button) findViewById(R.id.button51);
        Button btnLog =(Button) findViewById(R.id.button52);
        btnReg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent i=new Intent(getApplicationContext(),MomRegistationActivity.class);
                startActivity(i);
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i=new Intent(getApplicationContext(),WorkerRegistrationActivity.class);
            }
        });*/

        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view7);
        if(navigationView != null)
        {
            setupDrawerContent(navigationView);
        }

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager);
        }

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new InfoChildListFragment(), "জরুরী বার্তাবলী");
        adapter.addFragment(new InfoChildListFragment(), "সব মায়ের বার্তাবলী");
        adapter.addFragment(new InfoListFragment(), "সকল মায়ের তথ্যাবলী");
        viewPager.setAdapter(adapter);
    }

    private void setupDrawerContent(NavigationView navigationView)
    {
        navigationView.setNavigationItemSelectedListener(

                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        int id = menuItem.getItemId();
                      //  menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        switch(id)
                        {
                            case R.id.nav_register:

                                Intent i = new Intent(getApplicationContext(), MomRegistationActivity.class);
                                startActivity(i);
                        }
                        return true;
                    }
                });
    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public Fragment getItem(int position) {
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

}
