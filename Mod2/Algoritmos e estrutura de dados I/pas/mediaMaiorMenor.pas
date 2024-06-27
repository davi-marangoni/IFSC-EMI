// Crie um programa que peça 10 números inteiros
// e apresente: a média, o maior e o menor. 

Program Pzim ;

var
cont, numero, soma, maior, menor: integer;
media: real;

Begin
    maior:=0;
    menor:= 100000;
    for cont:=1 to 10 do
    begin
        Writeln ('Digite um número inteiro positivo qualquer');
        readln (numero);
        soma:= soma+ numero;
        media:=soma/10;
        if numero>maior then
            maior:= numero;
        if numero < menor then
            menor:= numero;
    end;
    Writeln ('A média dos números digitados é ', media);
    writeln ('Maior: ', maior);
    Writeln ('Menor: ', menor);
End.