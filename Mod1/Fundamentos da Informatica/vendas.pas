//Maria vende Natura. Faça um algoritmo que leia o valor total
//das vendas de Maria e mostre o seu lucro que é de 20%;
//mostre o valor que maria coloca na poupança (10% do lucro)
//mostre o valor que sobra para Maria gastar

Program vendas_natura;

var
    valor_total_vendas, lucro, poup, resto: real;

Begin
    Writeln ('Informe o valor total das vendas de Maria');
    readln (valor_total_vendas);
    lucro:= valor_total_vendas*0.2;
    poup:= lucro*0.1;
    resto:=lucro-poup;
    writeln ('O lucro de Maria é ', lucro:0:2);
    Writeln ('Maria colocará na poupança ', poup:0:2);
    writeln ('Maria pode gastar R$ ', resto:0:2 , ' por mês');
    readkey 
End.