package de.danbim.notes
import javax.ws.rs.GET
import javax.inject.Inject
import javax.ws.rs.Path

@Path("/")
class NotesResource @Inject() (val notes: Notes) {

  
  
  @GET
  def get = {
    notes.addNote(new Note())
    "Hello, Resource!"
  }
  
}