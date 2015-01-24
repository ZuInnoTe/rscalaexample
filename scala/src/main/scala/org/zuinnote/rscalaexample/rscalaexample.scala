/**
* Simple scala example that can be called via R and that itself is calling R!
*
*
* Version: 0.1
* LICENSE: MIT
* Author: Jörn Franke / ZuInnoTe (zuinnote@gmail.com)
*
*/

package org.zuinnote.rscalaexample

import org.rosuda.REngine.JRI.JRIEngine

class RScalaExample {
	

	/**
	 * This function is called via R and it calculates the sum of the parameters by using Scala !
	 * @param a first operand
	 * @param b second operand
	 *
	 * @return sum of a+b
	 *
	 */
	def calcScala(a: Int, b: Int): Int = {
		val sum: Int = a + b
		return sum
	}

	/**
	 * This function is called via R and it calculates the sum of the parameters by using R !
	 * @param a first operand
	 * @param b second operand
	 *
	 * @return sum of a+b (calculated by R)
	 *
	 */

	def calcR(a: Int, b: Int): Int = {
		val rengine = new JRIEngine
		var sum:Int = 0
		try {
			val exp = rengine.parse("x <- "+a+"+"+b,false)
			val result = rengine.eval(exp,null,true);
			sum = result.asInteger()
		} finally { // always close the rengine or program looks like it is frozen
			rengine.close()
		}
		return sum
	}

}


