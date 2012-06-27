package de.danbim.notes

import java.util.Set
import java.util.HashSet

class NotesApplication extends javax.ws.rs.core.Application {

  override def getClasses(): Set[Class[_]] = {
    val classes = new HashSet[Class[_]]()
    classes.add(classOf[NotesResource])
    classes
  }
}