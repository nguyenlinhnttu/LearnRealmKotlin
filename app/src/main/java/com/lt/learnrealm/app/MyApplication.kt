package com.lt.learnrealm.app

import android.app.Application
import io.realm.Realm

/**
 * Created by nguyenvanlinh on 1/5/18.
 * Project: LearnRealm
 * Web: www.androdcoban.com
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

    companion object {
        fun getRealmDB(): Realm {
            return Realm.getDefaultInstance();
        }
    }
}