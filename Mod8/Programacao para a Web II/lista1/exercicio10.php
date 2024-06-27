<?php
function contaAte10(){
$resultado = 0;
for ($contador = 0; $contador <= 10; $contador++) {
    echo 'Somando:' . $resultado . ' + ' .  $contador;
    $resultado = $contador + $resultado;
    echo ' | Resultado:' . $resultado . '<br>';
}
}    
contaAte10();