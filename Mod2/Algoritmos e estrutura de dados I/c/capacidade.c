/*Desenvolver um algoritmo para ler o número de uma sala de aula,
sua capacidade e o total de alunos matriculados na mesma
e imprimir uma linha mostrando
o número da sala, sua capacidade,
o número de cadeiras ocupadas
e sua disponibilidade indicando se a sala está lotada ou não.*/

#include <stdio.h>
#include <math.h>

int main()
{
    int numerosala, capacidade, alunosmatriculados;
    printf("Informe o número da sala: ");
    scanf("%d", &numerosala);
    printf("Informe a capacidade da sala: ");
    scanf("%d", &capacidade);
    printf("Informe a quantidade de alunos matriculados: ");
    scanf("%d", &alunosmatriculados);
    if (alunosmatriculados >= capacidade)
    {
        printf("SALA = %d\n", numerosala);
        printf("CAPACIDADE = %d\n", capacidade);
        printf("CADEIRAS OCUPADAS = %d\n", alunosmatriculados);
        printf("SALA LOTADA\n");
    }
    else if (alunosmatriculados < capacidade)
    {
        printf("SALA = %d\n", numerosala);
        printf("CAPACIDADE = %d\n", capacidade);
        printf("CADEIRAS OCUPADAS = %d\n", alunosmatriculados);
        printf("SALA NAO LOTADA\n");
    }
    return 0;
}