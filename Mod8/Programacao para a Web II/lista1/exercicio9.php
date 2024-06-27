<?php

function repeteTexto($texto){
  for ($num = 0; $num < 10; $num++) {
    echo $texto . '<br>';    
  }
}

$texto = $_POST['texto1'];
repeteTexto($texto);

