package com.danielasfregola.quiz.management

import scala.concurrent.ExecutionContext

import akka.http.scaladsl.server.Route

import com.danielasfregola.quiz.management.resources.QuestionResource

trait RestInterface extends Resources {

  implicit def executionContext: ExecutionContext

  val routes: Route = questionRoutes
}

trait Resources extends QuestionResource

