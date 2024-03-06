# Estrutura de Dados I (1)

Links complementares

[https://joaoarthurbm.github.io/eda/posts/linkedlist/](https://joaoarthurbm.github.io/eda/posts/linkedlist/)

[https://www.inf.ufpr.br/andrey/ci062/TapAula14.pdf](https://www.inf.ufpr.br/andrey/ci062/TapAula14.pdf)

## Aula 06/02

Comentário sobre como é o mundo de programação e sua evolução dos programas mais básico que vimos em algoritmos, daqui para frente os códigos e os processos ficam mais complexos com diversos algoritmos e dados diferentes. Estes processam os dados e os organizam de alguma forma, nosso objetivo é armazenar os dados de maneira mais eficiente, organizar-los de maneira mais eficiente. Tendo assim **********mais eficiência de memória,********** quando estamos organizando mal essas informações temos mais problema na hora do crescimento do tamanho da complexidade e do volume de dados.

Quando fazemos uma consulta no banco de dados por exemplo, se o tamanho do banco for extenso e o filtro da busca que eu solicitei bem genérico, acaba demorando muito mais para retornar uma busca.

Existem vários algoritmos de ordenação de estrutura de dados, como vamos avaliar qual é o melhor para o seu uso, temos que ver uma anástase do tempo de execução de cada um. Comparando um com o outro vemos que cada uma faz em um tempo diferente, porém nem sempre a melhor solução no tempo de retorno do teste, mas tem que saber também o nível de execução para implementar. Na análise de algoritmo se for pelo tempo não seria um critério válido pois tudo varia de computador para computador, sistema para sistema. Precisamos de uma medida universal para consulta de testes. 

---

## Tipos de estruturas de dados

- Listas Encadeadas
- Pilhas
- Filas
- Árvores
- Gráficos

---

## Aula 13/02 - Tipos de Dados

- Tipos Básicos (primitivos)
    - Inteiro (int,….), Real(float, double, …), Lógico
- Tipos compostos
    - Array (list, duple, set,…)
- Tipos definidos pelo usuário
    - TADs - Tipo Abstrato de Dados
    TAD > Dados; Operações 
    Vamos ter vário clientes (programas, microserviços) utilizando aquele TAD.

A melhor forma de construir classes em java é utilizando métodos geters e setters para atribuir ou consultar valores.

---

## Aula 06/03  - Nodos

Um nodo é um dado que precisamos armazenar dentro de uma lista, poderia ser vários dados, posso armazenar qualquer coisa possível, cada elemento adicionado a uma lista é um nodo. Na outra parte do nodo temos o link para o próximo elemento, temos a entrada de um dado e a saída de um resultado de acordo com o respectivo dado de entrada.

Podemos organizar os dados dentro de uma hierarquia, árvore, grafo e outros por exemplo.

O básico de qualquer estrutura de dados é a remoção, aplicação e busca. 

Na aula de hoje, vamos falar sobre os algoritmos de busca em estruturas de dados. Existem diversos algoritmos que podem ser usados, como busca linear, busca binária, busca por interpolação, entre outros. Cada algoritmo tem sua própria complexidade e eficiência, por isso é importante avaliar qual é o mais adequado para cada caso. Além disso, é fundamental entender a estrutura de dados em que estamos trabalhando para escolher o algoritmo mais apropriado.

Como mencionado antes, a escolha do algoritmo de busca depende da estrutura de dados em que estamos trabalhando. Por exemplo, se estivermos trabalhando com uma lista ordenada, a busca binária pode ser uma opção mais eficiente do que a busca linear. Porém, se a lista não estiver ordenada, a busca linear pode ser a melhor escolha.

Outro fator importante a considerar é a eficiência em termos de tempo e espaço. Alguns algoritmos podem ter um desempenho melhor em termos de tempo, mas podem exigir mais espaço de memória. Por isso, é importante avaliar não apenas a complexidade do algoritmo, mas também o uso de recursos de computação.

Por fim, é importante lembrar que a escolha do algoritmo certo pode fazer uma grande diferença no desempenho do sistema como um todo. Por isso, é importante analisar cuidadosamente as características da estrutura de dados e escolher o algoritmo mais apropriado para cada caso.

- [ ]  Avaliar qual é o melhor algoritmo de ordenação de estrutura de dados para o seu uso, considerando a análise do tempo de execução de cada um
- [ ]  Entender a estrutura de dados em que estamos trabalhando para escolher o algoritmo de busca mais apropriado
- [ ]  Avaliar a eficiência em termos de tempo e espaço dos algoritmos de busca

### Array

Dentro de uma lista temos a melhor forma de definir vários itens em uma única variável, podemos acessar diretamente o dados que eu preciso pelo index. 

```java
package listas_lineares;

public class ListaEncadeada {
	private Nodo inicio;
	
	public ListaEncadeada() {
		inicio = null;}

	public boolean vazia() {
		return inicio == null;
	}
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
		System.out.println(inicio);
		}
	
	
	public void mostraLista() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDado() + "");
			aux = aux.getProx();
		}
		
		System.out.println("");
	}
	
	public void deleteComValor(int valor) {
		if (vazia()) return;
		if (inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			if (aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	

}
```

dentro do deleteComValor() vamos movendo onde inicia o nosso Nodo, então o garbage collector tem a função de não utilizar o valor do node não utilizando. Caso não encontre o nosso valor desejado para ser deletado acabamos movendo para o próximo item utilizando uma variável auxiliar.

---

## Aula 13/03 - Lista Circular

Quando tivermos apenas uma único elemento a lista vai setar que o final vai ser o último elemento então como o último elemento é o primeiro ele vai ficar dando voltas dentro de si mesmo.

### Atividades:

Implemente os seguinte métodos:

1. Contar nodos da lista - LC
2. Inserir no final - LC
3. Deletar ùltimo - LE
4. Deletar Primeiro - LE
5. Buscar um valor e caso encontre retornar a posição na lista - LE e LC

---

## Aula 20/03 - Listas Lineares com Restrições

- Passou a resolução das tarefas anteriores, código dentro do git:

LIFO - Last in First Out 

Em uma pilha de dados temos por convensção que a primeira a entrar é a sempre a primeira a sair.

FIFO - First in Firts Out

Em uma fila para inserir é sempre na frente, quem chegou primeiro sai primeiro, 

********************Atividade******************** 

Implemente um método que receba três filas, F, F_Impares e F_Pares, e separe todos os valores armazenados em F de tal forma que os valores pares são movidos para a fila F_Pares e os valores ímpares são movidos para F_Impares.

---

## Aula 27/03 - Fila, Pilha e seus métodos.

Estamos utilizando o método Interger dentro do Java que vai nos proporcionar mais atributos dentro da variável do tipo inteiro, isso o torna melhor que apenas o “INT”.

```jsx
package listas_lineares;

public class Fila {

	public Interger remover() {
		if (estaVazio()) {
			return null;
		}
		int valor = inicio.getProx();
		inicio = inicio.getProx();
		tamanho--;
		if (estaVazio()) {
			fim = null;
		}
		return valor;
	}
	public void separarNumeros(Fila F, Fila F_Pares, Fila F_Impares) {
		while (!F.estaVazio()) {
			int num = F.remover();
			if (num %2 == 0) {
//				número par 
				F_Pares.inserir(num);
			} else {
//				Número impar
				F_Impares.inserir(num);
			}
		}
	}
}
```

### Lista Duplamente Encadeada.

Agora vamos ter a possibilidade de navegar dentro das listas, agora ele vai ter o campo do anterior e do próximo. 

![Untitled](Estrutura%20de%20Dados%20I%20(1)/Untitled.png)

---

## Aula 03/04 - Lista duplamente encadeada circular

---

## Aula 24/04 - Tabelas Hash/ Tabela de Dispersão/ Dicionários

É uma forma de armazenar informações de maneira bem eficiente, considerando sempre o formato chave e valor. Definimos em uma array e dentro de cada campo atribuímos um hashcode, desta forma é mais simples de ser identificado dentro de uma armazenamento. Assim também é o funcionamento dos bancos de dados onde o index é uma chave interna. 

4

```java
package flights;

public class Main {
    static int tempo = 20;
    static int combustivel = 20;
    static int decolagem = 10;
    static int aterrisasagem = 10;

    public static void main(String[] args) {
        System.out.println("Sucesso!");
        System.out.println(tempo);
        Main.addTempo(tempo);
        System.out.println(tempo);
    }

    public static void addTempo(int tempo) {
        tempo++;
        System.out.println(tempo);
    }
}
```

## Aula 08/05 - hashTables Funcionamento de dicionários

Estudo sobre como é o funcionamento de dicionários dentro das linguagens de programação. Foi criado um código em Java para realizar essa transferência de dados. 

Versão 1: Somente insere a chave e o valor, sem se preocupar em sobrescrever os valores que já tem uma hash ocupada.

Versão 2:Tratamento de colisão, agora ele procura um posição vazia que não tem nenhum valor dentro do array. Um problema que pode acontecer é caso tenha mais valores do que o tamanho do array, assim fica infinitamente buscando um novo espaço vazio.

Versão 3: Agora tratamos cada item das chaves como uma lista encadeada.

## Aula 22/05 - Análise Assintótica Tempo de execução algoritmo

Conforme eu acrescento vários elementos dentro da minha entrada, conforme eu aumento meu conjunto de entrada eu aumento meu conjunto de instrução de máquina. Temos que analisar qual a caracteristica dominante, isto é, não focar no tempo de execução pois isso demanda sobre fatores externos como a máquina e poder de processamento, o que importa é a quantidade de instruções. 

A parte dominante é a função raiz que vai definir o tamanho do crescimento do tempo de execução de acordo com o conjunto de entrada de dados;

1 Big Theta (****θ****)- Caso médio
2 Big O (O) - Pior caso
3 Big Omega (****Ω****) - Melhor Caso

![a1.png](Estrutura%20de%20Dados%20I%20(1)/a1.png)

**********PROVA**********

Listas

TabelasHash

Analise Assintodica

---
# 2024.1
## Aula 21/02
- Conceitos iniciais sobre os tipos de dados e as formas para se organizar

## Aula 28/02
### Lista Encadeada
São uma fila de Nodos, onde a gente pega um nodo inicial e vai incrementando na esquerda, no inicio. Na hora de ler temos que criar uma variavél auxiliar para conseguir mover o incio depois. Na hora de deletar temos que pegar o aux e receber o próximo do pŕoximo elemento, para que ele consiga romper o vincula com o próximo e vincular com o prox do prox.

## Aula 06/03/24

### Escreva os seguintes métodos para a Lista Encadeada:

1. Contar nodos da lista
2. ~~Inserir no final~~
3. Deletar o **primeiro** nodo da lista
4. Deletar o **último** nodo da lista
5. Procurar se um valor está ou não da nlista, caso sim, em qual posição.