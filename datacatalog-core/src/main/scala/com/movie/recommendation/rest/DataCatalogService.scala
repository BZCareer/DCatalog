package com.movie.recommendation.rest

import akka.actor.Props
import com.movie.recommendation.actor.DataPipelineOperation._
import com.movie.recommendation.actor.DataPipelineServiceActor
import spray.http.MediaTypes
import spray.routing.HttpService

/**
  * Created by zhassan on 2016-11-05.
  */
trait DataCatalogService  extends HttpService {
  val route =
    pathPrefix("api") {
      path("datapipeline") {
        get {
          respondWithMediaType(MediaTypes.`application/json`) {
            requestContext =>
              val dataservice = actorRefFactory.actorOf(Props(new DataPipelineServiceActor(requestContext)))
              val resp = dataservice ! GetAllPipelines
          }
        }
      }
    }
}
