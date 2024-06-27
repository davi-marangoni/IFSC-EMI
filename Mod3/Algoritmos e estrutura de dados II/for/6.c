// 6) Para calcular o seu salário, faça um programa que pergunte qual o mês, seu valor hora,
// o número de horas trabalhadas e a porcentagem de desconto de imposto de renda, ISS e Sindicato.
// Após isso mostre o mês, valor bruto do seu salário, o valor de cada desconto e o valor do salário líquido.
// Obs: Caso o mês seja igual a 12, duplique o salário bruto (referente ao 13º salário) antes de calcular
// os descontos e o salário líquido.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int nMes;
    float nQtdhor, nIR, nIss, nSind, nValor, nSalbru, nValohour, nSalliq;

    printf("Qual mes é em numeros !\n");
    scanf("%d", &nMes);
    printf("Quantas horas!\n");
    scanf("%f", &nQtdhor);
    printf("Valor da hora\n");
    scanf("%f", &nValohour);
    printf("Qunato Iss \n");
    scanf("%f", &nIss);
    printf("Qual IR\n");
    scanf("%f", &nIR);
    printf("Qual sindicado\n");
    scanf("%f", &nSind);

    nSalbru = nValohour + nQtdhor;

    if (nMes == 12)
    {
        nSalbru *= 2;
    }

    nIR = (nIR * nSalbru) / 100;
    nIss = (nIss * nSalbru) / 100;
    nSind = (nSind * nSalbru) / 100;
    nSalliq = nSalbru - (nIR + nIss + nSind);

    printf("Mes:%d - salario bruto : R$ %.2f\n", nMes, nSalbru);
    printf("descontos: IR= R$ %.2f\n", nIR);
    printf("descontos: Iss= R$ %.2f\n", nIss);
    printf("descontos: Sind= R$ %.2f\n", nSind);
    printf("descontos: Salario liquido= R$ %.2f\n", nSalliq);
}