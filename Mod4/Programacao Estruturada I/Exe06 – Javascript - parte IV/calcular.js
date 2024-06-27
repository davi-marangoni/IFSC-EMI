function Calcula() {
    var s1 = 0
    var t2 = 0
    var mo3 = 0
    var n3 = 0;
    var n6 = 0;
    var n7 = 0;
    var Piso = window.document.getElementById('piso').value
    if (Piso == 'mad') {
        s1 = 3;
    }
    else if (Piso == 'lag') {
        s1 = 4;
    }
    else if (Piso == 'lam') {
        s1 = 5;
    }
    else if (Piso == 'car') {
        s1 = 6;
    }
    var Tijolo = window.document.getElementById('tijolo').value
    if (Tijolo == 'T1') {
        t2 = 1;
    }
    if (Tijolo == 'T2') {
        t2 = 2;
    }
    if (Tijolo == 'T3') {
        t2 = 3;
    }
    var Maodeobra = window.document.getElementById('maodeobra').value
    if (Maodeobra == 'M1') {
        mo3 = 30;
    }
    if (Maodeobra == 'M2') {
        mo3 = 50;
    }
    if (Maodeobra == 'M3') {
        mo3 = 80;
    }
    var n3 = document.getElementById('number3').value;
    var n6 = document.getElementById('number6').value;
    var n7 = document.getElementById('number7').value;
    var s1 = s1 * n3;
    var t2 = t2 * n6;
    var mo3 = mo3 * n7;
    var orcamento = s1 + t2 + mo3;
    window.document.getElementById('valor').innerHTML = orcamento.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
}