package edu.alan.estudos.poo.pilares;

public class AbstracaoEPolimorfismo {
    /*
    * Abstração -> Basicamente você diz que o metodo é abstrato e a classe que está herdando os metodos da classe generica ou classe pai
    * Vai poder modelar esse método da forma que bem entender, ou seja a classe pai não fica mais responsavel por dizer que um método será
    * igual para todos e sim que todos tem o método mas elas poderão definir suas caracteristicas.
    *
    * Exemplo:
    *
    * // Classe PAI ou Classe Generica:
    * public abstract class Veiculo{
    * public abstract void acelerar(){}
    * }
    * //
    *
    * public class Moto extends Veiculo{
    *   public void acelerar(){
    *   System.out.println("Acelerando da forma que uma moto acelera..")
    * }
    * }
    * //
    *
    * public class Carro extends Veiculo{
    * public void acelerar(){
    * System.out.println("Acelerando da forma que um carro acelera..")
    *}
    *
    * //
    *
    * Logo o conceito de Abstração e Polimorfismo caminham juntas  o conceito de abstração diz que  as classes que herdam as propriedades
    * de uma classe generica ou uma classe pai devem partilhar dos mesmos metodos porém esse metodo deve ser abstrato para que a classe que
    * está herdando consiga modelar ela atraǘes do conceito de polimorfismo, pois o metodo é o mesmo porém aplicado em um determinado  contexto
    *
    * Para compartilhar métodos que queremos que ele seja privado porém seja visto pelas outras classes que herdaram da classe pai, não utilizamos
    * mais o private, agora usamos o protected, isso torna a classe privada porém as classes que herdaram os metodos da classe Pai, podem ver
    * esse Método, diferentemente se fosse private.
    * */

}
