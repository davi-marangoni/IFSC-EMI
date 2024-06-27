Program tabela;

var
cont:integer;
numero: integer;

Begin
  Write ('Qual tabela você deseja calcular?....: ');
  read (numero);
  clrscr;  //limpa a tela
  For cont:=10 downto 1 do  //ordem decrescente
  begin
    Writeln (numero, ' x ', cont, ' = ', numero*cont);
  end;
  readkey; // espera uma tecla para fechar o programa
End