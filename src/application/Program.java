package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
//		Caminho do arquivo de entrada
		String path = "C:\\Windows\\Temp\\in.txt";

//		Lista para armazenar as linhas do arquivo
		List<String> list = new ArrayList<>();
		
//		Leitura do arquivo e armazenamento das linhas na lista
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			Lendo as linhas do arquivo
			String name = br.readLine();
			while(name != null) {
				list.add(name); // Adiciona a linha na lista
				name = br.readLine(); // Lê a próxima linha
			}
//			Ordenação das linhas em ordem alfabética
			Collections.sort(list);
			
//			Exibição das linhas ordenadas
			for(String s : list) {
				System.out.println(s);
			}
		}
//		Tratamento de erros
		catch(IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
}
/*  🎯 Resumo do que esse código faz:

		Abre um arquivo de texto.

		Lê todas as linhas e guarda numa lista.

		Ordena essas linhas em ordem alfabética.
*/
/*
Boa! Esse código é um exemplo simples e prático para quem está começando em Java e quer entender **como ler um arquivo de texto, armazenar os dados em uma lista, ordenar e exibir no console**.

Vou te explicar por partes, de forma didática:


### ✅ **1. Importação de bibliotecas**

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

Essas são **bibliotecas que o programa precisa para funcionar**:
- `BufferedReader` e `FileReader`: usadas para ler o arquivo.
- `IOException`: trata erros que podem acontecer na leitura do arquivo.
- `ArrayList`, `List` e `Collections`: usadas para guardar e ordenar os dados.


### ✅ **2. Estrutura principal**

public class Example_Working_with_Files_and_Ordering_Lines {

Aqui começa a **classe principal**. O nome está grande e descritivo para dizer o que o código faz.


### ✅ **3. Método `main`**

public static void main(String[] args) {

O **ponto de entrada** do programa, onde tudo começa.


### ✅ **4. Criação da lista**

List<String> list = new ArrayList<>();

Aqui ele cria uma **lista de Strings** chamada `list`. Essa lista vai guardar cada linha do arquivo de texto.


### ✅ **5. Caminho do arquivo**

String path = "C:\\Windows\\Temp\\in.txt";

É o **caminho do arquivo** que será lido.  
*(Obs: em Java, para representar o caractere `\`, precisa escrever duas vezes `\\`)*


### ✅ **6. Leitura do arquivo**

try (BufferedReader br = new BufferedReader(new FileReader(path))) {

Aqui começa um **bloco `try-with-resources`**, que serve para:
- **Abrir o arquivo.**
- Garantir que o arquivo será fechado automaticamente no final (boa prática).


### ✅ **7. Lendo as linhas do arquivo**

String name = br.readLine();
while (name != null) {
	list.add(name);
	name = br.readLine();
}

Essa parte:
- **Lê uma linha do arquivo.**
- Enquanto não for `null` (ou seja, enquanto existir linha), adiciona na lista.
- Lê a próxima linha.

Ou seja, vai lendo o arquivo **linha por linha**.


### ✅ **8. Ordenando as linhas**

Collections.sort(list);

Essa linha usa a **função pronta do Java** para ordenar as Strings em ordem alfabética.


### ✅ **9. Mostrando as linhas**

for (String s : list) {
	System.out.println(s);
}

Depois de ordenar, ele **percorre a lista** e mostra cada linha no console.


### ✅ **10. Tratamento de erros**

} catch (IOException e) {
	System.out.println("Error: " + e.getMessage());
}

Se der algum problema ao abrir ou ler o arquivo (por exemplo: arquivo não existe), ele vai **mostrar a mensagem de erro**.

*/