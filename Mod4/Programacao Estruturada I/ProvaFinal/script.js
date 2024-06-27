function Calcula() {
    var nTotal = 0
    var sSabor = window.document.getElementById('CarnesPreco').value
    if (sSabor == 'Bife Acebolado') {
        nTotal = 25;
    }
    else if (sSabor == 'Peito de Frango') {
        nTotal = 30;
    }
    else if (sSabor == 'Picanhona TOP') {
        nTotal = 50;
    }

    var QtdP = window.document.getElementById('qtdCarne').value
    nTotal2 = nTotal * QtdP

    var sSabor2 = window.document.getElementById('SaladasPreco').value
    if (sSabor2 == 'Salada Comum') {
        nTotal = 25
    }
    else if (sSabor2 == 'Salada Temperada') {
        nTotal = 30
    }
    else if (sSabor2 == 'Salada TOP') {
        nTotal = 50
    }

    var QtdX = window.document.getElementById('qtdSalada').value
    nTotal3 = nTotal * QtdX

    var sSabor3 = window.document.getElementById('MassasPreco').value
    if (sSabor3 == 'Carbonara') {
        nTotal = 25
    }
    else if (sSabor3 == 'Molho Branco') {
        nTotal = 30
    }
    else if (sSabor3 == 'Molho funghi') {
        nTotal = 50
    }
    var QtdF = window.document.getElementById('qtdMassa').value
    nTotal4 = nTotal * QtdF


    var nTotalT = nTotal2 + nTotal3 + nTotal4
    console.log(nTotalT)

    var nBebida = document.getElementById('Beb')
    if (nBebida.checked) {
        nTotalT = nTotalT + 10
    }
    var nSobre = document.getElementById('Tal')
    if (nSobre.checked) {
        nTotalT = nTotalT + 5
    }
    window.document.getElementById('valor').innerHTML = `R$ ${nTotalT}`;
}


function getValueById(id) {
    return window.document.getElementById(id).value || 0;
}


function notif() {

    var dados = [],
        nome = getValueById('cliente'),
        mensagem = "Olá " + nome;

    getValueById('qtdCarne') > 0 && dados.push({ qtd: getValueById('qtdCarne'), preco: getValueById('CarnesPreco') });
    getValueById('qtdSalada') > 0 && dados.push({ qtd: getValueById('qtdSalada'), preco: getValueById('SaladasPreco') });
    getValueById('qtdMassa') > 0 && dados.push({ qtd: getValueById('qtdMassa'), preco: getValueById('MassasPreco') });

    dados.forEach(function (produto, i) {
        i == 0 && (mensagem += " pelo pedido de : ");
        i != 0 && (mensagem += ' , ');
        mensagem += produto.qtd + " , " + produto.preco;
    });

    mensagem += " Obrigado pela preferencia!";

    alert(mensagem);
}