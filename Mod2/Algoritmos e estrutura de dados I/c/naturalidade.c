#include <stdio.h>
#include <string.h>

main()
{
    char estado[3];
    printf("Informe a sigla de um estado do Brasil: ");
    scanf("%s", estado);
    if (!strcmp(estado, "MG") || !strcmp(estado, "mg"))
        printf("Mineiro\n");
    else if (!strcmp(estado, "RJ") || !strcmp(estado, "rj"))
        printf("Carioca\n");
    else if (!strcmp(estado, "SP") || !strcmp(estado, "sp"))
        printf("Paulista\n");
    else
        printf("Outros estados\n");
    printf("\n");
    system("pause");
    return 0;
}