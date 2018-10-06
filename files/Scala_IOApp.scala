#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

#parse("File Header.java")
object ${NAME} extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    //your code here
  }.as(ExitCode.Success)
}

