function questao1() {
    document.write("<h1> Exercicio<h1><br>");
    document.write("1 - ");
    var pessoa1 = new Array("Davi");
    var pessoa2 = new Array(" Mocva");
    var result = pessoa1.concat(pessoa2);
    document.write("Valores concatenados: " + result + "<br><br>");
}

function questao2() {
    document.write("2 - ");
    var texto = result.toString();
    texto = result.indexOf('a');
    document.write("Encontrado na " + texto + " posição <br><br>");
}


function questao3() {
    document.write("3 - ");
    var vetor1 = new Array(1, 2, 3, 4, 5);
    var elementos = vetor1.join(" * ");
    document.write("Elementos separados pelo caracter: " + elementos + "<br><br>");
}


function questao4() {
    document.write("4 - ");
    var result2 = result.toString();
    result2 = result.lastIndexOf('a');
    document.write("Encontrado na " + result2 + " posição <br><br>");
}

function questao5() {
    document.write("5 - ");
    var vetor1 = new Array(1, 2, 3, 4, 5);
    document.write("Vetor: " + vetor1 + "<br>");
    var ultimo = vetor1.pop();
    document.write("Elemento removido: " + ultimo + "<br>");
    document.write("Novo vetor: " + vetor1 + "<br><br>");
}


function questao6() {
    document.write("6 - ");
    document.write("Vetor: " + vetor1 + "<br>");
    vetor1.push(ultimo, " é campeão");
    document.write("Novo vetor: " + vetor1 + "<br><br>");
}


function questao7() {
    document.write("7 - ");
    var vetor1 = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    document.write("Vetor: " + vetor1 + "<br>");
    vetor1.reverse();
    document.write("Vetor invertido: " + vetor1 + "<br><br>");
}

function questao8() {
    document.write("8 - ");
    var vetor = new Array(2, 4, 6, 8, 10, 12, 14);
    document.write("Vetor: " + vetor + "<br>");
    var primeiro = vetor.shift();
    document.write("Primeiro elemento removiso: " + primeiro + "<br>");
    document.write("Novo vetor: " + vetor + "<br><br>");
}

function questao9() {
    document.write("9 - ");
    var vetor1 = new Array(100, 200, 300, 400, 500, 600, 700);
    document.write("Vetor: " + vetor1 + "<br>");
    var selecao = vetor1.slice(2, 5);
    document.write("Valores selecionados posição 2 a 4: " + selecao + "<br><br>");
}

function questao10() {
    document.write("10 - ");
    var vetor1 = new Array(33, 22, 10, 50, 40);
    document.write("Vetor: " + vetor1 + "<br>");
    vetor1.sort();
    document.write("Vetor Ordenado: " + vetor1 + "<br><br>");
}

function questao11() {
    document.write("11 - ");
    var vetor1 = new Array(10, 20, 35, 44, 58);
    document.write("Vetor: " + vetor1 + "<br>");
    vetor1.splice(3, 0, 9, 8, 4);
    document.write("Novo vetor: " + vetor1 + "<br><br>");
}

function questao12() {
    document.write("12 - ");
    var vetor1 = new Array(10, 20, 35, 44, 58);
    document.write("Vetor: " + vetor1 + "<br>");
    vetor1.splice(3, 3, 9, 8, 4);
    document.write("Novo vetor: " + vetor1 + "<br><br>");
}