// 15) Para um aluno ser considerado aprovado em uma determinada disciplina é necessário que ele possua nota
// igual ou superior a média da turma.
//
// Sabendo que a turma é composta por 15 alunos, Armazene o nome dos alunos(em uma matriz char Nome[15][50]),
// e suas 3 notas e a média (em uma matriz float nota[15][4]);
//
// Imprima a média da turma(todos os alunos) e depois imprima o nome dos alunos aprovados e sua respectiva média
// em relação à média da turma.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, y;
    float nNota[14][4], nTotMedia, a[1];
    char sNome[15][50], nNomeMe;

    for (x = 0; x < 2; x++)
    {
        printf("digite seu nome\n");
        scanf("%s", &sNome[x]);
        printf("Digite a 1 nota \n");
        scanf("%f", &nNota[x][0]);
        printf("Digite a 2 nota \n");
        scanf("%f", &nNota[x][1]);
        printf("Digite a 3 nota \n");
        scanf("%f", &nNota[x][2]);
        nNota[x][3] = (nNota[x][0] + nNota[x][1] + nNota[x][2]) / 3;
        nTotMedia += nNota[x][3];
    }
    for (x = 0; x < 2; x++)
    {
        printf("%s teve a nota: %f\n", sNome[x], nNota[x][3]);
    }

    for (x = 0; x < 2; x++)
    {
        if (nNota[x][3] >= nTotMedia / 2)
        {
            printf("%s teve a nota e foi aprovado %f\n", sNome[x], nNota[x][3]);
        }
    }
}