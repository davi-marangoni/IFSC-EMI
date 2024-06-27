Program LEDORDEPOTENCIADALAMPADAPRASALA;

var
    largura:real;
    altura:real;
    formula:real;

Begin
    writeln ('informe a largura da sala ');
    readln (largura);
    writeln ('informe a altura da sala ');
    readln (altura);
    formula:=(largura+altura)*18;
    writeln ('a potencia da lampada precisa ser ',formula);
End.