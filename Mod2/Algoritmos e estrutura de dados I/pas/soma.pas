//Some os números de 1 a 100 e imprima o valor. 

Program Pzim ;

var
cont, soma: integer;

Begin
    For cont:=1 to 100 do
    begin
        soma:=soma+cont;
    end;
    Writeln ('A soma de 1 a 100 é: ', soma);
End.