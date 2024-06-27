// 8) Faça um programa  que leia um vetor A (Inteiro) e ao final gere um vetor B resultante da inversão do vetor A.

#include <stdio.h>

main()
{
    int a;
    int vetor[10];
    for (a = 0; a < 10; a++)
    {
        printf("Informe um número: ");
        scanf("%d", &vetor[a]);
    }
    printf("Números digitados: ");
    for (a = 0; a < 10; a++)
    {
        printf(" %d ", vetor[a]);
    }
    printf("\n");
    printf("Vetor invertido: ");
    for (a = 10 - 1; a >= 0; a--)
        printf(" %d ", vetor[a]);
    printf("\n");
}