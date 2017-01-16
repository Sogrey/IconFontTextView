package org.sogrey.iconfont.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.sogrey.iconfont.IconFontTextView;

/**
 * Created by Sogrey on 2017/1/16.
 */

public class GridViewAdapter extends BaseAdapter {
    String[] iconFonts = null;
    Context mContext;
    LayoutInflater mInflater;

    public GridViewAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        iconFonts = context.getResources().getStringArray(R.array.icon_fonts);
    }

    @Override
    public int getCount() {
        return iconFonts == null ? 0 : iconFonts.length;
    }

    @Override
    public Object getItem(int i) {
        return iconFonts[i];
    }

    @Override
    public long getItemId(int i) {
        return iconFonts[i].hashCode();
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        View view = v;
        ViewHolder holder =null;
        if(view==null){
            view =  mInflater.inflate(R.layout.item,null);
            holder = new ViewHolder();
            holder.txt = (IconFontTextView)view.findViewById(R.id.txt_icon_font);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.txt.setText(iconFonts[i]);
        return view;
    }

    static class ViewHolder{
        IconFontTextView txt;
    }
}