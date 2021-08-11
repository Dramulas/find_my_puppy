package com.findmypup;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

// tanıma sonuçlarını göstermek için özel metin
public class RecognitionScoreView extends TextView {

    public RecognitionScoreView(final Context context, final AttributeSet set) {
        super(context, set);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "OpenSans-Regular.ttf"));
    }
}
