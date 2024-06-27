// 10) Temos dois vetores A e B, com 10 números desconhecido de elementos. 
// Elabore um programa que armazene num vetor C o valor de cada elemento de A elevado ao quadrado, 
// e num vetor D o valor de cada elemento de A multiplicado pelo elemento corresponde em B.
// Exemplo: A[1]=2 B[1]=3 C[1]= 2*2 D[1]=2*3

#include <stdio.h>
#include <stdlib.h>
#define TAM 10

int main()
{
    int a[TAM], b[TAM], i, c[TAM], d[TAM];
    for (i = 0; i < 11; i++)
    {
        printf("Informe os numeros 1.0 ");
        scanf("%d", &a[i]);

        printf("\n");

        printf("Informe os numeros 2.0 ");
        scanf("%d", &b[i]);
    }
    for (i = 0; i < 11; i++)
    {
        c[i] = a[i] * a[i];

        d[i] = a[i] * b[i];
    }
    for (i = 0; i < TAM; i++)
    {
        printf("o valor de cada elemento de A multiplicado pelo elemento corresponde em B%d\n", d[i]);
        printf("o valor de cada elemento de A elevado ao quadrado %d\n", c[i]);
    }
}