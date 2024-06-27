#include <stdio.h>
#include <stdlib.h>

void main()
{
    float venda, lucro;
    printf("Informe o valor das vendas \n");
    scanf("%f",&venda);

    lucro=venda*0.12;

    printf("O lucro é: %.2f", lucro);
}