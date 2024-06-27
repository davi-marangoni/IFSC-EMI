Program votacao ;

var
    idade: integer;

Begin
    write ('Informe da idade....:');
    read (idade);
    IF (idade=16) OR (idade=17) OR (idade>=71) then
        Writeln ('Voto Facultativo');
    if (idade <16) then 
        Writeln ('Não pode votar'); 
    if (idade>=18) AND (IDADE <=70) then 
        writeln ('Voto Obrigatório'); 
    readkey;
End.