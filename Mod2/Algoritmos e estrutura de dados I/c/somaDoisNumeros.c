 	

/*soma de dois números em C*/
#include <stdio.h>
#include <stdlib.h>

void main()
{
    int num1, num2, soma;
    printf("Digite o primeiro número\n"); //mostra na tela
    scanf("%d",&num1); //local onde vai ser escrito
    printf("Digite o segundo número\n");
    scanf("%d",&num2);
    soma=num1+num2;
    printf("A soma é: %d\n",  soma);
}