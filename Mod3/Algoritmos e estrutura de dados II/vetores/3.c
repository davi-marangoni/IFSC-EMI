// 3) Faça um programa que peça a idade e a altura de 5 pessoas, 
// armazene cada informação no seu respectivo vetor. 
// Imprima a idade e a altura na ordem inversa a ordem lida.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int cont;
    float altura[5], idade[5];

    for (cont = 0; cont < 5; cont++)
    {
        printf("Informe a idade \n");
        scanf("%f", &idade[cont]);
        printf("Informe a altura\n");
        scanf("%f", &altura[cont]);
    }

    for (cont = 4; cont >= 0; cont--)
    {

        printf("A Altura é %.2f \n ", altura[cont]);
        printf("A idade é %.2f \n", idade[cont]);
    }
}