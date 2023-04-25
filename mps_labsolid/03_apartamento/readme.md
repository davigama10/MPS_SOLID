# Explicação

Princípio da Substituição de Liskov (LSP)

Nesse exemplo, a classe UpgradeApartamento aplica o LSP no método upgrade ao verificar se
o objeto enviado como parâmetro é um Studio. Como um Studio não tem quartos, o incremento
de quartos não pode ser feito. Isso garante que os objetos criados a partir de todas as 
classes filhas podem agir como objetos da classe Apartamento sem causar um mal-funcionamento. 