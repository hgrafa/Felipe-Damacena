# Java Core

## Saida do Java

imprime e pula linha

```java
System.out.println("Hello world!");
```

apenas imprime

```java
System.out.print("Nome: ");

```

formatando a saida

```java
double resultado = 4.53291;

System.out.printf("AREA = %.4f", resultado);
```

```java
String nome = "Hugo";
int idade = 22;
double altura = 1.8;

System.out.printf("Nome: %s, Idade: %d, Altura: %.2f\n", nome, idade, altura);
```

## Entrada do Java

```java
import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Seja bem vindo");

    String palavra = leitor.next();
    int inteiro = leitor.nextInt();
    double real = leitor.nextDouble();
    leitor.nextLine();
    String texto = leitor.nextLine();

    System.out.println("palavra: " + palavra);
    System.out.println("inteiro: " + inteiro);
    System.out.println("real: " + real);
    System.out.println("texto: " + texto);
  }
}
```

## Seleção + Booleanos

```java
if ( /*condicao / boolean */ ) {
  // faca algo se for true
}
```

```java
boolean estaChovendo = true;

if ( estaChovendo ) {
  System.out.println("Nao vou sair hoje");
}

if ( !estaChovendo ) { // se nao esta chovendo
  System.out.println("Vou sair hoje");
}
```

```java
boolean estaChovendo = true;
boolean tanqueCheio = false;
boolean devoSair = !estaChovendo && tanqueCheio;

if ( devoSair ) {
  System.out.println("Vou sair hoje");
}  
```

melhorando com o `else` (senao):

```java
boolean agua = true;
boolean cafe = false;

if (agua && cafe) {
  System.out.println("Consigo fazer cafe");
} else {
  System.out.println("Nao consigo fazer cafe");
}
```

ou ...(`if-else-braceless`)

```java
boolean agua = true;
boolean cafe = false;

if (agua && cafe)
  System.out.println("Consigo fazer cafe");
else
  System.out.println("Nao consigo fazer cafe");
```

```java
boolean agua = true;
boolean suco = false;

if (agua || suco)
  System.out.println("Consigo matar a sede");
else
  System.out.println("Nao consigo matar a sede");
```

### Operadores booleanos

`!` = significa `not`

`&&` = significa `and`

> depende que duas coisas sejam true para dar true

`||` = significa `or`

> depende que pelo menos uma das coisas sejam true

`>=` = maior ou igual

### Exemplo

```java
double nota = 7.8;

if ( nota >= 7 ) {
  System.out.println("Aprovado");
} else if ( nota >= 4 ) {
  System.out.println("Recuperacao");
} else {
  System.out.println("Reprovado");
}
```

## Repeticao

- inicializacao
- verificacao
- atualizacao

```java
int contador = 1;

while( contador <= 5 ) {
  System.out.println("oi");
  contador++;
}
```

```java
for(/*inicializacao*/; /*verificacao*/; /*atualizacao*/) {
 // faca algo
}
```

```java
for(int contador = 1; contador <= 5; contador++) {
  System.out.println("oi")
}
```

- Somando uma sequencia de numeros

```java
Scanner scanner = new Scanner(System.in);
int soma = 0;

for(int i=0; i<10; i++) {
  int valor = scanner.nextInt();
  soma += valor; // soma = soma + valor
}
```

## Vetores/Arrays

- array tem tamanho fixo (e isso nao muda)
- homogeneo (so tem um tipo pelo array)

```java
int a = 2;

// array de 7 elementos
int[] conjunto = {10, 23, 34, 45, 51, 67, 72};

// indexado em zero
// vetor de tamanho n vai de zero ate n-1
System.out.println(conjunto[0]); // 1
System.out.println(conjunto[4]); // 5

// imprimindo todos os valores
for(int i = 0; i < conjunto.length; i++) {
  System.out.println(conjunto[i]);
}
```

## Funções

- sequencia bem definida de passos
- pode ter entrada
- pode ter saida
- deve ter um unico e claro objetivo

no momento atual:

```java
public static [retorno] nome([entradas]) {
  codigo...
  return [algo(se tiver retorno)]
}
```

```java
public static void sayHello(String name) {
  if(name == null) 
    return;

  System.out.println("Hello, " + name);
}

public static String getHelloMessage(String name) {
  return "Hello, " + name;
}

public static void main(String[] args) {
  sayHello("Felipe"); // Hello, Felipe

  System.out.println(getHelloMessage("Felipe"));
}
```

```java
public static void showMenu() {
  System.out.println("1 - para somar");
  System.out.println("2 - para subtrair");
  System.out.println("3 - para multiplicar");
  System.out.println("4 - para dividir");
  System.out.println("5 - para obter o resto");
  System.out.println("0 - para sair");
}

public public static void main(String[] args) {
  while(true) {
    showMenu();
    option = scanner.nextInt();

    if(option == 0)
      break;


    if(option == 1) handleSumOption();
    else if (option == 2) handleSubtractionOption();
    else if (option == 3) handleProductOption();
    else if (option == 4) handleDivisionOption();
    else if (option == 5) handleModuloOption();

  }
}
```
