package com.movie.recommendation.actor

/**
  * Created by zhassan on 2016-11-05.
  */
object DataPipelineOperation {
  case class CreatePipelines()
  case class StartPipelines(id:String)
  case class StopPipelines(id:String)
  case class GetOnePipeline(id:String)
  case class GetAllPipelines()
  case class GetPipelineMetrics()
}