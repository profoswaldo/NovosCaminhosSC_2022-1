package br.gov.exemplo003_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


public class SharedPreferenceActivity extends AppCompatActivity {

    private String SHARED_PREFERENCES_FILE_NAME = "userInfo";

    private String SHARED_PREFERENCES_KEY_USERNAME = "userName";

    private String SHARED_PREFERENCES_KEY_PASSWORD = "password";

    private String SHARED_PREFERENCES_KEY_REMEMBER_ACCOUNT = "rememberAccount";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        setTitle("Exemplo de Login");

        final EditText userNameEditText = (EditText)findViewById(R.id.shared_preference_login_username);

        final EditText passwordEditText = (EditText)findViewById(R.id.shared_preference_login_password);

        final CheckBox rememberAccountCheckbox = (CheckBox)findViewById(R.id.shared_preference_remember_account);

        final Context context = getApplicationContext();

        initLoginForm(context, userNameEditText, passwordEditText, rememberAccountCheckbox);

        Button verifyButton = (Button)findViewById(R.id.shared_preference_verify_button);
        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if("professor".equalsIgnoreCase(userName) && "123".equalsIgnoreCase(password))
                {

                    boolean rememberAccount = rememberAccountCheckbox.isChecked();
                    if(rememberAccount)
                    {
                        writeToSharedPreferences(context, userName, password, rememberAccount);
                        Toast.makeText(context, "Usuário e senha verificados com sucesso e gravação efetuada com sucesso. ", Toast.LENGTH_LONG).show();
                    }else
                    {
                        Toast.makeText(context, "Usuário e senha verificados com sucesso .", Toast.LENGTH_LONG).show();
                    }
                }else
                {
                    Toast.makeText(context, "Usuário e senha inválidos.", Toast.LENGTH_LONG).show();
                }
            }
        });


        Button removeButton = (Button)findViewById(R.id.shared_preference_remove_button);
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, MODE_PRIVATE);

                Editor editor = sharedPreferences.edit();

                editor.remove(SHARED_PREFERENCES_KEY_PASSWORD);

                editor.commit();

                Toast.makeText(context, "Removido senha do usuário.", Toast.LENGTH_SHORT).show();
            }
        });

        Button clearButton = (Button)findViewById(R.id.shared_preference_clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, MODE_PRIVATE);

                Editor editor = sharedPreferences.edit();

                editor.clear();

                editor.commit();

                Toast.makeText(context, "Apagado dados do usuário e senha do arquivo.", Toast.LENGTH_SHORT).show();
            }
        });

        Button reloadButton = (Button)findViewById(R.id.shared_preference_reload_button);
        reloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initLoginForm(context, userNameEditText, passwordEditText, rememberAccountCheckbox);

                Toast.makeText(context, "Dados do usuário e senha carregados com sucesso.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initLoginForm(Context context, EditText userNameEditText, EditText passwordEditText, CheckBox rememberAccountCheckbox)
    {
        String savedUserName = readValueFromSharedPreferences(context, SHARED_PREFERENCES_KEY_USERNAME);

        String savedPassword = readValueFromSharedPreferences(context, SHARED_PREFERENCES_KEY_PASSWORD);

        String rememberAccount = readValueFromSharedPreferences(context, SHARED_PREFERENCES_KEY_REMEMBER_ACCOUNT);

        userNameEditText.setText(savedUserName);

        passwordEditText.setText(savedPassword);

        rememberAccountCheckbox.setChecked(Boolean.valueOf(rememberAccount));
    }

    private void writeToSharedPreferences(Context context, String userName, String password, boolean rememberAccount)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, MODE_PRIVATE);

        Editor editor = sharedPreferences.edit();

        editor.putString(SHARED_PREFERENCES_KEY_USERNAME, userName);

        editor.putString(SHARED_PREFERENCES_KEY_PASSWORD, password);

        editor.putBoolean(SHARED_PREFERENCES_KEY_REMEMBER_ACCOUNT, rememberAccount);

        editor.apply();
    }

    private String readValueFromSharedPreferences(Context context, String key)
    {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, MODE_PRIVATE);

        String ret = "";

        if(SHARED_PREFERENCES_KEY_REMEMBER_ACCOUNT.equalsIgnoreCase(key))
        {
            boolean value = sharedPreferences.getBoolean(key, false);
            ret = String.valueOf(value);
        }else {
            ret = sharedPreferences.getString(key, "");
        }

        return ret;
    }
}