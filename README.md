# 🚀 GitFlow & CI/CD Pipeline - Gestão da Qualidade de Software

[![PR Validation](https://github.com/matcand/Aula09-GitFlow/actions/workflows/pr-validation.yml/badge.svg)](https://github.com/matcand/Aula09-GitFlow/actions/workflows/pr-validation.yml)
[![Java Version](https://img.shields.io/badge/Java-25-blue.svg)](https://openjdk.org/projects/jdk/25/)
[![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen.svg)]()

## 📌 Sobre o Projeto
Este repositório consolida práticas avançadas de engenharia de software, desenvolvido como parte da disciplina de Gestão da Qualidade de Software (FATEC SBC). O foco principal é a implementação de um fluxo de trabalho profissional utilizando **Git Flow**, automação de **Integração Contínua (CI)** e garantia de qualidade através de **Testes Unitários**.

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Linguagem:** Java (Microsoft OpenJDK 25)
* **Gerenciamento de Dependências:** Maven
* **Testes Automatizados:** JUnit 5
* **Cobertura de Código:** JaCoCo Plugin
* **Automação CI/CD:** GitHub Actions
* **Versionamento:** Git & GitHub (Estratégia Git Flow)

## ⚙️ Arquitetura e Fluxo de Trabalho (Git Flow)
O projeto foi estruturado simulando o ambiente colaborativo de uma empresa de tecnologia, contendo:
1. **`main`**: Código em nível de produção.
2. **`develop`**: Branch de integração para testes de novas funcionalidades.
3. **`feature/*`**: Desenvolvimento isolado de novas regras de negócio (ex: `feature/login`, `feature/notificacoes`).
4. **`hotfix/*`**: Correções ágeis e urgentes (ex: `hotfix/header-null`).

## 🧪 Qualidade e Automação
* **GitHub Actions:** Pipeline configurada (`pr-validation.yml`) para interceptar *Pull Requests*, provisionar o ambiente Ubuntu, compilar o projeto e executar `mvn clean test` automaticamente.
* **Code Review:** Simulação de revisão de código por pares, garantindo a refatoração de métodos críticos (tratamento de `ArithmeticException`).
* **Cobertura de Testes:** Implementação de validações via Expressões Regulares (Regex) com cobertura de 100% garantida nas regras de negócio submetidas.

## 🚀 Como Executar Localmente
```bash
# Clone o repositório
git clone [https://github.com/matcand/Aula09-GitFlow.git](https://github.com/matcand/Aula09-GitFlow.git)

# Entre no diretório
cd Aula09-GitFlow

# Execute os testes e gere a documentação Javadoc
mvn clean test javadoc:javadoc
