package com.arupakaman.multimodulegradleconfig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.arupakaman.basemodule.BuildConfig as BuildConfigBaseModule

class MainActivity : AppCompatActivity() {

    companion object{

        //From App module
        const val WEB_BASE_URL_APP_MODULE = BuildConfig.WEB_BASE_URL_APP_MODULE

        //From Base module
        const val WEB_BASE_URL_BASE_MODULE = com.arupakaman.basemodule.BuildConfig.WEB_BASE_URL_BASE_MODULE

        //From Base module (by using import as = import com.arupakaman.basemodule.BuildConfig as BuildConfigBaseModule)
        const val WEB_BASE_URL_BASE_MODULE_2 = BuildConfigBaseModule.WEB_BASE_URL_BASE_MODULE

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}