import java.sql.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private String calassificacaoCorporal;
    private Data data_nascimento;

    public Pessoa() {
        nome = "";
        sobrenome = "";
        idade = 0;
        altura = 0.0;
        peso = 0.0;
        imc = 0.0;
        calassificacaoCorporal = "";
        data_nascimento = 0;
    }

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double imc, String calassificacaoCorporal, Data data_nascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.calassificacaoCorporal = calassificacaoCorporal;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

/*     public double CalculaIMC() {
        peso = 0.0;
        altura = 0.0;
        imc = (peso/(Math.pow(altura, 2)));
        return imc;
    } */

    public double CalculaIMC(double peso, double altura) {
       return imc = (peso/(Math.pow(altura, 2)));
    }

/*     public String InformaObesidade() {
        imc = 0.0;
        if (imc < 18.5) {
            calassificacaoCorporal = "Abaixo do peso";
        } else if ((imc >= 18.5) && (imc <= 24.9)){
            calassificacaoCorporal = "Peso normal";
        } else if ((imc >= 25) && (imc <= 29.9)){
            calassificacaoCorporal = "Sobrepeso";
        } else if ((imc >= 30) && (imc <= 34.9)){
            calassificacaoCorporal = "Obesidade grau 1";
        } else if ((imc >= 35) && (imc <= 39.9)){
            calassificacaoCorporal = "Obesidade grau 2";
        } else if ((imc >= 40)){
            calassificacaoCorporal = "Obesidade grau 3";
        }
        return calassificacaoCorporal;
    } */

    public String InformaObesidade(double imc) {
        if (imc < 18.5) {
            calassificacaoCorporal = "Abaixo do peso";
        } else if ((imc >= 18.5) && (imc <= 24.9)){
            calassificacaoCorporal = "Peso normal";
        } else if ((imc >= 25) && (imc <= 29.9)){
            calassificacaoCorporal = "Sobrepeso";
        } else if ((imc >= 30) && (imc <= 34.9)){
            calassificacaoCorporal = "Obesidade grau 1";
        } else if ((imc >= 35) && (imc <= 39.9)){
            calassificacaoCorporal = "Obesidade grau 2";
        } else if ((imc >= 40)){
            calassificacaoCorporal = "Obesidade grau 3";
        }
        return calassificacaoCorporal;
    }

    public int CalculaIdade(Data data_nascimento, Date hoje){
        return idade = (hoje - data_nascimento);
    }

}
