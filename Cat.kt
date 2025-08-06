open class Cat{
    open fun latir(){
		println("Meow!")
    }
}

class Orange : Cat(){
    override fun latir(){
        println("Orange Meow!")
    }
}

fun main(){
    val cat:Cat = Orange()
    cat.latir()
}
