package my.first.play.app

import play.api.mvc._

class HelloWorldController(
  cc: ControllerComponents
) extends AbstractController(cc) {

  def helloWorld(): Action[AnyContent] = Action {
    Ok("Hello World")
  }
}
