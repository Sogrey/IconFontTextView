package org.sogrey.iconfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 适用于fontawesome的字体TextView
 * Created by Sogrey on 2017/1/17.
 */

public class IconFontTextView extends TextView {
    public IconFontTextView(Context context) {
        this(context,null);
    }

    public IconFontTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public IconFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        Typeface iconfont = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
        this.setTypeface(iconfont);
    }
}
