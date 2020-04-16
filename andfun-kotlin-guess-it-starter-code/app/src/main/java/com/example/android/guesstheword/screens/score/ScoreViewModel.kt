package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _scoreText = MutableLiveData<String>()
    val scoreText: LiveData<String> = _scoreText

    private val _eventOnPlayAgain = MutableLiveData<Boolean>()
    val eventOnPlayAgain: LiveData<Boolean> = _eventOnPlayAgain

    init {
        _scoreText.value = finalScore.toString()
        _eventOnPlayAgain.value = false
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

    fun onPlayAgain() {
        _eventOnPlayAgain.value = true
    }
}