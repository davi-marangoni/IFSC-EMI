// 6) Faça um programa que leia 20 números inteiros e armazene-os num vetor.
// Armazene os números pares no vetor PAR e os número IMPARES no vetor impar.
// Imprima os três vetores.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int num[20], cont, numI[20], numP[20];

    for (cont = 0; cont < 20; cont++)
    {
        printf("Informe os números ");
        scanf("%d", &num[cont]);
    }

    for (cont = 0; cont < 20; cont++)
    {
        if (num[cont] % 2 == 0)
        {
            printf("O número: %.2d é par \n", num[cont]);
        }
        else
        {
            printf("O número:%.2d é impar\n", num[cont]);
        }
    }
}