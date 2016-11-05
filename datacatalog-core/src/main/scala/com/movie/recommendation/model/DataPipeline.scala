package com.movie.recommendation.model

/**
  * DataPipeline <br>
  *
  * Modeled for the DataPipeline to track sink/source info .
  *
  *  @author Zak Hassan <zak.hassan@redhat.com>
  */
case class DataPipeline (datapipelineId : String, name : String, sourceId : String,
                         sinkId : String, cron:String )
