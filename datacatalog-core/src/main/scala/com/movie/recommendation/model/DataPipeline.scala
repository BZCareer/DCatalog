package com.movie.recommendation.model

import reactivemongo.bson.BSONObjectID

/**
  * DataPipeline <br>
  *
  * Modeled for the DataPipeline to track sink/source info .
  *
  *  @author Zak Hassan <zak.hassan@redhat.com>
  */
case class DataPipeline (id: BSONObjectID = BSONObjectID.generate, name : String, sourceId : String,
                         sinkId : String, cron:String )
