// 2) Faça um programa que peça a matricula de dez alunos e armazene num vetor.
// Peça também as quatro notas desses 10 alunos, calcule e armazene em outro vetor a média de cada aluno.
// Imprima a matricula de cada aluno seguido de sua média.

#include <stdio.h>
#include <stdlib.h>

main()
{
    int cont, matri[10];
    float n1, n2, n3, n4, media[10];

    for (cont = 0; cont < 10; cont++)
    {
        printf("Informe a matricula dos alunos ");
        scanf("%d", &matri[cont]);
        printf("Informe a 1 nota \n");
        scanf("%f", &n1);
        printf("Informe a 2 nota \n");
        scanf("%f", &n2);
        printf("Informe a 3 nota \n");
        scanf("%f", &n3);
        printf("Informe a 4 nota \n");
        scanf("%f", &n4);

        media[cont] = (n1 + n2 + n3 + n4) / 4;
        
        printf("Media do aluno %d é  %.2f\n", matri[cont], media[cont]);
    }
}