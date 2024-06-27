Program TEMPERATURA;

var

    Celsius, Fahrenheit: real;

Begin
    Writeln ('Informe a temperatura em Celsius');
    readln (Celsius);
    Fahrenheit:= (9 * Celsius + 160) / 5;
    writeln ('A temperatura tranformada é ', Fahrenheit:0:2); 
End.