function Calcula() {
    var n1 = 0
    var Sabor = window.document.getElementById('sabor').value
    if (Sabor == 'cal') {
        n1 = 30;
    }
    else if (Sabor == 'stro') {
        n1 = 35;
    }
    else if (Sabor == 'qq') {
        n1 = 40;
    }
    else if (Sabor == 'casa') {
        n1 = 45;
    }
    if ((document.getElementById('tam').value == '1' && document.getElementById('tam').checked)) {
        n1 = n1 * 0.5;
    }
    else if ((document.getElementById('tam3').value == '3' && document.getElementById('tam3').checked)) {
        n1 = n1 * 1.5;
    }
    var beb = document.getElementById('refri')
    if (beb.checked) {
        n1 = n1 + 10;
    }
    var sobre = document.getElementById('sobre')
    if (sobre.checked) {
        n1 = n1 + 5;
    }
    window.document.getElementById('valor').innerHTML = n1.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
}