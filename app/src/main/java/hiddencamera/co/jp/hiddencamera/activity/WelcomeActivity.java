package hiddencamera.co.jp.hiddencamera.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import hiddencamera.co.jp.hiddencamera.R;
import hiddencamera.co.jp.hiddencamera.view.welcome.WelcomePagerAdapter;

public class WelcomeActivity extends AbstractHCActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setViews();
    }

    private void setViews() {
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = findViewById(R.id.welcome_viewpager);
        WelcomePagerAdapter adapter = new WelcomePagerAdapter(this, manager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
