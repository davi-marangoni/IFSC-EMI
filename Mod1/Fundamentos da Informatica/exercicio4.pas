Program EXERCICIO3mais1;

var
    distanciakm:real;
    velocidadekm:real;
    formulatempo:real;
    formulametros:real;

Begin
    writeln ('informe a distancia em quilometros ');
    readln (distanciakm);
    writeln ('informe a velocidade em quilometros ');
    readln (velocidadekm);
    formulatempo:= distanciakm/velocidadekm;
    formulametros:= velocidadekm/3.6;
    writeln ('o tempo levado para fazer o percurso foi de ',formulatempo);
    writeln ('a velocidade em metros por segundo foi de ',formulametros); 
End.