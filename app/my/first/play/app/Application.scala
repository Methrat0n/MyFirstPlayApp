package my.first.play.app

import play.api._
import play.api.ApplicationLoader.Context
import play.filters.HttpFiltersComponents

import router.Routes

class Application extends ApplicationLoader {
  def load(context: Context) = {
    LoggerConfigurator(context.environment.classLoader).foreach {
      _.configure(context.environment, context.initialConfiguration, Map.empty)
    }
    new MyComponents(context).application
  }
}

class MyComponents(context: Context) extends BuiltInComponentsFromContext(context) with HttpFiltersComponents {
  val helloWorldController = new HelloWorldController(controllerComponents)
  lazy val router = new Routes(
    httpErrorHandler,
    helloWorldController
  )
}
