#include <stdio.h>
#include <stdlib.h>
#include <string.h>
main()
{
    char nome[30];
    int cont;
    printf("informe um nome:");
    gets(nome);
    for (cont = 0; cont <= 3; cont++)
        printf("\%c", nome[cont]);
    printf("\n\n");
    system("PAUSE");
    return 0;
}