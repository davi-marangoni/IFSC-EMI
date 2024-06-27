// 12) Um dado é lançado 10 vezes. Para cada lançamento, o valor correspondente é anotado (de 1 a 6 ) em um cartão.
// Faça um programa para:
//
// a) Ler todos os dados para a memória do computador(Vetor);
// b) Determinar o número de lançamentos nos quais o resultado obtido é maior que a média aritmética dos 10 lançamentos.
// c) Determinar a porcentagem de ocorrência da face 6.

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int x, nDados[10], nMaior = 0, nCont = 0, nCont6 = 0;
    float nMedia = 0;
    srand(time(NULL));
    for (x = 0; x < 10; x++)
    {
        printf("Informe a rolagem %d: ", x+1);
        scanf("%d", &nDados[x]);
        nMedia += nDados[x];
        if (nDados[x] > nMedia / 10)
        {
            nCont++;
        }
        if (nDados[x] == 6)
        {
            nCont6++;
        }
    }
    printf("A media é %f \n", nMedia / 10);
    printf("O numero de lançamentos maiores que a media é %d \n", nCont);
    printf("A porcentagem de ocorrência da face 6 é %d \n", nCont6 * 10);
}