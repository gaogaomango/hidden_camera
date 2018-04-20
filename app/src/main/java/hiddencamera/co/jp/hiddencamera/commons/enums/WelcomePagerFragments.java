package hiddencamera.co.jp.hiddencamera.commons.enums;

import android.support.v4.app.Fragment;

import hiddencamera.co.jp.hiddencamera.R;
import hiddencamera.co.jp.hiddencamera.view.camera.CameraFragment;
import hiddencamera.co.jp.hiddencamera.view.welcome.WelcomeFragment;

public enum WelcomePagerFragments {
    CAMERA(0, R.string.title_camera, R.layout.activity_camera, CameraFragment.newInstance()),
    VIDEO(1, R.string.title_video, R.layout.activity_camera, WelcomeFragment.newInstance()),
    CAMER2(2, R.string.title_camera, R.layout.activity_camera, WelcomeFragment.newInstance());

    private int mOrder;
    private int mTitleResId;
    private int mLayoutResId;
    private Fragment mFragment;

    WelcomePagerFragments(int order, int titleResId, int layoutResId, Fragment fragment) {
        mOrder = order;
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
        mFragment = fragment;
    }

    public static WelcomePagerFragments getByValue(int value) {
        for (WelcomePagerFragments t : WelcomePagerFragments.values()) {
            if (t.mOrder == value) {
                return t;
            }
        }
        return null;
    }


    public int getOrder() {
        return mOrder;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

    public Fragment getFragment() {
        return mFragment;
    }

    public static Fragment getFragmentByItemId(int item) {
        return getByValue(item).getFragment();
    }

}
