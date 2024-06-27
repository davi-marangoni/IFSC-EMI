<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Curriculum</title>
</head>
<?php
$nome = $_POST['nome'];
$email = $_POST['email'];
$cpf = $_POST['cpf'];
$endereco = $_POST['endereco'];
$telefone = $_POST['telefone'];
$sexo = $_POST['sexo'];
$escolaridade = $_POST['escolaridade'];
$expcom = $_POST['expcom'];
?>
<body>
  <h1 style="text-align: center;">Curriculum</h1>
  <br>
  <h2 style="text-align: center;">Curriculo recebido com sucesso, Obrigado!</h2>
  <br> 
  <br>   
  <form style="margin-left: 100px; margin-right: 100px" action="curriculum1.php" method="post">
    <div class="form-row">
      <div class="form-group col-md-4">
        <label for="nome">Nome Completo</label>
        <input type="text" class="form-control" id="nome" name="nome" value="<?php echo $nome; ?>" disabled>
      </div>
      <div class="form-group col-md-4">
        <label for="email">E-mail</label>
        <input type="email" class="form-control" id="email" name="email" value="<?php echo $email; ?>" disabled>
      </div>
      <div class="form-group col-md-2">
        <label for="cpf">CPF</label>
        <input type="text" class="form-control" id="cpf" name="cpf" value="<?php echo $cpf; ?>" disabled>
      </div>
      <div class="form-group col-md-2">
        <label for="sexo">Sexo</label>
        <select id="sexo" name="sexo" class="form-control" disabled >
          <option selected ><?php echo $sexo; ?></option>
        </select>
      </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-4">
          <label for="endereco">Endereço</label>
          <input type="text" class="form-control" id="endereco" name="endereco" value="<?php echo $endereco; ?>" disabled>
        </div>
        <div class="form-group col-md-4">
          <label for="telefone">Telefone</label>
          <input type="text" class="form-control" id="telefone" name="telefone" value="<?php echo $telefone; ?>" disabled>
        </div>
        <div class="form-group col-md-4">
        <label for="escolaridade">Escolaridade</label>
        <select id="escolaridade" name="escolaridade" class="form-control" disabled>
        <option selected ><?php echo $escolaridade; ?></option>
        </select>
      </div>
    </div>
    <div class="form-row">
        <div class="form-outline w-100">
            <label class="form-label" for="expcom">Experiencia/Conhecimentos</label>
            <textarea class="form-control" id="expcom" name="expcom" rows="4" disabled><?php echo $expcom; ?></textarea>
        </div>
    </div>
    <br>
  </form>
  <a style="margin-left: 100px;" href="curriculum.php" class="btn btn-primary">< voltar</a>  
</body>
</html>