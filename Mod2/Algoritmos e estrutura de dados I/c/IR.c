#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int numero_carros_vendidos, cont;
    float salario_final, valor_carro, soma, ir, salario_com_desconto;
    
    soma = 0;

    printf("Informe a quantidade de carros vendidos: \n");
    scanf("%d", &numero_carros_vendidos);

    for (cont = 1; cont <= numero_carros_vendidos; cont++)
    {
        printf("Informe o valor do automovel:");
        scanf("%f", &valor_carro);
        soma = (soma + valor_carro);
    }
    if (numero_carros_vendidos <= 2)
    {
        salario_final = 700 + (soma * 0.02);
    }
    else if (numero_carros_vendidos > 2 && numero_carros_vendidos <= 6)
    {
        salario_final = 700 + (soma * 0.02) + 1500;
    }
    else
    {
        salario_final = 700 + (soma * 0.02) + 2000;
    }

    printf("Salário Fixo: 700,00\n");
    printf("Quantidade de carros vendidos: %d\n", numero_carros_vendidos);
    printf("Total vendido: %.2f\n", soma);
    printf("Salário final: %.2f\n", salario_final);

    if (salario_final <= 1903.98)
    {
        printf("Isento de Imposto de Renda\n");
    }
    else if (salario_final > 1903.98 && salario_final <= 2826.65)
    {
        ir = salario_final * 0.075;
        salario_com_desconto = salario_final - ir + 142.80;
        printf("Pagará 7,5 por cento de IR\n");
        printf("Receberá após os descontos: %.2f \n", salario_com_desconto);
    }
    else if (salario_final >= 2826.66 && salario_final <= 3751.05)
    {
        ir = salario_final * 0.15;
        salario_com_desconto = salario_final - ir + 354.80;
        printf("Pagará 15 por cento de IR\n");
        printf("Receberá após os descontos: %.2f \n", salario_com_desconto);
    }
    else if (salario_final >= 3751.06 && salario_final <= 4664.68)
    {
        ir = salario_final * 0.225;
        salario_com_desconto = salario_final - ir + 636, 13;
        printf("Pagará 22.5 por cento de IR\n");
        printf("Receberá após os descontos: %.2f \n", salario_com_desconto);
    }
    else
    {
        ir = salario_final * 0.275;
        salario_com_desconto = salario_final - ir + 869.38;
        printf("Pagará 27.5 por cento de IR\n");
        printf("Receberá após os descontos: %.2f \n", salario_com_desconto);
    }
}