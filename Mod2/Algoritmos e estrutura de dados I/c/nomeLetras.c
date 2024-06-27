#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main()

{
    int cont, tam;
    char nome[30];
    for (cont = 1; cont <= 4; cont++)
    {

        printf("Digite um nome: ");
        gets(nome);
        // na variavel tam ficará guardado quantas letras tem o nome
        tam = strlen(nome);
        printf("\nEsse nome tem %d\ letras.\n\n", tam);
    }
    printf("\n\n");
    system("pause");
    return 0;
}