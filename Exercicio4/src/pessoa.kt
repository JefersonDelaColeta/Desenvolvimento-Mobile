class Pessoas{

    private var nome = ""
    private var idade = 0.0
    private var peso = 0.0
    private var altura = 0.0

    fun setNome( n: String) {
        nome = n
    }
    fun getNome(): String{
        return "O nome da pessoa é $nome"
    }

    fun setIdade( i: Double) {
        idade = i
    }
    fun getIdade(): Double{
        return idade
    }

    fun setPeso( p: Double) {
        peso = p
    }
    fun getPeso(): Double{
        return peso
    }

    fun setAltura( a: Double) {
        altura = a
    }
    fun getAltura(): Double{
        return altura
    }




}