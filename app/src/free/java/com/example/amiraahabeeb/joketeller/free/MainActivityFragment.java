package com.example.amiraahabeeb.joketeller.free;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.amiraahabeeb.jokefactory.DisplayJokeActivity;
import com.example.amiraahabeeb.joketeller.EndpointAsyncTask;
import com.example.amiraahabeeb.joketeller.OnTaskCompleted;
import com.example.amiraahabeeb.joketeller.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivityFragment extends Fragment implements OnTaskCompleted {
    Button mJokeButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        mJokeButton = (Button) root.findViewById(R.id.btn_joke);

        mJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return root;
    }

    public void loadData() {
        EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(this);
        endpointsAsyncTask.execute();
    }

    @Override
    public void onTaskCompleted(String result) {
        Intent intent = new Intent(getActivity(), DisplayJokeActivity.class);

        intent.putExtra(DisplayJokeActivity.JOKE_KEY, result);
        startActivity(intent);
    }
}