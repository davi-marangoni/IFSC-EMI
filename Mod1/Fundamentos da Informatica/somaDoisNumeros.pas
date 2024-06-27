Program SOMADOISNUMEROS;

var //variavel, significa que na sequencia aparecerão as variaveis e os tipos das variaveis
  numero1: integer; //tipo é inteiro e escreve integer;
  numero2: integer;
  soma: integer;

Begin  //começo do programa
  Writeln ('Informe o primeiro número');  //entrada de dados
  readln (numero1);//leitura dos dados
  Writeln ('Informe o segundo número');   //entrada de dados
  readln (numero2);  //leitura dos dados
  soma:= numero1+numero2; // processamento
  writeln ('A soma é ', soma);  //saida dos dados
End. //final do programa