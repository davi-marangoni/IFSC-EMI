<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Curriculum</title>
</head>
<body>
  <h1 style="text-align: center;">Curriculum</h1>
  <br>
  <h3 style="text-align: center;">Envie seu curriculo utilizando os campos abaixo:</h3>
  <br> 
  <br>   
  <form style="margin-left: 100px; margin-right: 100px" action="curriculum1.php" method="post">
    <div class="form-row">
      <div class="form-group col-md-4">
        <label for="nome">Nome Completo</label>
        <input type="text" class="form-control" id="nome" name="nome" placeholder="Nome Completo" required>
      </div>
      <div class="form-group col-md-4">
        <label for="email">E-mail</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="seu@email.com" required>
      </div>
      <div class="form-group col-md-2">
        <label for="cpf">CPF</label>
        <input type="text" class="form-control" id="cpf" name="cpf" placeholder="CPF" maxlength="11" required>
      </div>
      <div class="form-group col-md-2">
        <label for="sexo">Sexo</label>
        <select id="sexo" name="sexo" class="form-control" required>
          <option>Masculino</option>
          <option>Feminino</option>
          <option>Não Binario</option>
          <option>Prefiro não dizer</option>
        </select>
      </div>     

    </div>
    <div class="form-row">
        <div class="form-group col-md-4">
          <label for="endereco">Endereço</label>
          <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Endereço" required>
        </div>
        <div class="form-group col-md-4">
          <label for="telefone">Telefone</label>
          <input type="tel" class="form-control" id="telefone" name="telefone" placeholder="Telefone" maxlength="15" required>
        </div>
        <div class="form-group col-md-4">
        <label for="escolaridade">Escolaridade</label>
        <select id="escolaridade" name="escolaridade" class="form-control" required>
          <option>Ensino medio</option>
          <option>Graduação</option>
          <option>Pós-Graduação</option>
          <option>Outros Cursos</option>
        </select>
      </div>
      </div>
      <div class="form-row">
          <div class="form-outline w-100">
            <label class="form-label" for="expcom">Experiencia/Conhecimentos</label>
            <textarea class="form-control" id="expcom" name="expcom" rows="4" placeholder="Fale um pouco sobre seus conhecimenos e experiências na area ..."></textarea>
          </div>
        </div>
        <br>
    <button type="submit" class="btn btn-primary">Enviar</button>
  </form>
</body>
</html>