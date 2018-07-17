package io.paperplane.techpanda.columbusaletrail;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter adapter =
                new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Show the names of the tabs
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(0).setText(R.string.tab_text_1);
            tabLayout.getTabAt(1).setText(R.string.tab_text_2);
            tabLayout.getTabAt(2).setText(R.string.tab_text_3);
            tabLayout.getTabAt(3).setText(R.string.tab_text_4);
        }
    }
}
