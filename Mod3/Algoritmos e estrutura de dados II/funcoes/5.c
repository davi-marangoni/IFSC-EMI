// 5 Escreva uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘-’ e ‘| ‘.
// O usuário pode escolher o tamanho (Lado x Altura).

#include <stdio.h>
#include <stdlib.h>

void reg(int altura, int comp)
{
    int x, y;
    for (x = 0; x < altura + 1; x++)
    {
        if ((x == 0) || (x == altura))
        {
            printf("+");
            for (y = 0; y < comp; y++)
            {
                printf("-");
            }
            printf("+\n");
        }
        else
        {
            printf("|");
            for (y = 0; y < comp; y++)
            {
                printf(" ");
            }
            printf("|\n");
        }
    }
}
main()
{
    int altura, comp;
    printf("Informe o valor do comprimento\n");
    scanf("%d", &comp);
    printf("Informe o valor da altura\n");
    scanf("%d", &altura);
    
    reg(altura, comp);
}
