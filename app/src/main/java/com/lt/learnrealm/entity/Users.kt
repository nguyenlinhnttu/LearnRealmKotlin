package com.lt.learnrealm.entity

import io.realm.RealmObject



/**
 * Created by nguyenvanlinh on 1/5/18.
 * Project: LearnRealm
 * Web: www.androdcoban.com
 */

open class Users : RealmObject() {

    var name: String? = null
    var age: Int = 0

}