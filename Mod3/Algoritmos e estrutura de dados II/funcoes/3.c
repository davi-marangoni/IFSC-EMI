// 3) Faça um programa que tenha uma procedure que peça um valor em horas, minutos e segundos e transforme em segundos
// (com passagem de parâmetros).

#include <stdio.h>
#include <stdlib.h>

nConvSeg(float nHoras)
{
    float nMin, nSeg;
    nMin = nHoras * 60;
    printf("Minutos : %.0f\n", nMin);
    nSeg = nHoras * 3600;
    printf("Segundos : %.0f\n", nSeg);

    printf("Horas : %.0f\n", nHoras);
}
main()
{
    float nHoras;
    printf("Informe o valor em horas\n");
    scanf("%f", &nHoras);
    nConvSeg(nHoras);
}