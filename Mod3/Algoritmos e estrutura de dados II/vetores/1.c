// 1) Faça um programa que peça as quatro notas de 10 alunos,
// calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int cont, n1, n2, n3, n4, aprov, media[4];
    aprov = 0;
    
    for (cont = 0; cont < 10; cont++)
    {

        printf("Informe a 1 nota \n");
        scanf("%d", &n1);
        printf("Informe a 2 nota \n");
        scanf("%d", &n2);
        printf("Informe a 3 nota \n");
        scanf("%d", &n3);
        printf("Informe a 4 nota \n");
        scanf("%d", &n4);

        media[cont] = (n1 + n2 + n3 + n4) / 4;

        printf("Media é  %d \n", media[cont]);

        if (media[cont] > 7)
        {
            aprov++;
        }
        printf("A quantidade de aprovados são %.2d\n", aprov);
    }
}