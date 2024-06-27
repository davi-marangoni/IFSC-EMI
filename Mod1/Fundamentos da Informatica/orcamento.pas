Program ORCAMENTO;

var
cor, tipo: string;
VALOR: REAL;

Begin
    Writeln ('--- *ORÇAMENTO*----');
    WRITELN ('');
    WRITELN ('COR DESEJADA (VERDE/ROSA).......:');
    READ (COR);
    WRITELN ('TIPO DA COR (SIMPLES/TEXTURA.....:');
    READ (TIPO);
    IF (COR = 'VERDE') AND (TIPO = 'SIMPLES') THEN
    BEGIN
        VALOR:= (200/2)*(100);
        WRITELN ('');
        WRITELN ('O ORÇAMENTO FECHOU EM R$' , VALOR:0:2);
    END;
    IF (COR = 'VERDE') AND (TIPO = 'TEXTURA') THEN
    BEGIN
        VALOR:= (200/2)*(110);
        WRITELN ('');
        WRITELN ('O ORÇAMENTO FECHOU EM R$' , VALOR:0:2);
    END;
    IF (COR = 'ROSA') AND (TIPO = 'SIMPLES') THEN
    BEGIN
        VALOR:= (200/2)*(150);
        WRITELN ('');
        WRITELN ('O ORÇAMENTO FECHOU EM R$' , VALOR:0:2);
    END;
    IF (COR = 'ROSA') AND (TIPO = 'TEXTURA') THEN
    BEGIN
        VALOR:= (200/2)*(165);
        WRITELN ('');
        WRITELN ('O ORÇAMENTO FECHOU EM R$' , VALOR:0:2);
    END;
End.