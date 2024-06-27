//informe a valor de 3 aneis que contem data de nascimento,  nome do
//aviário e nome do produtor rural
//informe a quantidade de frangos
//calcule o valor gasto total

Program Frangotec;

var
    anel_dt_nasc, anel_aviario, anel_produtor, vlr_tot: real;
    qtd_frangos: integer;

Begin
    Writeln ('Informe o valor do anel com a data de nascimento');
    readln (anel_dt_nasc);
    Writeln ('Informe o valor do anel com o nome do aviário');
    readln (anel_aviario);
    Writeln ('Informe o valor do anel com o nome do produtor rural');
    readln (anel_produtor);
    Writeln ('Informe a quantidade de frangos');
    readln (qtd_frangos);
    vlr_tot:= qtd_frangos*(anel_dt_nasc+anel_aviario+anel_produtor);
    write ('o valor gasto será de R$ ', vlr_tot:0:2, ' reais');
End.