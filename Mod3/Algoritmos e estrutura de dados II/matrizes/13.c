// 13) Faça um programa  que peça o número de alunos de uma sala, peça para cada aluno sua idade,
// altura e sexo(1-masculino/2-feminino) e armazene estas informações em uma matriz(float alunos[qtd] [3])
// no final calcule e imprima:
//
// a) A maior e a menor altura da turma;
// b) A média de altura das mulheres;
// c) A média de altura dos homens;
// d) A média de idade da turma.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    float nMair = 0, nMenor = 3, nAltMu, nAlthom, nConth = 0, nContM = 0, nTotidade = 0;
    int nQtd, x, y;
    printf("Digite a quantidade de alunos na sala ");
    scanf("%d", nQtd);
    float nAluno[nQtd][3];
    for (x = 0; x < nQtd; x++)
    {
        printf("Digite a idade \n");
        scanf("%f", &nAluno[x][0]);

        printf("Digite a altura \n");
        scanf("%f", &nAluno[x][1]);

        printf("Digite o sexo 1=M 2=F \n");
        scanf("%f", &nAluno[x][2]);
        nTotidade += nAluno[x][0];
        if (nAluno[x][1] > nMair)
        {
            nMair = nAluno[x][1];
        }

        if (nAluno[x][1] < nMenor)
        {
            nMenor = nAluno[x][1];
        }

        if (nAluno[x][2] == 1)

        {
            nAlthom += nAluno[x][1];
            nConth++;
        }
        else
        {
            nAltMu += nAluno[x][1];
            nContM++;
        }
    }
    printf("A Maior altura foi %.2f e a menor é %.2f \n", nMair, nMenor);
    printf("A media masculina é %f.2 \n ", nAlthom / nConth);
    printf("A media feminina  é %f.2 \n ", nAltMu / nContM);
    printf("A media de idade é %2f \n ", nTotidade / nQtd);
}