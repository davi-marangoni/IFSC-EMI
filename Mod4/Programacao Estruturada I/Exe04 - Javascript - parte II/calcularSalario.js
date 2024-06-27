function calculaSalario() {
    var valor = document.getElementById("valor").value;
    var tempo = document.getElementById("tempo").value;
    var salarioBruto = valor * tempo;
    var imposto = salarioBruto * 0.27;
    var salarioLiquido = salarioBruto - imposto;


    console.log(salarioBruto.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));
    console.log(salarioLiquido.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));

    document.getElementById('A').innerHTML = salarioBruto.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    document.getElementById('B').innerHTML = salarioLiquido.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
}