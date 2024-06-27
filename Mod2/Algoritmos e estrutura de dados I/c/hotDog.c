#include <stdio.h>
#include <stdlib.h>

void main ()
{
    int qtd_hotdog;
    float vlr_hotdog, vlr_vendido, vlr_poup;

    printf ("Informe a quantidade vendida\n");
    scanf("%d", &qtd_hotdog);
    printf ("Informe valor de cada hotdog\n");
    scanf("%f", &vlr_hotdog);

    vlr_vendido=qtd_hotdog*vlr_hotdog;
    vlr_poup=vlr_vendido*0.10;
    
    printf("O valor vendido é %.2f\n", vlr_vendido);
    printf("O valor da poupança é %.2f\n", vlr_poup);
}