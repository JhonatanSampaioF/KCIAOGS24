# KCIAO

Gustavo Vieira Bargas - Pitch da proposta
</br>
Jhonatan Sampaio Ferreira - Desenvolvimento da aplicação
</br>
Vivian Sy Ting Wu - Desenvolvimento da documentação
</br>
</br>

## Objetivo da solução

O objetivo da nossa solução foi criar uma calculadora para que os usuarios possam entrar, inserir dados simples e serem retornados com o quanto economizariam caso se tornem adeptos aos equipamentos mais simples energia verde via energia solar e eólica.
Utilizamos o necessário para o funcionamento dos equipamentos de geração de energia, planos futuros incluem:
- Um repositório com diferentes equipamentos
- Consumo de APIs externas para coleta de dados a respeito do clima do local informado
- Consumo de APIs externas para coleta de dados a respeito da situação tarifária do local informado
- Uso de IA para o cálculo de escalabilidade e custo benefício com os diversos equipamentos e tamanhos disponíveis


## Pitch apresentação
### [Video Pitch](https://www.youtube.com/watch?v=evHRuOFIT_Q)


## Instrução de como rodar a aplicação e vídeo de teste
### [Link tutorial](https://youtu.be/JMmKNNNo7GY)


## Diagramas
</br>

![WhatsApp Image 2024-11-21 at 19 05 34 (1)](https://github.com/user-attachments/assets/70e6fd17-a86d-431c-b3c4-a7f613695ca8)

</br>

![WhatsApp Image 2024-11-21 at 19 05 34](https://github.com/user-attachments/assets/42b1d5f8-7fbf-401d-8cfd-cc5e7042e336)


## Lista de endpoints
Os endpoints documentados abaixo são funcionais para todos os domínios da aplicação, sendo necessária apenas a alteração da URL correspondente e do corpo da requisição.
</br>
| Domínio | URL |
| :---: | :---: |
| Usuario | /usuario |
| Endereco | /endereco |
| Energia Eolica | /energiaEolica |
| Energia Solar | /energiaSolar |


# Deploy e Teste da API em Docker
### [Link Deploy](https://www.youtube.com/watch?v=k8LD8ITsCfQ)

## Arquitetura do Projeto

- **API Java**: A aplicação Java roda dentro do contêiner `api`, que é construído usando o `Dockerfile` presente no repositório.
- **Nginx**: O Nginx atua como um proxy reverso, redirecionando as requisições feitas na porta 8081 para o contêiner da API na porta 8080.
- **Docker Compose**: Utilizado para orquestrar a criação e execução dos contêineres de forma simples.

