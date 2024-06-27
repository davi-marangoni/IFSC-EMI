<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Lista 1/ Exercicio 8</title>
</head>
<body>

<?php   

function numero(){
    $numero = rand(0,50);

    return $numero;
}

function sorteia(){
    $numero = "";
    while($numero != 37){
        $numero = numero();
        echo $numero. " <br>";
    }
}

sorteia();

?>


</body>
</html>