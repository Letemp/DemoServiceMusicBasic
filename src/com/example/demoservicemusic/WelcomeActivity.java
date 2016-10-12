package com.example.demoservicemusic;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		doChangeActivity();
	}
	

	/**
	 * ���ַ�ʽ�·�������Service֮��û�й�������Service��һֱ�ں�ִ̨�У���ʹ����startService�Ľ��̽����ˡ�
	 * Service�޷�������߽���ͨ�š����ݽ�����������ִ�е�һ����������û�з��ؽ����
	 */
	private void doServiceMethodOne(){
		final Intent intent=new Intent();
		intent.setAction("com.example.demoservicemusic.doService");
		startService(intent);
		
		//ֹͣService
		//stopService(intent);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

	private void doChangeActivity(){
		Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
		this.startActivity(intent);
	}
}
