package botasperdidas;

public class Dados {

    private Integer LadoE;
    private Integer LadoD;

    public Dados(Integer LadoE, Integer LadoD) {
        this.LadoE = LadoE;
        this.LadoD = LadoD;
    }

    public Integer getLadoE() {
        return LadoE;
    }

    public void setLadoE(Integer LadoE) {
        this.LadoE = LadoE;
    }

    public Integer getLadoD() {
        return LadoD;
    }

    public void setLadoD(Integer LadoD) {
        this.LadoD = LadoD;
    }
    
    public Integer getMenor(){
        if(LadoE > LadoD)
            return LadoD;
        return LadoE;
    }

    @Override
    public String toString() {
        return "LadoE: " + getLadoE() + " LadoD: " + getLadoD();
    }
}
