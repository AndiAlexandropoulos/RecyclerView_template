package com.example.contactbook.data

import com.example.contactbook.data.model.Model

class DataSource {
    fun loadData(): MutableList<Model> {
        return mutableListOf(
            // TODO: Listeneinträge hinzufügen
        )
    }
}

// hier werden die nötigen items im "Konstruktor" erstellt
// Für die Recycler View wäre es gut variablen als Integer anzulegen.
