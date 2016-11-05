package com.movie.recommendation.rest

import com.movie.recommendation.model.DataPipeline
import spray.json.{DefaultJsonProtocol, RootJsonFormat}

/**
  * Created by zhassan on 2016-11-05.
  */
object DataPipelineJSONProtocol extends DefaultJsonProtocol {
  implicit def dataPipelineFormat:RootJsonFormat[DataPipeline] = jsonFormat5(DataPipeline.apply)
}
