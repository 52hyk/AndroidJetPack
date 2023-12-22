package com.hyk.androidjetpack.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hyk.androidjetpack.R;
import com.hyk.androidjetpack.viewmodel.NameViewModel;

/**
 * 创建日期：2023/12/22 on 10:23
 * 描述:
 * 作者:hyk
 */
public class LiveDataActivity extends AppCompatActivity implements View.OnClickListener {

    private NameViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_live_data);
        // Other code to setup the activity...

        // Get the ViewModel.
        model = new ViewModelProvider(this).get(NameViewModel.class);

        // Create the observer which updates the UI.
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                ((TextView)findViewById(R.id.tv_name)).setText(newName);
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        model.getCurrentName().observe(this, nameObserver);
        findViewById(R.id.tv_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String  name="hello liveData";
        model.getCurrentName().setValue(name);
    }
}
