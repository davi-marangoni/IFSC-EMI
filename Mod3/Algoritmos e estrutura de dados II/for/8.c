// 8) Faça um programa que simule um computador de bordo de 8 veículos. Para cada veículo solicite MODELO;
// a DISTÂNCIA e TEMPO percorrido de viagem e calcule a velocidade média;
// o CONSUMO em litros e a DISTÂNCIA em quilômetros e calcule o consumo(km / l).
// Ao final mostre o carro mais rápido e o mais econômico.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, d, ccc, vm2;
    float b, c, vm, e, cc;
    for (d = 0; d < 8; d++)

    {

        printf("Insira o modelo do veiculo \n");
        scanf("%d", &a);
        printf("Insira a distancia percorrida pelo veiculo \n");
        scanf("%f", &b);
        printf("Insira o tempo da distancia percorrida \n");
        scanf("%f", &c);
        printf("Insira o consumo de gasolina do  veiculo \n");
        scanf("%f", &e);

        vm = b / c;
        cc = b / e;

        printf(" \n A velocidade media do veiculo foi %f", vm);
        printf("\n A media de uso do combustivel  foi %f", cc);
        printf("\n \n");
    }

    if (d == 0)
    {
        ccc = cc;
        vm2 = vm;
    }

    if (cc > ccc)
    {
        printf("\n O carro mais economico foi o %d", a);
    }

    if (vm > vm2)
    {
        printf("\n O carro mais rapido foi %d", a);
    }
}