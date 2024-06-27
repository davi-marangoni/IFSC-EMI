/Informar o nome e a media de 15 alunos de uma escola
//o programa deve mostrar quantos foram aprovados - média >=7
//quantos estao em exame - media >-5 e < 7
//quantos estão reprovados - media < 5

Program Pzim;

var
nome: string;
media: real;
cont, cont_apro, cont_rep, cont_exa: integer;

Begin
    for cont:=1 to 3 do //para cont de 1 até 15 faça
    Begin
        write ('Informe o nome do estudante...:');
        read (nome);
        write ('Informe a média do estudante..:');
        read (media);
        if media >=7 then
            inc (cont_apro);
        if (media>=5) and (media <7) then
            inc (cont_exa);
        if media<5 then
            inc (cont_rep);
    end;
    clrscr;
    Writeln ('A quantidade de alunos aprovados é: ', cont_apro);
    Writeln ('A quantidade de alunos em exame é: ', cont_exa);
    Writeln ('A quantidade de alunos reprovados é: ', cont_rep);
End.