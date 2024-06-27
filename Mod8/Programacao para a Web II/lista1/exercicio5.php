<?php
    function contaAte10(){
        $contador = 0;
        $resultado = 0;
        while ($contador<=10){
            echo "Somando: " . $resultado . " + " .  $contador;
            $resultado = $contador + $resultado;
            $contador ++;
            echo " Resultado: " . $resultado . "<br>";
        } 
    }
    contaAte10();