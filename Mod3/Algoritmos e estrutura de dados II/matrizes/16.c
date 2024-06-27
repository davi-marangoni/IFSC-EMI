// 16) Desenvolva um programa em C para realizar 15 orçamentos e guarde-os em uma matriz (15x5) float veiculo[15][5];
// Para cada veículo orçado, o programa deve guardar na matriz:
//     - código do veículo;
//     - total de mão de obra. Solicite a quantidade de horas trabalhadas no veículo que multiplica esta
//       quantidade de horas pelo valor hora, que é R$ 110,00.
//     - Valor das peças;
//     - O Valor do balanceamento. Solicite se o usuário deseja fazer o balanceamento,
//       caso sim acrescente R$50,00 no orçamento.
//     - Total do orçamento (mão de obra + peças + balanceamento(se houver)).
// Em seguida imprima o custo total para a manutenção do veículo;
// Ao final dos 15 orçamentos, mostre na tela:
//     - os dados da matriz;
//     - valor total com a soma de todos os 15 orçamentos;
//     - veículo (código) que gerou o maior orçamento e seu respectivo valor (Total do orçamento).

#include <stdio.h>
main()
{
    float veiculo[15][5], qtdhoras, nTotal = 0, ValMaior = 0, CodMaior;
    int nbala, x;
    for (x = 0; x < 15; x++)
    {
        printf("Informe o código");
        scanf("%f", &veiculo[x][0]);
        printf("Informe a quantidade de horas trabalhadas");
        scanf("%f", &qtdhoras);
        veiculo[x][1] = qtdhoras * 110;
        printf("Informe o valor da peças do veiculo");
        scanf("%f", &veiculo[x][2]);
        printf("Informe o balanceamento 1-sim, 0-nao");
        scanf("%d", &nbala);
        if (nbala == 1)
        {
            veiculo[x][3] = 50;
        }
        else
        {
            veiculo[x][3] = 0;
        }
        veiculo[x][4] = (veiculo[x][1] + veiculo[x][2] + veiculo[x][3]);
        nTotal += veiculo[x][4];
        if (veiculo[x][4] > ValMaior)
        {
            ValMaior = veiculo[x][4];
            CodMaior = veiculo[x][0];
        }
    }
    for (x = 0; x < 15; x++)
    {
        printf("Codigo\n%f", veiculo[x][0]);
        printf("Mão de obra\n%f", veiculo[x][1]);
        printf("Peças\n%f", veiculo[x][2]);
        printf("Balanceamento\n%f", veiculo[x][3]);
        printf("Total gasto\n%f", veiculo[x][4]);
    }
    printf("Total dos orcamentos = %f", nTotal);
    printf("Orcamento mais caro cod: %.0f - Valor R$ %.2f", CodMaior, ValMaior);
}