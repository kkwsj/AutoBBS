package com.wsj.kk.autobbs;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.wsj.kk.autobbs.fragment.CoverFragment;
import com.wsj.kk.autobbs.fragment.HomeFragment;
import com.wsj.kk.autobbs.fragment.MessageFragment;
import com.wsj.kk.autobbs.fragment.MineFragment;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost mTabHost;

    private LayoutInflater mLayoutInflater;



    /**
     * Fragment数组界面
     */
    private Class mFragmentArray[] = { HomeFragment.class, CoverFragment.class,
            CoverFragment.class, MessageFragment.class, MineFragment.class };
    /**
     * 存放图片数组
     */
    private int mImageArray[] = { R.drawable.home_tab,
            R.drawable.cover_tab, R.drawable.icon_publish,
            R.drawable.message_tab, R.drawable.mine_tab };

    private String mTextArray[] = { "首页", "找车", "发布", "消息", "我" };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * 初始化组件
     */
    private void initView() {
        mLayoutInflater = LayoutInflater.from(this);

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabHost.getTabWidget().setDividerDrawable(null); // 去掉分割线

        // 得到fragment的个数
        int count = mFragmentArray.length;
        for (int i = 0; i < count; i++) {
            // 给每个Tab按钮设置图标、文字和内容
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(mTextArray[i])
                    .setIndicator(getTabItemView(i));
            // 将Tab按钮添加进Tab选项卡中
            mTabHost.addTab(tabSpec, mFragmentArray[i], null);

        }

    }

    /**
     * 给每个Tab按钮设置图标和文字
     */
    private View getTabItemView(int index) {
        View view = mLayoutInflater.inflate(R.layout.tab_item_view, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        imageView.setImageResource(mImageArray[index]);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(mTextArray[index]);

        return view;
    }

}
