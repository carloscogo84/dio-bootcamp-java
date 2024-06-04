package one;


import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLaze;
import one.digitalinovation.gof.singleton.SingletonLazeHolder;
import one.digitalinovation.gof.strategy.Comportamento;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinovation.gof.strategy.ComportamentoDefencivo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) throws Exception {
        
        //Testes realacionados ao Design Pattern Singleton:
        SingletonLaze lazy = SingletonLaze.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLaze.getInstancia();
        System.out.println(lazy);

        System.out.println();

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println();

        SingletonLazeHolder lazerHolder = SingletonLazeHolder.getInstancia();
        System.out.println(lazerHolder);
        lazerHolder = SingletonLazeHolder.getInstancia();
        System.out.println(lazerHolder);

        //Testes realacionados ao Design Pattern Singleton:
        Comportamento defencivo = new ComportamentoDefencivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agrecivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defencivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agrecivo);
        robo.mover();
        robo.mover();

        // Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
    }
}
