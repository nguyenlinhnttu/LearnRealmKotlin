package com.lt.learnrealm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lt.learnrealm.app.MyApplication
import com.lt.learnrealm.entity.Users
import io.realm.Realm
import io.realm.RealmResults
import io.realm.kotlin.where

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        insertUser();
        updateUser();
        deleteUser();
        getListUser();
    }

    private fun getListUser() {
        var realm = MyApplication.getRealmDB()
        var result : RealmResults<Users> = realm.where(Users::class.java).findAll()
        Log.d("TAG",result[0].toString())
    }

    private fun deleteUser() {

    }

    private fun updateUser() {

    }

    private fun insertUser() {
        var realm = MyApplication.getRealmDB()
        realm.beginTransaction()
        var user :Users = realm.createObject(Users::class.java)
        user.name = "Linh"
        user.age =  10
        realm.commitTransaction()
    }
}
