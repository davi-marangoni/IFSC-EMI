<?php
    $texto = $_POST['texto'];
    function repeteTexto($texto){
        $i = 0;
        while ($i<10){
            echo $texto . '<br>';
            $i ++;
        }
    }
    repeteTexto($texto);