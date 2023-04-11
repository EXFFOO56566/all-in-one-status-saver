package com.cd.statussaver.util;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.cd.statussaver.R;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class AdsUtils {




    public static AdView showFBBannerAd(Context context, LinearLayout adContainer) {

        adContainer.setVisibility(View.VISIBLE);
        AdView adView = new AdView(context, context.getResources().getString(R.string.fb_placement_id), AdSize.RECTANGLE_HEIGHT_250);
        adContainer.addView(adView);
        adView.loadAd();

        return adView;


    }

    public static AdView showFBBannerAdRect(Context context, LinearLayout adContainer) {

        adContainer.setVisibility(View.VISIBLE);
        AdView adView = new AdView(context, context.getResources().getString(R.string.fb_placement_id), AdSize.BANNER_HEIGHT_50);
        adContainer.addView(adView);
        adView.loadAd();

        return adView;

    }

}
