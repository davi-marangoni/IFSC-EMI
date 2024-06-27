//usuário digita 5 numeros inteiros
// programa mostra quantos são pare e  a soma dos impares
Program Pzim ;

var
numero, cont, cont_pares, soma_impares: integer;

Begin
    For cont:=1 to 5 do
    begin
        Write ('Informe um núemro inteiro qualquer...:');
        read (numero);
        if numero mod 2 = 0 then  //resto da divisão do numero por 2 for igual 0
            inc (cont_pares)
        else
            soma_impares:= soma_impares+numero;
        end;
    Writeln ('A quantida de pares é: ', cont_pares);
    writeln ('A soma dos ímpares é: ',   soma_impares);
End.