package org.sogrey.iconfont.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView mGridView;
    private GridViewAdapter mGridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = (GridView)findViewById(R.id.gridview);
        mGridViewAdapter = new GridViewAdapter(this);
        mGridView.setAdapter(mGridViewAdapter);
        mGridViewAdapter.notifyDataSetChanged();
    }
}
