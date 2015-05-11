package com.example.nju;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity; 
import android.content.Intent;

public class MainActivity extends Activity {
	
	private Button button1=null,button2=null,button3=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent buttonIntent=new Intent(MainActivity.this,firstpage.class);
				MainActivity.this.startActivity(buttonIntent);
			}
		});
		button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View V){
				Intent button2Intent=new Intent(MainActivity.this,secondpage.class);
				MainActivity.this.startActivity(button2Intent);
			}
		});
		button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener(){
			public void onClick(View V){
				Intent button3Intent=new Intent(MainActivity.this,myInfo.class);
				MainActivity.this.startActivity(button3Intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
