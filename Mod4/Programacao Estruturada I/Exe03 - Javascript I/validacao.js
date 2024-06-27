function mudaasfoto()
{
    var nome=prompt("Digite o nome do melhor cantor do mundo:");
        var certo = new String('ANDRE MATOS');
        var y = nome.toUpperCase();
        if(y == certo){
            document.getElementById("demo").innerHTML='ACERTOU !!!';
            document.getElementById("img").src="ANDREacertou.jpg";
            document.getElementById("img").style="position: absolute; top: 25%; left: 30%; width: 500px; height: 500px;";
        }else{
            document.getElementById("demo").innerHTML='ERROU !!!';
            document.getElementById("img").src='ANDREerrou.jpg';
            document.getElementById("img").style="position: absolute; top: 25%; left: 33%; width: 500px; height: 500px;";
    }
}