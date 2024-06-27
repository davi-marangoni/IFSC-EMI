Program DESCONTADOR;

var
    preco:real;
    formula:real;

Begin
    writeln ('informe o preco do produto ');
    readln (preco);
    formula:=preco-(preco*0.09);
    writeln ('o preco final sera ',formula);
End.