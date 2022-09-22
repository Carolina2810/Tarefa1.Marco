import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ExameTest {
    ExameTest() {
    }


    @Test
    public void deveVerificarValorExameTriglicerides() {
        try {
            Exame exame = new Exame();
            exame.setTriglicerides(0.0F);
            exame.calcularExame_Triglicerides();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }


    @Test
    public void deveVerificarValorExameColesterolTotal() {
        try {
            Exame exame = new Exame();
            exame.setColesterol_Total(0.0F);
            exame.calcularExame_Colesterol_Total();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }

    @Test
    public void deveVerificarValorExameColesterol_HDL() {
        try {
            Exame exame = new Exame();
            exame.setColesterol_HDL(0.0F);
            exame.calcularExame_Colesterol_HDL();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }

    @Test
    public void deveVerificarValorExameColesterol_LDL() {
        try {
            Exame exame = new Exame();
            exame.setColesterol_LDL(0.0F);
            exame.calcularExame_Colesterol_LDL();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }

    @Test
    public void deveVerificarValorExameColesterol_VLDL() {
        try {
            Exame exame = new Exame();
            exame.setColesterol_VLDL(0.0F);
            exame.calcularExame_Colesterol_VLDL();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }


    @Test
    public void deveVerificarValorExameGlicose() {
        try {
            Exame exame = new Exame();
            exame.setGlicose(0.0F);
            exame.calcularExame_Glicose();
            Assertions.fail();
        } catch (IllegalArgumentException var2) {
            Assertions.assertEquals("O valor digitado não pode ser menor ou igual a 0", var2.getMessage());
        }

    }


    @Test
    void deveTestarTrigliceridesNivelDesejado() {
        Exame exame = new Exame();
        exame.setTriglicerides(149.0F);
        Assertions.assertEquals("O resultado do exame de Triglicérides está em um nivel desejável", exame.calcularExame_Triglicerides());
    }


    @Test
    void deveTestarTrigliceridesNivelLimítrofe() {
        Exame exame = new Exame();
        exame.setTriglicerides(198.0F);
        Assertions.assertEquals("O resultado do exame de Triglicérides está em um nivel limítrofe", exame.calcularExame_Triglicerides());
    }


    @Test
    void deveTestarTrigliceridesNivelalto() {
        Exame exame = new Exame();
        exame.setTriglicerides(499.0F);
        Assertions.assertEquals("O resultado do exame de Triglicérides está em um nivel alto", exame.calcularExame_Triglicerides());
    }


    @Test
    void deveTestarTrigliceridesNivelMuitoAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(500.0F);
        Assertions.assertEquals("O resultado do exame de Triglicérides está em um nivel muito alto", exame.calcularExame_Triglicerides());
    }


    @Test
    void deveTestarColesterolTotalDesejável() {
        Exame exame = new Exame();
        exame.setColesterol_Total(199.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol total é desejável", exame.calcularExame_Colesterol_Total());
    }


    @Test
    void deveTestarColesterolTotalLimítrofe() {
        Exame exame = new Exame();
        exame.setColesterol_Total(238.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol total é limítrofe", exame.calcularExame_Colesterol_Total());
    }


    @Test
    void deveTestarColesterolTotalElevado() {
        Exame exame = new Exame();
        exame.setColesterol_Total(240.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol total é elevado", exame.calcularExame_Colesterol_Total());
    }


    @Test
    void deveTestarColesterolHDLBaixo() {
        Exame exame = new Exame();
        exame.setColesterol_HDL(39.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol HDL é baixo", exame.calcularExame_Colesterol_HDL());
    }


    @Test
    void deveTestarColesterolHDLNormal() {
        Exame exame = new Exame();
        exame.setColesterol_HDL(59.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol HDL é normal", exame.calcularExame_Colesterol_HDL());
    }


    @Test
    void deveTestarColesterolHDLDesejavel() {
        Exame exame = new Exame();
        exame.setColesterol_HDL(61.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol HDL é desejável", exame.calcularExame_Colesterol_HDL());
    }


    @Test
    void deveTestarColesterolLDLÓtimo() {
        Exame exame = new Exame();
        exame.setColesterol_LDL(99.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol LDL é ótimo", exame.calcularExame_Colesterol_LDL());
    }


    @Test
    void deveTestarColesterolLDLDesejavel() {
        Exame exame = new Exame();
        exame.setColesterol_LDL(128.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol LDL é desejável", exame.calcularExame_Colesterol_LDL());
    }


    @Test
    void deveTestarColesterolLDLLimítrofe() {
        Exame exame = new Exame();
        exame.setColesterol_LDL(158.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol LDL é limítrofe", exame.calcularExame_Colesterol_LDL());
    }


    @Test
    void deveTestarColesterolLDLAlto() {
        Exame exame = new Exame();
        exame.setColesterol_LDL(188.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol LDL é alto", exame.calcularExame_Colesterol_LDL());
    }


    @Test
    void deveTestarColesterolLDLMuitoAlto() {
        Exame exame = new Exame();
        exame.setColesterol_LDL(191.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol LDL é muito alto", exame.calcularExame_Colesterol_LDL());
    }


    @Test
    void deveTestarColesterolVLDLDesejável() {
        Exame exame = new Exame();
        exame.setColesterol_VLDL(29.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol VLDL está em um nivel desejável", exame.calcularExame_Colesterol_VLDL());
    }


    @Test
    void deveTestarColesterolVLDLLimítrofe() {
        Exame exame = new Exame();
        exame.setColesterol_VLDL(39.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol VLDL está em um nivel limítrofe", exame.calcularExame_Colesterol_VLDL());
    }


    @Test
    void deveTestarColesterolVLDLElevado() {
        Exame exame = new Exame();
        exame.setColesterol_VLDL(41.0F);
        Assertions.assertEquals("O resultado do exame de Colesterol VLDL está em um nivel elevado", exame.calcularExame_Colesterol_VLDL());
    }

    @Test
    void deveTestarGlicoseHipoglicemia() {
        Exame exame = new Exame();
        exame.setGlicose(59.0F);
        Assertions.assertEquals("O resultado do exame de Glicose é hipoglicemia", exame.calcularExame_Glicose());
    }


    @Test
    void deveTestarGlicoseDesejável() {
        Exame exame = new Exame();
        exame.setGlicose(98.0F);
        Assertions.assertEquals("O resultado do exame de Glicose é desejável", exame.calcularExame_Glicose());
    }


    @Test
    void deveTestarGlicoseGlicemia() {
        Exame exame = new Exame();
        exame.setGlicose(124.0F);
        Assertions.assertEquals("O resultado do exame de Glicose é glicemia de jejum inapropriada", exame.calcularExame_Glicose());
    }


    @Test
    void deveTestarGlicoseDiabetes() {
        Exame exame = new Exame();
        exame.setGlicose(126.0F);
        Assertions.assertEquals("O resultado do exame de Glicose é diabetes", exame.calcularExame_Glicose());
    }
}
