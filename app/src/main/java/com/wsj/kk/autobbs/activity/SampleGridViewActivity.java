package com.wsj.kk.autobbs.activity;

import android.os.Bundle;
import android.widget.GridView;

import com.wsj.kk.autobbs.R;
import com.wsj.kk.autobbs.adapter.SampleGridViewAdapter;
import com.wsj.kk.autobbs.listener.SampleScrollListener;

public class SampleGridViewActivity extends PicassoSampleActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sample_gridview_activity);

    GridView gv = (GridView) findViewById(R.id.grid_view);
    gv.setAdapter(new SampleGridViewAdapter(this));
    gv.setOnScrollListener(new SampleScrollListener(this));
  }
}
