// 9) Uma empresa vende 30 artigos. Cada artigo é identificado por um código e possui um preço.
// Faça um programa que armazene todos os códigos e preços (armezene-os em uma matriz[30][2])
// e depois imprima o produto mais caro e o mais barato.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int codigo[5];
    float valor[5];
    int imaior = 0;
    int imenor = 0;
    float maior = 0;
    float menor = 10000;
    int i;

    for (i = 0; i < 5; i++)
    {
        codigo[i] = 0;
        valor[i] = 0;
    }
    
    for (i = 0; i < 5; i++)
    {
        printf("Código");
        scanf("%d", &codigo[i]);
        printf("Valor");
        scanf("%f", &valor[i]);
        printf("\n");
        if (valor[i] < menor)
        {
            menor = valor[i];
            imenor = i;
        }
        if (valor[i] > maior)
        {
            maior = valor[i];
            imaior = i;
        }
    }

    printf("\n Código menor %d", codigo[imenor]);
    printf("\n Valor menor %f", valor[imenor]);

    printf("\n Código maior %d", codigo[imaior]);
    printf("\n Valor maior %f", valor[imaior]);
}