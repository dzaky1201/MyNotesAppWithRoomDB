package com.dzakyhdr.mynotesappwithroomdb.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.dzakyhdr.mynotesappwithroomdb.database.Note
import com.dzakyhdr.mynotesappwithroomdb.database.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mRepository = NoteRepository(application)

    fun insert(note: Note){
        mRepository.insert(note)
    }

    fun delete(note: Note){
        mRepository.delete(note)
    }

    fun update(note: Note){
        mRepository.update(note)
    }
}