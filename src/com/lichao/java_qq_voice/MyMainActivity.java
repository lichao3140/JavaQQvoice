package com.lichao.java_qq_voice;

import java.io.File;
import org.fmod.FMOD;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;

/**
 * 仿QQ变声
 * @author LiChao
 *
 */
public class MyMainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
        
        FMOD.init(this);
    }

    public void mFix(View view){
    	String path = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "jason.wav";
		Log.d("lichao", "mFix"+path);
		switch (view.getId()) {
		case R.id.btn_normal:
			EffectUtils.fix(path, EffectUtils.MODE_NORMAL);
			break;

		case R.id.btn_luoli:
			EffectUtils.fix(path, EffectUtils.MODE_LUOLI);
			break;	
			
		case R.id.btn_dashu:
			EffectUtils.fix(path, EffectUtils.MODE_DASHU);
			break;	
			
		case R.id.btn_jingsong:
			EffectUtils.fix(path, EffectUtils.MODE_JINGSONG);
			break;	
			
		case R.id.btn_gaoguai:
			EffectUtils.fix(path, EffectUtils.MODE_GAOGUAI);
			break;	
			
		case R.id.btn_kongling:
			EffectUtils.fix(path, EffectUtils.MODE_KONGLING);
			break;
		default:
			break;
		}
    }
	
    @Override
	protected void onDestroy() {
		super.onDestroy();
		FMOD.close();
	}
}
