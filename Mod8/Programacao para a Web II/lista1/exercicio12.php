<?php
function mostraNumero() {
    $contador = 0;
    for ($contador = 0; $contador <= 100; $contador++) {
        if ($contador % 2 == 0 ){
            echo "Número " . $contador . " é par <br>";
        }
    }
}
mostraNumero();