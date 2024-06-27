// 4) Em uma construção a quantidade de concreto é estimada em 10 kg por m².
// O mestre de obras precisa saber quantos pacotes de 1 kg ele precisa para preencher o chão da construção.
// O usuário precisa informar as medidas (l)largura x (c)comprimento e o algoritmo deverá calcular
// quantos pacotes serão necessários.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float comp, larg, formula, formula2;

    printf("qual a largura? \n");
    scanf("%f", &larg);

    printf("qual o comprimento? \n");
    scanf("%f", &comp);

    formula = comp * larg;

    formula2 = formula * 10;

    printf("Para preencher o chão será necessario(utilizando sacos de 1 kg): %f", formula2);
}