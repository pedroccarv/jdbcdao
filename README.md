#  JDBC DAO Project

Projeto desenvolvido para estudo aprofundado de **Java** e manipulação de banco de dados **MySQL** utilizando **JDBC (Java Database Connectivity)**.

O objetivo principal foi implementar o sistema completo sem o uso de frameworks ORM (como Hibernate ou JPA) para compreender o funcionamento interno das conexões, transações e mapeamento objeto-relacional (ORM) manual.

## Arquitetura e Padrões de Projeto

O projeto segue uma arquitetura em camadas bem definida, visando baixo acoplamento e alta coesão:

* **Padrão DAO (Data Access Object):** Isola a lógica de acesso a dados das regras de negócio.
* **Factory Pattern:** A classe `DaoFactory` é responsável por instanciar os DAOs, ocultando a implementação concreta (`JDBC`) da camada de aplicação.
* **Singleton Pattern:** Utilizado na classe `DB` para garantir uma única instância de conexão com o banco.
* **Injeção de Dependência:** As dependências de conexão são injetadas manualmente nos DAOs.

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **JDBC (Standard)**
* **MySQL 8+**
* **IntelliJ IDEA**
* **MySQL Connector/J**

## 📂 Estrutura do Projeto

```text
└── src
    ├── application      # Camada de interação com o usuário (Main)
    ├── db               # Gerenciamento de conexão e exceções personalizadas
    ├── model
    │   ├── Dao          # Interfaces (Contratos)
    │   │   └── impl     # Implementações JDBC concretas
    │   └── entities     # Classes de domínio (POJO) - Seller, Department
