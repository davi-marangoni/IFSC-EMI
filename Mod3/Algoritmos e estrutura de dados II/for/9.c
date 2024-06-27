// 9) Numa universidade existem 03 cursos de Engenharia:
// 1 – Engenharia de Software,
// 2 – Engenharia Mecânica e
// 3 – Engenharia Elétrica.
// Desenvolva um programa em Linguagem C, que cadastre os seguintes dados dos alunos:
// Curso, Número de matricula, sexo, nota da 1º Prova e nota da 2º Prova e frequência.
// O programa, ao iniciar, deverá pedir a quantidade de alunos que se deseja cadastrar e deverá imprimir:
//
// a) O número de matrícula, sua média, frequência e se o mesmo está: aprovado, em exame ou reprovado;
// b) A quantidade de alunos de cada turma.
// c) A média geral total (somatória de todas as turmas) e número de aprovados;
// d) A média geral de cada turma para passar para o MEC;
// e) A média dos meninos e das meninas;
// f) O número de matrícula e a média de quem tirou a maior e menor média;
//
// Obs: Media é composta por: 60% 1º prova + 40% 2º prova; sendo que:
// Aprovados: média maior ou igual a 7;
// Exame: média menor que 7 e maior ou igual a 3;
// Reprovado: média menor que 3. Se frequência for menor que 75 % o aluno está reprovado.

#include <stdio.h>
#include <stdlib.h>

int main()

{
    int nCurso, nMatri, nSexo, nAluno, nCont, nSoft, nMec, nEle, nAprov, nMas, nfe, nMaiorMat, nMenorMat;
    float nNota, nNota2, nFreq, nMedia, nMediatot, nMediasoft, nMediamec, nMediaele, nMasmed, nfesmed, nMedmaior, nMedmenor;
    nSoft = nMec = nEle = nMediatot = nAprov = nMediasoft = nMediamec = nMediaele = nMas = nfe = 0;

    printf("Informe a quantidade de alunos que é necessario cadastrar !\n");
    scanf("%d", &nAluno);

    for (nCont = 0; nCont < nAluno; nCont++)
    {
        printf("Digite o seu curso, EX:1=ES,2=EM, 3=EE\n");
        scanf("%d", &nCurso);
        printf("Digite a sua matricula\n");
        scanf("%d", &nMatri);
        printf("digite seu sexo, EX: 1-Masculino, 2-Feminino\n");
        scanf("%d", &nSexo);
        printf("Informe a primeira nota\n");
        scanf("%f", &nNota);
        printf("Informe a segunda nota nota\n");
        scanf("%f", &nNota2);
        printf("Informe a frequencia do aluno\n");
        scanf("%f", &nFreq);

        nMedia = (nNota * 0.6) + (nNota2 * 0.4);
        if (nCont == 0)
        {
            nMedmaior = nMedmaior = nMedia;
            nMedmenor = nMenorMat = nMatri;
        }
        else
        {
            if (nMedia > nMedmaior)
            {
                nMedmaior = nMedia;
                nMaiorMat = nMatri;
            }
            else if (nMedia < nMedmenor)
            {
                nMedmenor = nMedia;
                nMenorMat = nMatri;
            }
        }
        nMediatot += nMedia;

        if ((nMedia>=7) && (nFreq >75))
        {
            printf("Matricula : %d, media: %.2f, frequencia: %.2f, APROVADO\n", nMatri, nMedia, nFreq);
            nAprov++;
        }
        else if ((nMedia>3) && (nFreq>75))
        {
            printf("Matricula : %d, media: %.2f, frequencia: %.2f, EXAME\n", nMatri, nMedia, nFreq);
        }
        else
        {
             printf("Matricula : %d, media: %.2f, frequencia: %.2f, REPROVADO\n", nMatri, nMedia, nFreq);

        }

        if (nCurso==1)
        {
            nMediasoft += nMedia;
            nSoft++;
        }
        else if (nCurso==2)
        {
            nMediamec += nMedia;
            nMec++;
        }
        else
        {
            nMediaele += nMedia;
            nEle++;
        }

        if (nSexo==1)
        {
            nMasmed += nMedia;
            nMas++;
        }
        else
        {
            nfesmed += nMedia;
            nfe++;
        }
    }

    printf("b) Quantidade de alunos: EngSoft :%d - EngMec :%d - EngEle : %d \n", nSoft, nMec, nEle);
    printf("c)A media geral total : %.2f\n", nMediatot / nAluno);
    printf("c) Aprovados :%d\n", nAprov);
    printf("d) Media Soft :%.2f\n", nMediasoft / nSoft);
    printf("d) Media Mecanica :%.2f\n", nMediamec / nMec);
    printf("d) Media Eletrica :%.2f\n", nMediaele / nEle);
    printf("e) Media Masculuno :%.2f\n", nMasmed / nMas);
    printf("e) Media Feminina :%.2f\n", nfesmed / nfe);
    printf("f) Matricula :%d - maior média :%.2f\n", nMaiorMat, nMedmaior);
    printf("f) Matricula :%d - menor média :%.2f\n", nMenorMat, nMedmenor);
}