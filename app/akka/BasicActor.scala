package com.particeep.test.akka

import akka.actor.{ Actor, ActorSystem, Props }

/**
 * Question about Akka framework http://akka.io
 *
 * When receiving a message that says "Hello", BasicActor must print "Hello there."
 * It must print "What?" when receiving any other message
 */
class BasicActor {}

object FireActor {

  /**
   * Create an instance of BasicActor
   *
   * Make it print "Hello there." and "What?"
   */
  def fireActor(): Unit = {
  message="";
  }
       val system = ActorSystem("Actor System")
      val basic_actor = system.actorOf(Props[BasicActor], name = "basic actor")
      if (system==("Hello"||"hello"){
      basic_actor.message=("hello there")
      println(basic_actor.message)
      }else{
      println("What?")
      }
  }
}
