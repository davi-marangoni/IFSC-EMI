<?php
$primeiro=$_POST['numero1'];
$segundo=$_POST['numero2'];
$terceiro=$_POST['numero3'];

function mostraMenor($primeiro, $segundo, $terceiro){
  if ($primeiro < $segundo && $primeiro < $terceiro){
    echo "<h1>O menor número é " . $primeiro . "</h1><br>";
  }
  elseif ($segundo < $primeiro && $segundo < $terceiro){
    echo "<h1>O menor número é " . $segundo."</h1><br>";
  }
  else{
    echo "<h1>O menor número é " . $terceiro ."</h1><br>";
  }
}

mostraMenor($primeiro, $segundo, $terceiro);