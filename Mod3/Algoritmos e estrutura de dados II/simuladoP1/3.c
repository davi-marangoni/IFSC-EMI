// 3) Uma empresa precisa calcular o valor de venda de alguns itens. Existe a seguinte regra:
// Informe o valor do item e a quantidade. Para cada quantidade superior a 5 e a cada 5 quantidades
// o usuário ganha um desconto de 3,5%.

#include <stdio.h>
#include <stdlib.h>

main()
{
    float qtd, valor, Div, Ver, total;
    printf("informe a quantidade\n");
    scanf("%f", &qtd);
    printf("informe valor\n");
    scanf("%f", &valor);
    if (valor >= 5)
    {
        Div = valor / 5;
        Ver = Div * 0.035;
        total = qtd - Ver;
    }
    printf("O valor com o desconto é: %f", total);
}
