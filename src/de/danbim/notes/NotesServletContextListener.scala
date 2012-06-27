package de.danbim.notes
import com.google.inject.servlet.GuiceServletContextListener
import com.google.inject.Guice
import com.google.inject.Injector

class NotesServletContextListener extends GuiceServletContextListener {

  override def getInjector() = Guice.createInjector(new NotesServletModule())

}