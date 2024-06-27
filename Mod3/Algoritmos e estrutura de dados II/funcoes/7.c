// 7) Faça um programa que simule um computador de bordo de 10 veículos.
// Para cada veículo solicite MODELO a DISTÂNCIA, QUANTIDADE de litros abastecido e TEMPO percorrido de viagem e calcule:
//
// a) velocidade média (crie a função VelocidadeMedia(), para calcular a velocidade média do veículo;
// b) consumo (crie a função Consumo() para calcular os kilometros por litros);
// c) O carro mais rápido (crie a função Veloz() para armazenar o carro que teve a maior velocidade média);
// d) o carro mais econômico(crie a função Economico() para armazenar o carro que teve o menor consumo).

#include <stdio.h>

char Modelo[100];
float Distancia, QtdLitros, VelocidadeMediaKm, Tempo, ConsumoA, MaiorVel = 0, MenorConsumo = 999999;
int Contador;

main()
{
    for (Contador = 0; Contador < 10; Contador++)
    {
        printf("Qual o modelo do carro? \n");
        scanf("%s", Modelo);

        printf("\nQual foi a distancia percorrida?\n");
        scanf("%f", &Distancia);

        printf("\nQual foi a quantidade de litros gasta?\n");
        scanf("%f", &QtdLitros);

        printf("\nEm quanto tempo foi feito o trajeto?\n");
        scanf("%f", &Tempo);

        printf("\n\n");

        VelocidadeMedia();
        Consumo();
        Veloz();
        Economico();
    }
}

VelocidadeMedia()
{
    VelocidadeMediaKm = Distancia / (Tempo / 60);
}

Consumo()
{
    ConsumoA = Distancia / QtdLitros;
}

Veloz()
{
    if (MaiorVel < VelocidadeMediaKm)
        MaiorVel = VelocidadeMediaKm;
}

Economico()
{
    if (MenorConsumo > ConsumoA)
        MenorConsumo = ConsumoA;
}