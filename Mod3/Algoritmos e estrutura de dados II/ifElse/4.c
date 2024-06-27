// 4) Fazer um programa para receber um número inteiro de segundos do usuário e imprimir a quantidade
// correspondente em horas, minutos e segundos.

#include <stdio.h>
#include <stdlib.h>

main()
{
    float juvenal, gilberto, jefferson;
    printf("fale os segundos: ");
    scanf("%f", &juvenal);

    gilberto = juvenal / 60;

    jefferson = juvenal / 3600;

    printf("os segundos em minutos sao: %f\n", gilberto);
    printf("os segundos em horas sao: %f", jefferson);
}