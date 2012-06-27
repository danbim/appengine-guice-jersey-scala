package de.danbim.notes

import com.google.inject.servlet.ServletModule
import com.sun.jersey.guice.JerseyServletModule
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer
import com.sun.jersey.api.json.JSONConfiguration
import java.util.Map
import java.util.HashMap

class NotesServletModule extends JerseyServletModule {

  override def configureServlets() {

    bind(classOf[Notes]).to(classOf[NotesImpl])
    bind(classOf[NotesResource])

    serve("/servlet/*").`with`(classOf[NotesServlet])
    serve("/rest/*").`with`(classOf[GuiceContainer], params)
  }

  private def params: Map[String, String] = {
    val params = new HashMap[String, String]()
    params.put("javax.ws.rs.Application", "de.danbim.notes.NotesApplication")
    params.put(JSONConfiguration.FEATURE_POJO_MAPPING, "true")
    params
  }

}