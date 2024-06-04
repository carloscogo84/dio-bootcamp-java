package one.digitalinovation.gof.singleton;

public class SingletonLazeHolder {

    private static class instanceHolder{
        public static SingletonLazeHolder instancia = new SingletonLazeHolder();
    }
    

    private SingletonLazeHolder(){
        super();
    }

    public static SingletonLazeHolder getInstancia(){
       return instanceHolder.instancia;
    }
    
}
