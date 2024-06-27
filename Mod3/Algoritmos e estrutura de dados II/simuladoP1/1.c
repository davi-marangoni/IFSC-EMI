// 1) Elabore um algoritmo que leia o valor inicial, o valor final e o mesmo mostre todos os valores pares entre eles.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numinicial, numfinal, numeropar;

    numeropar = 0;

    printf("qual o numero inicial? \n");
    scanf("%d", &numinicial);

    printf("qual o numero final? \n");
    scanf("%d", &numfinal);

    while (numinicial < numfinal)
    {
        if (numinicial % 2 == 0)
        {

            printf("%d \n", numinicial);
        }

        numinicial++;
    }
}