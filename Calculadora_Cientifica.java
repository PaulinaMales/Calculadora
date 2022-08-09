import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Color;
import javax.swing.border.Border;

public class Calculadora_Cientifica extends JPanel {
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
    private JButton rojo;
    private JButton amarillo;
    private JButton verde;
    private JTextField cuadroAux;
    double Multiplicacion;

    //Fuentes y colores a usar
    Font negrita = new Font("Arial", Font.BOLD, 14);

    Color uno1 = new Color(68, 206, 120);
    Color dos2 = new Color(194, 206, 78);
    Color tres3 = new Color(206, 123, 31);
    Color numeros= new Color(120, 232, 26);
    Color numeros1= new Color(191, 154, 18);
    Color pantalla= new Color(146, 136, 99);
    Color pantalla1 = new Color(121, 161, 91 );
    Color pantalla2= new Color(178, 161, 35);
    // Fin de colores y fuentes

    //VARIABLES RESPUESTAS
    double numero1, numero2, result, resultado;
    double sen, cos, tan, cuadrado;
    String opcion;

    //FUNCIONALIDAD
    public Calculadora_Cientifica() {


        cuadroAux.setFont(negrita);

        //BOTON AC
        borrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText("");
                cuadroAux.setText("");
            }
        });
        // FIN BOTON AC

        //BOTON 1
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + uno.getText());

            }
        });
        //FIN BOTON 1


        //BOTON 2
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + dos.getText());
            }
        });
        //FIN BOTON 2

        //BOTON 3
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + tres.getText());
            }
        });
        //FIN BOTON 3

        //BOTON 4
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + cuatro.getText());
            }
        });
        //FIN BOTON 4

        //BOTON 5
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + cinco.getText());
            }
        });
        //FIN BOTON 5

        //BOTON 6
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + seis.getText());
            }
        });
        //FIN BOTON 6

        //BOTON 7
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + siete.getText());
            }
        });
        //FIN BOTON 7

        //BOTON 8
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + ocho.getText());
            }
        });
        //FIN BOTON 8

        //BOTON 9
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + nueve.getText());
            }
        });
        //FIN BOTON 9

        //BOTON 0
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadroDatos.setText(cuadroDatos.getText() + cero.getText());
            }
        });
        //FIN BOTON 0

        //BOTON PORCENTAJE
        porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+" % de ");
                cuadroDatos.setText("");
                opcion="%";
            }
        });
        //FIN BOTON PORCENTAJE


        //BOTON PUNTO (DECIMALES)
        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cuadroDatos.getText().contains(".")) {
                    cuadroDatos.setText(cuadroDatos.getText() + punto.getText());
                }
            }
        });
        //FIN BOTON PUNTO

        //BOTON SUMA
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+" + ");
                opcion = "+";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON SUMA

        //BOTON RESTA
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+" - ");
                opcion = "-";
                cuadroDatos.setText("");
            }
        });


        //FIN BOTON RESTA

        //BOTON MULTIPLICACION
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+" x ");
                opcion = "x";
                cuadroDatos.setText("");
            }
        });
        //FIN BOTON MULTIPLICACION


        //BOTON DIVISION
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+" / ");
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

                if (cuadroDatos.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(cuadroDatos.getText());
                    strB.deleteCharAt(cuadroDatos.getText().length() - 1);
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

                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("sin ("+cuadroDatos.getText()+") ");
                opcion = "sin";

            }
        });
        //FIN BOTON SENO

        //BOTON POTENCIA
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+"²");
                opcion = "potencia";

            }
        });
        //FIN POTENCIA

        //Raiz cuadrada
        raizCuadra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcion = "raiz";
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("√ "+cuadroDatos.getText());

            }
        });
        //Fin raiz cuadrada

        //Tangente
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("tan("+cuadroDatos.getText()+") ");
                opcion = "tangente";
            }
        });

        // Fin Tangente

        //Coseno
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("cos("+cuadroDatos.getText()+") ");
                opcion = "coseno";
            }
        });

        //Fin coseno

        //Logaritmo
        logartimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("Log("+cuadroDatos.getText()+") ");
                opcion = "log";
            }
        });


        //Fin logaritmo

        //Logaritmo natural
        logNatural.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText("Ln("+cuadroDatos.getText()+") ");
                opcion = "natural";
            }
        });
        //Fin natural

        //Factorial
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(cuadroDatos.getText());
                cuadroAux.setText("");
                cuadroAux.setText(cuadroDatos.getText()+"!");
                opcion = "factorial";
            }
        });
        //Fin factorial


        //BOTON RESULTADO
        respuesta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(cuadroDatos.getText());

                if (opcion == "+") {
                    resultado = Double.parseDouble(cuadroAux.getText());
                    result = resultado+numero1 + numero2;
                    cuadroAux.setText(resultado+ " + " + numero1+ " + " + numero2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "-") {
                    result = numero1 - numero2;
                    cuadroAux.setText(numero1+ " - " + numero2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "x") {
                    result = numero1 * numero2;
                    cuadroAux.setText(numero1+ " x " + numero2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "÷") {
                    result = numero1 / numero2;
                    cuadroAux.setText(numero1+ " / " + numero2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "raiz") {
                    result = Math.sqrt(numero1);
                    cuadroAux.setText(" √" + numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "potencia") {
                    result = Math.pow(numero1, 2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "tangente") {
                    result = Math.tan(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "coseno") {
                    result = Math.cos(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "log") {
                    result = Math.log(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "natural") {
                    result = Math.log1p(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "factorial") {
                    long fact = 1;
                    int i = 1;
                    while (i <= numero1) {
                        fact = fact * i;
                        i++;
                    }

                    result = fact;
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "%") {
                    result = (numero1 * numero2)/100;
                    cuadroAux.setText(numero1+ " % de " + numero2);
                    cuadroDatos.setText(String.valueOf(result));
                }
                else if (opcion == "sin") {
                    result = Math.sin(numero1);
                    cuadroDatos.setText(String.valueOf(result));
                }
            }

        });
        //FIN BOTON RESULTADO


        modoOscuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPanel.setBackground(Color.black);
                cuadroDatos.setBackground(Color.white);
                cuadroDatos.setFont(negrita);

                //Color del backgroung
                uno.setBackground(Color.black);
                dos.setBackground(Color.black);
                tres.setBackground(Color.black);
                cuatro.setBackground(Color.black);
                cinco.setBackground(Color.black);
                seis.setBackground(Color.black);
                ocho.setBackground(Color.black);
                nueve.setBackground(Color.black);
                siete.setBackground(Color.black);
                cero.setBackground(Color.black);
                seno.setBackground(Color.black);
                coseno.setBackground(Color.black);
                tangente.setBackground(Color.black);
                logartimo.setBackground(Color.black);
                logNatural.setBackground(Color.black);
                factorial.setBackground(Color.black);
                raizCuadra.setBackground(Color.black);
                borrarTodo.setBackground(Color.black);
                borrarUno.setBackground(Color.black);
                punto.setBackground(Color.black);
                respuesta.setBackground(Color.black);
                suma.setBackground(Color.black);
                resta.setBackground(Color.black);
                division.setBackground(Color.black);
                multiplicacion.setBackground(Color.black);
                porcentaje.setBackground(Color.black);
                potencia.setBackground(Color.black);

                //Fin de color del background

                //Color de los numeros
                uno.setForeground(Color.white);
                dos.setForeground(Color.white);
                tres.setForeground(Color.white);
                cuatro.setForeground(Color.white);
                cinco.setForeground(Color.white);
                seis.setForeground(Color.white);
                siete.setForeground(Color.white);
                ocho.setForeground(Color.white);
                nueve.setForeground(Color.white);
                cero.setForeground(Color.white);
                seno.setForeground(Color.red);
                coseno.setForeground(Color.red);
                tangente.setForeground(Color.red);
                logartimo.setForeground(Color.red);
                logNatural.setForeground(Color.red);
                factorial.setForeground(Color.red);
                raizCuadra.setForeground(Color.red);
                borrarUno.setForeground(Color.red);
                borrarTodo.setForeground(Color.red);
                punto.setForeground(Color.red);
                respuesta.setForeground(Color.red);
                suma.setForeground(Color.red);
                resta.setForeground(Color.red);
                division.setForeground(Color.red);
                multiplicacion.setForeground(Color.red);
                porcentaje.setForeground(Color.red);
                potencia.setForeground(Color.red);

                //Fin color de los numeros


            }
        });


        rojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPanel.setBackground(uno1);
                rojo.setBackground(uno1);
                cuadroDatos.setFont(negrita);
                cuadroDatos.setBackground(pantalla1);


                //Color de los numeros
                uno.setForeground(numeros);
                dos.setForeground(numeros);
                tres.setForeground(numeros);
                cuatro.setForeground(numeros);
                cinco.setForeground(numeros);
                seis.setForeground(numeros);
                siete.setForeground(numeros);
                ocho.setForeground(numeros);
                nueve.setForeground(numeros);
                cero.setForeground(numeros);
                seno.setForeground(Color.red);
                coseno.setForeground(Color.red);
                tangente.setForeground(Color.red);
                logartimo.setForeground(Color.red);
                logNatural.setForeground(Color.red);
                factorial.setForeground(Color.red);
                raizCuadra.setForeground(Color.red);
                borrarUno.setForeground(Color.red);
                borrarTodo.setForeground(Color.red);
                punto.setForeground(Color.red);
                respuesta.setForeground(Color.red);
                suma.setForeground(Color.red);
                resta.setForeground(Color.red);
                division.setForeground(Color.red);
                multiplicacion.setForeground(Color.red);
                porcentaje.setForeground(Color.red);
                potencia.setForeground(Color.red);

                //Fin color de los numeros

                //Color del backgroung
                uno.setBackground(Color.black);
                dos.setBackground(Color.black);
                tres.setBackground(Color.black);
                cuatro.setBackground(Color.black);
                cinco.setBackground(Color.black);
                seis.setBackground(Color.black);
                ocho.setBackground(Color.black);
                nueve.setBackground(Color.black);
                siete.setBackground(Color.black);
                cero.setBackground(Color.black);
                seno.setBackground(Color.black);
                coseno.setBackground(Color.black);
                tangente.setBackground(Color.black);
                logartimo.setBackground(Color.black);
                logNatural.setBackground(Color.black);
                factorial.setBackground(Color.black);
                raizCuadra.setBackground(Color.black);
                borrarTodo.setBackground(Color.black);
                borrarUno.setBackground(Color.black);
                punto.setBackground(Color.black);
                respuesta.setBackground(Color.black);
                suma.setBackground(Color.black);
                resta.setBackground(Color.black);
                division.setBackground(Color.black);
                multiplicacion.setBackground(Color.black);
                porcentaje.setBackground(Color.black);
                potencia.setBackground(Color.black);

                //Fin de color del background



            }
        });
        amarillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainPanel.setBackground(dos2);
                amarillo.setBackground(dos2);
                cuadroDatos.setBackground(pantalla2);
                cuadroDatos.setFont(negrita);

                //Color de los numeros
                uno.setForeground(Color.yellow);
                dos.setForeground(Color.yellow);
                tres.setForeground(Color.yellow);
                cuatro.setForeground(Color.yellow);
                cinco.setForeground(Color.yellow);
                seis.setForeground(Color.yellow);
                siete.setForeground(Color.yellow);
                ocho.setForeground(Color.yellow);
                nueve.setForeground(Color.yellow);
                cero.setForeground(Color.yellow);
                seno.setForeground(Color.red);
                coseno.setForeground(Color.red);
                tangente.setForeground(Color.red);
                logartimo.setForeground(Color.red);
                logNatural.setForeground(Color.red);
                factorial.setForeground(Color.red);
                raizCuadra.setForeground(Color.red);
                borrarUno.setForeground(Color.red);
                borrarTodo.setForeground(Color.red);
                punto.setForeground(Color.red);
                respuesta.setForeground(Color.red);
                suma.setForeground(Color.red);
                resta.setForeground(Color.red);
                division.setForeground(Color.red);
                multiplicacion.setForeground(Color.red);
                porcentaje.setForeground(Color.red);
                potencia.setForeground(Color.red);

                //Fin color de los numeros



            }
        });
        verde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPanel.setBackground(tres3);
                verde.setBackground(tres3);
                cuadroDatos.setBackground(pantalla);
                cuadroDatos.setFont(negrita);

                //Color de los numeros
                uno.setForeground(numeros1);
                dos.setForeground(numeros1);
                tres.setForeground(numeros1);
                cuatro.setForeground(numeros1);
                cinco.setForeground(numeros1);
                seis.setForeground(numeros1);
                siete.setForeground(numeros1);
                ocho.setForeground(numeros1);
                nueve.setForeground(numeros1);
                cero.setForeground(numeros1);
                seno.setForeground(Color.red);
                coseno.setForeground(Color.red);
                tangente.setForeground(Color.red);
                logartimo.setForeground(Color.red);
                logNatural.setForeground(Color.red);
                factorial.setForeground(Color.red);
                raizCuadra.setForeground(Color.red);
                borrarUno.setForeground(Color.red);
                borrarTodo.setForeground(Color.red);
                punto.setForeground(Color.red);
                respuesta.setForeground(Color.red);
                suma.setForeground(Color.red);
                resta.setForeground(Color.red);
                division.setForeground(Color.red);
                multiplicacion.setForeground(Color.red);
                porcentaje.setForeground(Color.red);
                potencia.setForeground(Color.red);

                //Fin color de los numeros

                //Color del backgroung
                uno.setBackground(Color.black);
                dos.setBackground(Color.black);
                tres.setBackground(Color.black);
                cuatro.setBackground(Color.black);
                cinco.setBackground(Color.black);
                seis.setBackground(Color.black);
                ocho.setBackground(Color.black);
                nueve.setBackground(Color.black);
                siete.setBackground(Color.black);
                cero.setBackground(Color.black);
                seno.setBackground(Color.black);
                coseno.setBackground(Color.black);
                tangente.setBackground(Color.black);
                logartimo.setBackground(Color.black);
                logNatural.setBackground(Color.black);
                factorial.setBackground(Color.black);
                raizCuadra.setBackground(Color.black);
                borrarTodo.setBackground(Color.black);
                borrarUno.setBackground(Color.black);
                punto.setBackground(Color.black);
                respuesta.setBackground(Color.black);
                suma.setBackground(Color.black);
                resta.setBackground(Color.black);
                division.setBackground(Color.black);
                multiplicacion.setBackground(Color.black);
                porcentaje.setBackground(Color.black);
                potencia.setBackground(Color.black);

                //Fin de color del background


            }
        });

    }





    //FUNCION MAIN
    public static void main(String[] args) {
        JFrame frame= new JFrame("Calculadora");
        frame.setContentPane(new Calculadora_Cientifica().MainPanel);
        frame.setTitle("Calculadora M/M");
        frame.setSize(350,450);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }


}
