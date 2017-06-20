package com.example.arakitaku.aactwitterclient;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.arakitaku.aactwitterclient.livedatasample.Resource;

import java.util.List;

/**
 * (c)FURYU CORP. 2017. All rights reserved.
 */

public class MainViewModel extends ViewModel {

    public MainViewModel() {
    }

    public LiveData<Resource<List<Repository>>> getTimeline() {
        GithubRepository githubRepository = new GithubRepository();
        return githubRepository.getTimeline();
    }
}