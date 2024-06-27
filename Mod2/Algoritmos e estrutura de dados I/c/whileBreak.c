#include <stdio.h>
#include <stdlib.h>

void main()
{
    int numero, cont, soma;
    cont = 1;
    soma = 0;
    printf("Digite um valor (-1 para encerrar!)");
    scanf("%d", &numero);
    while (numero != -1) // diferente
    {
        soma = soma + numero;
        cont++;
        printf("Digite um valor (-1 para encerrar!)");
        scanf("%d", &numero);
    }
    printf("A soma dos números digitados é: %d", soma);
}