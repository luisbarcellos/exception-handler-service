# exception-handler-service

### Utilizado no projeto:
    *   Spring boot
    *   Gradle
    *   Java 11

### Passos para rodar o projeto
## 1- Entrar na pasta raiz do projeto pelo terminal e rodar o comando abaixo:
    ./gradlew clean build

Obs.: Necessário acesso a rede para download das dependências.

## Recursos

### 1. Testando Exception

Retorna uma mensagem do módulo de multiproject-jacoco-impl.

#### 1.1 Exemplo de Consumo
* Método:
 
        POST
        
* URL:

        localhost:8080/exception-handler/exception
        

* Response: 

        {
            "timestamp": "2019-04-08 19:41:17",
            "status": "INTERNAL_SERVER_ERROR",
            "message": "Testando Exception personalizada!",
            "errors": []
        }
        
## Conclusão:

        Foi possível personalizar facilmente padrões de exceptions.