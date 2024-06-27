<?php
function numero(){
    $numero = rand(0,50);

    return $numero;
}
function sorteia(){
    $numero = 0;
   for ($numero = 0; $numero != 37;) {
        $numero = numero();
        echo $numero . " <br>";    
   }
}
sorteia();