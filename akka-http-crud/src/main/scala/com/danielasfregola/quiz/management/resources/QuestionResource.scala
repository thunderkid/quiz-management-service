package com.danielasfregola.quiz.management.resources

import akka.http.scaladsl.server.Route

import com.danielasfregola.quiz.management.routing.MyResource

trait QuestionResource extends MyResource {

  def questionRoutes: Route = path("prattle") {
    complete("whatever pus you like")
  }

}

