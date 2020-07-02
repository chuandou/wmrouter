package com.mola.lib.routerlib

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sankuai.waimai.router.Router
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_haha.setOnClickListener{
            Router.startUri(this,"/lib2")
        }
    }
}
