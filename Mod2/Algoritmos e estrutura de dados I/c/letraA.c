// Receber um nome no teclado e imprimir quantas letras "A" tem o nome.

#include <stdio.h>
#include <string.h>

main()
{
    char nome[30];
    int cont, tam, conta = 0;
    printf("\n\t INFORME UM NOME : ");
    gets(nome);
    tam = strlen(nome);
    for (cont = 0; cont <= tam; cont++)
    {
        if (nome[cont] == 'a' || nome[cont] == 'A')
            conta++;
    }
    printf("\n O nome %s ", (nome));
    printf("tem %d letra a.", conta);
    printf("\n\n");
    system("pause");
    return (0);
}