package classes

fun main(){
    val whileExample = whileExample()
    whileExample.whileLoop()
}



class whileExample{


    fun whileLoop (){

        val maxCount=100
        var currentCount=0

        for (i in currentCount..maxCount step 2)  {
            println(i)

        }

    }
}