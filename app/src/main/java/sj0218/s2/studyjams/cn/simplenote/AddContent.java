package sj0218.s2.studyjams.cn.simplenote;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Salmon on 2017/6/12.
 */

public class AddContent extends Activity {
    private String val;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcontent);
        val=getIntent().getStringExtra("flag");
    }
}
