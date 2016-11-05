package com.movie.recommendation.actor

import akka.actor.{Actor, ActorLogging, ActorRefFactory}
import com.movie.recommendation.rest.DataCatalogService
import spray.routing.{ExceptionHandler, RejectionHandler, RoutingSettings}
import spray.util.LoggingContext

/**
  * Created by zhassan on 2016-11-05.
  */
class DataCatalogServiceActor extends Actor with DataCatalogService with ActorLogging{
  implicit val system = context.system
  override def receive: Receive = runRoute(route)(ExceptionHandler.default, RejectionHandler.Default, context,
    RoutingSettings.default, LoggingContext.fromActorRefFactory)
  override implicit def actorRefFactory: ActorRefFactory = context
}
