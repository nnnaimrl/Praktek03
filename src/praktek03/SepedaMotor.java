package praktek03;

public class SepedaMotor extends Sepeda{
    private String jenismotor;
    
    void throttle(){
        System.out.println("NGEEEENG.......");
    }

    public String getJenismotor() {
        return jenismotor;
    }

    public void setJenismotor(String jenismotor) {
        this.jenismotor = jenismotor;
    }
    
    
}
