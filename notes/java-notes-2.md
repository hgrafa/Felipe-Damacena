
- CRUD: Create Read Update Delete

## Modelando um aluno

```java
String nome;
String cpf;
int idade;
double notaFinal;
```

## Modelando 3 alunos

```java
String nome1, nome2, nome3;
String cpf1, cpf2, cpf3;
int idade1, idade2, idade3;
double notaFinal1, notaFinal2, notaFinal3;
```

## Modelando 1000 alunos

```java
int quantidade = 1000;

String[] nomes = new String[quantidade];
String[] cpfs = new String[quantidade];
int[] idades = new int[quantidade];
double[] notasFinais = new double[quantidade];
```

```java
public static void exibirDadosPorId(int id, String[] nomes, String[] cpfs, int[] idades, double[] notasFinais) {
  System.out.println(nomes[id])
  System.out.println(cpfs[id])
  System.out.println(idades[id])
  System.out.println(notasFinais[id])
}

public static void main(String[] args) {
  int quantidade = 1000;

  String[] nomes = new String[quantidade];
  String[] cpfs = new String[quantidade];
  int[] idades = new int[quantidade];
  double[] notasFinais = new double[quantidade];

  exibirDadosPorId(2, nomes, cpfs, idades, notasFinais);
}
```

## Primeiro Problema Motivador

Nosso codigo não possui expressividade e será mais dificil de escalar os atributos

## Relembrando... Como Trocar Variaveis?

```java
int a = 2, b = 3;
int aux = a;
a = b;
b = aux;
```

## Trocando dois alunos

quero trocar os alunos da posicao 2 com a posicao 5:

```java
String aux = nomes[2];
nomes[2] = nomes[5];
nomes[5] = aux;
```

## Classe e Objeto (Abstracao)

Classe: molde, classificacao
Objeto: fruto do molde, caso particular, instancia

```java
public class Aluno {
  // tem - atributos
  String nome;
  String cpf;
  int idade;
  double notafinal;

  // faz - metodos
  public double somar(double a, double b) {
    return a + b;
  }
}
```

```java
Aluno joao = new Aluno();

joao.nome = "Joao da Silva"; // acessa o atributo nome do aluno
joao.idade = 23;
joao.cpf = "111.222.333-44"
joao.notaFinal = 8.9;

joao.somar(2, 3);

Aluno[] alunos = new Alunos[1000];

alunos[4].nome; // acess o nome do quinto aluno
```
