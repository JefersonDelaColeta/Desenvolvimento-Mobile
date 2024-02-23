//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    dadosPessoais()


}

fun dadosPessoais(){

    var p1: Pessoas = Pessoas()

    print("Digite o nome da pessoa: ")
    var entrada: String =  readln()
    p1.setNome(entrada.toString())

    print("Digite a idade da pessoa: ")
    var number: String = readln()
    p1.setIdade(number.toDouble())

    print("Digite a altura da pessoa: ")
    var alt: String = readln()
    p1.setAltura(alt.toDouble())

    print("Digite o peso da pessoa: ")
    var pes: String = readln()
    p1.setPeso(pes.toDouble())


    val imcResult = imc(pes.toDouble(), alt.toDouble())

    println("${p1.getNome()}")
    println("A idade da pessoa é ${p1.getIdade()}")
    println("A altura da pessoa é de ${p1.getAltura()}")
    println("o peso da pessoa é de ${p1.getPeso()}")
    println("O IMC da pessoa é:  ${String.format("%.2f", imcResult)}")

    dados(imcResult)

}

fun imc(num1: Double, num2: Double): Double{
    return (num1/(num2*num2))
}

fun dados(n1: Double) {
    if (n1<18.5){
        print("Você está abaixo do peso")
    }
    else if(n1 >= 18.5 && n1 < 24.9){
    print ("peso ideal")
    }
    else if(n1 >= 24.9 && n1 < 29.9){
        print ("Acima do peso")
    }
    else if (n1>= 29.9 && n1 < 34.9){
        print("Obesidade grau I")
    }
    else if(n1>35 && n1 <= 39.9){
        print("Obesidade grau II")
    }
    else{
        print("Obesidade grau III")
    }
}

