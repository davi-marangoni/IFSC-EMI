//Para uma turma de 5 alunos, construa um
// algoritmo que determine:
//a) A idade média dos alunos com menos de 1,70m
//altura;
//b) A altura média dos alunos com mais de
//20 anos.

Program Pzim ;

var
cont: integer;
idade: integer;
altura: real;
media_idade: real;
soma_idade, qtd_idade: integer;
media_altura: real;
soma_altura:real;
qtd_altura: integer;

Begin
    For cont:=1 to 5 do
    begin
        Write ('Informe a idade do/a estudante...:');
        read (idade);
        Write ('Informe a altura do/a estudante..:');
        read (altura);
        if (altura < 1.70) then
        begin
            inc (qtd_idade);
            soma_idade:= soma_idade+idade;
        end;
        if (idade > 20) then
        begin
            inc (qtd_altura);
            soma_altura:= soma_altura+altura;
        end;
    end;

    If (qtd_idade=0) then
        Writeln ('Nenhuma idade atende a condição');
    If (qtd_idade<>0) then
    begin
        media_idade:=soma_idade/qtd_idade;
        Writeln ('A média de idade dos estudantes com mais de 1.70 m é: ',media_idade);
    end;

    if (qtd_altura=0) then
        writeln ('Nenhuma altura atende a condição');
    if (qtd_altura<>0) then
    begin
        media_altura:=  soma_altura/qtd_altura;  
        Writeln ('A média de altura dos estudantes com mais de 20 anos é: ',media_altura);
    end;  
End.