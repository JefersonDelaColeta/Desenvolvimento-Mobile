import java.lang.NumberFormatException

class Pessoas{

    private var nome = ""
    private var idade = 0.0
    private var peso = 0.0
    private var altura = 0.0
    private var peso2 = 0.0

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


fun dadosPessoais1(){

    val p1: Pessoas = Pessoas()

    try {

        print("Digite o nome da primeira pessoa: ")
        var entrada: String = readln()
        p1.setNome(entrada.toString())


        print("Digite a idade da primeira pessoa: ")
        var number: String = readln()
        p1.setIdade(number.toDouble())


        print("Digite a altura da primeira pessoa: ")
        var alt: String = readln()
        p1.setAltura(alt.toDouble())

        print("Digite o peso da primeira pessoa: ")
        var pes: String = readln()
        p1.setPeso(pes.toDouble())

        val imcResult = imc(pes.toDouble(), alt.toDouble())
        val p2: Pessoas = Pessoas()
        dados(imcResult)
        println()

        print("\nDigite o nome da segunda pessoa: ")
        entrada = readln()
        p2.setNome(entrada.toString())

        print("Digite a idade da segunda pessoa: ")
        number = readln()
        p2.setIdade(number.toDouble())

        print("Digite a altura da segunda pessoa: ")
        alt = readln()
        p2.setAltura(alt.toDouble())

        print("Digite o peso da segunda pessoa: ")
        pes = readln()
        p2.setPeso(pes.toDouble())

        val imcResult2 = imc2(pes.toDouble(), alt.toDouble())
        dados(imcResult2)
        println()


        println("\n\n Os dados da primeira pessoa são:")
        println("${p1.getNome()}")
        println("A idade da pessoa é ${p1.getIdade()}")
        println("A altura da pessoa é de ${p1.getAltura()}")
        println("o peso da pessoa é de ${p1.getPeso()}")
        println("O IMC da primeira pessoa é:  ${String.format("%.2f", imcResult)}\n")


        println("\n\nOs dados da segunda pessoa são:")
        println("${p2.getNome()}")
        println("A idade da segunda pessoa é ${p2.getIdade()}")
        println("A altura da segunda pessoa é de ${p2.getAltura()}")
        println("o peso da segunda pessoa é de ${p2.getPeso()}")
        println("O IMC da segunda pessoa é:  ${String.format("%.2f", imcResult2)}\n")
    }catch (e: ArithmeticException){
        println("Os valores digitados não condizem com o valor pedido!")
    }catch (e: NumberFormatException){
        println("Os valores digitados não condizem com o valor pedido!")
    }


}

fun imc(num1: Double, num2: Double): Double{
    return (num1/(num2*num2))
}
fun imc2(num3: Double, num4: Double): Double{
    return (num3/(num4*num4))
}

fun dados(n1: Double) {
    if (n1<18.5 ){
        print("Você está abaixo do peso")
    }
    else if(n1 >= 18.5 && n1 < 24.9 ){
        print ("peso ideal")
    }
    else if(n1 >= 24.9 && n1 < 29.9 ){
        print ("Acima do peso")
    }
    else if (n1>= 29.9 && n1 < 34.9 ){
        print("Obesidade grau I")
    }
    else if(n1>35 && n1 <= 39.9 ){
        print("Obesidade grau II")
    }
    else if (n1 > 39.9 ){
        print("Obesidade grau III")
    }
}

