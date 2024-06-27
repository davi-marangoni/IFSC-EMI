// Faça um programa em Pascal que leia 4 notas de um aluno. //Calcular e mostrar a média deste aluno

Program media;
var
    n1, n2, n3, n4, media: real;

Begin
    textcolor (red); // cor do texto, aplica a tudo o que está abaixo
    textbackground (yellow); //cor do fundo - aplica a tudo o que esta abaixo.
    writeln ('Informe a primeira nota');
    readln (n1);
    writeln ('Informe a segunda nota');
    readln (n2);
    writeln ('Informe a terceira nota');
    readln (n3);
    writeln ('Informe a quarta nota');
    readln (n4);
    media:= (n1+n2+n3+n4)/4;
    textcolor (yellow);
    writeln ('A média é ', media:0:2);
End.