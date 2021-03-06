package com.gassayan.first

import com.typesafe.scalalogging.Logger
import pureconfig._

object First {

  val config = loadConfig[FirstConfig]("first").getOrElse(FirstConfig("undefined"))

  val logger = Logger(getClass)

  def main(args: Array[String]): Unit = {
    val _ = logger.info(s"Run first at version: ${config.version}")
  }
}
