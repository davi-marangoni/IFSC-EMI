#include <stdio.h>
#include <stdlib.h>

void main()
{
    float nota, soma, media;
    int cont;
    cont = 1;
    soma = 0;
    media = 0;
    while (cont <= 4)
    {
        printf("Digite a nota: ");
        scanf("%f", &nota);
        soma = soma + nota;
        media = soma / cont;
        cont++;
    }
    if (media >= 7)
    {
        printf("APROVADO");
    }
    if (media >= 5 && media < 7)
    {
        printf("EM EXAME");
    }
    if (media < 5)
    {
        printf("REPROVADO");
    }
}