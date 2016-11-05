package com.movie.recommendation.actor

import akka.actor.Actor
import akka.event.Logging
import com.movie.recommendation.model.DataPipeline
import spray.routing.RequestContext

/**
  * Created by zhassan on 2016-11-05.
  */
class DataPipelineServiceActor(requestContext: RequestContext) extends Actor {
  import DataPipelineOperation._
  implicit val system = context.system
  val log = Logging(system, getClass)

  override def receive: Receive = {
    case CreatePipelines => {
      // TODO: create record in mongo for this pipeline
    }
    case StartPipelines(id:String) => {
      //TODO: Create Worker that will run the work. And supervise till work is complete
      }
    case StopPipelines(id:String) => {
      //TODO: This is equivalent to stop all workers that are currently running the pipeline
    }
    case GetPipelineMetrics()=> {
    /* TODO: Should be able to gather details about status of all datastreamed through system.
    * Example: Events should be persisted in the journal but you should also save some metadata
    *          in the database
    */
  }
    case GetAllPipelines => {
      // Import the JSON format to display json in spray-json
      import com.movie.recommendation.rest.DataPipelineJSONProtocol._
      import spray.httpx.SprayJsonSupport.sprayJsonMarshaller

      log.info("Get datapipeline list")
      // TODO: Replace stubs with database  code to pull datapipelines.

      requestContext.complete(List(
        new DataPipeline(id="1",name="name-1",sourceId="sourceId-1", sinkId="sinkId-1",cron="*/15 * * * *"),
        new DataPipeline(id="1",name="name-2",sourceId="sourceId-2",sinkId="sinkId-2",cron="*/15 * * * *"),
        new DataPipeline(id="1",name="name-3",sourceId="sourceId-3",sinkId="sinkId-3",cron="*/15 * * * *"),
        new DataPipeline(id="1",name="name-4",sourceId="sourceId-4",sinkId="sinkId-4",cron="*/15 * * * *"),
        new DataPipeline(id="1",name="name-5",sourceId="sourceId-5",sinkId="sinkId-5",cron="*/15 * * * *")  ))
      context.stop(self)
    }
    case _ => {  }
  }
}
