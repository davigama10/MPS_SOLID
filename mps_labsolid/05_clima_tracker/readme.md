Princípio da Inversão de Dependência (DIP):

As classes de alto nível não devem depender de classes de baixo nível. Ambos devem depender de abstrações. Isso significa que as classes devem depender de interfaces ou classes abstratas em vez de classes concretas. 
No exemplo entregue, a classe ClimaTracker depende das classes Phone e EmailCliente, que são classes concretas. 
Para corrigir isso é recomendado criar uma classe de interface.
