package com.sopian.challenge7.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.sopian.challenge7.storage.PreferencesManager

class MainViewModel(private val preferencesManager: PreferencesManager) : ViewModel() {

    val isLoggedIn = preferencesManager.isLoggedIn().asLiveData()
}