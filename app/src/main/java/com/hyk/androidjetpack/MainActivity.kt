package com.hyk.androidjetpack

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.hyk.androidjetpack.ui.DataBindActivity
import com.hyk.androidjetpack.ui.LiveDataActivity

class MainActivity : ComponentActivity(),OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
        findViewById<TextView>(R.id.tv_data_bing).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_live_data).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_data_bing->{
                startActivity(Intent(this,DataBindActivity::class.java))
            }
            R.id.tv_live_data->{
                startActivity(Intent(this,LiveDataActivity::class.java))
            }
        }
    }
}
