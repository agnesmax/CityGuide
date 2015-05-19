package com.mobile.jiew;

import android.widget.ListView;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

	ListView typeListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);
	}

	public void init(){
		typeListView = (ListView) findViewById(R.id.typelistView);
	}
	
	
}
