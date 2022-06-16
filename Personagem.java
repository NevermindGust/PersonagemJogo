public class Personagem {

    //atributos (variaveis)
    String nome;
    int energia=10, fome=0, sono=0;
    private final static int MAX_ENERGIA = 10, MIN_ENERGIA = 0;
    private final static int MAX_FOME = 10, MIN_FOME = 0;
    private final static int MAX_SONO = 10, MIN_SONO = 0;
    

    //metodo de acesso (getter) - codigo cliente pode ler valores
    public int getEnergia(){
        return energia;
    }
    public int getFome(){
        return fome;
    }
    public int getSono(){
        return sono;
    }

    //metodo (setter) - codigo cliente pode alterar valores
    //public void setNome(int nome){
    //    this.nome = nome;
    //}

    public Personagem(String nome){
        this();
        this.nome = nome;
    }
    public Personagem(){
        this(MAX_ENERGIA, MIN_FOME, MIN_SONO);
        //energia = 10;
        //fome = 0;
        //sono = 0;
    }

    public Personagem (int energia, int fome, int sono) {
        this.energia = energia >= MIN_ENERGIA && energia <= MAX_ENERGIA ? energia : MAX_ENERGIA;
        this.fome = fome >= MIN_FOME && fome <= MAX_FOME ? fome : MIN_FOME;
        this.sono = sono >= MIN_SONO && sono <= MAX_SONO ? sono : MIN_SONO;

        //if (energia >=0 && energia <= 10) 
        //    this.energia = energia;
        //if (fome >=0 && fome <= 10) 
        //    this.fome = fome;
        //if (sono >=0 && sono <= 10) 
        //    this.sono = sono;
    }
    //metodos (comportamentos) - tipo de retorno, nome, lista de parametros
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " cacando...");
            energia -= 2;
            fome++;
        }
        else{
            System.out.printf("%s Sem energia para caçar...\n", nome);
        }
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if (fome >= 2){
            System.out.println(nome + " comendo...");
            energia = Math.min(energia + 1, 10);
            fome--; fome--;
        } else if (fome==1) {
            System.out.println(nome + " comendo...");
            energia = Math.min(energia + 1, 10);
            fome--;
        }
        else{
            System.out.printf("%s Sem fome...\n", nome);
        }
    }

    void dormir(){
        if (sono >= 1){
            System.out.println(nome + " Dormindo...");
            energia = energia + 1 <= 10 ? energia + 1 : 10;
            sono--;
            fome++;
        }
        else{
            System.out.printf("%s Sem sono...\n", nome);
        }     
    }

    
}
