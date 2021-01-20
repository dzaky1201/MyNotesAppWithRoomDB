package com.dzakyhdr.mynotesappwithroomdb.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dzakyhdr.mynotesappwithroomdb.database.Note
import com.dzakyhdr.mynotesappwithroomdb.database.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mRepository.getAllNotes()
}