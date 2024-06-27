// 3) Faça um algoritmo que calcule a quantidade de pisos de uma casa.
// Peça as dimensões do piso e a metragem da casa.
// Obs: Compre 10 % a mais de piso como margem de segurança.

main()
{
    float lc, cc, ll, cl, f1, f2, f3;

    printf("qual a largura da casa?\n");
    scanf("%f", &lc);

    printf("qual o comprimento da casa?\n");
    scanf("%f", &cc);

    printf("qual a largura da lajota?\n");
    scanf("%f", &ll);

    printf("qual o comprimento da lajota?\n");
    scanf("%f", &cl);

    f1 = cc * lc;
    f2 = cl * ll;

    f3 = (f1 / f2) + 0.1;

    printf("O numero de lajotas da casa é: %f", f3);
}
