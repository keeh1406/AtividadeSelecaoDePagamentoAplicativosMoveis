package com.example.katiamagareth.selecaodepagamento;
// Seleção de pagamento: O usuário deverá entrar com o valor total de uma compra e selecionar via
// radiobutton o método de pagamento. Para cada método, seguir a seguinte tabela:
// 1 - À vista: dar 10% de desconto no pagamento.
// 2 - Cartão de débito: o mesmo valor da compra.
// 3 - Cartão de crédito: 5% de acréscimo e exibir o valor em até 3 parcelas
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editValor;
    RadioGroup radioForma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        radioForma = findViewById(R.id.radioForma);
    }

    int selecionado = radioForma.getCheckedRadioButtonId();
    RadioButton radioButton = findViewById(selecionado);
    data+= "\n"+ radioButton.getText().toString();
    }

