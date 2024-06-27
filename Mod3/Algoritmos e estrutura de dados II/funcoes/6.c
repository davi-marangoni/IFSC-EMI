// 6)  Desenvolva um programa em C para atender a seguinte necessidade:
//
// Uma Oficina solicitou um software, para orçar os custos de seus serviços. Ao executar este programa,
// o mesmo deve funcionar continuamente, até que o usuário deseje finalizar orçamentos.
// Ao encerrar o sistema deve mostrar o valor total de todos os orçamentos e a sua quantidade.
// Para cada veículo orçado, o programa deve solicitar:
//     - a placa do veículo;
//     - total de horas trabalhadas no veículo (crie a função CalculaHoras que retorna o custo das horas gastas
//       com a mão-de-obra);
//     - custo das peças;
//     - se precisa fazer balanceamento no veículo;
// Sendo impresso em seguida, o custo total para a manutenção do veículo.
// Parâmetros necessários para o cálculo do custo:
//     - o valor unitário da hora trabalhada é R$ 100,00;
//     - o valor do balanceamento é de R$ 50,00;
// Obs: Não esqueça que após o usuário solicitar o encerramento do programa, o sistema deve imprimir o
// valor total de todos os orçamentos realizados e a quantidade.

#include <stdio.h>

float Total, TotalBalanceamento;

void CalculaHoras()
{
    float horastrab;
    printf("Informe quantas horas foram trabalhadas no veiculo\n");
    scanf("%f", &horastrab);
    Total = (horastrab * 100);
}

main()
{
    int numCont, placa, Cont, x;
    int balanceameto;
    float pecas, TotTudo, totaldetodos;
    Cont = totaldetodos = 0;
    printf("Deseja continuar: 0-Nao, 1-Sim\n");
    scanf("%d", &numCont);
    while (numCont == 1 && numCont != 0)
    {
        printf("Informe a placa do veiculo\n");
        scanf("%d", &placa);
        CalculaHoras();
        printf("Sera ncessario balanceamento? 0-Nao, 1-Sim\n");
        scanf("%d", &balanceameto);
        if (balanceameto == 1)
        {
            TotalBalanceamento = Total + 50;
        }
        else
        {
            TotalBalanceamento = Total + 0;
        }
        printf("Informe o custo das pecas\n");
        scanf("%f", &pecas);
        TotTudo = TotalBalanceamento + pecas;
        Cont++;
        printf("Deseja continuar: 0-Nao, 1-Sim\n");
        scanf("%d", &numCont);
        totaldetodos += TotTudo;
    }
    printf("A quantidade de orcamentos do dia é: %d\n", Cont);
    printf("O valor de todos os orcamentos é %.2f", totaldetodos);
}