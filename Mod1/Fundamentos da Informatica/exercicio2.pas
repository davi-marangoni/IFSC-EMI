Program CALCULADORDESALARIO;

var
    salario:real;
    formula1:real;
    formula2:real;

Begin
    writeln ('informe o salario base ');
    readln (salario);
    formula1:= (salario*0.05)+salario;
    formula2:= formula1-(salario*0.07);
    writeln ('o salario final sera ',formula2);
End.