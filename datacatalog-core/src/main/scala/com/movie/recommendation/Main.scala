package com.movie.recommendation

import akka.actor.{ActorSystem, Props}
import akka.event.Logging
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import com.movie.recommendation.actor.DataCatalogServiceActor
import spray.can.Http

import scala.concurrent.duration._

/**
  * The class bootstraps Spray web application and starts up the app.
  *
  * @author Zak Hassan <zak.hassan@redhat.com>
  */
object Main extends App {
  implicit val system = ActorSystem("datacatalog-core")
  val log = Logging(system, getClass)
  val service = system.actorOf(Props[DataCatalogServiceActor], "datacatalog-core-service")
  implicit val timeout = Timeout(5.seconds)
  log.info("Booting up app!")
  IO(Http) ? Http.Bind(service, interface = "0.0.0.0", port = 8080)
}
