// 5)Faça um programa que calcule a quantidade de feijão que você precisa comprar para fazer o evento “FEIJIFSC Chapecó’.
// O programa deverá pedir quantas pessoas irão participar do evento para que você possa realizar o pedido.
// Considere que o mercado vende sacos de 8 kilos por R$ 24,00 e pacotinhos de 2 kilos por R$ 8,00.
// Obs: Cada pes-soa irá consumir em média 500 gramas de  feijão. O sistema deverá orçar as três opções:
// a) Comprando somente sacos de 8 kilos;
// b) Comprando somente pacotinhos de 2 kilos;
// c) Misturando as duas opções, de forma que o preço seja o menor.
// Obs: Aumente 20% a sua compra, para dar uma margem de sobra para os esfomeados.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main()
{
    int nPessoas, nCompraS, nCompraP;
    float nKilo;
    nCompraS = 0;
    nCompraP = 0;
    nKilo = 0;
    nPessoas = 0;

    printf("Escreva quantas pessoas irao no evento FEIJIFSC Chapeco: ");
    scanf("%d", &nPessoas);

    nKilo = ((nPessoas * 500) * 1.2);

    const int nPacote = 2000; // 2kg
    const int nSaco = 8000;   // 8kg

    double nPacotes = nKilo / 2000;
    double nSacos = nKilo / 8000;

    int nSacosA = (ceil(nSacos)); // se for 50p = 4sacos com o ceil
    int nPacotesA = (ceil(nPacotes));

    int intSacos = (floor(nSacos));  // se for 50p = 3 sacos com o floor
    float resto = nSacos - intSacos; // sobra 0,75
    nCompraS = intSacos;             // 3sacos
    if (resto > 0.5)                 // é maior q 0.5 entao deveria comprar +1Saco. 0.5 pq é = a 4000g, se for maior q 4kg compra saco
    {
        nCompraS++; // ou seja, 4 sacos
    }
    else if (resto <= 0.25) // se for menor q 2kg compra 1 pct
    {
        nCompraP++;
    }
    else if ((resto > 0.25) && (resto <= 0.5)) // se for entre 2kg e 4kg compra 2pct
    {
        nCompraP += 2;
    }

    float nValFS = (nCompraS * 24.0);
    float nValFP = (nCompraP * 8.0);
    float nValSS = (nSacosA * 24.0);
    float nValSP = (nPacotesA * 8.0);

    float nValF = (nValFS + nValFP);

    printf("Se comprar somente sacos de 8k, ira dar %d sacos e o preco ficara %.1f reais\n", nSacosA, nValSS);
    printf("Se comprar somente pacotes de 2k, ira dar %d pacotes e o preco ficara %.1f reais\n", nPacotesA, nValSP);
    printf("Para que o preco fique menor, voce tera que comprar %d sacos que custam %.1f reais e %d pacotes que custam %.1f reais, o total ira dar %.1f reais\n", nCompraS, nValFS, nCompraP, nValFP, nValF);
}
