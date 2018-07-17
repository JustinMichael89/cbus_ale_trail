package io.paperplane.techpanda.columbusaletrail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    final int TAB_COUNT = 4;

    public CategoryAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TheTrailFragment();
        } else if (position == 1) {
            return new AllBrewersFragment();
        } else if (position == 2) {
            return new BrewersRowFragment();
        } else {
            return new PartnerCompaniesFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return null;
    }
}
