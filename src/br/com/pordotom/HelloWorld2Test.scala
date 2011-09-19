package br.com.pordotom

import org.junit.Test

/**
 * Created by IntelliJ IDEA.
 * User: rodrigo
 * Date: 9/18/11
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */

class HelloWorld2Test {

  @Test
  def shouldCalculate() = {
    var calculo = HelloWorld2.soma(2,3)
    assert(calculo == 5, "Retorno deve ser 5")
  }

  @Test
  def shouldTalk() = {
    var gretting = HelloWorld2.grettings("Rodrigo")
    assert(gretting == "Hello Rodrigo", "Deve falar com o Rodrigo")
  }

}