package br.com.pordotom
import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack
import org.scalatest.WordSpec

/**
 * Created by IntelliJ IDEA.
 * User: rodrigo
 * Date: 9/19/11
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */

class HelloWorldBDDTest extends WordSpec with ShouldMatchers {

  "A Stack" when {

    "empty" should {

      val stack = new Stack[Int]

      "be empty" in {
        stack should be ('empty)
      }

      "complain when popped" in {
        evaluating { stack.pop() } should produce [NoSuchElementException]
      }

      "do not complain when pushed" in {
        stack.push(1)
        stack should not be ('empty)
        stack should have size (1)
      }
    }
  }
}