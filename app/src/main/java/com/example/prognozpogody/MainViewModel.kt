package com.example.prognozpogody

import adapters.WeatherModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {
    val lifeDataCurrent = MutableLiveData<WeatherModel>()
    val lifeDataList = MutableLiveData<List<WeatherModel>>()


}