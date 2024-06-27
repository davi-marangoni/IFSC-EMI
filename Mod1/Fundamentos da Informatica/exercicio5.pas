Program PRECODOKRONEWPROCONSUMIDORDEPOISDEPASSARPELAFABRICA;

var
    custofirma:real;
    formula1:real;
    formula2:real;

Begin
    writeln ('informe o custo do carro para a fabrica');
    readln (custofirma);
    formula1:=(custofirma*0.45)+custofirma;
    formula2:=(formula1*0.28)+formula1;
    writeln ('o custo para o consumidor sera ',formula2);
    writeln ('o custo para a fabrica sera ',formula1);
End.