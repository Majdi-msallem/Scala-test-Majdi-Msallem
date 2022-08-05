package com.particeep.test.basic

/**
 * Compute the average of the list
 *
 * ex : [1, 10, 16] -> 9
 */
object ComputeAverage {

  def average(l: List[Double]) =Unit{
  for ( x <- l ) {
      print(s"${x}, ")
                 }
   var total = 0.0;
   for ( i <- 0 to (l.length - 1)) {
   total += nums(i);
       }
   println(s"\nAverage value List elements is: ${total/l.length}");
      }
}
