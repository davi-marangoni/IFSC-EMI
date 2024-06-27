// ler uma palavra e mostrar ela de trás para frente

#include <stdio.h>
#include <string.h>

main()
{
    int cont, tam;
    char nome[30];
    printf("Digite uma palavra: ");
    gets(nome);
    tam = strlen(nome);
    printf("\n A palavra de tras pra frente e: ");
    for (cont = tam; cont >= 0; cont--)
        printf("%c", nome[cont]);
    printf("\n\n");
    system("pause");
    return 0;
}