unit Aluno_projetofinalprogramacaoestruturada;

{$mode objfpc}{$H+}

interface

uses
  Classes, SysUtils, Forms, Controls, Graphics, Dialogs, ComCtrls, StdCtrls,
  Grids, ExtCtrls, DateTimePicker, Types;

type

  { TForm1 }

  TForm1 = class(TForm)
    BtnConfirmaDavi: TButton;
    BtnConfirmaDavi2: TButton;
    BtnConfirmaDavi3: TButton;
    BtnCalcularDavi: TButton;
    BtnImporta: TButton;
    BtnExporta: TButton;
    CheckGroupExporta: TCheckGroup;
    CheckGroupImporta: TCheckGroup;
    ComboSelecionaPecaDavi: TComboBox;
    ComboPecaDavi2: TComboBox;
    ComboPecaDavi: TComboBox;
    Edit1: TEdit;
    Edit10: TEdit;
    Edit11: TEdit;
    Edit12: TEdit;
    Edit13: TEdit;
    Edit2: TEdit;
    Edit3: TEdit;
    Edit4: TEdit;
    Edit5: TEdit;
    Edit6: TEdit;
    Edit7: TEdit;
    Edit8: TEdit;
    Edit9: TEdit;
    Label1: TLabel;
    Label10: TLabel;
    Label11: TLabel;
    Label12: TLabel;
    Label13: TLabel;
    Label14: TLabel;
    Label15: TLabel;
    Label16: TLabel;
    Label17: TLabel;
    Label18: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    Label4: TLabel;
    Label5: TLabel;
    Label6: TLabel;
    Label7: TLabel;
    Label8: TLabel;
    Label9: TLabel;
    PageControl1: TPageControl;
    GridPecaDavi: TStringGrid;
    GridProducaoDavi: TStringGrid;
    GridVendaDavi: TStringGrid;
    Panel1: TPanel;
    Panel2: TPanel;
    Panel3: TPanel;
    TabSheet1: TTabSheet;
    TabSheet2: TTabSheet;
    TabSheet3: TTabSheet;
    TabSheet4: TTabSheet;
    TabSheet5: TTabSheet;
    procedure BtnCalcularDaviClick(Sender: TObject);
    procedure BtnConfirmaDavi2Click(Sender: TObject);
    procedure BtnConfirmaDavi3Click(Sender: TObject);
    procedure BtnConfirmaDaviClick(Sender: TObject);
    procedure BtnExportaClick(Sender: TObject);
    procedure BtnImportaClick(Sender: TObject);

    procedure GridPecaDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
      var CanSelect: Boolean);
    procedure GridProducaoDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
      var CanSelect: Boolean);
    procedure GridVendaDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
      var CanSelect: Boolean);
    procedure PageControl1Change(Sender: TObject);

    procedure Panel1Click(Sender: TObject);
    procedure TabSheet2Show(Sender: TObject);
    procedure TabSheet3Show(Sender: TObject);
    procedure TabSheet4Show(Sender: TObject);
  private

  public

  end;

var
  Form1: TForm1;
  LinhaAluno:integer;
  Chave: string;
  i, j: integer;
  TotalQtdeProducao: Real;
  TotalValorProducao: Real;
  TotalQtdeVenda: Real;
  TotalValorVenda: Real;

implementation

{$R *.lfm}

{ TForm1 }
//1page
procedure GeraChave();
begin
     i:=Random(10000);
     chave:=IntToStr(i)+TimeToStr(Time);
end;

//GridPecaDavi
procedure TForm1.GridPecaDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
  var CanSelect: Boolean);
begin
  LinhaAluno:=aRow;
  Edit1.Text:=GridPecaDavi.Cells[1,arow];
end;

//BtnConfirmaDavi
procedure TForm1.BtnConfirmaDaviClick(Sender: TObject);
begin
     if GridPecaDavi.Cells[0,LinhaAluno]='' then
        begin
             GeraChave();
             GridPecaDavi.Cells[0,LinhaAluno]:=Chave;
        end;
     GridPecaDavi.Cells[1,LinhaAluno] := Edit1.Text;
end;


//1page

//2page
procedure TForm1.GridProducaoDaviSelectCell(Sender: TObject; aCol,
  aRow: Integer; var CanSelect: Boolean);
begin
     LinhaAluno:=aRow;
     //Edits
     Edit2.Text:=GridProducaoDavi.Cells[0,arow];
     Edit3.Text:=GridProducaoDavi.Cells[2,arow];
     Edit4.Text:=GridProducaoDavi.Cells[3,arow];
     Edit5.Text:=GridProducaoDavi.Cells[4,arow];
     //ComboBox
     ComboPecaDavi.Text:=GridProducaoDavi.Cells[1,LinhaAluno];
