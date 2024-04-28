package edu.alan.estudos.javabasico;

public class teste {
    public static void main(String[] args) {
        // Eu instanciei a classe DefinirAnoBissexto, e tentei invocar os métodos
        // e cheguei a conclusão de que quando usamos o Static definimos que o metodo irá ser utilizado apenas dentro da classe
        // e não ficará disponivel em instancia de classe!
        DefinirAnoBissexto definir = new DefinirAnoBissexto();
        //definir.isAnoBissexto();
        // getName não está estatico ou seja ele é um metodo de instancia e não de classe.
    }
}
