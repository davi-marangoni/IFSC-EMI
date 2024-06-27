// 5) Faça um programa  que leia dois vetores A[5] e B[10] e depois:
// a) gere e mostre o vetor C correspondente a união de dos vetores A e B.
// b) gere e mostre o vetor D com elementos e A que não estão em B.

#include <stdio.h>
main()
{
    int a[5], b[10], c[15], d[5], e, f, g, cont;

    for (e = 0; e < 5; e++)
    {
        printf("Informe um valor ");
        scanf("%d", &a[e]);
    }

    for (e = 0; e < 10; e++)
    {
        printf("Informe um outro valor ");
        scanf("%d", &b[e]);
    }

    for (e = 0; e < 10; e++)
    {
        if (e < 5)
        {
            c[e] = a[e];
            c[e + 5] = b[e];
        }
    }

    for (e = 0; e < 15; e++)
    {
        printf("c = %d", c[e]);
    }

    if (g = 0)
    {
        for (e = 0; e < 5; e++)
        {
            cont = 0;
            for (f = 0; f < 10; f++)
            {
                if (a[e] == b[f])
                {
                    cont++;
                }
                if (cont == 0)
                {
                    d[g] = a[e];
                    g++;
                }
            }
        }
        for (e = 0; e < g; e++)
        {
            ("d= %d",
             d[e]);
        }
    }
}