package com.example.katiamagareth.selecaodepagamento;
// Seleção de pagamento: O usuário deverá entrar com o valor total de uma compra e selecionar via
// radiobutton o método de pagamento. Para cada método, seguir a seguinte tabela:
// 1 - À vista: dar 10% de desconto no pagamento.
// 2 - Cartão de débito: o mesmo valor da compra.
// 3 - Cartão de crédito: 5% de acréscimo e exibir o valor em até 3 parcelas
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText valor;
    private RadioGroup formas;
    private RadioButton vista;
    private RadioButton credito;
    private RadioButton debito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.editValor);
        formas = findViewById(R.id.radioFormas);
        vista = findViewById(R.id.radioAVista);
        credito = findViewById(R.id.radioCartaoCredito);
        debito = findViewById(R.id.radioCartaoDebito);

    }

    public void click(View v) {




        switch (opcao) {
            case "Á Vista":
                valorfinal = valor / 10;

                break;
            case "Cartão de Crédito":

                break;
            case "Cartão de Débito":


                break;

        }

    }
}