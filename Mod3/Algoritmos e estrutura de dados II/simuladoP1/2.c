// 2) O consumo diário de água é estimado em 70 l por pessoa.
// Através de um algoritmo, calcule o consumo mensal, semestral e anual para uma família.
// Informe a quantidade de pessoas da mesma.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int pes, lts, mensal, dias, semes, anual, media, media2;

    printf("Informe a quantidade de pessoas: \n");
    scanf("%d", &pes);
    printf("Informe a quantidade de dias do mês: \n");
    scanf("%d", &dias);
    printf("Informe a quantidade de dias no semestre: \n");
    scanf("%d", &semes);
    printf("Informe a quantidade de dias no ano: \n");
    scanf("%d", &anual);

    lts = 70 * pes;
    mensal = lts * dias;
    media = lts * semes;
    media2 = lts * anual;
    
    printf("Mensal: %d \n", mensal);
    printf("Semestral: %d \n", media);
    printf("Anual: %d  \n", media2);
}