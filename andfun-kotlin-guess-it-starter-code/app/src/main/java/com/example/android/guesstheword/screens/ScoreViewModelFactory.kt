package com.example.android.guesstheword.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.guesstheword.screens.score.ScoreViewModel

class ScoreViewModelFactory(private val finalScore: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            // TODO Construct and return the ScoreViewModel
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}