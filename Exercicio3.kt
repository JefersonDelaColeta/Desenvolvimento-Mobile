//3)Faça um programa que receba números positivos até que o número zero seja
//digitado. Calcule e mostre ao final:
//- a soma de todos os números digitados
//- a quantidade de números digitados,
//- a média dos números digitados (fazer uma função para calcular a media)
//- o maior número digitado
//- o menor número digitado
//-  a média dos números pares digitados (utilizar a mesma função de calculo de média
//criada acima)
//-  a quantidade de números ímpares digitados
//Obs: para pegar o resto de uma divisão utilize % (modulo) no lugar da /.


fun main(){

    var numeroDigitado = 0
    var somaTotal = 0.0
    var quantidadeDeNumerosDigitados = 0
    var maiorNumero = -1000000
    var menorNumero = 1000000
    var somaPares = 0.0
    var quantidadeImpar = 0
    var quantidadeDeNumerosPares = 0

    do {
        println("Digite um número positivo (ou 0 para sair): ")
        numeroDigitado = readln()!!.toInt()

        if (numeroDigitado > 0){
            somaTotal += numeroDigitado
            quantidadeDeNumerosDigitados++
        }
        if(numeroDigitado > maiorNumero){
            maiorNumero = numeroDigitado
        }
        if(numeroDigitado < menorNumero){
            menorNumero = numeroDigitado
        }
        if(numeroDigitado % 2 == 0){
            somaPares += numeroDigitado
            quantidadeDeNumerosPares++
        }
        else{
            quantidadeImpar++
        }
    }
        while (numeroDigitado !=0)

        val media = media(somaTotal, quantidadeDeNumerosDigitados.toFloat())
        val mediaPar = media(somaPares, quantidadeDeNumerosPares.toFloat())

    println("A soma de todos os números digitados é de: $somaTotal")
    println("A quantidade de números digitados foi de: $quantidadeDeNumerosDigitados")
    println("A média dos números digitados é de: $media")
    println("O maior valor digitado foi o: $maiorNumero")
    println("O menor valor digitado foi: $menorNumero")
    println("A média dos números pares digitados é: $mediaPar")
    println("A quantidade de números ímpares digitados é: $quantidadeImpar")
}

fun media(soma: Double, quantidade: Float): Float{
    return (soma / quantidade).toFloat()
}


