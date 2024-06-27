<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Lista 1/ Exercicio 7</title>
</head>
<body>

<?php

function mostraNumero() {
    $contador = 0;

    while($contador <= 100){
        if ($contador % 2 == 0 ){
            echo "Número ". $contador ." é par <br>";
        }
        $contador++;
    }
}

mostraNumero();

?>
</body>
</html>