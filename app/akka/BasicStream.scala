package com.particeep.test.akka

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import akka.{ Done, NotUsed }
import java.util.concurrent.Future

/**
 * Question about Akka Stream framework https://doc.akka.io/docs/akka/current/stream/index.html
 *
 * Complete the code (replace the ???)
 */
object BasicStream {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("Actor System")

    val numbers = 1 to 1000

    val numberSource: Source[Int, NotUsed] = Source.fromIterator(() => numbers.iterator)

    //Only let pass even number through the flow aaded zawjeya
    val isEvenFlow: Flow[Int, Int, NotUsed] =
            if(numbers %2 ==0)
                  println(numbers)


    //Create a Source of even numbers by combining the number Source with the even Flow
    val evenNumberSource: Source[Int, NotUsed] =
    val nums= List();
      if(numbers %2==){
      nums=nums :+numbers
      }

    //A Sink that will write its input onto the console
    val consoleSink: Sink[Int, Future[Done]] =
    while (true) {
            val result = scala.io.StdIn.readLine()

    //Connect the Source with the Sink and run it
            printf("Enter the String: %s", result)

                println()
  }
}
