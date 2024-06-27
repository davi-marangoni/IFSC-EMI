#include <stdio.h>
#include <stdlib.h>

void main()
{
    int num, cont, soma, mult;
    cont = 1;
    soma = 0;
    mult = 1;
    while (cont <= 5)
    {
        printf("Informe um número inteiro: ");
        scanf("%d", &num);
        if (num % 2 == 0)
        {
            soma = soma + num;
        }
        else
        {
            mult = mult * num;
        }
        cont++;
    }
    printf("A soma dos pares é %d\n ", soma);
    printf("A multiplicação dos impares é %d ", mult);
}