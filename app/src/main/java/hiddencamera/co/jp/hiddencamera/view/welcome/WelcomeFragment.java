package hiddencamera.co.jp.hiddencamera.view.welcome;


import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import hiddencamera.co.jp.hiddencamera.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    private final static String BACKGROUND_COLOR = "background_color";

    public WelcomeFragment() {
    }

//    public static WelcomeFragment newInstance(@ColorRes int IdRes) {
    public static WelcomeFragment newInstance() {
        return new WelcomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_welcome, container, false);

        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_welcome);
        return view;

    }

}
