// 2) Faça um programa que leia o preço de 3 produtos. Faça uma procedure para ler, outra para ordenar
// ( em ordem de preço ) e outra para mostrar os dados.(sem passagem de parâmetros)

#include <stdio.h>
#include <stdlib.h>

float preco[3];

void ler()
{
    int x;
    for (x = 0; x < 3; x++)
    {
        printf("Informe o preço %d\n", x + 1);
        scanf("%f", &preco[x]);
    }
}

void ordenar()
{
    int x, y;
    float nAux;
    for (x = 0; x < 3; x++)
    {
        for (y = x + 1; y < 3; y++)
        {
            if (preco[x] > preco[y])
            {
                nAux = preco[x];
                preco[x] = preco[y];
                preco[y] = nAux;
            }
        }
    }
}

void mostrar()
{
    int x;
    for (x = 0; x < 3; x++)
    {
        printf("Produto %d = R$ %.2f\n", x + 1, preco[x]);
    }
}

main()
{
    ler();
    ordenar();
    mostrar();
}