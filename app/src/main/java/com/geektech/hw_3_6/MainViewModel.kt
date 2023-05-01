package com.geektech.hw_3_6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count = 0
    val mCounter = MutableLiveData<Int>()

    fun increment() {
        count++
        mCounter.value = count
    }

    fun decrement() {
        count--
        mCounter.value = count
    }
}