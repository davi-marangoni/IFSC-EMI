// 11) Faça um programa em C, que solicite 2 vetores, VetorA e VetorB.
// - União de vetores é a junção dos dois vetores.
// - Interseção de vetores são os elementos que são comuns nos dois vetores.
// - Diferença são os elementos que estão em um vetor (Vetor A) e que não estão no outro vetor (Vetor B).
// - Diferença Simétrica consiste em unir os dois Vetores (A e B) e remover os elementos comuns entre eles.
// - Desenvolva um programa que carregue dois vetores A[5] e B[10] e faça:
// a)Gere e imprima o vetor C correspondente a união dos vetores A e B.
// b)Gere e imprima o vetor D com a interseção dos vetores A e B.
// c)Gere e imprima o vetor E com os elementos da diferença de A em relação a B.
// d)Gere e imprima o vetor F com os elementos da diferença simétrica entre os vetores A e B.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[5], b[10], c[15], x[5], f[5], g[15], j, y, nAux, z, h, n;
    h = 0;
    n = 0;
    for (j = 0; j < 5; j++)
    {
        printf("Informe os elementos de A ");
        scanf("%d", &a[j]);
    }
    printf("\n");
    for (j = 0; j < 10; j++)
    {
        printf("Informe os elementos de B ");
        scanf("%d", &b[j]);
    }
    for (j = 0; j < 5; j++)
    {
        c[j] = a[j];
    }
    for (j = 0; j < 10; j++)
    {
        c[j + 5] = b[j];
    }
    for (j = 0; j < 15; j++)
    {
        printf("Vetc[%d] = %d\n", j + 1, c[j]);
    }
    printf("\n");
    z = 0;
    for (j = 0; j < 5; j++)
    {

        nAux = 0;
        for (y = 0; y < 10; y++)
        {
            if (a[j] == b[y])
            {
                nAux++;
            }
        }
        if (nAux >= 1)
        {
            x[z] = a[j];
            z++;
        }
    }

    for (y = 0; y < z; y++)
    {
        printf("vetd[%d] = %d\n", y + 1, x[y]);
    }
    printf("\n");

    for (j = 0; j < 5; j++)
    {
        nAux = 0;
        for (y = 0; y < 10; y++)
        {
            if (a[j] == b[y])
            {
                nAux++;
            }
        }
        if (nAux == 0)
        {
            f[h] = a[j];
            h++;
        }
    }
    for (j = 0; j < 5; j++)
    {
        nAux = 0;
        for (y = 0; y < 10; y++)
        {
            if (a[j] == b[y])
            {
                nAux++;
            }
        }
        if (nAux == 0)
        {
            f[h] = a[j];
            h++;
        }
    }
    for (y = 0; y < h; y++)
    {
        printf("vete[%d] = %d\n", y + 1, f[y]);
    }
    for (y = 0; y < h; y++)
    {
        printf("vete[%d] = %d\n", y + 1, f[y]);
    }

    printf("\n");

    for (j = 0; j < 10; j++)
    {
        nAux = 0;
        for (y = 0; y < 5; y++)
        {
            if (b[j] == a[y])
            {
                nAux++;
            }
        }
        if (nAux == 0)
        {
            g[n] = b[j];
            n++;
        }
    }
    for (y = 0; y < n; y++)
    {
        printf("vetf[%d] = %d\n", y + 1, g[y]);
    }
}