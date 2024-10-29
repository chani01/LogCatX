package com.chani.logcatxsample

import android.app.Application
import com.chani.logcatx.Dlog


class LogCatXApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Dlog.init("LogCatXTest", true)
    }
}