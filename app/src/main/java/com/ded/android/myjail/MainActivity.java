package com.ded.android.myjail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

  private NavController navController;
  private AdView mAdView;
  private InterstitialAd mInterstitialAd;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    // MobileAds.initialize(this);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



    navController = Navigation.findNavController(this, R.id.navContainer);

    mAdView = findViewById(R.id.adView);

    MobileAds.initialize(this, new OnInitializationCompleteListener() {
      @Override
      public void onInitializationComplete(InitializationStatus initializationStatus) {
        AdView adView = new AdView(MainActivity.this);
        //ca-app-pub-4433493293018663/9700347467
        if (BuildConfig.DEBUG)

          adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
          @Override
          public void onAdLoaded() {
            // Code to be executed when an ad finishes loading.
          }

          @Override
          public void onAdFailedToLoad(LoadAdError adError) {
            // Code to be executed when an ad request fails.
          }

          @Override
          public void onAdOpened() {
            // Code to be executed when an ad opens an overlay that
            // covers the screen.
          }

          @Override
          public void onAdClicked() {
            // Code to be executed when the user clicks on an ad.
          }

          @Override
          public void onAdClosed() {
            // Code to be executed when the user is about to return
            // to the app after tapping on an ad.
          }
        });

      }
    });

    loadInterstitialAd();
    //ca-app-pub-4433493293018663/3032966958

//    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
//      @Override
//      public void onAdDismissedFullScreenContent() {
//        // Called when fullscreen content is dismissed.
//        Log.d("TAG", "The ad was dismissed.");
//      }
//
//      @Override
//      public void onAdFailedToShowFullScreenContent(AdError adError) {
//        // Called when fullscreen content failed to show.
//        Log.d("TAG", "The ad failed to show.");
//      }
//
//      @Override
//      public void onAdShowedFullScreenContent() {
//        // Called when fullscreen content is shown.
//        // Make sure to set your reference to null so you don't
//        // show it a second time.
//        mInterstitialAd = null;
//        Log.d("TAG", "The ad was shown.");
//      }
//    });


  }

  public void loadInterstitialAd() {
    AdRequest adRequest1 = new AdRequest.Builder().build();

    String adKey = "ca-app-pub-4433493293018663/3032966958";
    if (BuildConfig.DEBUG)
      adKey = "ca-app-pub-3940256099942544/1033173712";


    InterstitialAd.load(this, adKey, adRequest1,
        new InterstitialAdLoadCallback() {
          @Override
          public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            // The mInterstitialAd reference will be null until
            // an ad is loaded.
            mInterstitialAd = interstitialAd;
            Log.i("TAG", "onAdLoaded");
          }

          @Override
          public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            // Handle the error
            Log.i("TAG", loadAdError.getMessage());
            mInterstitialAd = null;
          }
        });
  }

  public void showAd(){

    if (mInterstitialAd != null){
    mInterstitialAd.show(this);
    loadInterstitialAd();
    }

  }

  public void finishApp() {
    finish();
    // System.exit(0);
  }


}