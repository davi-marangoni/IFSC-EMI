// 14) Faça um programa  que leia 10 números inteiros, armazene-os num vetor e imprima em ordem decrescente.
// (Ordenação Bubble sort).

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, j;
    int a[10], aux;
    for (x = 0; x < 10; x++)
    {
        printf("Informe os números!\n");
        scanf("%d", &a[x]);
    }
    for (j = 0; j < 9; j++)
    {
        for (x = 0; x < 10; x++)
        {
            if (a[x] < a[x + 1])
            {
                aux = a[x];
                a[x] = a[x + 1];
                a[x + 1] = aux;
            }
        }
    }
    for (x = 0; x < 10; x++)
    {
        printf("%d\n", a[x]);
    }
}