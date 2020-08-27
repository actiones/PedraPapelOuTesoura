package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int bound;

    @Override // ANOTAÇÃO SOBRE ESCRITA
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // on create constroi a interface
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {

        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view) {

        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view) {

        this.opcaoSelecionada("Tesoura");
    }


    public void opcaoSelecionada(String escolhaUsuario) {

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);


       /* String opcaoSelecionada = null;
        System.out.println("item clicado" + opcaoSelecionada);
*/
        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3);


        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "Pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;

        }

        {if (
                            (escolhaApp == "Tesoura" && escolhaUsuario == "Papel") ||
                            (escolhaApp == "Papel"   && escolhaUsuario == "Pedra")||
                            (escolhaApp == "Pedra" && escolhaUsuario   == "tesoura")

        ){//app ganhador
                            textoResultado.setText("Você Perdeu :(");


        }else if(
                            (escolhaUsuario == "Tesoura" && escolhaApp      == "Papel") ||                                                    //usuario ganhador
                            (escolhaUsuario == "Papel"   && escolhaApp      == "Pedra")||
                            (escolhaUsuario == "Pedra" && escolhaApp        == "tesoura")
        ) {//Usuario ganhador
            textoResultado.setText("Você Ganhou :)");
        }else{//Empate
                            textoResultado.setText("Empatou!!!");
        }

                }



                            System.out.println("ITEM CLICADO" + escolhaApp);


    }

}