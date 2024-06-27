program peso_ideal;

var
    altura, resultado:real;
    sexo: char; // variável do tipo caracter

begin
    Write ('Informe a altura da pessoa ...:');
    Read (altura);
    Writeln ('Informe o sexo da pessoa');
    write ('Masculino = M / Feminino = F..:');
    Read (sexo);
    If (sexo = 'M') then
        resultado:= (72.7*altura)-58;
    else
        resultado:=(62.1*altura)-44.7;
    Writeln ('O peso ideal é ', resultado:0:2);
    readkey;
end.