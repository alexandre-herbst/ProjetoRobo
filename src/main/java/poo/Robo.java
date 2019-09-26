package poo;

public class Robo {
    private int velocidade;
    private char frente;
    private Controlador control;

    public boolean movimentar(int intensidade, int distancia, char sentido){
        if(intensidade > 255 || intensidade < 0 || distancia < 0 || (sentido != 'F' && sentido != 'R')){
            return false;
        }

        this.control.receberComando(intensidade, distancia, sentido, 'O');
        return true;
    }

    public boolean virar(char lado){
        if(lado != 'D' && lado !='E'){
            return false;
        }
        else {
            this.control.receberComando(0, 0, 'O', lado);
            return true;
        }
    }



}
