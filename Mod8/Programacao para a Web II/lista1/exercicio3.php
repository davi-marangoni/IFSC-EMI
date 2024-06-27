<?php

$altura=$_POST['altura'];
$sexo=$_POST['sexo'];

function pesoIdeal($altura, $sexo){
    if ($sexo == 'masculino'){
        $pesoIdeal = ('72.7'*$altura) - '58';
    }else{
        $pesoIdeal = ('62.1'*$altura) - '44.7';
    }
    $resultado = ("<br> <b>Peso Ideal: </b>". $pesoIdeal ."<br>");
    echo $resultado;
}
pesoIdeal($altura, $sexo);