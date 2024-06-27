// 7) Faça um programa  que leia dois vetores com 10 elementos cada.
// Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos
// intercalados dos dois outros vetores.

#include <stdio.h>
#include <stdlib.h>
#define TAM 10

int main()
{
    int n[TAM], cont, n2[TAM], n3[TAM * 2];

    for (cont = 0; cont < TAM; cont++)
    {
        printf("Informe os números ");
        scanf("%d", &n[cont]);
    }
    for (cont = 0; cont < TAM; cont++)
    {
        printf("Informe os números 2 ");
        scanf("%d", &n2[cont]);
    }
    for (cont = 0; cont < TAM; cont++)
    {
        n3[cont * 2] = n[cont];
    }
    for (cont = 0; cont < TAM; cont++)
    {
        n3[cont * 2 + 1] = n2[cont];
    }
    printf("Insira o vetor 1: ");
    for (cont = 0; cont < TAM; cont++)
    {
        printf("%d ", n[cont]);
    }
    printf("\n");

    printf("Insira o vetor 2: ");
    for (cont = 0; cont < TAM; cont++)
    {
        printf("%d ", n2[cont]);
    }
    printf("\n");

    printf("Insira o vetor 3: ");
    for (cont = 0; cont < TAM * 2; cont++)
    {
        printf("%d ", n3[cont]);
    }
}