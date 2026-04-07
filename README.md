# 📚 API Livros - Spring Boot

Uma **API REST simples em Java com Spring Boot** para gerenciar um CRUD de livros (Create, Read, Update, Delete).  
Esse projeto serve como **exemplo prático** para aprender a desenvolver APIs completas com persistência em banco de dados usando Spring Data JPA.

---

## 🚀 Tecnologias utilizadas

- Java (8+ / 17)
- Spring Boot
- Spring Web (REST)
- Spring Data JPA
- MYSQL
- Maven

---

## 🧠 Descrição

Esta API fornece endpoints para cadastrar, listar, atualizar e remover livros.  
É um backend REST que pode ser usado como base para aplicações maiores ou como projeto de estudo.

---

## 📦 Instalação

1. Clone este repositório:
   ```bash
   git clone https://github.com/leozin-del/api-livros-spring.git

Acesse a pasta:

cd api-livros-spring

Execute com Maven:

mvn spring-boot:run

⚠️ Certifique-se de ter JDK instalado e configurado no sistema.

🛠️ Uso / Endpoints

A API roda por padrão em:

http://localhost:8080

Principais endpoints:

Método	Rota	Descrição
GET	/livros	Lista todos os livros
GET	/livros/{id}	Busca livro por ID
POST	/livros	Cria um novo livro
PUT	/livros/{id}	Atualiza um livro
DELETE	/livros/{id}	Remove um livro

Exemplo de requisição POST (JSON):

{
  "titulo": "Clean Code",
  "autor": "Robert C. Martin",
  "ano": "2026"
}
🧪 Testes

Se houver testes automatizados (JUnit / Spring Test), explique aqui como executá-los, por exemplo:

mvn test
📁 Estrutura principal de pastas
src/
├── main/
│   ├── java/
│   │   └── com/…
│   └── resources/
├── test/
└── pom.xml
📌 Contribuições

Contribuições são bem‑vindas! 🙌
Se quiser adicionar melhorias (novos endpoints, testes, documentação, Swagger/OpenAPI etc.), abra uma issue ou um pull request.



Este projeto possui licença aberta — sinta‑se à vontade para usar e modificar conforme necessário.

