package hiddencamera.co.jp.hiddencamera.view.welcome;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import hiddencamera.co.jp.hiddencamera.commons.enums.WelcomePagerFragments;

public class WelcomePagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public WelcomePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int i) {
        return WelcomePagerFragments.getFragmentByItemId(i);
    }

    @Override
    public int getCount() {
        return WelcomePagerFragments.values().length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(mContext == null) {
            return "default";
        } else {
            return mContext.getString(WelcomePagerFragments.getByValue(position).getTitleResId());
        }
    }
}
