package com.cd.statussaver.util;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;


import com.cd.statussaver.R;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import static com.facebook.ads.AudienceNetworkAds.TAG;

public class AdsUtils {

    public static void showGoogleBannerAd(Context context, com.google.android.gms.ads.AdView googleAdView) {

        googleAdView.setVisibility(View.VISIBLE);
        //Load Banner Ad
        MobileAds.initialize(context, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        googleAdView.loadAd(adRequest);
    }



    public static AdView showFBBannerAd(Context context, LinearLayout adContainer) {
        adContainer.setVisibility(View.VISIBLE);
        AdView adView = new AdView(context, context.getResources().getString(R.string.fb_placement_id), AdSize.BANNER_HEIGHT_50);
        adContainer.addView(adView);
        adView.loadAd();

        return adView;

    }

    public static AdView showFBBannerAdRect(Context context, LinearLayout adContainer) {
        adContainer.setVisibility(View.VISIBLE);
        AdView adView = new AdView(context, context.getResources().getString(R.string.fb_placement_id), AdSize.RECTANGLE_HEIGHT_250);
        adContainer.addView(adView);
        adView.loadAd();

        return adView;

    }

}
