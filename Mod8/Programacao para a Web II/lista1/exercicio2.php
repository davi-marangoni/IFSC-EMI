<?php
$idade=$_POST['idade'];
if ($idade >= 5 && $idade <=7 ){
  echo "<h1>O nadador esta na categoria infantil A </h1><br>";
}
elseif ($idade >= 8 && $idade <=10){
  echo "<h1>O nadador esta na categoria infantil B </h1><br>";
}
elseif ($idade >= 11 && $idade <=13){
  echo "<h1>O nadador esta na categoria Juvenil A </h1><br>";
}
elseif ($idade >= 14 && $idade <=17){
  echo "<h1>O nadador esta na categoria Juvenil B </h1><br>";
}
else{
  echo "<h1>O nadador esta na categoria Senior </h1><br>";
}
