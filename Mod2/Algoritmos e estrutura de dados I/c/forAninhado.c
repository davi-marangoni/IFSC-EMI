#include <stdio.h>
#include <string.h>

main()

{
    int cont, cont1, tam;
    char nome[30];
    printf("Digite uma palavra: ");
    gets(nome);
    tam = strlen(nome);
    for (cont = 1; cont <= tam; cont++)
    {
        for (cont1 = 1; cont1 <= cont; cont1++)
            printf("%s\t", nome);
        printf("\n");
    }
    system("pause");
    return 0;
}