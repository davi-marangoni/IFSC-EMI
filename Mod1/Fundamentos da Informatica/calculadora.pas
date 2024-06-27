Program CALCULADORA;

var 
    numero1: integer; 
    numero2: integer;
    soma: integer;
    subtracao: integer;
    multi: integer;
    divisao: real;

Begin  
    Writeln ('Informe o primeiro número');  
    readln (numero1);       
    Writeln ('Informe o segundo número');  
    readln (numero2);  
    soma:= numero1+numero2;
    subtracao:=numero1-numero2;
    multi:=numero1*numero2;
    divisao:=numero1/numero2;
    writeln ('A soma é ', soma); 
    writeln ('A subtração é ', subtracao); 
    writeln ('A multiplicação é ', multi);
    writeln ('A divisão é ', divisao:0:2);
    readkey;
End. 