Program Nadadores ;

var
    idade: integer;

Begin
    Write('Informe a idade do nadador...:');
    Read (idade);
    If (idade>=5) and (idade<=7) then
        Writeln ('O nadador pertence ao Infantil A');
    If (idade>=8) and (idade<=10) then
        Writeln ('O nadador pertence ao Infantil B');
    If (idade>=11) and (idade<=13) then
        Writeln ('O nadador pertence ao Juvenil A');
    If (idade>=14) and (idade<=17) then
        Writeln ('O nadador pertence ao Juvenil B');
    If (idade>17)  then
        Writeln ('O nadador pertence ao Senior');
    If (idade<5)  then
        Writeln ('O nadador pertence não tem categoria');
    readkey;
End.