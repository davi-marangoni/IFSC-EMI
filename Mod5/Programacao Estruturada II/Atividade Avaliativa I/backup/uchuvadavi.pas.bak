unit uChuvaDavi;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, FileUtil, Forms, Controls, Graphics, Dialogs, StdCtrls,
  Grids, Buttons, ExtCtrls;

type

  { TForm1 }

  TForm1 = class(TForm)
    AdicionarDavi: TBitBtn;
    ExcluirTudoDavi: TBitBtn;
    CalcularDavi: TBitBtn;
    ExcluirDavi: TBitBtn;
    EditTemperaturaDavi: TEdit;
    EditChuvaDavi: TEdit;
    Image1: TImage;
    LabelDavi1: TLabel;
    LabelDavi2: TLabel;
    StringGridResultadoDavi: TStringGrid;
    StringGridChuvaDavi: TStringGrid;
    procedure AdicionarDaviClick(Sender: TObject);
    procedure CalcularDaviClick(Sender: TObject);
    procedure ExcluirDaviClick(Sender: TObject);
    procedure ExcluirTudoDaviClick(Sender: TObject);
    procedure StringGridChuvaDaviSelectCell(Sender: TObject; aCol,
      aRow: Integer; var CanSelect: Boolean);
  private
    { private declarations }
  public
    { public declarations }
  end;

var
  Form1: TForm1;
  var i,j:integer;

  linha,coluna:integer;

    resultado1T:real;
    valor1T,valor2T,valor3T,valor4T,valor5T,valor6T:real;

    resultado1C:real;
    valor1C,valor2C,valor3C,valor4C,valor5C,valor6C:real;

    resultado2T:real;
    valor7T,valor8T,valor9T,valor10T,valor11T,valor12T:real;

    resultado2C:real;
    valor7C,valor8C,valor9C,valor10C,valor11C,valor12C:real;


    resultado3C:real;
    resultado3T:real;



implementation

{$R *.lfm}

{ TForm1 }


procedure TForm1.AdicionarDaviClick(Sender: TObject);
begin
  begin
   if (EditChuvaDavi.Text='') OR (EditTemperaturaDavi.Text='') then Showmessage('Valor em Branco')
   else
     begin
        j:=1;
        while(j<=12) AND (StringGridChuvaDavi.Cells[j,1]<>'') do inc(j);
        if (j>12) then Showmessage('Grid Cheio !')
        else
          begin
             StringGridChuvaDavi.Cells[j,1]:= EditChuvaDavi.Text;
             StringGridChuvaDavi.Cells[j,2]:= EditTemperaturaDavi.Text;
          end;
     end;
end;

end;

procedure TForm1.CalcularDaviClick(Sender: TObject);
begin
     //chuva 1 semestre
     valor1C:=StrToFLoat(StringGridChuvaDavi.Cells[1,1]);
     valor2C:=StrToFloat(StringGridChuvaDavi.Cells[2,1]);
     valor3C:=StrToFloat(StringGridChuvaDavi.Cells[3,1]);
     valor4C:=StrToFloat(StringGridChuvaDavi.Cells[4,1]);
     valor5C:=StrToFloat(StringGridChuvaDavi.Cells[5,1]);
     valor6C:=StrToFloat(StringGridChuvaDavi.Cells[6,1]);
     resultado1C:= valor1C+valor2C+valor3C+valor4C+valor5C+valor6C;
     resultado1C:= resultado1C/6;
     StringGridResultadoDavi.Cells[1,1]:=FloatToStr(resultado1C);
     //temperatura 1 semestre
     valor1T:=StrToFLoat(StringGridChuvaDavi.Cells[1,2]);
     valor2T:=StrToFloat(StringGridChuvaDavi.Cells[2,2]);
     valor3T:=StrToFloat(StringGridChuvaDavi.Cells[3,2]);
     valor4T:=StrToFloat(StringGridChuvaDavi.Cells[4,2]);
     valor5T:=StrToFloat(StringGridChuvaDavi.Cells[5,2]);
     valor6T:=StrToFloat(StringGridChuvaDavi.Cells[6,2]);
     resultado1T:= valor1T+valor2T+valor3T+valor4T+valor5T+valor6T;
     resultado1T:= resultado1T/6;
     StringGridResultadoDavi.Cells[1,2]:=FloatToStr(resultado1T);
     //chuva 2 semestre
     valor7C:=StrToFLoat(StringGridChuvaDavi.Cells[7,1]);
     valor8C:=StrToFloat(StringGridChuvaDavi.Cells[8,1]);
     valor9C:=StrToFloat(StringGridChuvaDavi.Cells[9,1]);
     valor10C:=StrToFloat(StringGridChuvaDavi.Cells[10,1]);
     valor11C:=StrToFloat(StringGridChuvaDavi.Cells[11,1]);
     valor12C:=StrToFloat(StringGridChuvaDavi.Cells[12,1]);
     resultado2C:= valor7C+valor8C+valor9C+valor10C+valor11C+valor12C;
     resultado2C:= resultado2C/6;
     StringGridResultadoDavi.Cells[2,1]:=FloatToStr(resultado2C);
     //temperatura 2 semestre
     valor7T:=StrToFLoat(StringGridChuvaDavi.Cells[7,2]);
     valor8T:=StrToFloat(StringGridChuvaDavi.Cells[8,2]);
     valor9T:=StrToFloat(StringGridChuvaDavi.Cells[9,2]);
     valor10T:=StrToFloat(StringGridChuvaDavi.Cells[10,2]);
     valor11T:=StrToFloat(StringGridChuvaDavi.Cells[11,2]);
     valor12T:=StrToFloat(StringGridChuvaDavi.Cells[12,2]);
     resultado2T:= valor7T+valor8T+valor9T+valor10T+valor11T+valor12T;
     resultado2T:= resultado2T/6;
     StringGridResultadoDavi.Cells[2,2]:=FloatToStr(resultado2T);
     //Media anumal
     resultado3C:=resultado1C+resultado2C;
     StringGridResultadoDavi.Cells[3,1]:=FloatToStr(resultado3C/2);
     resultado3T:=resultado1T+resultado2T;
     StringGridResultadoDavi.Cells[3,2]:=FloatToStr(resultado3T/2);
end;

procedure TForm1.ExcluirDaviClick(Sender: TObject);
begin
     if MessageDlg('Deseja mesmo Excluir?', mtconfirmation,[mbYes,mbNo],0)=mrYes then
     begin
          for linha:=1 to 2 do StringGridChuvaDavi.Cells[coluna,linha]:='';
     end;

end;

procedure TForm1.ExcluirTudoDaviClick(Sender: TObject);
begin
       if MessageDlg('Deseja mesmo Excluir Tudo?', mtconfirmation,[mbYes,mbNo],0)=mrYes then
        begin
             StringGridChuvaDavi.Clean(1,1,12,2,[]);
        end;
end;

procedure TForm1.StringGridChuvaDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
  var CanSelect: Boolean);
begin
  linha:=(Arow);
  coluna:=(Acol);
end;

end.
