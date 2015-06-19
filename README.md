# CidadeEstadoAPI
Simples API com os estados e cidades do Brasil no formato de enum, nada mais de ter que acessar o banco só para conseguir uma lista estatica de cidades e estados

#Uso
-Retornar as cidades de um determinado estado

List<Cidade> cidades = Cidade.getCidades("SP");
List<Cidade> cidades = Cidade.getCidade(Estado.SP);


-Lista todas os estados de uma determinada cidade

List<Estado> estados = Cidade.ABADIA_DE_GOIAS.getEstados();
