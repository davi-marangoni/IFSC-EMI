//Some e mostra a soma dos números pares de 50 a 60
Program Pzim ;

var
cont, soma: integer;

Begin
    For cont:=50 to 60 do
    begin
        If (cont mod 2=0) then
        soma:=soma+cont;
    end;
    Writeln ('A soma dos pares entre 50 e 60 é: ', soma);
End.