end;

//BtnConfirmaDavi2
procedure TForm1.BtnConfirmaDavi2Click(Sender: TObject);
begin
     //Edits
     GridProducaoDavi.Cells[0,LinhaAluno] := Edit2.Text;
     GridProducaoDavi.Cells[2,LinhaAluno] := Edit3.Text;
     GridProducaoDavi.Cells[3,LinhaAluno] := Edit4.Text;
     GridProducaoDavi.Cells[4,LinhaAluno] := Edit5.Text;
     //ComboBox
     GridProducaoDavi.Cells[1,LinhaAluno]:=ComboPecaDavi.Text;
end;
//2page
//3page
procedure TForm1.GridVendaDaviSelectCell(Sender: TObject; aCol, aRow: Integer;
  var CanSelect: Boolean);
begin
    LinhaAluno:=aRow;
    //Edits
    Edit6.Text:=GridVendaDavi.Cells[0,arow];
    Edit7.Text:=GridVendaDavi.Cells[2,arow];
    Edit8.Text:=GridVendaDavi.Cells[3,arow];
    Edit9.Text:=GridVendaDavi.Cells[4,arow];
    //ComboBox
    ComboPecaDavi2.Text:=GridVendaDavi.Cells[1,LinhaAluno];
end;

procedure TForm1.PageControl1Change(Sender: TObject);
begin
     case PageControl1.PageIndex of
          0: LinhaAluno := GridPecaDavi.Row;
          1: LinhaAluno := GridProducaoDavi.Row;
          2: LinhaAluno := GridVendaDavi.Row;
     end;

end;



procedure TForm1.Panel1Click(Sender: TObject);
begin

end;

//BtnConfirmaDavi3
procedure TForm1.BtnConfirmaDavi3Click(Sender: TObject);
begin
     //Edits
     GridVendaDavi.Cells[0,LinhaAluno] := Edit6.Text;
     GridVendaDavi.Cells[2,LinhaAluno] := Edit7.Text;
     GridVendaDavi.Cells[3,LinhaAluno] := Edit8.Text;
     GridVendaDavi.Cells[4,LinhaAluno] := Edit9.Text;
     //ComboBox
     GridVendaDavi.Cells[1,LinhaAluno]:=ComboPecaDavi2.Text;
end;
//ENDpage3
//STRATpage4


procedure TForm1.BtnCalcularDaviClick(Sender: TObject);
begin
    TotalQtdeVenda:= 0;
    TotalValorVenda:= 0;
    TotalQtdeProducao:= 0;
    TotalValorProducao:= 0;
     for i:=1 to GridProducaoDavi.RowCount-1 do
     begin
          if GridProducaoDavi.Cells[1,i]=ComboSelecionaPecaDavi.Text then
          begin
                       TotalQtdeProducao:=TotalQtdeProducao+StrToFloat(GridProducaoDavi.Cells[4,i]);
                       TotalValorProducao:=TotalValorProducao+StrToFloat(GridProducaoDavi.Cells[3,i]);
          end;
     end;
     for i:=1 to GridVendaDavi.RowCount-1 do
     begin
          if GridVendaDavi.Cells[1,i]=ComboSelecionaPecaDavi.Text then
          begin
                       TotalQtdeVenda:=TotalQtdeVenda+StrToFloat(GridVendaDavi.Cells[4,i]);
                       TotalValorVenda:=TotalValorVenda+StrToFloat(GridVendaDavi.Cells[3,i]);
          end;
     end;
     Edit10.Text:=FloatToStr(TotalQtdeProducao);
     Edit11.Text:=FloatToStr(TotalValorProducao);
     Edit12.Text:=FloatToStr(TotalQtdeVenda);
     Edit13.Text:=FloatToStr(TotalValorVenda);
end;




// atualiza o ComboPecaDavi com os dados do GridPecaDavi
procedure TForm1.TabSheet2Show(Sender: TObject);
begin
     ComboPecaDavi.Clear;
     for i:=1 to GridPecaDavi.RowCount-1 do
     begin
       if GridPecaDavi.Cells[0,i]<>'' then
       ComboPecaDavi.Items.Add(GridPecaDavi.Cells[1,i]);
     end;
end;

