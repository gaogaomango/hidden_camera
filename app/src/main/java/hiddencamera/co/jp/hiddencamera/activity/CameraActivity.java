package hiddencamera.co.jp.hiddencamera.activity;

import android.os.Bundle;

import hiddencamera.co.jp.hiddencamera.R;
import hiddencamera.co.jp.hiddencamera.view.camera.CameraFragment;

public class CameraActivity extends AbstractHCActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())
                    .commit();
        }

    }
}
