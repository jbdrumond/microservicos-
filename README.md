# Microsserviços em Spring Cloud com Java

## Sobre o projeto

As arquiteturas de microsserviço são uma abordagem na qual o software consistede em pequenos serviços indepentendes que 
se comunicam entre si e são organizados de acordo com suas regras de negócio. 

Sua utilização é recomendada para aplicações que demandam certas particularidades como; Escalabilidade, Resiliência, 
Flexibilidade, Monitoramento, Automação de processos, dentre outros.  
  Este tipo de arquitetura possui aspectos voltado ao processo de desenvolvimento, aumentam a produtividade pela possibilidade de 
segmentação de time, entrega contínua e pela autonomia de cada microserviço, novas versões podem ser implantadas, possui baixo risco em fix de bugs, melhora a agilidade das 
entregas e agregam mais valor ao produto pois também possibilita que cada segmento do time possa se aprofundar nas regras de negocio. 

### Organização do projeto

* Config Server: _Consome as configurações do repositório no git e disponibiliza para os módulos._
* Service Discory: _Criado pelo Eureka, Integra os serviços e disponibiliza para as aplicações._
* Catalog: _Módulo desenvolvido utilizando Elasticsearch._
* Shopping Cart: _Módulo desenvolvido utilizando Redis._
* Gateway: _Módulo responsável pelas rotas._


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Lombok
- spring-cloud
- Elasticsearch
- Eureka-server
- Docker
- Gradle


# Autor

José Brasil Drumond Filho
