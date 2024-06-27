#include <stdio.h>
#include <stdlib.h>

void main ()
{
    int num, cont, soma;
    float media;
    cont=1;
    soma=0;

    while (cont<=3) {
        printf("Informe um número inteiro: ");
        scanf("%d", &num);
        soma= soma+num;
        media=soma/cont;
        cont++;
    }
    printf("A soma é: %.2d\n", soma);
    printf("A média é: %.2f", media);
}