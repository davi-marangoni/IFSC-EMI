// Escrever um programa que receba um nome -Que conte o número de
// vogais existentes nele. -O programa deverá imprimir o numero total de
// caracteres do nome -Quantas vogais - E a respectiva porcentagem das
// vogais em relação ao total de caracteres.

#include <stdio.h>
#include <string.h>

main()
{
    char nome[45];
    int cont, tot_letras, tot_vogais = 0;
    float percent;
    printf("Digite um nome: ");
    gets(nome);
    tot_letras = strlen(nome);
    for (cont = 0; cont <= tot_letras; cont++) // repete de acordo com o total de caracteres
        if (nome[cont] == 'a' || nome[cont] == 'A' || nome[cont] == 'e' || nome[cont] == 'E' ||
            nome[cont] == 'i' || nome[cont] == 'I' || nome[cont] == 'o' || nome[cont] == 'O' ||
            nome[cont] == 'u' || nome[cont] == 'U')
            tot_vogais++;
    printf("\n O nome tem %d caracteres: ", tot_letras);
    printf("\n\n");
    printf("\n O nome tem %d vogais: ", tot_vogais);
    printf("\n\n");
    percent = (tot_vogais * 100) / tot_letras;
    printf("\n %f porcento do nome %s sao vogais: ", percent, nome);
    printf("\n\n");
    system("pause");
    return (0);
}