package com.movie.recommendation.actor

/**
  * Created by zhassan on 2016-11-05.
  */
object DataPipelineOperation {
  case class CreatePipelines()
  // To run a particular pipeline
  case class RunPipelines(id:String)
  case class CancelPipelines(id:String)
  case class GetOnePipeline(id:String)
  case class GetAllPipelines()
}