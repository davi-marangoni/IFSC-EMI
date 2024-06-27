Program tabela;

var
cont:integer;
numero: integer;

Begin
  Write ('Qual tabela você deseja calcular?....: ');
  read (numero);
  clrscr;  //limpa a tela
  For cont:=1 to 10 do  //ordem crescente
  begin
    Writeln (numero, ' x ', cont, ' = ', numero*cont);
  end;
  readkey; // espera uma tecla para fechar o programa
End