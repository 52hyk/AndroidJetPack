package com.hyk.androidjetpack.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 创建日期：2023/12/22 on 10:24
 * 描述:
 * 作者:hyk
 */
public class NameViewModel extends ViewModel {

    // Create a LiveData with a String
    private MutableLiveData<String> currentName;

    public MutableLiveData<String> getCurrentName() {
        if (currentName == null) {
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }
}
