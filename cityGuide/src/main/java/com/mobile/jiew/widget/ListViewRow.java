package com.mobile.jiew.widget;

import com.mobile.jiew.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class ListViewRow extends FrameLayout {

	public ListViewRow(Context context) {
		super(context, null);
	}

	public ListViewRow(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ListViewRow(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs);
	}

	public void init() {
		LayoutInflater inflater = (LayoutInflater) getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.activity_list_view_row, this, true);
	}

}
