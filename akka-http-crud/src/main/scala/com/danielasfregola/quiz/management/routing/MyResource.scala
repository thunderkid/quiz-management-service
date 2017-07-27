package com.danielasfregola.quiz.management.routing

import akka.http.scaladsl.marshalling.{ToResponseMarshaller, ToResponseMarshallable}

import scala.concurrent.{ExecutionContext, Future}
import akka.http.scaladsl.model.headers.Location
import akka.http.scaladsl.server.{Directives, Route}

trait MyResource extends Directives {

  implicit def executionContext: ExecutionContext
}
