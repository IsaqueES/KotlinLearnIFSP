open class Tigrinho(val valorapostado:String,val nome:String){
    open fun caiunogolpe(){
		println("Apostou $valorapostado e não soltei cartinha!")
    }
    open fun Perdeu(){
		println("$nome Perdeu!")
    }
}

class Apostador : Tigrinho("1000","Cauã")

fun main(){
    val pessoa:Tigrinho = Apostador()
    pessoa.caiunogolpe()
    pessoa.Perdeu()
    
}
