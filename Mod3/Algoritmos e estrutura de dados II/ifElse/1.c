//1) Um professor atribui pesos de 1 a 4 para as notas de quatro avaliações. 
//A nota é calculada por meio da média ponderada (N1*1 + N2*2 + N3*3 + N4*4)/(1+2+3+4), 
//onde N1 é a nota da primeira avaliação, N2 a da segunda, etc. 
//Faça um programa que o aluno informe as notas de N1 até N4 e depois calcula e escreva a média deste aluno.


#include <stdio.h>
#include <stdlib.h>

main() 
{
    float n1, n2, n3, n4, N1, N2, N3, N4, media;

    printf ("primeira nota  ");
    scanf ("%f",&n1);

    printf ("segunda nota  ");
    scanf ("%f",&n2);

    printf ("terceira nota  ");
    scanf ("%f",&n3);

    printf ("quarta nota  ");
    scanf ("%f",&n4);

    N1= n1*0.1;
    N2= n2*0.2;
    N3= n3*0.3;
    N4= n4*0.4;

    media= (N1+N2+N3+N4)/(0.1+0.2+0.3+0.4);

    printf ("a media do aluno foi: %f",media);
}