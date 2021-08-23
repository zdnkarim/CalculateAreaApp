package utils

class StarGeneratorUtils {

    fun printStars(totalStar: Int){
        if (totalStar <= 20){
            for (i in 1..totalStar) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
        }else{
            println("Total stars should not greater than 20")
        }
    }
}