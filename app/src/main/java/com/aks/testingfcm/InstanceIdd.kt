package com.aks.testingfcm

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService

class InstanceIdd : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("TAG", "onTokenRefresh: ")
    }

}