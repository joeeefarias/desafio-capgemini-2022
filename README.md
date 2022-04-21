<h1 align="center"> ☕ Desafio Capgemini Proway 2022</h1>

<section>
  <details>
  <summary>Requesitos</summary>
    <p>
    
# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
Exemplo:

Entrada:
n = 6

Saída:
```
     *
    **
   ***
  ****
 *****
******
```

# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

    • Possui no mínimo 6 caracteres.
    • Contém no mínimo 1 dígito.
    • Contém no mínimo 1 letra em minúsculo.
    • Contém no mínimo 1 letra em maiúsculo.
    • Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:
Entrada:
Ya3

Saída:
3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
Exemplo:
Exemplo 1)
Entrada:
ovo

Saída:
2
Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 


Exemplo 2)
Entrada:
ifailuhkqq

Saída:
3

Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

# O que será avaliado
    • Documentação
    • Estrutura do código
    • Atendimento aos requisitos
    • Testes unitários

  </p>
  </details>
  <hr/>
  <br></br> 

>Desafio de código do programa Capgemini 2022
Aplicação desenvolvida em Java 8 utilizando a IDE IntelliJ Idea.
<br></br>


<h2>📚 Ferramentas</h2>

<p stle="align:left">Antes de começar, você vai precisar das ferramentas abaixo:

* Java 8 (Open JDK) [Download](https://www.openlogic.com/openjdk-downloads)
* JUnit 5 para os teste unitários [Site Oficial](https://junit.org/junit5/docs/current/user-guide/)
* Alguma IDE com suporte ao Java. Recomendo [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/#section=windows) ou [Eclipse](https://www.eclipse.org/downloads/)
* Git [Instalação e configuração](https://www.hostinger.com.br/tutoriais/tutorial-do-git-basics-introducao)
* *Extra* [Comandos básicos de GIT](https://www.digitalhouse.com/br/blog/principais-comandos-git)
</p>


<h2>⬇️ Baixando o projeto</h2>

<p>Para importar o projeto, basta fazer o download do repositório:

Faça o [download](https://github.com/joeeefarias/desafio-capgemini-2022/archive/refs/heads/main.zip) do projeto na sua maquina e abra o projeto com sua IDE de preferência.

Ou

Abra o terminal ou prompt de comando, navegue até a pasta de destino.
Então digite comando:
```
~$ git clone  https://github.com/joeeefarias/desafio-capgemini-2022.git
```
Após clonar o repositório abra o projeto com sua IDE de preferência.
</p>
<h2>💻 Utilizando o projeto</h2>

<p>Após o download do projeto abra-o em sua IDE de preferêcia.
Ao abrir o projeo algumas dependências do Java serão indexadas.

Para executar o projeto basta executar classe ``` DesafioMain.java ``` será exibido no terminal da IDE 4 opções:

|Opção | Ação |
| ----- | ----- |
| `1` | **Executa a questão 1** |  
| `2` | **Executa a questão 2** |
| `3` | **Executa a questão 3**|
| `9` | **Encerra o programa** |
</p>

</br>

<h2> ✔️ Testes Unitários</h2>

<p>

Para o desenvolvimento dos testes unitários, foi utilizado o framework JUnit 5.
Para rodar os testes basta executar a classe ```DesafioTest.java```.
Ao finalizar o processo será exibido um relatório com o resultado dos testes.

</p>