// atualiza o ComboPecaDavi2 com os dados do GridVendaDavi
procedure TForm1.TabSheet3Show(Sender: TObject);
begin
     ComboPecaDavi2.Clear;
     for i:=1 to GridPecaDavi.RowCount-1 do
     begin
       if GridPecaDavi.Cells[0,i]<>'' then
          ComboPecaDavi2.Items.Add(GridPecaDavi.Cells[1,i]);
     end;
end;

// atualiza o ComboSelecionaPecaDavi com os dados do GridVendaDavi
procedure TForm1.TabSheet4Show(Sender: TObject);
begin
     ComboSelecionaPecaDavi.Clear;
     for i:=1 to GridPecaDavi.RowCount-1 do
     begin
       if GridPecaDavi.Cells[0,i]<>'' then
          ComboSelecionaPecaDavi.Items.Add(GridPecaDavi.Cells[1,i]);
     end;
end;




procedure TForm1.BtnImportaClick(Sender: TObject);
var
  arquivo: TextFile;
  valor: string;
begin
    // Importa Peça
   if CheckGroupImporta.Checked[0] then
   begin

       AssignFile ( arquivo, 'ProjetoPecasDavi.txt' );
       try
         Reset (arquivo);
         for i:=0 to GridPecaDavi.RowCount-1 do
         begin
                for j:=0 to GridPecaDavi.ColCount-1 do
                begin
                  ReadLn (arquivo, valor );
                  if (i = 0) then
                     continue;
                  GridPecaDavi.Cells[j,i]:= Trim(valor);
                end;
         end;

       finally
              CloseFile ( arquivo );
       end;

    end;
  // Importa Produção
    if CheckGroupImporta.Checked[0] then
   begin

       AssignFile ( arquivo, 'ProjetoProduzDavi.txt' );
       try
         Reset (arquivo);
         for i:=0 to GridProducaoDavi.RowCount-1 do
         begin
                for j:=0 to GridProducaoDavi.ColCount-1 do
                begin
                  ReadLn (arquivo, valor );
                  if (i = 0) then
                     continue;
                  GridProducaoDavi.Cells[j,i]:= Trim(valor);
                end;
         end;

       finally
              CloseFile ( arquivo );
       end;

    end;
 // Importa Venda
    if CheckGroupImporta.Checked[2] then
  begin
       AssignFile ( arquivo, 'ProjetoVendaDavi.txt' );
       Reset ( arquivo );
       ReadLn ( arquivo, valor );
       for i:=0 to GridVendaDavi.RowCount-1 do
       for j:=0 to GridVendaDavi.ColCount-1 do
       begin
            	GridVendaDavi.Cells[j,i]:=valor;
                ReadLn ( arquivo, valor );
       end;
       CloseFile ( arquivo );
end;
end;

procedure TForm1.BtnExportaClick(Sender: TObject);
var
arquivo: TextFile;
begin

      // Exporta Peca
  if CheckGroupExporta.Checked[0] then
  begin
       AssignFile ( arquivo, 'ProjetoPecasDavi.txt' );
       try
          Rewrite( arquivo );
          for i:=0 to GridPecaDavi.RowCount-1 do
          begin
              for j:=0 to GridPecaDavi.ColCount-1 do
              begin
                if GridPecaDavi.Cells[j,i] <> '' then
                   WriteLn(arquivo, GridPecaDavi.Cells[j,i]);
              end;
          end;
       finally
          CloseFile ( arquivo );
       end;
  end;
  // Exporta Producao
 if CheckGroupExporta.Checked[1] then
  begin
       AssignFile ( arquivo, 'ProjetoProduzDavi.txt' );
       try
          Rewrite( arquivo );
          for i:=0 to GridProducaoDavi.RowCount-1 do
          begin
              for j:=0 to GridProducaoDavi.ColCount-1 do
              begin
                if GridProducaoDavi.Cells[j,i] <> '' then
                   WriteLn(arquivo, GridProducaoDavi.Cells[j,i]);
              end;
          end;
       finally
          CloseFile ( arquivo );
       end;
  end;
  // Exporta Venda
    if CheckGroupExporta.Checked[2] then
   begin
       AssignFile ( arquivo, 'ProjetoVendaDavi.txt' );
       try
          Rewrite( arquivo );
          for i:=0 to GridVendaDavi.RowCount-1 do
          begin
              for j:=0 to GridVendaDavi.ColCount-1 do
              begin
                if GridVendaDavi.Cells[j,i] <> '' then
                   WriteLn(arquivo, GridVendaDavi.Cells[j,i]);
              end;
          end;
       finally
          CloseFile ( arquivo );
       end;
  end;
end;




end.

