# Principais métodos de lista

simples:

```java
List<Integer> numeros = new ArrayList<>();
List<String> frutas = new ArrayList<>();
```

- get(position): `frutas.get(2);` pega a fruta na posição 2;
- isEmpty(): retorna se a lista esta vazia
- sublist(beginIndex, EndIndex): retorna uma porção da lista, iniciando no begin, inclusive, e terminando no end, exclusive

```java
List<String> frutas = new ArrayList<>();
frutas.add("uva");
frutas.add("banana");
frutas.add("pera");
frutas.add("maca");
frutas.add("acerola");

List<String> frutas2 = List.of("uva", "banana", "pera", "maca", "acerola");

List<String> subfrutas = frutas.sublist(1, 3); // ["banana", "pera"]
```

---

- add(element): `numeros.add(2);` adiciona 2 ao fim da lista
- add(position, element): `numeros.add(3, 2);` adiciona 2 na posicao 3

---

- remove(position): `numeros.remove(0)` remove o primeiro elemento, posicao 0
- remove(element): `numeros.remove((Integer)3)` remove o elemento 3
- remove(element): `frutas.remove("uva")` procura e remove "uva" se houver

---

- indexOf(element): `frutas.indexOf("maçã")` procura, se houver manda posição, senão manda -1
- indexOf(element): `frutas.lastIndexOf("maçã")` procura, se houver manda posição, senão manda -1

## programação funcional

> "O que?" (programação imperativa) vs. "como?" (programação funcional)

- forEach():

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);
List<String> nomes = List.of("pedro", "julia", "alice");

numeros.forEach(numero -> System.out.pritln(numero));
nomes.forEach(nome -> System.out.println(nome));

numeros.forEach(numero -> {
  int fator = 2;
  int resultado = fator * numero;
  System.out.println(resultado);
})
```

- filter / allMatch / anyMatch:

> esse aqui pode ser lido como 'tal que'

```java
boolean jogadorJaCriado1 = jogadores.stream()
  .filter(jogador -> {
    boolean temMesmoNome = jogador.getNome().equals(novoJogador.getNome());
    boolean temMesmoNumCamisa = jogador.getNumCamisa() == novoJogador.getNumCamisa();
    return temMesmoNome && temMesmoNumCamisa;
  })
  .toList()
  .isEmpty();

boolean jogadorJaCriado2 = jogadores.stream()
  .filter(jogador -> jogador.isAtivo())
  .anyMatch(jogador -> {
    boolean temMesmoNome = jogador.getNome().equals(novoJogador.getNome());
    boolean temMesmoNumCamisa = jogador.getNumCamisa() == novoJogador.getNumCamisa();
    return temMesmoNome && temMesmoNumCamisa;
  });

boolean timeTemTodosOsJogadoresAtivos = time.getJogadores()
  .stream()
  .allMatch(jogador -> jogador.isAtivo());
```

- map:

Function<T, R> : T -> R

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5);

List<Integer> dobroDosNumeros = numeros.stream()
  .map(numero -> 2 * numero)
  .toList();

List<Integer> idades = usuarios.stream()
  .map(usuario -> usuario.getIdade())
  .toList()

usuarios.stream() // Stream<Usuario>
  .map(usuario -> {
    UserResponse response = new UserResponse();
    response.setName(usuario.getName());
    response.setAge(usuario.getAge());
    return response;
  }) // Stream<UserResponse>
  .toList();
```

```java
public class User {
  private String name;
  private String email;
  private String password;
  private int age;
  // constructors, getters, setters, ...
}

public class UserResponse {
  private String name;
  private int age;
  // constructors, getters, setters, ...
}
```
