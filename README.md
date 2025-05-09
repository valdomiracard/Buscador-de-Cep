📍 Buscador de CEP
Buscador de CEP é uma aplicação Java que consome a API pública ViaCEP para buscar e exibir informações de endereço a partir de um CEP informado pelo usuário.

✨ Funcionalidades
Entrada de CEP pelo usuário

Requisição HTTP para a API ViaCEP

Conversão de resposta JSON em objeto Java

Exibição de endereço formatado no console

🧰 Tecnologias utilizadas
Java 11+

Biblioteca HttpClient

Biblioteca Gson para conversão JSON

📦 Estrutura do projeto
bash
Copiar
Editar
src/
├── Principal.java        # Classe principal com entrada do usuário
├── BuscaCep.java         # Lógica de requisição à API e conversão JSON
└── Endereco.java         # Modelo de dados para armazenar os campos do endereço
🚀 Como executar
Clone este repositório

Compile e execute o projeto com o seu ambiente Java

Digite um CEP válido quando solicitado

Veja o endereço completo retornado pela API
