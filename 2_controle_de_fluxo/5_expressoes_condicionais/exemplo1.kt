/**
 * Expressões condicionais (análogas a operadores ternários).
 *
 * @see [Conditional Expression](https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression)
 */
fun main() {
	
    fun max(a: Int, b: Int) = if (a > b) a else b
	
    println(max(99, -42))
    
    fun maxOld(a: Int, b: Int): Int {
		if(a > b) {
			return a
		} else {
			return b
		}
    }

     println(maxOld(99, -42))
    
 }