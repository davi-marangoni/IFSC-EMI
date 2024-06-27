function Calcula() {
    var nTotot = 0
    var nTotal = 0
    var sVeiculo = window.document.getElementById('classe').value
    if (sVeiculo == 'popular') {
        nTotal = 50;
    }
    else if (sVeiculo == 'premim') {
        nTotal = 75;
    }
    else if (sVeiculo == 'luxo') {
        nTotal = 100;
    }
    if ((document.getElementById('veiculo').value == '1' && document.getElementById('veiculo').checked)) {
        nTotal = nTotal;
    }
    else if ((document.getElementById('veiculo').value == '2' && document.getElementById('veiculo').checked)) {
        nTotal = nTotal * 0.8;
    }
    else if ((document.getElementById('veiculo').value == '3' && document.getElementById('veiculo').checked)) {
        nTotal = nTotal * 1.5;
    }
    var nGPS = document.getElementById('gps')
    if (nGPS.checked) {
        nTotal = nTotal + 20;
    }
    var qtdDias = window.document.getElementById('dias').value;
    nTotot = nTotal * qtdDias;
    window.document.getElementById('valor').innerHTML = `R$ ${nTotot}`

}