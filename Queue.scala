package com.knoldus.queueHelper {
//Defining Trait Queue for queue operations
  trait Queue {
    def enqueue(listQueue: List[Int], element: Int): List[Int] = {
      listQueue.:+(element)
    }

    def dequeue(listQueue: List[Int]): List[Int] = {
      listQueue.tail

    }
  }

}

package com.knoldus.queueImplementer {
//using trait Queue from package com.knoldus.queueHelper
  class DoubleQueue extends com.knoldus.queueHelper.Queue {
  //function to enqueue the elements after doubling into the queue
    def doubleElements(srcList: List[Int], el: Int): List[Int] = {
      enqueue(srcList, 2 * el)
    }
  //function to remove the element
    def removeDouble(srcList: List[Int]): List[Int] = {
      dequeue(srcList)
    }
  }

  //using trait Queue from package com.knoldus.queueHelper
  class SquareQueue extends com.knoldus.queueHelper.Queue{

    //function to enqueue the elements after doubling into the queue
    def squareElements(srcList: List[Int], el: Int): List[Int] = {
      enqueue(srcList, el * el)
    }
    //function to remove the element
    def removeSquare(srcList: List[Int]): List[Int] = {
      dequeue(srcList)
    }
  }

}
