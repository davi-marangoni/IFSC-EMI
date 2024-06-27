// 4) Faça um programa que leia um vetor A com 10 elementos, 
// calcule e mostre a soma dos quadrados dos elementos do vetor.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int cont;
    float elemento[10], dobro, soma;
    for (cont = 0; cont < 10; cont++)
    {

        printf("Informe o número \n");
        scanf("%f", &elemento[cont]);
        dobro = elemento[cont] * 2;
        soma += dobro;
    }

    printf("Os elementos %.2f \n", soma);
}