// 1) Faça um programa que tenha uma procedure que peça um valorem segundos e transforme em horas, minutos e segundos. 
// Criar uma função que transforme essas horas, minutos e segundos em segundos (com passagem de parâmetros).

#include <stdio.h>

void ConvHora(float nSeg)
{
    float nHora, nMinutos;
    if (nSeg >= 3600)
    {
        nHora = nSeg / 3600;
        printf("Horas: %f\n", nHora);
        nSeg = nSeg - (3600 * nHora);
    }
    nMinutos = nSeg / 60;
    printf("Minutos: %f\n", nMinutos);
}

int main()
{
    float nSeg = 3665;
    printf("Segundos: %f\n", nSeg);
    float nMinutos = nSeg / 60;
    nSeg = nSeg - (60 * nMinutos);
    printf("Segundos: %f\n", nSeg);
    return 0;
}
