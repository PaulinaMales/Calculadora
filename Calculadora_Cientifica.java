import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora_Cientifica {
    private JTextArea cuadroDatos;
    private JButton modoOscuro;
    private JButton seno;
    private JButton coseno;
    private JButton tangente;
    private JButton logartimo;
    private JButton potencia;
    private JButton logNatural;
    private JButton factorial;
    private JButton raizCuadra;
    private JButton multiplicacion;
    private JButton division;
    private JButton suma;
    private JButton resta;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton borrarUno;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton borrarTodo;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton porcentaje;
    private JButton cero;
    private JButton punto;
    private JButton respuesta;
    private JPanel MainPanel;
    double Multiplicacion;

    //VARIABLES RESPUESTAS
    double numero1,numero2, result;
    double sen,cos,tan,cuadrado;
    String opcion;

 //FUNCIONALIDAD
    public Calculadora_Cientifica() {


        //BOTON AC
        borrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText("");
            }
        });
        // FIN BOTON AC

        //BOTON 1
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+uno.getText());
            }
        });
        //FIN BOTON 1


        //BOTON 2
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+dos.getText());
            }
        });
        //FIN BOTON 2

        //BOTON 3
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+tres.getText());
            }
        });
        //FIN BOTON 3

        //BOTON 4
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+cuatro.getText());
            }
        });
        //FIN BOTON 4

        //BOTON 5
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+cinco.getText());
            }
        });
        //FIN BOTON 5

        //BOTON 6
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+seis.getText());
            }
        });
        //FIN BOTON 6

        //BOTON 7
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+siete.getText());
            }
        });
        //FIN BOTON 7

        //BOTON 8
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+ocho.getText());
            }
        });
        //FIN BOTON 8

        //BOTON 9
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+nueve.getText());
            }
        });
        //FIN BOTON 9

        //BOTON 0
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+cero.getText());
            }
        });
        //FIN BOTON 0

        //BOTON PORCENTAJE
        porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText()+porcentaje.getText());
            }
        });
        //FIN BOTON PORCENTAJE


        //BOTON PUNTO (DECIMALES)
        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!cuadroDatos.getText().contains(".")){
                    cuadroDatos.setText(cuadroDatos.getText()+punto.getText());
                }
            }
        });
        //FIN BOTON PUNTO

        //BOTON SUMA
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1= Double.parseDouble(cuadroDatos.getText());
                opcion = "+";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON SUMA

        //BOTON RESTA
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1= Double.parseDouble(cuadroDatos.getText());
                opcion = "-";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON RESTA

        //BOTON MULTIPLICACION
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1= Double.parseDouble(cuadroDatos.getText());
                opcion = "x";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON MULTIPLICACION


        //BOTON DIVISION
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1= Double.parseDouble(cuadroDatos.getText());
                opcion = "÷";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON DIVISION

        //BOTON DEL
        borrarUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (cuadroDatos.getText().length() >0){
                    StringBuilder strB = new StringBuilder(cuadroDatos.getText());
                    strB.deleteCharAt(cuadroDatos.getText().length()-1);
                    backspace = String.valueOf(strB);
                    cuadroDatos.setText(backspace);
                }
            }
        });
        //FIN BOTON DEL

        //BOTON SENO
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText("Sen(");
                numero1= Double.parseDouble(cuadroDatos.getText());
                opcion = "SEN";

            }
        });
        //FIN BOTON SENO

        //BOTON POTENCIA
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1= Double.parseDouble(cuadroDatos.getText());
                String simbolo = "²";
                cuadroDatos.setText(numero1+simbolo);
                opcion="x²";
                cuadrado =numero1*numero1;

            }
        });
        //FIN POTENCIA

        //BOTON RESULTADO
        respuesta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(cuadroDatos.getText());

                if(opcion == "+"){
                    result = numero1+numero2;
                    cuadroDatos.setText(String.valueOf(result));
                } else if (opcion == "-")
                {
                    result = numero1-numero2;
                    cuadroDatos.setText(String.valueOf(result));
                } else if (opcion == "x")
                {
                    result = numero1*numero2;
                    cuadroDatos.setText(String.valueOf(result));
                }else if (opcion == "÷")
                {
                    result = numero1/numero2;
                    cuadroDatos.setText(String.valueOf(result));
                }else if (opcion == "SEN")
                {
                    result = Math.sin(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }else if (opcion == "x²")
                {
                    cuadroDatos.setText(String.valueOf(cuadrado));
                }
            }
        });
        //FIN BOTON RESULTADO



    }

    //FUNCION MAIN
    public static void main(String[] args) {
        JFrame frame= new JFrame("Calculadora");
        frame.setContentPane(new Calculadora_Cientifica().MainPanel);
        frame.setTitle("Calculadora M/M");
        frame.setSize(300,350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
