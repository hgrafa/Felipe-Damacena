# Programação Orientada a Objetos

## Revisão - pilares Java Sequencial

- entradas (`Scanner`)
- variaveis (`String, double, int, boolean`)
- seleção (`if...else`) + expressões booleanas
- repetição (`for`, `while`, `do...while`) + keywords(`break`, `continue`)
- vetores ou array (`tipo[] vetor`)
- função

```java
Scanner scanner = new Scanner(System.in);

int idade = scanner.nextInt();
```

```java
int soma = 0;

for(int i = 0; i < 100; i++) {
  if(i%13 != 0){
    continue;
  }

  soma += i;  
}
```

```java
int[] sequencia = new int[10]; // [0] -> [9]

sequencia[0] = 9999;

for(int i = 0; i < sequencia.length; i++){
  System.out.println(sequencia[i]);
}
```

```java
public class Program {

  public static double somar(double a, double b) {
    double soma = a + b;
    return soma;
  }

  public static void dizerOi(String nome) {
    System.out.println("Oi, " + nome);
  }

  public static void main(String[] args) {
    int resultado = somar(2, 3);

    dizerOi("Joao");
  }

}
```

## Intro POO

classe: molde, classificacao
objeto: fruto do molde

```java
class Produto {

  // tem - atributo
  String nome;
  String descricao;
  double preco;
  int quantidade;

  // faz - metodo
  double subtotal() {
    return preco * quantidade;
  }
}
```

```java
Produto p1 = new Produto();
Produto p2 = new Produto();

p1.nome = "Hamburguer";
p1.preco = 50;
p1.quantidade = 1;

p2.nome = "Pizza";
p2.preco = 50;
p2.quantidade = 2;

Produto[] produtos = new Produto[3];

produtos[0] = p1;
produtos[1] = p2;
produtos[2] = new Produto();

produtos[2].nome = "Macarrao";
produtos[2].preco = 30;
produtos[2].quantidade = 1;

double total = 0;

for(int i = 0; i < produtos.length; i++) {
  Produto produtoAtual = produtos[i];
  total += produtoAtual.subtotal();
}
```

## Estrutura base

```java
public class Pessoa {

  public String nome;
  public String cpf;
  public int idade;
  public double altura;

  public void dizerOi() {
    System.out.println("Muito prazer, sou o(a) " + nome);
  }

}

public class Program {

  public static void main(string[] args) {

    Pessoa joao = new Pessoa();

    joao.nome = "Joao da Silva";
    joao.cpf = "111.222.333-44";
    joao.idade = 23;
    joao.altura = 1.8;

    joao.dizerOi(); // Muito prazer, sou o(a) Joao da Silva

  }
}
```

## construtores

```java
public class Pessoa {

  // atributos - tem
  public String nome;
  public String cpf;
  public int idade;
  public double altura;

  // construtor ou metodo construtor
  // construtor padrao
  public Pessoa() { 
  }

  // metodos - faz
  public void dizerOi() {
    System.out.println("Muito prazer, sou o(a) " + nome);
  }

}
```

criando o nosso proprio construtor:

- quando criamos nosso construtor o construtor padrao eh removido.

```java
public class Pessoa {

  // atributos - tem
  public String nome;
  public String cpf;
  public int idade;
  public double altura;

  // construtor ou metodo construtor
  public Pessoa(String nomeEntrada, String cpfEntrada) {
    nome = nomeEntrada;
    cpf = cpfEntrada;
  }

  // metodos - faz
  public void dizerOi() {
    System.out.println("Muito prazer, sou o(a) " + nome);
  }

}
```

usando:

```java
Pessao joao = new Pessoa("Joao da Silva", "111.222.333-44");
```
