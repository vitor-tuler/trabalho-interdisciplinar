# trabalho-interdisciplinar
Davi Athanes Pinheiro – 1625562
Gabriel Teodoro Suzano – 1975038
Matheus Henrique Nobre de Freitas – 5037049
Renan Cruz dos Santos – 3346165
Victor Filippi Nicolosi Franco – 5148846
Vinicius Luiz Ventura Ribeiro – 4817103
Vitor Tuler Anizio – 4736500

Proposta do trabalho: Definir um conjunto de características para os nomes que permita identificar se o mesmo se
trata de um nome masculino ou feminino, e com isso, fazer um programa que implemente um modelo Naive Bayes que
utilize o conjunto de características definido, receba ao menos 3 nomes e informe a sugestão do nome se é
masculino ou feminino.

Desenvolvimento: Com base nas aulas e em diversos fóruns de estudos como Stack Overflow e DevMedia, conseguimos
desenvolver duas interfaces utilizando duas linguagens diferentes, fizemos isso para ao longo do desenvolvimento
dos códigos, analisarmos qual teria melhor desempenho e usabilidade, primeiramente desenvolvemos uma interface 
utilizando Java, e depois desenvolvemos uma Interface utilizando Python.
Em Java, utilizamos a biblioteca javax.swing, já em python, utilizamos a biblioteca Tkinter.

Com as telas prontas, começamos a estudar maneiras de realizar os cálculos das probabilidades, ao fazer uma
análise de uma série de nomes, optamos por verificar de trás para frente, utilizando da última letra dos nomes
para as primeiras, pois as características de nomes masculinos e femininos são mais predominantes no final dos
nomes, com as características já identificadas podemos chegar a uma conclusão e criar um rotulo de identificação
dos nomes.
