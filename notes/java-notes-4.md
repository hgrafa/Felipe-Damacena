# Herança

Uma classe pode extender e continuar outra. Recebe seus atributos e métodos.

```java
public class Veiculo {
  private String placa;
  private String modelo;
  private String ano;

  public void ligar() {
    // ...
  }
}

public class Carro extends Veiculo {
  private boolean sedan;

  public void puxarFreioDeMao() {
    // ...
  }
}
```

## keyword `protected`

A palavra-chave `protected` somente permite que o atributo ou metodo seja visualizado na propria classe ou na sua classe filha.

```java
public class Veiculo {
  protected String placa;
  protected String modelo;
}

public class Carro extends Veiculo {

  @Override
  public String toString() {
    return "Placa: " + placa; // funciona com protected
  }
}
```

## keyword `@Override`

```java
public class Animal {
  private String especie;

  public void seAlimentar() {
    System.out.println("devo caçar");
  }
}

public class Humano extends Animal {

  @Override
  public void seAlimentar() {
    System.out.println("vou comprar comida e preparar");
  }
}
```

## Classes abstratas

É uma classe que não produz objeto. Como se fosse uma classe incompleta feita para ser terminada por outras classes.

```java
public abstract class Veiculo {
  private String placa;
  private String modelo;

  public void ligar() {
    System.out.println("viro a chave");
  }
}

public class Carro extends Veiculo {
  private boolean sedan;
}

public class Moto extends Veiculo {
  private boolean temBagageiro;
}

public class Aviao extends Veiculo {
  public int capacidadePassageiros;
}

Veiculo v1 = new Carro(); // ok
Veiculo v2 = new Veiculo(); // nao funciona!
```

```java
public abstract class Veiculo {
  private String placa;
  private String modelo;

  // contrato
  public abstract void ligar();
}


public class Carro extends Veiculo {
  private boolean sedan;

  @Override
  public void ligar() {
    System.out.println("pisa no freio");
    System.out.println("solta o freio de mao");
    System.out.println("gira a chave");
  }
}

public class Moto extends Veiculo {
  private boolean temBagageiro;

  @Override
  public void ligar() {
    System.out.println("segura no freio");
    System.out.println("segura embreagem");
    System.out.println("gira a chave");
  }
}

public class Aviao extends Veiculo {
  private int capacidadePassageiros;

  @Override
  public void ligar() {
    System.out.println("...");
  }
}
```
