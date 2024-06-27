bolsa = 0;
lula = 0;
hulk = 0;
ntot = 0;
totEle = 0;
function voto(candidato) {
    var totEle = window.document.getElementById('eleitor').value
    ntot++;
    if (ntot <= totEle) {
        if (candidato == '1') {
            bolsa++;
            alert("voto computado com sucesso!");
            if (ntot == totEle) {
                ganha();
            }
        }
        else if (candidato == '2') {
            lula++;
            alert("voto computado com sucesso!");
            if (ntot == totEle) {
                ganha();
            }
        }
        else if (candidato == '3') {
            hulk++;
            alert("voto computado com sucesso!");
            if (ntot == totEle) {
                ganha();
            }
        }
    }
}
function ganha() {
    if ((bolsa > lula) && (bolsa > hulk)) {
        alert("Bolsonaro wins com " + bolsa + "votos");
    }
    else if ((lula > bolsa) && (lula > hulk)) {
        alert("Lula wins com " + lula + "votos");
    }
    else if ((hulk > lula) && (hulk > bolsa)) {
        alert("Hulk wins com " + hulk + "votos");
    }
}
function Aviso() {
    var nome = window.document.getElementById('nick_nome').value
    var can1 = window.document.getElementById('can').value
    alert("Obrigado " + nome + ", sua mensagem foi enviado com sucesso para o candidato " + can1 + "!");
}