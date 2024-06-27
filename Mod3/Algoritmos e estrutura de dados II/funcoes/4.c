// 4) Faça um programa que 5 empregados contendo o número do empregado, a hora do inicio (horas, minutos e segundos)
// e a hora do termino (horas, minutos e segundos) de uma determinada tarefa. Calcule para cada empregado, a duração da
// tarefa que ele executou. Imprima para cada empregado, o seu número e a duração de sua tarefa em horas, minutos e
// segundos. Faça uma procedure para ler, outra para calcular e outra para imprimir.

#include <stdio.h>
#include <stdlib.h>

int num;
float inicio;
float fim, duracaohoras, duracaomin, duracaoseg;

void Duracao()
{
    duracaohoras = fim - inicio;
    duracaomin = (fim - inicio) * 60;
    duracaoseg = (fim - inicio) * 3600;
    Mostrar();
}
void Mostrar()
{
    printf("Trabalhador numero: %d ", num);
    printf("\nHoras trabalhadas%.2f\n", duracaohoras);
    printf("\nMinutos trabalhadas%.2f\n", duracaomin);
    printf("\nSegundos trabalhadas%.2f\n", duracaoseg);
}
main()
{
    int nCont;
    for (nCont = 0; nCont < 5; nCont++)
    {
        printf("Informe o numero do trabalhador\n");
        scanf("%d", &num);
        printf("Informe o horario de inicio do trabalho\n");
        scanf("%f", &inicio);
        printf("Informe o termino do trabalho\n");
        scanf("%f", &fim);
        Duracao();
    }
}