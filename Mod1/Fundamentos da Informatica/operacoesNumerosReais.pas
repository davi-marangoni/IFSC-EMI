//Ler 3 numeros reais e:
//somar o primeiro com o terceiro;
//subtrair o segundo do primeiro
// multiplicar os 3 numeros

Program NUMEROSREAIS ;

var
    n1, n2, n3,soma, subt, multi: real;

Begin
    Writeln ('Informe o primeiro número');
    Readln (n1);
    Writeln ('Informe o segundo número');
    Readln (n2);
    Writeln ('Informe o terceiro número');
    Readln (n3);
    soma:= n1+n3;
    subt:= n1-n2;
    multi:=n1*n2*n3;
    Writeln ('A soma é ', soma);
    Writeln ('A subtração é ', subt); 
    Writeln ('A multiplicação é ', multi);
    readkey;
End.