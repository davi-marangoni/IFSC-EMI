// FAZER UM PROGRAMA EM PASCAL QUE LEIA UM NUMERO E MOSTRE:
// O DOBRO DESTE NUMERO
// A DIVISÃO DESTE NÚMERO POR 2

Program Pzim ;

var
    num, dobro: integer;
    divisao: real;

Begin
    Writeln ('Informe um numero inteiro');
    readln (num);
    dobro:= num*2;
    divisao:= num/2;
    Writeln (' O dobro de ', num ,' é ', dobro);
    Writeln (' A divisão é ', divisao); 
End.