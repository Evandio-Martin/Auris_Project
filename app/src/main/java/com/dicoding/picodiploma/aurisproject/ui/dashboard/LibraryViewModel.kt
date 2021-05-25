package com.dicoding.picodiploma.aurisproject.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LibraryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Learn Sign Language"
    }
    val text: LiveData<String> = _text
}