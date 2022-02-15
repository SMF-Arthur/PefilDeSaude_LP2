import java.util.Calendar;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private float altura;
    private float quilograma;
    private int frequenciaCardiaca;
    private float IMC;
    
    Calendar cld = Calendar.getInstance();
    
    public PerfilDeSaude(String nome, String sobrenome, String sexo, int dia, int mes, int ano, float altura, float kg){
        
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSexo(sexo);
        this.setDiaNascimento(dia);
        this.setMesNascimento(mes);
        this.setAnoNascimento(ano);
        this.setAltura(altura);
        this.setQuilograma(kg);
        
    }

    public String CalculaIdade(){
        int dia;
        int mes;
        int ano;
        String saida;
        
        ano = cld.get(Calendar.YEAR);
        mes = cld.get(Calendar.MONTH);
        dia = cld.get(Calendar.DAY_OF_MONTH);       
        
        if(this.anoNascimento > ano){
            saida = ("Você não pode ter nascido no futuro...");
        }
        else{
            if(this.mesNascimento <= mes){
                
               if(this.diaNascimento <= dia){
                   ano = ano - this.anoNascimento;
                   //System.out.println("\n\n mes <= e dia <= ");
               }               
               else{
                   ano = (ano - this.anoNascimento) - 1;
                   //System.out.println("\n\n mes <= e dia > ");
               }               
            }
            else{
                ano = (ano - this.anoNascimento) - 1;
                //System.out.println("\n\n mes > e dia > ");
            }
        }
        
        this.anoNascimento = ano;
        
        return " "+ ano +"";
    }
    
    public String CalculaFrequenciaAlvo(){    
        
        return "Sua Frequencia Cardiaca Alvo é entre : " + this.frequenciaCardiaca / 2 + "  e : " + this.frequenciaCardiaca * 0.85 ;
    }
    
    public String FrenquenciaMaxima(){
        this.frequenciaCardiaca = 220 - this.anoNascimento;        
        
        return "Sua Frequencia Cardiaca Maxima é : "+ frequenciaCardiaca +"" ;
    }
    
    public String CalculaIMC(){
        
        IMC = quilograma / (altura * altura);
        
        return "Seu IMC é : "+IMC ;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the diaNascimento
     */
    public int getDiaNascimento() {
        return diaNascimento;
    }

    /**
     * @param diaNascimento the diaNascimento to set
     */
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    /**
     * @return the mesNascimento
     */
    public int getMesNascimento() {
        return mesNascimento;
    }

    /**
     * @param mesNascimento the mesNascimento to set
     */
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the quilograma
     */
    public float getQuilograma() {
        return quilograma;
    }

    /**
     * @param quilograma the quilograma to set
     */
    public void setQuilograma(float quilograma) {
        this.quilograma = quilograma;
    }
}
