//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public class Exame {
    private float Triglicerides;
    private float Colesterol_Total;
    private float Colesterol_HDL;
    private float Colesterol_LDL;
    private float Colesterol_VLDL;
    private float Glicose;

    public Exame() {
    }

    public float getTriglicerides() {
        return this.Triglicerides;
    }

    public void setTriglicerides(float triglicerides) {
        this.Triglicerides = triglicerides;
    }

    public float getColesterol_Total() {
        return this.Colesterol_Total;
    }

    public void setColesterol_Total(float colesterol_Total) {
        this.Colesterol_Total = colesterol_Total;
    }

    public float getColesterol_HDL() {
        return this.Colesterol_HDL;
    }

    public void setColesterol_HDL(float colesterol_HDL) {
        this.Colesterol_HDL = colesterol_HDL;
    }

    public float getColesterol_LDL() {
        return this.Colesterol_LDL;
    }

    public void setColesterol_LDL(float colesterol_LDL) {
        this.Colesterol_LDL = colesterol_LDL;
    }

    public float getColesterol_VLDL() {
        return this.Colesterol_VLDL;
    }

    public void setColesterol_VLDL(float colesterol_VLDL) {
        this.Colesterol_VLDL = colesterol_VLDL;
    }

    public float getGlicose() {
        return this.Glicose;
    }

    public void setGlicose(float glicose) {
        this.Glicose = glicose;
    }



    public String calcularExame_Triglicerides() {
        float exame = this.Triglicerides;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 150.0F) {
            return "O resultado do exame de Triglicérides está em um nivel desejável";
        } else if (exame <= 199.0F) {
            return "O resultado do exame de Triglicérides está em um nivel limítrofe";
        } else {
            return exame != 200.0F && exame <= 499.0F ? "O resultado do exame de Triglicérides está em um nivel alto" : "O resultado do exame de Triglicérides está em um nivel muito alto";
        }
    }


    public String calcularExame_Colesterol_Total() {
        float exame = this.Colesterol_Total;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 200.0F) {
            return "O resultado do exame de Colesterol total é desejável";
        } else {
            return exame != 200.0F && exame <= 239.0F ? "O resultado do exame de Colesterol total é limítrofe" : "O resultado do exame de Colesterol total é elevado";
        }
    }


    public String calcularExame_Colesterol_HDL() {
        float exame = this.Colesterol_HDL;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 40.0F) {
            return "O resultado do exame de Colesterol HDL é baixo";
        } else {
            return exame != 40.0F && exame <= 60.0F ? "O resultado do exame de Colesterol HDL é normal" : "O resultado do exame de Colesterol HDL é desejável";
        }
    }


    public String calcularExame_Colesterol_LDL() {
        float exame = this.Colesterol_LDL;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 100.0F) {
            return "O resultado do exame de Colesterol LDL é ótimo";
        } else if (exame <= 129.0F) {
            return "O resultado do exame de Colesterol LDL é desejável";
        } else if (exame != 130.0F && exame <= 159.0F) {
            return "O resultado do exame de Colesterol LDL é limítrofe";
        } else {
            return exame != 160.0F && exame <= 189.0F ? "O resultado do exame de Colesterol LDL é alto" : "O resultado do exame de Colesterol LDL é muito alto";
        }
    }


    public String calcularExame_Colesterol_VLDL() {
        float exame = this.Colesterol_VLDL;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 30.0F) {
            return "O resultado do exame de Colesterol VLDL está em um nivel desejável";
        } else {
            return exame != 30.0F && exame <= 40.0F ? "O resultado do exame de Colesterol VLDL está em um nivel limítrofe" : "O resultado do exame de Colesterol VLDL está em um nivel elevado";
        }
    }


    public String calcularExame_Glicose() {
        float exame = this.Glicose;
        if (exame <= 0.0F) {
            throw new IllegalArgumentException("O valor digitado não pode ser menor ou igual a 0");
        } else if (exame < 60.0F) {
            return "O resultado do exame de Glicose é hipoglicemia";
        } else if (exame != 60.0F && exame <= 99.0F) {
            return "O resultado do exame de Glicose é desejável";
        } else {
            return exame != 100.0F && exame <= 125.0F ? "O resultado do exame de Glicose é glicemia de jejum inapropriada" : "O resultado do exame de Glicose é diabetes";
        }
    }
}
