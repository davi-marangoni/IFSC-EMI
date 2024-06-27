// 7) Desenvolva um programa em Linguagem C, que cadastre 10 atletas corredores dos 100 metros rasos.
// Para cada atleta o usuário deve informar o nome, sexo, o tempo.
// Ao concluir deve imprimir:
// a) O nome do atleta, seu tempo e se o mesmo está aprovado ou reprovado.
// Obs: Os homens são aprovados quanto tempo for menor que 10 segundos, e as mulheres quando for menor que 11 segundos.
// b) A média de tempo geral e o número de atletas aprovados;
// c) A média de tempo dos meninos e das meninas;
// d) O nome e o tempo de quem teve a melhor marca (menor tempo).

#include <stdio.h>
#include <stdlib.h>

int main()

{
    int nSexo, nCont, nContapro, nMas, nFem, nMelhorNome;
    float nTempo, nTotTemp, nMediaM, nMediaF, nMedia, nMelhorTemp;
    char nome[50];
    nContapro = nMas = nFem = 0;
    nCont = 0;
    while (nCont < 2)

    {
        printf("Informe o nome do atleta !\n");
        scanf("%s", nome);
        printf("Informe o seu sexo, EX:1-Masculino 2-Feminino\n");
        scanf("%d", &nSexo);
        printf("Informe o tempo do atleta\n");
        scanf("%f", &nTempo);

        if ((nSexo == 1) && (nTempo < 10))
        {
            printf("O atleta :%s, o tempo: %.2f , foi Aprovadoo!\n ", nome, nTempo);
            nContapro++;
        }
        else if ((nSexo == 2) && (nTempo < 11))
        {
            printf("O atleta :%s, o tempo: %.2f , foi Aprovadoo!\n ", nome, nTempo);
            nContapro++;
        }
        else
        {
            printf("O atleta :%s, o tempo: %.2f , foi Reprovado!\n ", nome, nTempo);
        }
        
        if (nSexo == 1)
        {
            nMediaM += nTempo;
            nMas++;
        }
        else
        {
            nMediaF += nTempo;
            nFem++;
        }

        if (nCont == 0)
        {
            nMelhorTemp = nTempo;
            nMelhorNome = nome;
        }
        else
        {
            if (nTempo > nMelhorTemp)
            {
                nMelhorTemp = nTempo;
                nMelhorNome = nome;
            }
            nMedia += nTempo / 2;
            nCont++;
        }
    }
    printf("A media é :%f, e o numeros de aprovados são %d !\n", nMedia, nContapro);
    printf("A media Masculina é :%.2f !\n", nMediaM / nMas);
    printf("A media Feminina é :%.2f !\n", nMediaF / nFem);
    printf("Atleta %s, teve o melhor tempo: %f", nome, nMelhorTemp);
}