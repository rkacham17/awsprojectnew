package com.allaboutscala.chapter.one.tutorialP_10

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging  extends App with LazyLogging {

  logger.info("Hello world from scala Logging")
}
