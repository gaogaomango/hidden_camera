package hiddencamera.co.jp.hiddencamera.activity;

import android.os.Bundle;
import android.widget.Button;

import hiddencamera.co.jp.hiddencamera.R;

public class WelcomeActivity extends AbstractHCActivity {

    Bundle mBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button cameraBtn = (Button) findViewById(R.id.open_camera);
        Button videoBtn = (Button) findViewById(R.id.open_video);

//        cameraBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null == savedInstanceState) {
//                    getSupportFragmentManager().beginTransaction()
//                            .replace(R.id.container, Camera2BasicFragment.newInstance())
//                            .commit();
//                }
//            }
//        });


    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
