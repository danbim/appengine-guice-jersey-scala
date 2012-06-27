package de.danbim.notes
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import com.google.inject.Singleton
import javax.inject.Inject

@Singleton
class NotesServlet @Inject() (val notes: Notes) extends HttpServlet {

  override def doGet(req:HttpServletRequest, resp:HttpServletResponse) {
    notes.addNote(new Note())
    resp.getOutputStream().write("Hello, Servlet!".getBytes())
    resp.getOutputStream().flush()    
  }
  
}