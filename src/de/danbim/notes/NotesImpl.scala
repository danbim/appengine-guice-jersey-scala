package de.danbim.notes
import javax.inject.Singleton

@Singleton
class NotesImpl extends Notes {

  override def addNote(note: Note): Unit = {
    println("Notes.addNote()")
  }

}