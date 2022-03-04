package desafioCap;

public class TestaSenha {

    public String validaSenha(final String senha) {
        String resultado = "";
        try {
            if (senha != null) {

                //Parametros
                final int tamanhoMinimo = 6;


                //Validação

                boolean contemNumero = false;
                boolean contemMaiuscula = false;
                boolean contemMinuscula = false;
                boolean contemSimbolo = false;
                for (char c : senha.toCharArray()) {
                    if (c >= '0' && c <= '9') {
                        contemNumero = true;
                    } else if (c >= 'A' && c <= 'Z') {
                        contemMaiuscula = true;
                    } else if (c >= 'a' && c <= 'z') {
                        contemMinuscula = true;
                    } else {
                        contemSimbolo = true;
                    }
                }

                    if (!contemNumero) {
                        resultado = "Senha precisa conter no minimo um digito\n";
                    } else if (!contemMaiuscula) {
                        resultado = "Senha precisa conter no minimo uma letra maiúscula\n";
                    } else if (!contemMinuscula) {
                        resultado = "Senha precisa conter no minimo uma letra minúscula\n";
                    } else if (!contemSimbolo) {
                        resultado = "Senha precisa conter no minimo um caractere especial\n";
                    } else {

                        int i = tamanhoMinimo - senha.length();
                        resultado = (i >= 1 ? String.valueOf(i) : "");
                    }
                }


        } catch (Exception exception) {
            resultado = "Senha inválida";
        }

        return resultado;
    }
}
